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
	val OPEN = 1; val QUEEN = 2; val PAWN = 3;
	
	public def this(size:Int, pawns:Rail[Tile],queens:Rail[Tile]) {
		this.size = size; this.pawns = pawns; this.queens = queens;
		val max = size; //YOU HAD IT AT max = size-1, dunno why, crashes when board size is 1
		this.board = new Array_2[Int](max, max);
		for (pawn in pawns) {
			place(pawn);
		}
		for (queen in queens) {
			place(queen);
		}
	}
	
	private def validHoriz(queen:Tile) {
		var xPos:Int = queen.x;
		while(xPos < board.size && board(xPos, queen.y) != PAWN) {
			if(board(xPos, queen.y) == QUEEN) {
				return false;
			}
			xPos++;
		}
		xPos = queen.x;
		while(xPos >= 0 && board(xPos, queen.y) != PAWN) {
			if(board(xPos, queen.y) == QUEEN) {
				return false;
			}
			xPos--;
		}
		return true;
	}
	
	private def validVert(queen:Tile) {
		var yPos:Int = queen.y;
		while(yPos < board.size && board(queen.x, yPos) != PAWN) {
			if(board(yPos, queen.y) == QUEEN) {
				return false;
			}
			yPos++;
		}
		yPos = queen.x;
		while(yPos >= 0 && board(queen.x, yPos) != PAWN) {
			if(board(queen.x, yPos) == QUEEN) {
				return false;
			}
			yPos--;
		}
		
		return true;
	}
	
	private def validDiag(queen:Tile) {
		
		var yPos:Int = queen.y;
		var xPos:Int = queen.x;
		while(xPos<size && yPos<size && board(xPos,yPos) != PAWN) {
			if(board(xPos,yPos) == QUEEN) {
				return false;
			}
			xPos++; yPos++;
		}
		yPos = queen.y;
		xPos = queen.x;
		while(xPos>=0 && yPos>=0 && board(xPos,yPos) != PAWN) {
			if(board(xPos,yPos) == QUEEN) {
				return false;
			}
			xPos--; yPos--;
		}
		yPos = queen.y;
		xPos = queen.x;
		while(xPos<size && yPos>=0 && board(xPos,yPos) != PAWN) {
			if(board(xPos,yPos) == QUEEN) {
				return false;
			}
			xPos++; yPos--;
		}
		yPos = queen.y;
		xPos = queen.x;
		while(xPos>=0 && yPos<size && board(xPos,yPos) != PAWN) {
			if(board(xPos,yPos) == QUEEN) {
				return false;
			}
			xPos--; yPos++;
		}
		
		return true;
	}
	
	public def valid(queen:Tile) {
		return validDiag(queen) && validVert(queen) && validHoriz(queen);
	}
	
	
	private def place(someTile:Tile) {
		val occupation = board(someTile.x, someTile.y);
		if (occupation == 2 || occupation == 3) {
			throw new Exception("Placing on a wrong place!");
		}
		board(someTile.x, someTile.y) = someTile.tileType;
	}
	
	
}

