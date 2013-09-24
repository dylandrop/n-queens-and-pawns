import x10.util.Timer;
import x10.io.File;
import x10.util.ArrayList;
import x10.lang.Exception;
import x10.io.FileNotFoundException;
import x10.array.Array;
/**
 * This is the class that provides the solve() method.
 *
 * The assignment is to replace the contents of the solve() method
 * below with code that actually works :-)
 */
public class Solver
{
    /**
     * Solve a single 'N'-Queens with pawns problem.
     *     'size' is 'N'.
     *     'pawns' is an array of bidimensional Point {rank==2} with the locations of pawns.  The array may be of length zero.
     *
     * This function should return the number of solutions for the given configuration.
     */
    public def solve(size: int, pawns: ArrayList[Tile]) : int
    {
        // Your solution goes here
        return 42;
    }
    
    private class Node {
    	val board:Board;
    	public def this(pawns:Rail[Tile], queens:Rail[Tile], size:Int) {
    		this.board = new Board(size, pawns, queens);
    	}
    	
    	public check() {
    		return board.valid();
    	}
    	
    }
}