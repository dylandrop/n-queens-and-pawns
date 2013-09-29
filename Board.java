
@x10.runtime.impl.java.X10Generated public class Board extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Board> $RTT = x10.rtt.NamedType.<Board> make(
    "Board", Board.class
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Board $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Board.class + " calling"); } 
        $_obj.board = $deserializer.readRef();
        $_obj.size = $deserializer.readInt();
        $_obj.pawns = $deserializer.readRef();
        $_obj.queens = $deserializer.readRef();
        $_obj.OPEN = $deserializer.readInt();
        $_obj.QUEEN = $deserializer.readInt();
        $_obj.PAWN = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        Board $_obj = new Board((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        if (board instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.board);
        } else {
        $serializer.write(this.board);
        }
        $serializer.write(this.size);
        if (pawns instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.pawns);
        } else {
        $serializer.write(this.pawns);
        }
        if (queens instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.queens);
        } else {
        $serializer.write(this.queens);
        }
        $serializer.write(this.OPEN);
        $serializer.write(this.QUEEN);
        $serializer.write(this.PAWN);
        
    }
    
    // constructor just for allocation
    public Board(final java.lang.System[] $dummy) { 
    }
    
        
//#line 9 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public x10.array.Array_2<x10.core.Int> board;
        
//#line 10 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public int size;
        
//#line 11 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public x10.core.Rail<Tile> pawns;
        
//#line 12 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public x10.core.Rail<Tile> queens;
        
//#line 13 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public int OPEN;
        
//#line 13 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public int QUEEN;
        
//#line 13 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public int PAWN;
        
        
//#line 15 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
// creation method for java code (1-phase java constructor)
        public Board(final int size,
                     final x10.core.Rail<Tile> pawns,
                     final x10.core.Rail<Tile> queens, __1$1Tile$2__2$1Tile$2 $dummy){this((java.lang.System[]) null);
                                                                                          Board$$init$S(size,pawns,queens, (Board.__1$1Tile$2__2$1Tile$2) null);}
        
        // constructor for non-virtual call
        final public Board Board$$init$S(final int size,
                                         final x10.core.Rail<Tile> pawns,
                                         final x10.core.Rail<Tile> queens, __1$1Tile$2__2$1Tile$2 $dummy) { {
                                                                                                                   
//#line 15 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
;
                                                                                                                   
//#line 15 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"

                                                                                                                   
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.__fieldInitializers_Board();
                                                                                                                   
//#line 16 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.size = size;
                                                                                                                   
//#line 16 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.pawns = ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 16 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.queens = ((x10.core.Rail)(queens));
                                                                                                                   
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int max =
                                                                                                                     size;
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4451 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4452 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4453 =
                                                                                                                     ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array_2$$init$S(t4451,
                                                                                                                                                                                                                                                      t4452)));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.board = ((x10.array.Array_2)(t4453));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail4760 =
                                                                                                                     ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size4761 =
                                                                                                                     ((x10.core.Rail<Tile>)rail4760).
                                                                                                                       size;
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx4750 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail4760$value5043 =
                                                                                                                         ((Tile[])rail4760.value);
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4751 =
                                                                                                                             idx4750;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4752 =
                                                                                                                             ((t4751) < (((long)(size4761))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4752)) {
                                                                                                                               
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4746 =
                                                                                                                             idx4750;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile pawn4747 =
                                                                                                                             ((Tile)(((Tile)rail4760$value5043[(int)t4746])));
                                                                                                                           
//#line 20 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(pawn4747)));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4748 =
                                                                                                                             idx4750;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4749 =
                                                                                                                             ((t4748) + (((long)(1L))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx4750 = t4749;
                                                                                                                       }
                                                                                                                   }
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail4762 =
                                                                                                                     ((x10.core.Rail)(queens));
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size4763 =
                                                                                                                     ((x10.core.Rail<Tile>)rail4762).
                                                                                                                       size;
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx4757 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail4762$value5044 =
                                                                                                                         ((Tile[])rail4762.value);
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4758 =
                                                                                                                             idx4757;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4759 =
                                                                                                                             ((t4758) < (((long)(size4763))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4759)) {
                                                                                                                               
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4753 =
                                                                                                                             idx4757;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen4754 =
                                                                                                                             ((Tile)(((Tile)rail4762$value5044[(int)t4753])));
                                                                                                                           
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(queen4754)));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4755 =
                                                                                                                             idx4757;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4756 =
                                                                                                                             ((t4755) + (((long)(1L))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx4757 = t4756;
                                                                                                                       }
                                                                                                                   }
                                                                                                               }
                                                                                                               return this;
                                                                                                               }
        
        
        
