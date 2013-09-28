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
    public def solve(size: int, pawns: ArrayList[Tile]) : long
    {
        // Your solution goes here
        var results: ArrayList[Node] = generateBoards(size, pawns);
        //Console.OUT.println("testcase done");
        return results.size();
    }
    public def generateBoards(size: int, pawns: ArrayList[Tile]): ArrayList[Node]{
    	val t = new ArrayList[ArrayList[Node]]();
    	for(var x:Int = 0; x<size; x++){
    		for(var y:Int = 0; y<size; y++){
    			if(safe(pawns, new ArrayList[Tile](), x, y))
    			t.add(genSubLayer(size, pawns, x, y));
    		}
    	}
    	Console.OUT.println("finishes adding");
    	val out = new ArrayList[Node]();
    	for(var i:Int  = 0; i< t.size(); i++ ){
    		val tempAL = t.get(i);
    		for(var j:Int = 0; j<tempAL.size(); j++){
    			out.add(tempAL.get(j));
    		}
    	}
    	return out;
    }
    
    public def genSubLayer(size: int, pawns: ArrayList[Tile], xInit: int, yInit: int): ArrayList[Node]{
    	val out = new ArrayList[Node]();
    	val qRail = new ArrayList[Tile]();
    	qRail(0) = new Tile(xInit, yInit, 2);
    	//Console.OUT.println("recGen");
    	recGen(out, pawns, size, qRail, 1);
    	//Console.OUT.println("fucksup");
    	
    	return out;
    }
    
    public def recGen( nodes: ArrayList[Node], pawns: ArrayList[Tile], size: int, qRail: ArrayList[Tile], occupied: Int){
    	//Console.OUT.println("size is "+size+" and occupied is "+occupied); 
    	if(size==occupied){
    		val n = new Node(pawns.toRail(), qRail.toRail(), size);
    		//Console.OUT.println("generates node...");
    		nodes.add(new Node(pawns.toRail(), qRail.toRail(), size));
    		return;
    	}
    	var qTemp: ArrayList[Tile] = qRail.clone();
    	
    	//Console.OUT.println("copies array");
    	for(var x:Int = 0; x<size; x++){
    		for(var y:Int = 0; y<size; y++){
    			if(safe(pawns, qRail, x, y)){
    				qTemp(occupied) = new Tile(x, y, 2);
    				recGen(nodes, pawns, size, qTemp, (occupied+1));
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