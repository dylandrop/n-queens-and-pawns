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
	public var solutions: Int = 0;
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
    	for(var i:Int= 0;i<arr.size; i++){
    		// Console.OUT.println("Queen at "+arr(i).x +" "+arr(i).y);
    	}
    	//Console.OUT.println("size is "+ (size)+ "arr length is "+arr.size);
    	
    	boardCombos(size, 0, size, pawns, new ArrayList[Tile](), 0);
        return solutions;
    }
    // occupied should start off at 1
    public def boardCombos( len: long, startPos: Int, size: int, pawns: ArrayList[Tile], queens: ArrayList[Tile], occupied: Int){
    	// Console.OUT.println("calls boardCombos with len "+len+ " start pos " +startPos);
    	if(size==0)
    		return;
    	if(len ==0L){
    		solutions++;
    		return;
    	}
    	for(var i:int = startPos; i<=arr.size-len; i++){
    		var qTemp: ArrayList[Tile] = queens.clone();
    		//Console.OUT.println("assignment goes through");
    		if(safe(pawns, qTemp, arr(i).x, arr(i).y)){
    				//Console.OUT.println("is safe");
    				//Console.OUT.println("i is "+i+" arr size is "+arr.size);
    				qTemp(occupied) = arr(i);
    				
    				val n:Node = new Node(pawns.toRail(), qTemp.toRail(), size);
    				
    				if(n.board.valid()){
    					//Console.OUT.println("isvalid");
    					// n.board.print();
    					var oTemp:Int = occupied+1;
    					boardCombos(len-1, i+1, size, pawns, qTemp, oTemp);
    				}
    			
    		}
    		
    		
    	}
    }
    public def generateBoards(size: int, pawns: ArrayList[Tile]){
    	
    	for(var x:Int = 0; x<size; x++){
    		for(var y:Int = 0; y<size; y++){
    			if(safe(pawns, new ArrayList[Tile](), x, y))
    				genSubLayer(size, pawns, x, y);
    		}
    	}
    	Console.OUT.println("finishes generating");
    	
    }
    
    public def genSubLayer(size: int, pawns: ArrayList[Tile], xInit: int, yInit: int){
    	val out = new ArrayList[Node]();
    	val qRail = new ArrayList[Tile]();
    	qRail(0) = new Tile(xInit, yInit, 2);
    	//Console.OUT.println("recGen");
    	recGen(pawns, size, qRail, 1);
    	//Console.OUT.println("fucksup");
    	
    	
    }
    
    public def recGen( pawns: ArrayList[Tile], size: int, qRail: ArrayList[Tile], occupied: Int){
    	///Console.OUT.println("size is "+size+" and occupied is "+occupied); 
    	
    	if(size==occupied){
    		val n = new Node(pawns.toRail(), qRail.toRail(), size);
    		//Console.OUT.println("generates node...");
    		//Console.OUT.println("is valid returns "+n.board.valid());
    		if(n.board.valid()){
    			//Console.OUT.println("is valid ");
    			solutions++;
    		}
    			
    		return;
    	}
    	var qTemp: ArrayList[Tile] = qRail.clone();
    	
    	//Console.OUT.println("copies array");
    	for(var x:Int = 0; x<size; x++){
    		for(var y:Int = 0; y<size; y++){
    			if(safe(pawns, qRail, x, y)){
    				qTemp(occupied) = new Tile(x, y, 2);
    				val n:Node = new Node(pawns.toRail(), qTemp.toRail(), size);
    				if(n.board.valid())
    					recGen(pawns, size, qTemp, (occupied+1));
    			}
    		}
    	}
    	
    	
    }
    
    public def safe(pawns: ArrayList[Tile], qRail: ArrayList[Tile], x:Int, y:Int): boolean{
    	var out: boolean = true;
    	for(var i:Int = 0; i<pawns.size(); i++){
    		if(pawns(i).x==x && pawns(i).y==y){
    			out= false;
    		}
    	}
    	for(var i:Int = 0; i<qRail.size(); i++){
    		if(qRail(i).x==x && qRail(i).y==y){
    			return false;
    		}
    		//dont bother if it is right next to a queen
    		if(qRail(i).x==x && qRail(i).y==y-1){
    			return false;
    		}
    		if(qRail(i).x==x && qRail(i).y==y+1){
    			return false;
    		}
    		if(qRail(i).x==x-1 && qRail(i).y==y){
    			return false;
    		}
    		if(qRail(i).x==x+1 && qRail(i).y==y){
    			return false;
    		}
    		if(qRail(i).x==x+1 && qRail(i).y==y+1){
    			return false;
    		}
    		if(qRail(i).x==x-1 && qRail(i).y==y+1){
    			return false;
    		}
    		if(qRail(i).x==x+1 && qRail(i).y==y-1){
    			return false;
    		}
    		if(qRail(i).x==x-1 && qRail(i).y==y-1){
    			return false;
    		}
    		
    	}
    	return out;
    }
    public def queensForBoard(ofSize:Int) {
    	if(ofSize == 0) {
    		return new Rail[Tile](0);
    	}
    	queens:Rail[Tile] = new Rail[Tile](ofSize*ofSize);
    	for(var i:Int = 1; i <= ofSize*ofSize; i++) {
    		var x:Int = (i-1)%ofSize;
    		var y:Int = (i-1)/ofSize;
    		queens(i-1) = new Tile(x,y,2);
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