import x10.util.Timer;
import x10.io.File;
import x10.lang.Exception;
import x10.io.FileNotFoundException;
import x10.array.Array;
import x10.util.ArrayList;
/**

 * This is the class that provides the solve() method.
 *
 * The assignment is to replace the contents of the solve() method
 * below with code that actually works :-)
 */
public class Solver
{
	public var solutions: Int = 0n;
	public var arr:Rail[Tile];
    /**
     * Solve a single 'N'-Queens with pawns problem.
     *     'size' is 'N'.
     *     'pawns' is an array of bidimensional Point {rank==2} with the locations of pawns.  The array may be of length zero.
     *
     * This function should return the number of solutions for the given configuration.
     */
    public def solve(size: int, pawns: ArrayList[Tile]) : long
    {
        // Your solution goes here
        
        //Console.OUT.println("testcase done");
    	arr = queensForBoard(size);
    	
    	//Console.OUT.println("size is "+ (size)+ "arr length is "+arr.size);
    	
    	finish{
            boardCombos((size as Long), 0n, size, pawns.toRail(), new Rail[Tile](size), 0n);    
        }
        
        return solutions;
    }
    // occupied should start off at 1
    public def boardCombos( len: long, startPos: Int, size: int, pawns: Rail[Tile], queens: Rail[Tile], occupied: Int){
    	// Console.OUT.println("calls boardCombos with len "+len+ " start pos " +startPos);
    	if(size==0n)
    		return;
    	if(len ==0L){
    		atomic solutions++;
    		return;
    	}
    	async{ for(var i:int = startPos; i<=arr.size-len; i++){
    		
                var qTemp: Rail[Tile] = cloneArray(queens);
                        //Console.OUT.println("assignment goes through");
                if(safe(pawns, qTemp, arr(i).x, arr(i).y)){
                        //Console.OUT.println("is safe");
                        //Console.OUT.println("i is "+i+" arr size is "+arr.size);
                        qTemp(occupied) = arr(i);
                        
                        val n:Node = new Node(pawns, qTemp, size);
                        
                        if(n.board.valid()){
                            //Console.OUT.println("isvalid");
                            // n.board.print();
                            var oTemp:Int = occupied+1n;
                            boardCombos(len-1, i+1n, size, pawns, qTemp, oTemp);
                        }
                    
                }
            }
    		
    		
    	}
    }

    public def cloneArray(x: Rail[Tile]): Rail[Tile]{
        var out: Rail[Tile] = new Rail[Tile](x.size);
        for(var i: Long = 0; i<x.size; i++){
            out(i) = x(i);
        }
        return out;
    }
    
    
    public def safe(pawns: Rail[Tile], qRail: Rail[Tile], x:Int, y:Int): boolean{
    	var out: boolean = true;
        if(pawns.size == 0){
            return true;
        }
        if(qRail.size == 0){
            return true;
        }
    	for(var i:Int = 0n; i<pawns.size; i++){
    		if(pawns(i).x==x && pawns(i).y==y){
    			return false;
    		}
    	}
    	for(var i:Int = 0n; i<qRail.size; i++){
    	   try{
                if(qRail(i).x==x && qRail(i).y==y){
                    return false;
                }
                //dont bother if it is right next to a queen
                if(qRail(i).x==x && qRail(i).y==y-1n){
                    return false;
                }
                if(qRail(i).x==x && qRail(i).y==y+1n){
                    return false;
                }
                if(qRail(i).x==x-1n && qRail(i).y==y){
                    return false;
                }
                if(qRail(i).x==x+1n && qRail(i).y==y){
                    return false;
                }
                if(qRail(i).x==x+1n && qRail(i).y==y+1n){
                    return false;
                }
                if(qRail(i).x==x-1n && qRail(i).y==y+1n){
                    return false;
                }
                if(qRail(i).x==x+1n && qRail(i).y==y-1n){
                    return false;
                }
                if(qRail(i).x==x-1n && qRail(i).y==y-1n){
                
                    return false;
                }
           }	
           catch(NullPointerException){
                return true;
           }
            
    	}
    	return out;
    }
    public def queensForBoard(ofSize:Int) {
    	if(ofSize == 0n) {
    		return new Rail[Tile](0n);
    	}
    	queens:Rail[Tile] = new Rail[Tile](ofSize*ofSize);
    	for(var i:Int = 1n; i <= ofSize*ofSize; i++) {
    		var x:Int = (i-1n)%ofSize;
    		var y:Int = (i-1n)/ofSize;
    		queens(i-1) = new Tile(x,y,2n);
    	}
    	return queens;
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