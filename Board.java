
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
final long t5258 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5259 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5260 =
                                                                                                                     ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array_2$$init$S(t5258,
                                                                                                                                                                                                                                                      t5259)));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.board = ((x10.array.Array_2)(t5260));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail5568 =
                                                                                                                     ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5569 =
                                                                                                                     ((x10.core.Rail<Tile>)rail5568).
                                                                                                                       size;
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5557 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5568$value5854 =
                                                                                                                         ((Tile[])rail5568.value);
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5558 =
                                                                                                                             idx5557;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5559 =
                                                                                                                             ((t5558) < (((long)(size5569))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5559)) {
                                                                                                                               
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5553 =
                                                                                                                             idx5557;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile pawn5554 =
                                                                                                                             ((Tile)(((Tile)rail5568$value5854[(int)t5553])));
                                                                                                                           
//#line 20 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(pawn5554)));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5555 =
                                                                                                                             idx5557;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5556 =
                                                                                                                             ((t5555) + (((long)(1L))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5557 = t5556;
                                                                                                                       }
                                                                                                                   }
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail5570 =
                                                                                                                     ((x10.core.Rail)(queens));
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5571 =
                                                                                                                     ((x10.core.Rail<Tile>)rail5570).
                                                                                                                       size;
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5565 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5570$value5855 =
                                                                                                                         ((Tile[])rail5570.value);
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5566 =
                                                                                                                             idx5565;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5567 =
                                                                                                                             ((t5566) < (((long)(size5571))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5567)) {
                                                                                                                               
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5561 =
                                                                                                                             idx5565;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5562 =
                                                                                                                             ((Tile)(((Tile)rail5570$value5855[(int)t5561])));
                                                                                                                           
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                                                                                                                               
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(queen5562)));
                                                                                                                           }}catch (final java.lang.NullPointerException id$5560) {
                                                                                                                               
//#line 27 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5563 =
                                                                                                                             idx5565;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5564 =
                                                                                                                             ((t5563) + (((long)(1L))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5565 = t5564;
                                                                                                                       }
                                                                                                                   }
                                                                                                               }
                                                                                                               return this;
                                                                                                               }
        
        
        
