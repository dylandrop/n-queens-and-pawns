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
	
	private def validHoriz(x:Int, y:Int) {
		try {
			var xPos:Int = x;
			while(xPos < size && board(xPos, y) != PAWN) {
				if((xPos != x) && board(xPos, y) == QUEEN) {
					return false;
				}
				xPos++;
			}
			xPos = x;
			while(xPos >= 0n && board(xPos, y) != PAWN) {
				if((xPos != x) && board(xPos, y) == QUEEN) {
					return false;
				}
				xPos--;
			}
		}
		catch(NullPointerException) {
			return true;
		}
		return true;
	}
	
	private def validVert(x:Int, y:Int) {
		try {
			var yPos:Int = y;
			while(yPos < size && board(x, yPos) != PAWN) {
				if((yPos != y) && board(x, yPos) == QUEEN) {
					return false;
				}
				yPos++;
			}
			yPos = y;
			while(yPos >= 0n && board(x, yPos) != PAWN) {
				if((yPos != y) && board(x, yPos) == QUEEN) {
					return false;
				}
				yPos--;
			}
		}
		catch(NullPointerException) {
			return true;
		}
		return true;
	}
	
	private def validDiag(x:Int, y:Int) {
		try {
			var yPos:Int = y;
			var xPos:Int = x;
			while(xPos<size && yPos<size && board(xPos,yPos) != PAWN) {
				if((xPos != x) && (yPos != y) && board(xPos,yPos) == QUEEN) {
					return false;
				}
				xPos++; yPos++;
			}
			yPos = y;
			xPos = x;
			while(xPos>=0n && yPos>=0n && board(xPos,yPos) != PAWN) {
				if((xPos != x) && (yPos != y) && board(xPos,yPos) == QUEEN) {
					return false;
				}
				xPos--; yPos--;
			}
			yPos = y;
			xPos = x;
			while(xPos<size && yPos>=0n && board(xPos,yPos) != PAWN) {
				if((xPos != x) && (yPos != y) && board(xPos,yPos) == QUEEN) {
					return false;
				}
				xPos++; yPos--;
			}
			yPos = y;
			xPos = x;
			while(xPos>=0n && yPos<size && board(xPos,yPos) != PAWN) {
				if((xPos != x) && (yPos != y) && board(xPos,yPos) == QUEEN) {
					return false;
				}
				xPos--; yPos++;
			}
		}
		catch(NullPointerException) {
			return true;
		}
		return true;
	}
	
	public def valid(x:Int, y:Int) {
		if(pawns.size == 0) {
			try {
				for(queen in queens) {
					if(queen.x == x || queen.y == y || Math.abs(queen.y - y) ==Math.abs( queen.x - x)) {
						return false;
					}
				}
				return true;
			}
			catch(NullPointerException) {
				return true;
			}
		}
		return validHoriz(x,y) && validDiag(x,y) && validVert(x,y);
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