//#line 27 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validHoriz$O(
                                                                                                              ){
            
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail4820 =
              ((x10.core.Rail)(queens));
            
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size4821 =
              ((x10.core.Rail<Tile>)rail4820).
                size;
            
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx4817 =
              0L;
            {
                
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail4820$value5045 =
                  ((Tile[])rail4820.value);
                
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4818 =
                      idx4817;
                    
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4819 =
                      ((t4818) < (((long)(size4821))));
                    
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4819)) {
                        
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4813 =
                      idx4817;
                    
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen4814 =
                      ((Tile)(((Tile)rail4820$value5045[(int)t4813])));
                    
//#line 29 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos4790 =
                      queen4814.
                        x;
                    
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4791 =
                          xPos4790;
                        
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4792 =
                          size;
                        
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4793 =
                          ((t4791) < (((int)(t4792))));
                        
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4793) {
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4794 =
                              ((x10.array.Array_2)(board));
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4795 =
                              xPos4790;
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4796 =
                              ((long)(((int)(t4795))));
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4797 =
                              queen4814.
                                y;
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4798 =
                              ((long)(((int)(t4797))));
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4799 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4794).$apply$G((long)(t4796),
                                                                                                    (long)(t4798)));
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4800 =
                              PAWN;
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4793 = ((int) t4799) !=
                            ((int) t4800);
                        }
                        
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4801 =
                          t4793;
                        
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4801)) {
                            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4764 =
                          xPos4790;
                        
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4765 =
                          queen4814.
                            x;
                        
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4766 =
                          ((int) t4764) !=
                        ((int) t4765);
                        
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4766) {
                            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4767 =
                              ((x10.array.Array_2)(board));
                            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4768 =
                              xPos4790;
                            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4769 =
                              ((long)(((int)(t4768))));
                            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4770 =
                              queen4814.
                                y;
                            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4771 =
                              ((long)(((int)(t4770))));
                            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4772 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4767).$apply$G((long)(t4769),
                                                                                                    (long)(t4771)));
                            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4773 =
                              QUEEN;
                            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4766 = ((int) t4772) ==
                            ((int) t4773);
                        }
                        
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4774 =
                          t4766;
                        
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4774) {
                            
//#line 32 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4775 =
                          xPos4790;
                        
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4776 =
                          ((t4775) + (((int)(1))));
                        
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4790 = t4776;
                    }
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4802 =
                      queen4814.
                        x;
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4790 = t4802;
                    
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4803 =
                          xPos4790;
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4804 =
                          ((t4803) >= (((int)(0))));
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4804) {
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4805 =
                              ((x10.array.Array_2)(board));
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4806 =
                              xPos4790;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4807 =
                              ((long)(((int)(t4806))));
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4808 =
                              queen4814.
                                y;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4809 =
                              ((long)(((int)(t4808))));
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4810 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4805).$apply$G((long)(t4807),
                                                                                                    (long)(t4809)));
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4811 =
                              PAWN;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4804 = ((int) t4810) !=
                            ((int) t4811);
                        }
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4812 =
                          t4804;
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4812)) {
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4777 =
                          xPos4790;
                        
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4778 =
                          queen4814.
                            x;
                        
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4779 =
                          ((int) t4777) !=
                        ((int) t4778);
                        
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4779) {
                            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4780 =
                              ((x10.array.Array_2)(board));
                            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4781 =
                              xPos4790;
                            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4782 =
                              ((long)(((int)(t4781))));
                            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4783 =
                              queen4814.
                                y;
                            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4784 =
                              ((long)(((int)(t4783))));
                            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4785 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4780).$apply$G((long)(t4782),
                                                                                                    (long)(t4784)));
                            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4786 =
                              QUEEN;
                            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4779 = ((int) t4785) ==
                            ((int) t4786);
                        }
                        
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4787 =
                          t4779;
                        
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4787) {
                            
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 41 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4788 =
                          xPos4790;
                        
//#line 41 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4789 =
                          ((t4788) - (((int)(1))));
                        
//#line 41 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4790 = t4789;
                    }
                    
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4815 =
                      idx4817;
                    
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4816 =
                      ((t4815) + (((long)(1L))));
                    