//#line 32 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validHoriz$O(
                                                                                                              ){
            
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail5629 =
              ((x10.core.Rail)(queens));
            
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5630 =
              ((x10.core.Rail<Tile>)rail5629).
                size;
            
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5626 =
              0L;
            {
                
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5629$value5856 =
                  ((Tile[])rail5629.value);
                
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5627 =
                      idx5626;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5628 =
                      ((t5627) < (((long)(size5630))));
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5628)) {
                        
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5622 =
                      idx5626;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5623 =
                      ((Tile)(((Tile)rail5629$value5856[(int)t5622])));
                    
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos5598 =
                          queen5623.
                            x;
                        
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5599 =
                              xPos5598;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5600 =
                              size;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5601 =
                              ((t5599) < (((int)(t5600))));
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5601) {
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5602 =
                                  ((x10.array.Array_2)(board));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5603 =
                                  xPos5598;
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5604 =
                                  ((long)(((int)(t5603))));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5605 =
                                  queen5623.
                                    y;
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5606 =
                                  ((long)(((int)(t5605))));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5607 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5602).$apply$G((long)(t5604),
                                                                                                        (long)(t5606)));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5608 =
                                  PAWN;
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5601 = ((int) t5607) !=
                                ((int) t5608);
                            }
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5609 =
                              t5601;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5609)) {
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5572 =
                              xPos5598;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5573 =
                              queen5623.
                                x;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5574 =
                              ((int) t5572) !=
                            ((int) t5573);
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5574) {
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5575 =
                                  ((x10.array.Array_2)(board));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5576 =
                                  xPos5598;
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5577 =
                                  ((long)(((int)(t5576))));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5578 =
                                  queen5623.
                                    y;
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5579 =
                                  ((long)(((int)(t5578))));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5580 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5575).$apply$G((long)(t5577),
                                                                                                        (long)(t5579)));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5581 =
                                  QUEEN;
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5574 = ((int) t5580) ==
                                ((int) t5581);
                            }
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5582 =
                              t5574;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5582) {
                                
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5583 =
                              xPos5598;
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5584 =
                              ((t5583) + (((int)(1))));
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5598 = t5584;
                        }
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5610 =
                          queen5623.
                            x;
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5598 = t5610;
                        
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5611 =
                              xPos5598;
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5612 =
                              ((t5611) >= (((int)(0))));
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5612) {
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5613 =
                                  ((x10.array.Array_2)(board));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5614 =
                                  xPos5598;
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5615 =
                                  ((long)(((int)(t5614))));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5616 =
                                  queen5623.
                                    y;
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5617 =
                                  ((long)(((int)(t5616))));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5618 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5613).$apply$G((long)(t5615),
                                                                                                        (long)(t5617)));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5619 =
                                  PAWN;
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5612 = ((int) t5618) !=
                                ((int) t5619);
                            }
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5620 =
                              t5612;
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5620)) {
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5585 =
                              xPos5598;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5586 =
                              queen5623.
                                x;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5587 =
                              ((int) t5585) !=
                            ((int) t5586);
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5587) {
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5588 =
                                  ((x10.array.Array_2)(board));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5589 =
                                  xPos5598;
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5590 =
                                  ((long)(((int)(t5589))));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5591 =
                                  queen5623.
                                    y;
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5592 =
                                  ((long)(((int)(t5591))));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5593 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5588).$apply$G((long)(t5590),
                                                                                                        (long)(t5592)));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5594 =
                                  QUEEN;
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5587 = ((int) t5593) ==
                                ((int) t5594);
                            }
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5595 =
                              t5587;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5595) {
                                
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5596 =
                              xPos5598;
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5597 =
                              ((t5596) - (((int)(1))));
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5598 = t5597;
                        }
                    }}catch (final java.lang.NullPointerException id$5621) {
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5624 =
                      idx5626;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5625 =
                      ((t5624) + (((long)(1L))));
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5626 = t5625;
                }
            }
            
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validHoriz$P$O(
          final Board Board){
            return Board.validHoriz$O();
        }
        
        
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validVert$O(
                                                                                                              ){
            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail5688 =
              ((x10.core.Rail)(queens));
            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5689 =
              ((x10.core.Rail<Tile>)rail5688).
                size;
            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5685 =
              0L;
            {
                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5688$value5857 =
                  ((Tile[])rail5688.value);
                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5686 =
                      idx5685;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5687 =
                      ((t5686) < (((long)(size5689))));
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5687)) {
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5681 =
                      idx5685;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5682 =
                      ((Tile)(((Tile)rail5688$value5857[(int)t5681])));
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos5657 =
                          queen5682.
                            y;
                        
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5658 =
                              yPos5657;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5659 =
                              size;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5660 =
                              ((t5658) < (((int)(t5659))));
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5660) {
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5661 =
                                  ((x10.array.Array_2)(board));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5662 =
                                  queen5682.
                                    x;
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5663 =
                                  ((long)(((int)(t5662))));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5664 =
                                  yPos5657;
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5665 =
                                  ((long)(((int)(t5664))));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5666 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5661).$apply$G((long)(t5663),
                                                                                                        (long)(t5665)));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5667 =
                                  PAWN;
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5660 = ((int) t5666) !=
                                ((int) t5667);
                            }
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5668 =
                              t5660;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5668)) {
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5631 =
                              yPos5657;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5632 =
                              queen5682.
                                y;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5633 =
                              ((int) t5631) !=
                            ((int) t5632);
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5633) {
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5634 =
                                  ((x10.array.Array_2)(board));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5635 =
                                  queen5682.
                                    x;
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5636 =
                                  ((long)(((int)(t5635))));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5637 =
                                  yPos5657;
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5638 =
                                  ((long)(((int)(t5637))));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5639 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5634).$apply$G((long)(t5636),
                                                                                                        (long)(t5638)));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5640 =
                                  QUEEN;
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5633 = ((int) t5639) ==
                                ((int) t5640);
                            }
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5641 =
                              t5633;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5641) {
                                
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5642 =
                              yPos5657;
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5643 =
                              ((t5642) + (((int)(1))));
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5657 = t5643;
                        }
                        
//#line 67 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5669 =
                          queen5682.
                            y;
                        
