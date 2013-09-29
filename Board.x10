import x10.util.Timer;
import x10.io.File;
import x10.util.ArrayList;
import x10.lang.Exception;
import x10.io.FileNotFoundException;
import x10.array.*;

public class Board {
	val board:Array_2[Int];
	val size:Int;
	val pawns:Rail[Tile];
	val queens:Rail[Tile];
	val OPEN = 1n; val QUEEN = 2n; val PAWN = 3n;
	
	public def this(size:Int, pawns:Rail[Tile],queens:Rail[Tile]) {
		this.size = size; this.pawns = pawns; this.queens = queens;
		val max = size; //YOU HAD IT AT max = size-1, dunno why, crashes when board size is 1
		this.board = new Array_2[Int](max, max);
		for (pawn in pawns) {
			place(pawn);
		}
		for (queen in queens) {
			try {
				place(queen);
			}
			catch(NullPointerException) {
				break;
			}
		}
	}
	
	private def validHoriz() {
		for(queen in queens) {
			try {
				var xPos:Int = queen.x;
				while(xPos < size && board(xPos, queen.y) != PAWN) {
					if((xPos != queen.x) && board(xPos, queen.y) == QUEEN) {
						return false;
					}
					xPos++;
				}
				xPos = queen.x;
				while(xPos >= 0n && board(xPos, queen.y) != PAWN) {
					if((xPos != queen.x) && board(xPos, queen.y) == QUEEN) {
						return false;
					}
					xPos--;
				}
			}
			catch(NullPointerException) {
				break;
			}
		}
		return true;
	}
	
	private def validVert() {
		for(queen in queens) {
			try {
				var yPos:Int = queen.y;
				while(yPos < size && board(queen.x, yPos) != PAWN) {
					if((yPos != queen.y) && board(queen.x, yPos) == QUEEN) {
						return false;
					}
					yPos++;
				}
				yPos = queen.y;
				while(yPos >= 0n && board(queen.x, yPos) != PAWN) {
					if((yPos != queen.y) && board(queen.x, yPos) == QUEEN) {
						return false;
					}
					yPos--;
				}
			}
			catch(NullPointerException) {
				break;
			}
		}
		return true;
	}
	
	private def validDiag() {
		for(queen in queens) {
			try {
				var yPos:Int = queen.y;
				var xPos:Int = queen.x;
				while(xPos<size && yPos<size && board(xPos,yPos) != PAWN) {
					if((xPos != queen.x) && (yPos != queen.y) && board(xPos,yPos) == QUEEN) {
						return false;
					}
					xPos++; yPos++;
				}
				yPos = queen.y;
				xPos = queen.x;
				while(xPos>=0n && yPos>=0n && board(xPos,yPos) != PAWN) {
					if((xPos != queen.x) && (yPos != queen.y) && board(xPos,yPos) == QUEEN) {
						return false;
					}
					xPos--; yPos--;
				}
				yPos = queen.y;
				xPos = queen.x;
				while(xPos<size && yPos>=0n && board(xPos,yPos) != PAWN) {
					if((xPos != queen.x) && (yPos != queen.y) && board(xPos,yPos) == QUEEN) {
						return false;
					}
					xPos++; yPos--;
				}
				yPos = queen.y;
				xPos = queen.x;
				while(xPos>=0n && yPos<size && board(xPos,yPos) != PAWN) {
					if((xPos != queen.x) && (yPos != queen.y) && board(xPos,yPos) == QUEEN) {
						return false;
					}
					xPos--; yPos++;
				}
			}
			catch(NullPointerException) {
				break;
			}
		}
		return true;
	}
	
	public def valid() {
		var valid_1: boolean = true;
		var valid_2: boolean = true;
		var valid_3: boolean = true;
		finish {
			async {
				valid_1 = validDiag();
			}
			async {
				valid_2 = validVert();
			}
			async {
				valid_3 = validHoriz();
			}
		}
		return valid_1 && valid_2 && valid_3;
	}
	
	public def print(){
		for (y in 0n..(size-1n)) {
			for (x in 0n..(size-1n)) {
				Console.OUT.print("-" + board(x, y));
			}
			Console.OUT.println("-");
		}
	}
	
	
	private def place(someTile:Tile) {
		val occupation = board(someTile.x, someTile.y);
		if (occupation == 2n || occupation == 3n) {
			throw new Exception("Placing on a wrong place!");
		}
		board(someTile.x, someTile.y) = someTile.tileType;
	}
	
	
}