//#line 28 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx4817 = t4816;
                }
            }
            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validHoriz$P$O(
          final Board Board){
            return Board.validHoriz$O();
        }
        
        
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validVert$O(
                                                                                                              ){
            
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail4878 =
              ((x10.core.Rail)(queens));
            
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size4879 =
              ((x10.core.Rail<Tile>)rail4878).
                size;
            
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx4875 =
              0L;
            {
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail4878$value5046 =
                  ((Tile[])rail4878.value);
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4876 =
                      idx4875;
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4877 =
                      ((t4876) < (((long)(size4879))));
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4877)) {
                        
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4871 =
                      idx4875;
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen4872 =
                      ((Tile)(((Tile)rail4878$value5046[(int)t4871])));
                    
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos4848 =
                      queen4872.
                        y;
                    
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4849 =
                          yPos4848;
                        
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4850 =
                          size;
                        
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4851 =
                          ((t4849) < (((int)(t4850))));
                        
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4851) {
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4852 =
                              ((x10.array.Array_2)(board));
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4853 =
                              queen4872.
                                x;
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4854 =
                              ((long)(((int)(t4853))));
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4855 =
                              yPos4848;
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4856 =
                              ((long)(((int)(t4855))));
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4857 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4852).$apply$G((long)(t4854),
                                                                                                    (long)(t4856)));
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4858 =
                              PAWN;
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4851 = ((int) t4857) !=
                            ((int) t4858);
                        }
                        
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4859 =
                          t4851;
                        
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4859)) {
                            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4822 =
                          yPos4848;
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4823 =
                          queen4872.
                            y;
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4824 =
                          ((int) t4822) !=
                        ((int) t4823);
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4824) {
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4825 =
                              ((x10.array.Array_2)(board));
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4826 =
                              queen4872.
                                x;
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4827 =
                              ((long)(((int)(t4826))));
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4828 =
                              yPos4848;
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4829 =
                              ((long)(((int)(t4828))));
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4830 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4825).$apply$G((long)(t4827),
                                                                                                    (long)(t4829)));
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4831 =
                              QUEEN;
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4824 = ((int) t4830) ==
                            ((int) t4831);
                        }
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4832 =
                          t4824;
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4832) {
                            
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4833 =
                          yPos4848;
                        
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4834 =
                          ((t4833) + (((int)(1))));
                        
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4848 = t4834;
                    }
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4860 =
                      queen4872.
                        y;
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4848 = t4860;
                    
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4861 =
                          yPos4848;
                        
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4862 =
                          ((t4861) >= (((int)(0))));
                        
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4862) {
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4863 =
                              ((x10.array.Array_2)(board));
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4864 =
                              queen4872.
                                x;
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4865 =
                              ((long)(((int)(t4864))));
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4866 =
                              yPos4848;
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4867 =
                              ((long)(((int)(t4866))));
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4868 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4863).$apply$G((long)(t4865),
                                                                                                    (long)(t4867)));
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4869 =
                              PAWN;
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4862 = ((int) t4868) !=
                            ((int) t4869);
                        }
                        
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4870 =
                          t4862;
                        
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4870)) {
                            
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4835 =
                          yPos4848;
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4836 =
                          queen4872.
                            y;
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4837 =
                          ((int) t4835) !=
                        ((int) t4836);
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4837) {
                            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4838 =
                              ((x10.array.Array_2)(board));
                            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4839 =
                              queen4872.
                                x;
                            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4840 =
                              ((long)(((int)(t4839))));
                            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4841 =
                              yPos4848;
                            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4842 =
                              ((long)(((int)(t4841))));
                            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4843 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4838).$apply$G((long)(t4840),
                                                                                                    (long)(t4842)));
                            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4844 =
                              QUEEN;
                            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4837 = ((int) t4843) ==
                            ((int) t4844);
                        }
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4845 =
                          t4837;
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4845) {
                            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4846 =
                          yPos4848;
                        
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4847 =
                          ((t4846) - (((int)(1))));
                        
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4848 = t4847;
                    }
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4873 =
                      idx4875;
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4874 =
                      ((t4873) + (((long)(1L))));
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx4875 = t4874;
                }
            }
            
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validVert$P$O(
          final Board Board){
            return Board.validVert$O();
        }
        
        