//#line 67 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5657 = t5669;
                        
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5670 =
                              yPos5657;
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5671 =
                              ((t5670) >= (((int)(0))));
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5671) {
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5672 =
                                  ((x10.array.Array_2)(board));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5673 =
                                  queen5682.
                                    x;
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5674 =
                                  ((long)(((int)(t5673))));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5675 =
                                  yPos5657;
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5676 =
                                  ((long)(((int)(t5675))));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5677 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5672).$apply$G((long)(t5674),
                                                                                                        (long)(t5676)));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5678 =
                                  PAWN;
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5671 = ((int) t5677) !=
                                ((int) t5678);
                            }
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5679 =
                              t5671;
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5679)) {
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5644 =
                              yPos5657;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5645 =
                              queen5682.
                                y;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5646 =
                              ((int) t5644) !=
                            ((int) t5645);
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5646) {
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5647 =
                                  ((x10.array.Array_2)(board));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5648 =
                                  queen5682.
                                    x;
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5649 =
                                  ((long)(((int)(t5648))));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5650 =
                                  yPos5657;
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5651 =
                                  ((long)(((int)(t5650))));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5652 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5647).$apply$G((long)(t5649),
                                                                                                        (long)(t5651)));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5653 =
                                  QUEEN;
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5646 = ((int) t5652) ==
                                ((int) t5653);
                            }
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5654 =
                              t5646;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5654) {
                                
//#line 70 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5655 =
                              yPos5657;
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5656 =
                              ((t5655) - (((int)(1))));
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5657 = t5656;
                        }
                    }}catch (final java.lang.NullPointerException id$5680) {
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5683 =
                      idx5685;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5684 =
                      ((t5683) + (((long)(1L))));
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5685 = t5684;
                }
            }
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validVert$P$O(
          final Board Board){
            return Board.validVert$O();
        }
        
        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validDiag$O(
                                                                                                              ){
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail5830 =
              ((x10.core.Rail)(queens));
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5831 =
              ((x10.core.Rail<Tile>)rail5830).
                size;
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5827 =
              0L;
            {
                
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5830$value5858 =
                  ((Tile[])rail5830.value);
                
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5828 =
                      idx5827;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5829 =
                      ((t5828) < (((long)(size5831))));
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5829)) {
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5823 =
                      idx5827;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5824 =
                      ((Tile)(((Tile)rail5830$value5858[(int)t5823])));
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos5762 =
                          queen5824.
                            y;
                        
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos5763 =
                          queen5824.
                            x;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5764 =
                              xPos5763;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5765 =
                              size;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5766 =
                              ((t5764) < (((int)(t5765))));
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5766) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5767 =
                                  yPos5762;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5768 =
                                  size;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5766 = ((t5767) < (((int)(t5768))));
                            }
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5769 =
                              t5766;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5769) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5770 =
                                  ((x10.array.Array_2)(board));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5771 =
                                  xPos5763;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5772 =
                                  ((long)(((int)(t5771))));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5773 =
                                  yPos5762;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5774 =
                                  ((long)(((int)(t5773))));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5775 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5770).$apply$G((long)(t5772),
                                                                                                        (long)(t5774)));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5776 =
                                  PAWN;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5769 = ((int) t5775) !=
                                ((int) t5776);
                            }
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5777 =
                              t5769;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5777)) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5690 =
                              xPos5763;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5691 =
                              queen5824.
                                x;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5692 =
                              ((int) t5690) !=
                            ((int) t5691);
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5692) {
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5693 =
                                  yPos5762;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5694 =
                                  queen5824.
                                    y;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5692 = ((int) t5693) !=
                                ((int) t5694);
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5695 =
                              t5692;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5695) {
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5696 =
                                  ((x10.array.Array_2)(board));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5697 =
                                  xPos5763;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5698 =
                                  ((long)(((int)(t5697))));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5699 =
                                  yPos5762;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5700 =
                                  ((long)(((int)(t5699))));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5701 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5696).$apply$G((long)(t5698),
                                                                                                        (long)(t5700)));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5702 =
                                  QUEEN;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5695 = ((int) t5701) ==
                                ((int) t5702);
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5703 =
                              t5695;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5703) {
                                
//#line 89 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5704 =
                              xPos5763;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5705 =
                              ((t5704) + (((int)(1))));
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5763 = t5705;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5706 =
                              yPos5762;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5707 =
                              ((t5706) + (((int)(1))));
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5762 = t5707;
                        }
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5778 =
                          queen5824.
                            y;
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5762 = t5778;
                        
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5779 =
                          queen5824.
                            x;
                        
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5763 = t5779;
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5780 =
                              xPos5763;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5781 =
                              ((t5780) >= (((int)(0))));
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5781) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5782 =
                                  yPos5762;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5781 = ((t5782) >= (((int)(0))));
                            }
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5783 =
                              t5781;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5783) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5784 =
                                  ((x10.array.Array_2)(board));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5785 =
                                  xPos5763;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5786 =
                                  ((long)(((int)(t5785))));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5787 =
                                  yPos5762;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5788 =
                                  ((long)(((int)(t5787))));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5789 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5784).$apply$G((long)(t5786),
                                                                                                        (long)(t5788)));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5790 =
                                  PAWN;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5783 = ((int) t5789) !=
                                ((int) t5790);
                            }
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5791 =
                              t5783;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5791)) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5708 =
                              xPos5763;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5709 =
                              queen5824.
                                x;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5710 =
                              ((int) t5708) !=
                            ((int) t5709);
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5710) {
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5711 =
                                  yPos5762;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5712 =
                                  queen5824.
                                    y;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5710 = ((int) t5711) !=
                                ((int) t5712);
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5713 =
                              t5710;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5713) {
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5714 =
                                  ((x10.array.Array_2)(board));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5715 =
                                  xPos5763;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5716 =
                                  ((long)(((int)(t5715))));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5717 =
                                  yPos5762;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5718 =
                                  ((long)(((int)(t5717))));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5719 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5714).$apply$G((long)(t5716),
                                                                                                        (long)(t5718)));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5720 =
                                  QUEEN;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5713 = ((int) t5719) ==
                                ((int) t5720);
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5721 =
                              t5713;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5721) {
                                
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5722 =
                              xPos5763;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5723 =
                              ((t5722) - (((int)(1))));
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5763 = t5723;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5724 =
                              yPos5762;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5725 =
                              ((t5724) - (((int)(1))));
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5762 = t5725;
                        }
                        
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5792 =
                          queen5824.
                            y;
                        
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5762 = t5792;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5793 =
                          queen5824.
                            x;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5763 = t5793;
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5794 =
                              xPos5763;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5795 =
                              size;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5796 =
                              ((t5794) < (((int)(t5795))));
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5796) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5797 =
                                  yPos5762;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5796 = ((t5797) >= (((int)(0))));
                            }
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5798 =
                              t5796;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5798) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5799 =
                                  ((x10.array.Array_2)(board));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5800 =
                                  xPos5763;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5801 =
                                  ((long)(((int)(t5800))));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5802 =
                                  yPos5762;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5803 =
                                  ((long)(((int)(t5802))));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5804 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5799).$apply$G((long)(t5801),
                                                                                                        (long)(t5803)));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5805 =
                                  PAWN;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5798 = ((int) t5804) !=
                                ((int) t5805);
                            }
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5806 =
                              t5798;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5806)) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5726 =
                              xPos5763;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5727 =
                              queen5824.
                                x;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5728 =
                              ((int) t5726) !=
                            ((int) t5727);
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5728) {
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5729 =
                                  yPos5762;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5730 =
                                  queen5824.
                                    y;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5728 = ((int) t5729) !=
                                ((int) t5730);
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5731 =
                              t5728;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5731) {
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5732 =
                                  ((x10.array.Array_2)(board));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5733 =
                                  xPos5763;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5734 =
                                  ((long)(((int)(t5733))));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5735 =
                                  yPos5762;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5736 =
                                  ((long)(((int)(t5735))));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5737 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5732).$apply$G((long)(t5734),
                                                                                                        (long)(t5736)));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5738 =
                                  QUEEN;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5731 = ((int) t5737) ==
                                ((int) t5738);
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5739 =
                              t5731;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5739) {
                                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5740 =
                              xPos5763;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5741 =
                              ((t5740) + (((int)(1))));
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5763 = t5741;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5742 =
                              yPos5762;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5743 =
                              ((t5742) - (((int)(1))));
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5762 = t5743;
                        }
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5807 =
                          queen5824.
                            y;
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5762 = t5807;
                        
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5808 =
                          queen5824.
                            x;
                        
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5763 = t5808;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5809 =
                              xPos5763;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5810 =
                              ((t5809) >= (((int)(0))));
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5810) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5811 =
                                  yPos5762;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5812 =
                                  size;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5810 = ((t5811) < (((int)(t5812))));
                            }
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5813 =
                              t5810;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5813) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5814 =
                                  ((x10.array.Array_2)(board));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5815 =
                                  xPos5763;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5816 =
                                  ((long)(((int)(t5815))));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5817 =
                                  yPos5762;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5818 =
                                  ((long)(((int)(t5817))));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5819 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5814).$apply$G((long)(t5816),
                                                                                                        (long)(t5818)));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5820 =
                                  PAWN;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5813 = ((int) t5819) !=
                                ((int) t5820);
                            }
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5821 =
                              t5813;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5821)) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5744 =
                              xPos5763;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5745 =
                              queen5824.
                                x;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5746 =
                              ((int) t5744) !=
                            ((int) t5745);
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5746) {
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5747 =
                                  yPos5762;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5748 =
                                  queen5824.
                                    y;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5746 = ((int) t5747) !=
                                ((int) t5748);
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5749 =
                              t5746;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5749) {
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5750 =
                                  ((x10.array.Array_2)(board));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5751 =
                                  xPos5763;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5752 =
                                  ((long)(((int)(t5751))));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5753 =
                                  yPos5762;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5754 =
                                  ((long)(((int)(t5753))));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5755 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5750).$apply$G((long)(t5752),
                                                                                                        (long)(t5754)));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5756 =
                                  QUEEN;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5749 = ((int) t5755) ==
                                ((int) t5756);
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5757 =
                              t5749;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5757) {
                                
//#line 113 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5758 =
                              xPos5763;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5759 =
                              ((t5758) - (((int)(1))));
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5763 = t5759;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5760 =
                              yPos5762;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5761 =
                              ((t5760) + (((int)(1))));
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5762 = t5761;
                        }
                    }}catch (final java.lang.NullPointerException id$5822) {
                        
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5825 =
                      idx5827;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5826 =
                      ((t5825) + (((long)(1L))));
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5827 = t5826;
                }
            }
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validDiag$P$O(
          final Board Board){
            return Board.validDiag$O();
        }
        
        