//#line 67 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validDiag$O(
                                                                                                              ){
            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail5019 =
              ((x10.core.Rail)(queens));
            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5020 =
              ((x10.core.Rail<Tile>)rail5019).
                size;
            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5016 =
              0L;
            {
                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5019$value5047 =
                  ((Tile[])rail5019.value);
                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5017 =
                      idx5016;
                    
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5018 =
                      ((t5017) < (((long)(size5020))));
                    
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5018)) {
                        
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5012 =
                      idx5016;
                    
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5013 =
                      ((Tile)(((Tile)rail5019$value5047[(int)t5012])));
                    
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos4952 =
                      queen5013.
                        y;
                    
//#line 70 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos4953 =
                      queen5013.
                        x;
                    
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4954 =
                          xPos4953;
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4955 =
                          size;
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4956 =
                          ((t4954) < (((int)(t4955))));
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4956) {
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4957 =
                              yPos4952;
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4958 =
                              size;
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4956 = ((t4957) < (((int)(t4958))));
                        }
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4959 =
                          t4956;
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4959) {
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4960 =
                              ((x10.array.Array_2)(board));
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4961 =
                              xPos4953;
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4962 =
                              ((long)(((int)(t4961))));
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4963 =
                              yPos4952;
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4964 =
                              ((long)(((int)(t4963))));
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4965 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4960).$apply$G((long)(t4962),
                                                                                                    (long)(t4964)));
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4966 =
                              PAWN;
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4959 = ((int) t4965) !=
                            ((int) t4966);
                        }
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4967 =
                          t4959;
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4967)) {
                            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4880 =
                          xPos4953;
                        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4881 =
                          queen5013.
                            x;
                        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4882 =
                          ((int) t4880) !=
                        ((int) t4881);
                        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4882) {
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4883 =
                              yPos4952;
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4884 =
                              queen5013.
                                y;
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4882 = ((int) t4883) !=
                            ((int) t4884);
                        }
                        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4885 =
                          t4882;
                        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4885) {
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4886 =
                              ((x10.array.Array_2)(board));
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4887 =
                              xPos4953;
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4888 =
                              ((long)(((int)(t4887))));
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4889 =
                              yPos4952;
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4890 =
                              ((long)(((int)(t4889))));
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4891 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4886).$apply$G((long)(t4888),
                                                                                                    (long)(t4890)));
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4892 =
                              QUEEN;
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4885 = ((int) t4891) ==
                            ((int) t4892);
                        }
                        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4893 =
                          t4885;
                        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4893) {
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4894 =
                          xPos4953;
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4895 =
                          ((t4894) + (((int)(1))));
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4953 = t4895;
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4896 =
                          yPos4952;
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4897 =
                          ((t4896) + (((int)(1))));
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4952 = t4897;
                    }
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4968 =
                      queen5013.
                        y;
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4952 = t4968;
                    
//#line 78 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4969 =
                      queen5013.
                        x;
                    
//#line 78 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4953 = t4969;
                    
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4970 =
                          xPos4953;
                        
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4971 =
                          ((t4970) >= (((int)(0))));
                        
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4971) {
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4972 =
                              yPos4952;
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4971 = ((t4972) >= (((int)(0))));
                        }
                        
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4973 =
                          t4971;
                        
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4973) {
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4974 =
                              ((x10.array.Array_2)(board));
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4975 =
                              xPos4953;
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4976 =
                              ((long)(((int)(t4975))));
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4977 =
                              yPos4952;
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4978 =
                              ((long)(((int)(t4977))));
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4979 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4974).$apply$G((long)(t4976),
                                                                                                    (long)(t4978)));
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4980 =
                              PAWN;
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4973 = ((int) t4979) !=
                            ((int) t4980);
                        }
                        
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4981 =
                          t4973;
                        
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4981)) {
                            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4898 =
                          xPos4953;
                        
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4899 =
                          queen5013.
                            x;
                        
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4900 =
                          ((int) t4898) !=
                        ((int) t4899);
                        
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4900) {
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4901 =
                              yPos4952;
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4902 =
                              queen5013.
                                y;
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4900 = ((int) t4901) !=
                            ((int) t4902);
                        }
                        
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4903 =
                          t4900;
                        
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4903) {
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4904 =
                              ((x10.array.Array_2)(board));
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4905 =
                              xPos4953;
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4906 =
                              ((long)(((int)(t4905))));
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4907 =
                              yPos4952;
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4908 =
                              ((long)(((int)(t4907))));
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4909 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4904).$apply$G((long)(t4906),
                                                                                                    (long)(t4908)));
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4910 =
                              QUEEN;
                            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4903 = ((int) t4909) ==
                            ((int) t4910);
                        }
                        
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4911 =
                          t4903;
                        
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4911) {
                            
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4912 =
                          xPos4953;
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4913 =
                          ((t4912) - (((int)(1))));
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4953 = t4913;
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4914 =
                          yPos4952;
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4915 =
                          ((t4914) - (((int)(1))));
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4952 = t4915;
                    }
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4982 =
                      queen5013.
                        y;
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4952 = t4982;
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4983 =
                      queen5013.
                        x;
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4953 = t4983;
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4984 =
                          xPos4953;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4985 =
                          size;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4986 =
                          ((t4984) < (((int)(t4985))));
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4986) {
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4987 =
                              yPos4952;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4986 = ((t4987) >= (((int)(0))));
                        }
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4988 =
                          t4986;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4988) {
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4989 =
                              ((x10.array.Array_2)(board));
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4990 =
                              xPos4953;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4991 =
                              ((long)(((int)(t4990))));
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4992 =
                              yPos4952;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4993 =
                              ((long)(((int)(t4992))));
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4994 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4989).$apply$G((long)(t4991),
                                                                                                    (long)(t4993)));
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4995 =
                              PAWN;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4988 = ((int) t4994) !=
                            ((int) t4995);
                        }
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4996 =
                          t4988;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4996)) {
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4916 =
                          xPos4953;
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4917 =
                          queen5013.
                            x;
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4918 =
                          ((int) t4916) !=
                        ((int) t4917);
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4918) {
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4919 =
                              yPos4952;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4920 =
                              queen5013.
                                y;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4918 = ((int) t4919) !=
                            ((int) t4920);
                        }
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4921 =
                          t4918;
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4921) {
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4922 =
                              ((x10.array.Array_2)(board));
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4923 =
                              xPos4953;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4924 =
                              ((long)(((int)(t4923))));
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4925 =
                              yPos4952;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4926 =
                              ((long)(((int)(t4925))));
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4927 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4922).$apply$G((long)(t4924),
                                                                                                    (long)(t4926)));
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4928 =
                              QUEEN;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4921 = ((int) t4927) ==
                            ((int) t4928);
                        }
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4929 =
                          t4921;
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4929) {
                            
//#line 89 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4930 =
                          xPos4953;
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4931 =
                          ((t4930) + (((int)(1))));
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4953 = t4931;
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4932 =
                          yPos4952;
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4933 =
                          ((t4932) - (((int)(1))));
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4952 = t4933;
                    }
                    
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4997 =
                      queen5013.
                        y;
                    
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4952 = t4997;
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4998 =
                      queen5013.
                        x;
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4953 = t4998;
                    
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4999 =
                          xPos4953;
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5000 =
                          ((t4999) >= (((int)(0))));
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5000) {
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5001 =
                              yPos4952;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5002 =
                              size;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5000 = ((t5001) < (((int)(t5002))));
                        }
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5003 =
                          t5000;
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5003) {
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5004 =
                              ((x10.array.Array_2)(board));
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5005 =
                              xPos4953;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5006 =
                              ((long)(((int)(t5005))));
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5007 =
                              yPos4952;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5008 =
                              ((long)(((int)(t5007))));
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5009 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5004).$apply$G((long)(t5006),
                                                                                                    (long)(t5008)));
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5010 =
                              PAWN;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5003 = ((int) t5009) !=
                            ((int) t5010);
                        }
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5011 =
                          t5003;
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5011)) {
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4934 =
                          xPos4953;
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4935 =
                          queen5013.
                            x;
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4936 =
                          ((int) t4934) !=
                        ((int) t4935);
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4936) {
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4937 =
                              yPos4952;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4938 =
                              queen5013.
                                y;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4936 = ((int) t4937) !=
                            ((int) t4938);
                        }
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4939 =
                          t4936;
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4939) {
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4940 =
                              ((x10.array.Array_2)(board));
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4941 =
                              xPos4953;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4942 =
                              ((long)(((int)(t4941))));
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4943 =
                              yPos4952;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4944 =
                              ((long)(((int)(t4943))));
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4945 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4940).$apply$G((long)(t4942),
                                                                                                    (long)(t4944)));
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4946 =
                              QUEEN;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4939 = ((int) t4945) ==
                            ((int) t4946);
                        }
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4947 =
                          t4939;
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4947) {
                            
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4948 =
                          xPos4953;
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4949 =
                          ((t4948) - (((int)(1))));
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos4953 = t4949;
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4950 =
                          yPos4952;
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4951 =
                          ((t4950) + (((int)(1))));
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos4952 = t4951;
                    }
                    
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5014 =
                      idx5016;
                    
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5015 =
                      ((t5014) + (((long)(1L))));
                    
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5016 = t5015;
                }
            }
            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validDiag$P$O(
          final Board Board){
            return Board.validDiag$O();
        }
        
        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public boolean
                                                                                                               valid$O(
                                                                                                               ){
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4710 =
              this.validDiag$O();
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4710) {
                
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4710 = this.validVert$O();
            }
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4711 =
              t4710;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4711) {
                
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4711 = this.validHoriz$O();
            }
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4712 =
              t4711;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return t4712;
        }
        
        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public void
                                                                                                               print(
                                                                                                               ){
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i4436min4437 =
              0;
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4713 =
              size;
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i4436max4438 =
              ((t4713) - (((int)(1))));
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i5040 =
              i4436min4437;
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5041 =
                  i5040;
                
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5042 =
                  ((t5041) <= (((int)(i4436max4438))));
                
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5042)) {
                    
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                }
                
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int y5037 =
                  i5040;
                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i4420min5033 =
                  0;
                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5034 =
                  size;
                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i4420max5035 =
                  ((t5034) - (((int)(1))));
                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i5030 =
                  i4420min5033;
                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5031 =
                      i5030;
                    
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5032 =
                      ((t5031) <= (((int)(i4420max5035))));
                    
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5032)) {
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int x5027 =
                      i5030;
                    
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t5021 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5022 =
                      ((x10.array.Array_2)(board));
                    
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5023 =
                      ((long)(((int)(x5027))));
                    
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5024 =
                      ((long)(((int)(y5037))));
                    
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5025 =
                      x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5022).$apply$G((long)(t5023),
                                                                                            (long)(t5024)));
                    
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.String t5026 =
                      (("-") + ((x10.core.Int.$box(t5025))));
                    
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5021.print(((java.lang.String)(t5026)));
                    
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5028 =
                      i5030;
                    
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5029 =
                      ((t5028) + (((int)(1))));
                    
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i5030 = t5029;
                }
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t5036 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5036.println(((java.lang.Object)("-")));
                
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5038 =
                  i5040;
                
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5039 =
                  ((t5038) + (((int)(1))));
                
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i5040 = t5039;
            }
        }
        
        
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private void
                                                                                                               place(
                                                                                                               final Tile someTile){
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4734 =
              ((x10.array.Array_2)(board));
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4732 =
              someTile.
                x;
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4735 =
              ((long)(((int)(t4732))));
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4733 =
              someTile.
                y;
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4736 =
              ((long)(((int)(t4733))));
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int occupation =
              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t4734).$apply$G((long)(t4735),
                                                                                    (long)(t4736)));
            