//#line 125 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public boolean
                                                                                                               valid$O(
                                                                                                               ){
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5517 =
              this.validDiag$O();
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5517) {
                
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5517 = this.validVert$O();
            }
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5518 =
              t5517;
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5518) {
                
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5518 = this.validHoriz$O();
            }
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5519 =
              t5518;
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return t5519;
        }
        
        
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public void
                                                                                                               print(
                                                                                                               ){
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i5243min5244 =
              0;
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5520 =
              size;
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i5243max5245 =
              ((t5520) - (((int)(1))));
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i5851 =
              i5243min5244;
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5852 =
                  i5851;
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5853 =
                  ((t5852) <= (((int)(i5243max5245))));
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5853)) {
                    
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                }
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int y5848 =
                  i5851;
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i5227min5844 =
                  0;
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5845 =
                  size;
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i5227max5846 =
                  ((t5845) - (((int)(1))));
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i5841 =
                  i5227min5844;
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5842 =
                      i5841;
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5843 =
                      ((t5842) <= (((int)(i5227max5846))));
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5843)) {
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int x5838 =
                      i5841;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t5832 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5833 =
                      ((x10.array.Array_2)(board));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5834 =
                      ((long)(((int)(x5838))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5835 =
                      ((long)(((int)(y5848))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5836 =
                      x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5833).$apply$G((long)(t5834),
                                                                                            (long)(t5835)));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.String t5837 =
                      (("-") + ((x10.core.Int.$box(t5836))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5832.print(((java.lang.String)(t5837)));
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5839 =
                      i5841;
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5840 =
                      ((t5839) + (((int)(1))));
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i5841 = t5840;
                }
                
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t5847 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5847.println(((java.lang.Object)("-")));
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5849 =
                  i5851;
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5850 =
                  ((t5849) + (((int)(1))));
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i5851 = t5850;
            }
        }
        
        
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private void
                                                                                                               place(
                                                                                                               final Tile someTile){
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5541 =
              ((x10.array.Array_2)(board));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5539 =
              someTile.
                x;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5542 =
              ((long)(((int)(t5539))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5540 =
              someTile.
                y;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5543 =
              ((long)(((int)(t5540))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int occupation =
              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5541).$apply$G((long)(t5542),
                                                                                    (long)(t5543)));
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5544 =
              ((int) occupation) ==
            ((int) 2);
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5544)) {
                
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5544 = ((int) occupation) ==
                ((int) 3);
            }
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5546 =
              t5544;
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5546) {
                
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.RuntimeException t5545 =
                  ((java.lang.RuntimeException)(new java.lang.RuntimeException("Placing on a wrong place!")));
                
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw t5545;
            }
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5549 =
              ((x10.array.Array_2)(board));
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5547 =
              someTile.
                x;
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5550 =
              ((long)(((int)(t5547))));
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5548 =
              someTile.
                y;
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5551 =
              ((long)(((int)(t5548))));
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5552 =
              someTile.
                tileType;
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
((x10.array.Array_2<x10.core.Int>)t5549).$set__2x10$array$Array_2$$T$G((long)(t5550),
                                                                                                                                                                                        (long)(t5551),
                                                                                                                                                                                        x10.core.Int.$box(t5552));
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