//#line 121 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t4737 =
              ((int) occupation) ==
            ((int) 2);
            
//#line 121 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t4737)) {
                
//#line 121 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t4737 = ((int) occupation) ==
                ((int) 3);
            }
            
//#line 121 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t4739 =
              t4737;
            
//#line 121 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t4739) {
                
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.RuntimeException t4738 =
                  ((java.lang.RuntimeException)(new java.lang.RuntimeException("Placing on a wrong place!")));
                
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw t4738;
            }
            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t4742 =
              ((x10.array.Array_2)(board));
            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4740 =
              someTile.
                x;
            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4743 =
              ((long)(((int)(t4740))));
            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4741 =
              someTile.
                y;
            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t4744 =
              ((long)(((int)(t4741))));
            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t4745 =
              someTile.
                tileType;
            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
((x10.array.Array_2<x10.core.Int>)t4742).$set__2x10$array$Array_2$$T$G((long)(t4743),
                                                                                                                                                                                        (long)(t4744),
                                                                                                                                                                                        x10.core.Int.$box(t4745));
        }
        
        public static void
          place$P(
          final Tile someTile,
          final Board Board){
            Board.place(((Tile)(someTile)));
        }
        
        
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final public Board
                                                                                                             Board$$this$Board(
                                                                                                             ){
            
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return Board.this;
        }
        
        
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final public void
                                                                                                             __fieldInitializers_Board(
                                                                                                             ){
            
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.OPEN = 1;
            
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.QUEEN = 2;
            
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.PAWN = 3;
        }
    // synthetic type for parameter mangling
    public static final class __1$1Tile$2__2$1Tile$2 {}
    
}

