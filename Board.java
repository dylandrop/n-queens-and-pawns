
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
final long t5255 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5256 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5257 =
                                                                                                                     ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array_2$$init$S(t5255,
                                                                                                                                                                                                                                                      t5256)));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.board = ((x10.array.Array_2)(t5257));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail5565 =
                                                                                                                     ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5566 =
                                                                                                                     ((x10.core.Rail<Tile>)rail5565).
                                                                                                                       size;
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5554 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5565$value5851 =
                                                                                                                         ((Tile[])rail5565.value);
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5555 =
                                                                                                                             idx5554;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5556 =
                                                                                                                             ((t5555) < (((long)(size5566))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5556)) {
                                                                                                                               
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5550 =
                                                                                                                             idx5554;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile pawn5551 =
                                                                                                                             ((Tile)(((Tile)rail5565$value5851[(int)t5550])));
                                                                                                                           
//#line 20 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(pawn5551)));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5552 =
                                                                                                                             idx5554;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5553 =
                                                                                                                             ((t5552) + (((long)(1L))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5554 = t5553;
                                                                                                                       }
                                                                                                                   }
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail5567 =
                                                                                                                     ((x10.core.Rail)(queens));
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5568 =
                                                                                                                     ((x10.core.Rail<Tile>)rail5567).
                                                                                                                       size;
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5562 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5567$value5852 =
                                                                                                                         ((Tile[])rail5567.value);
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5563 =
                                                                                                                             idx5562;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5564 =
                                                                                                                             ((t5563) < (((long)(size5568))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5564)) {
                                                                                                                               
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5558 =
                                                                                                                             idx5562;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5559 =
                                                                                                                             ((Tile)(((Tile)rail5567$value5852[(int)t5558])));
                                                                                                                           
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                                                                                                                               
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(queen5559)));
                                                                                                                           }}catch (final java.lang.NullPointerException id$5557) {
                                                                                                                               
//#line 27 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5560 =
                                                                                                                             idx5562;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5561 =
                                                                                                                             ((t5560) + (((long)(1L))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5562 = t5561;
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
final x10.core.Rail rail5626 =
              ((x10.core.Rail)(queens));
            
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5627 =
              ((x10.core.Rail<Tile>)rail5626).
                size;
            
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5623 =
              0L;
            {
                
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5626$value5853 =
                  ((Tile[])rail5626.value);
                
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5624 =
                      idx5623;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5625 =
                      ((t5624) < (((long)(size5627))));
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5625)) {
                        
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5619 =
                      idx5623;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5620 =
                      ((Tile)(((Tile)rail5626$value5853[(int)t5619])));
                    
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos5595 =
                          queen5620.
                            x;
                        
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5596 =
                              xPos5595;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5597 =
                              size;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5598 =
                              ((t5596) < (((int)(t5597))));
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5598) {
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5599 =
                                  ((x10.array.Array_2)(board));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5600 =
                                  xPos5595;
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5601 =
                                  ((long)(((int)(t5600))));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5602 =
                                  queen5620.
                                    y;
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5603 =
                                  ((long)(((int)(t5602))));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5604 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5599).$apply$G((long)(t5601),
                                                                                                        (long)(t5603)));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5605 =
                                  PAWN;
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5598 = ((int) t5604) !=
                                ((int) t5605);
                            }
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5606 =
                              t5598;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5606)) {
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5569 =
                              xPos5595;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5570 =
                              queen5620.
                                x;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5571 =
                              ((int) t5569) !=
                            ((int) t5570);
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5571) {
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5572 =
                                  ((x10.array.Array_2)(board));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5573 =
                                  xPos5595;
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5574 =
                                  ((long)(((int)(t5573))));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5575 =
                                  queen5620.
                                    y;
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5576 =
                                  ((long)(((int)(t5575))));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5577 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5572).$apply$G((long)(t5574),
                                                                                                        (long)(t5576)));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5578 =
                                  QUEEN;
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5571 = ((int) t5577) ==
                                ((int) t5578);
                            }
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5579 =
                              t5571;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5579) {
                                
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5580 =
                              xPos5595;
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5581 =
                              ((t5580) + (((int)(1))));
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5595 = t5581;
                        }
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5607 =
                          queen5620.
                            x;
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5595 = t5607;
                        
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5608 =
                              xPos5595;
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5609 =
                              ((t5608) >= (((int)(0))));
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5609) {
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5610 =
                                  ((x10.array.Array_2)(board));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5611 =
                                  xPos5595;
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5612 =
                                  ((long)(((int)(t5611))));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5613 =
                                  queen5620.
                                    y;
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5614 =
                                  ((long)(((int)(t5613))));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5615 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5610).$apply$G((long)(t5612),
                                                                                                        (long)(t5614)));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5616 =
                                  PAWN;
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5609 = ((int) t5615) !=
                                ((int) t5616);
                            }
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5617 =
                              t5609;
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5617)) {
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5582 =
                              xPos5595;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5583 =
                              queen5620.
                                x;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5584 =
                              ((int) t5582) !=
                            ((int) t5583);
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5584) {
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5585 =
                                  ((x10.array.Array_2)(board));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5586 =
                                  xPos5595;
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5587 =
                                  ((long)(((int)(t5586))));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5588 =
                                  queen5620.
                                    y;
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5589 =
                                  ((long)(((int)(t5588))));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5590 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5585).$apply$G((long)(t5587),
                                                                                                        (long)(t5589)));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5591 =
                                  QUEEN;
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5584 = ((int) t5590) ==
                                ((int) t5591);
                            }
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5592 =
                              t5584;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5592) {
                                
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5593 =
                              xPos5595;
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5594 =
                              ((t5593) - (((int)(1))));
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5595 = t5594;
                        }
                    }}catch (final java.lang.NullPointerException id$5618) {
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5621 =
                      idx5623;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5622 =
                      ((t5621) + (((long)(1L))));
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5623 = t5622;
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
final x10.core.Rail rail5685 =
              ((x10.core.Rail)(queens));
            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5686 =
              ((x10.core.Rail<Tile>)rail5685).
                size;
            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5682 =
              0L;
            {
                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5685$value5854 =
                  ((Tile[])rail5685.value);
                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5683 =
                      idx5682;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5684 =
                      ((t5683) < (((long)(size5686))));
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5684)) {
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5678 =
                      idx5682;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5679 =
                      ((Tile)(((Tile)rail5685$value5854[(int)t5678])));
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos5654 =
                          queen5679.
                            y;
                        
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5655 =
                              yPos5654;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5656 =
                              size;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5657 =
                              ((t5655) < (((int)(t5656))));
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5657) {
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5658 =
                                  ((x10.array.Array_2)(board));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5659 =
                                  queen5679.
                                    x;
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5660 =
                                  ((long)(((int)(t5659))));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5661 =
                                  yPos5654;
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5662 =
                                  ((long)(((int)(t5661))));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5663 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5658).$apply$G((long)(t5660),
                                                                                                        (long)(t5662)));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5664 =
                                  PAWN;
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5657 = ((int) t5663) !=
                                ((int) t5664);
                            }
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5665 =
                              t5657;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5665)) {
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5628 =
                              yPos5654;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5629 =
                              queen5679.
                                y;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5630 =
                              ((int) t5628) !=
                            ((int) t5629);
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5630) {
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5631 =
                                  ((x10.array.Array_2)(board));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5632 =
                                  queen5679.
                                    x;
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5633 =
                                  ((long)(((int)(t5632))));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5634 =
                                  yPos5654;
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5635 =
                                  ((long)(((int)(t5634))));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5636 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5631).$apply$G((long)(t5633),
                                                                                                        (long)(t5635)));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5637 =
                                  QUEEN;
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5630 = ((int) t5636) ==
                                ((int) t5637);
                            }
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5638 =
                              t5630;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5638) {
                                
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5639 =
                              yPos5654;
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5640 =
                              ((t5639) + (((int)(1))));
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5654 = t5640;
                        }
                        
//#line 67 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5666 =
                          queen5679.
                            y;
                        
//#line 67 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5654 = t5666;
                        
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5667 =
                              yPos5654;
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5668 =
                              ((t5667) >= (((int)(0))));
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5668) {
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5669 =
                                  ((x10.array.Array_2)(board));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5670 =
                                  queen5679.
                                    x;
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5671 =
                                  ((long)(((int)(t5670))));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5672 =
                                  yPos5654;
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5673 =
                                  ((long)(((int)(t5672))));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5674 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5669).$apply$G((long)(t5671),
                                                                                                        (long)(t5673)));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5675 =
                                  PAWN;
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5668 = ((int) t5674) !=
                                ((int) t5675);
                            }
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5676 =
                              t5668;
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5676)) {
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5641 =
                              yPos5654;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5642 =
                              queen5679.
                                y;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5643 =
                              ((int) t5641) !=
                            ((int) t5642);
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5643) {
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5644 =
                                  ((x10.array.Array_2)(board));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5645 =
                                  queen5679.
                                    x;
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5646 =
                                  ((long)(((int)(t5645))));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5647 =
                                  yPos5654;
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5648 =
                                  ((long)(((int)(t5647))));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5649 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5644).$apply$G((long)(t5646),
                                                                                                        (long)(t5648)));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5650 =
                                  QUEEN;
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5643 = ((int) t5649) ==
                                ((int) t5650);
                            }
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5651 =
                              t5643;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5651) {
                                
//#line 70 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5652 =
                              yPos5654;
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5653 =
                              ((t5652) - (((int)(1))));
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5654 = t5653;
                        }
                    }}catch (final java.lang.NullPointerException id$5677) {
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5680 =
                      idx5682;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5681 =
                      ((t5680) + (((long)(1L))));
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5682 = t5681;
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
final x10.core.Rail rail5827 =
              ((x10.core.Rail)(queens));
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size5828 =
              ((x10.core.Rail<Tile>)rail5827).
                size;
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx5824 =
              0L;
            {
                
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail5827$value5855 =
                  ((Tile[])rail5827.value);
                
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5825 =
                      idx5824;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5826 =
                      ((t5825) < (((long)(size5828))));
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5826)) {
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5820 =
                      idx5824;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen5821 =
                      ((Tile)(((Tile)rail5827$value5855[(int)t5820])));
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos5759 =
                          queen5821.
                            y;
                        
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos5760 =
                          queen5821.
                            x;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5761 =
                              xPos5760;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5762 =
                              size;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5763 =
                              ((t5761) < (((int)(t5762))));
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5763) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5764 =
                                  yPos5759;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5765 =
                                  size;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5763 = ((t5764) < (((int)(t5765))));
                            }
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5766 =
                              t5763;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5766) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5767 =
                                  ((x10.array.Array_2)(board));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5768 =
                                  xPos5760;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5769 =
                                  ((long)(((int)(t5768))));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5770 =
                                  yPos5759;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5771 =
                                  ((long)(((int)(t5770))));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5772 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5767).$apply$G((long)(t5769),
                                                                                                        (long)(t5771)));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5773 =
                                  PAWN;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5766 = ((int) t5772) !=
                                ((int) t5773);
                            }
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5774 =
                              t5766;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5774)) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5687 =
                              xPos5760;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5688 =
                              queen5821.
                                x;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5689 =
                              ((int) t5687) !=
                            ((int) t5688);
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5689) {
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5690 =
                                  yPos5759;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5691 =
                                  queen5821.
                                    y;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5689 = ((int) t5690) !=
                                ((int) t5691);
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5692 =
                              t5689;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5692) {
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5693 =
                                  ((x10.array.Array_2)(board));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5694 =
                                  xPos5760;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5695 =
                                  ((long)(((int)(t5694))));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5696 =
                                  yPos5759;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5697 =
                                  ((long)(((int)(t5696))));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5698 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5693).$apply$G((long)(t5695),
                                                                                                        (long)(t5697)));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5699 =
                                  QUEEN;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5692 = ((int) t5698) ==
                                ((int) t5699);
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5700 =
                              t5692;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5700) {
                                
//#line 89 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5701 =
                              xPos5760;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5702 =
                              ((t5701) + (((int)(1))));
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5760 = t5702;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5703 =
                              yPos5759;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5704 =
                              ((t5703) + (((int)(1))));
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5759 = t5704;
                        }
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5775 =
                          queen5821.
                            y;
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5759 = t5775;
                        
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5776 =
                          queen5821.
                            x;
                        
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5760 = t5776;
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5777 =
                              xPos5760;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5778 =
                              ((t5777) >= (((int)(0))));
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5778) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5779 =
                                  yPos5759;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5778 = ((t5779) >= (((int)(0))));
                            }
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5780 =
                              t5778;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5780) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5781 =
                                  ((x10.array.Array_2)(board));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5782 =
                                  xPos5760;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5783 =
                                  ((long)(((int)(t5782))));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5784 =
                                  yPos5759;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5785 =
                                  ((long)(((int)(t5784))));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5786 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5781).$apply$G((long)(t5783),
                                                                                                        (long)(t5785)));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5787 =
                                  PAWN;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5780 = ((int) t5786) !=
                                ((int) t5787);
                            }
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5788 =
                              t5780;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5788)) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5705 =
                              xPos5760;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5706 =
                              queen5821.
                                x;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5707 =
                              ((int) t5705) !=
                            ((int) t5706);
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5707) {
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5708 =
                                  yPos5759;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5709 =
                                  queen5821.
                                    y;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5707 = ((int) t5708) !=
                                ((int) t5709);
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5710 =
                              t5707;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5710) {
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5711 =
                                  ((x10.array.Array_2)(board));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5712 =
                                  xPos5760;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5713 =
                                  ((long)(((int)(t5712))));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5714 =
                                  yPos5759;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5715 =
                                  ((long)(((int)(t5714))));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5716 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5711).$apply$G((long)(t5713),
                                                                                                        (long)(t5715)));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5717 =
                                  QUEEN;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5710 = ((int) t5716) ==
                                ((int) t5717);
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5718 =
                              t5710;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5718) {
                                
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5719 =
                              xPos5760;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5720 =
                              ((t5719) - (((int)(1))));
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5760 = t5720;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5721 =
                              yPos5759;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5722 =
                              ((t5721) - (((int)(1))));
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5759 = t5722;
                        }
                        
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5789 =
                          queen5821.
                            y;
                        
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5759 = t5789;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5790 =
                          queen5821.
                            x;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5760 = t5790;
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5791 =
                              xPos5760;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5792 =
                              size;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5793 =
                              ((t5791) < (((int)(t5792))));
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5793) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5794 =
                                  yPos5759;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5793 = ((t5794) >= (((int)(0))));
                            }
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5795 =
                              t5793;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5795) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5796 =
                                  ((x10.array.Array_2)(board));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5797 =
                                  xPos5760;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5798 =
                                  ((long)(((int)(t5797))));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5799 =
                                  yPos5759;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5800 =
                                  ((long)(((int)(t5799))));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5801 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5796).$apply$G((long)(t5798),
                                                                                                        (long)(t5800)));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5802 =
                                  PAWN;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5795 = ((int) t5801) !=
                                ((int) t5802);
                            }
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5803 =
                              t5795;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5803)) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5723 =
                              xPos5760;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5724 =
                              queen5821.
                                x;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5725 =
                              ((int) t5723) !=
                            ((int) t5724);
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5725) {
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5726 =
                                  yPos5759;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5727 =
                                  queen5821.
                                    y;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5725 = ((int) t5726) !=
                                ((int) t5727);
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5728 =
                              t5725;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5728) {
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5729 =
                                  ((x10.array.Array_2)(board));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5730 =
                                  xPos5760;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5731 =
                                  ((long)(((int)(t5730))));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5732 =
                                  yPos5759;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5733 =
                                  ((long)(((int)(t5732))));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5734 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5729).$apply$G((long)(t5731),
                                                                                                        (long)(t5733)));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5735 =
                                  QUEEN;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5728 = ((int) t5734) ==
                                ((int) t5735);
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5736 =
                              t5728;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5736) {
                                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5737 =
                              xPos5760;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5738 =
                              ((t5737) + (((int)(1))));
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5760 = t5738;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5739 =
                              yPos5759;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5740 =
                              ((t5739) - (((int)(1))));
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5759 = t5740;
                        }
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5804 =
                          queen5821.
                            y;
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5759 = t5804;
                        
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5805 =
                          queen5821.
                            x;
                        
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5760 = t5805;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5806 =
                              xPos5760;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5807 =
                              ((t5806) >= (((int)(0))));
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5807) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5808 =
                                  yPos5759;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5809 =
                                  size;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5807 = ((t5808) < (((int)(t5809))));
                            }
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5810 =
                              t5807;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5810) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5811 =
                                  ((x10.array.Array_2)(board));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5812 =
                                  xPos5760;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5813 =
                                  ((long)(((int)(t5812))));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5814 =
                                  yPos5759;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5815 =
                                  ((long)(((int)(t5814))));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5816 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5811).$apply$G((long)(t5813),
                                                                                                        (long)(t5815)));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5817 =
                                  PAWN;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5810 = ((int) t5816) !=
                                ((int) t5817);
                            }
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5818 =
                              t5810;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5818)) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5741 =
                              xPos5760;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5742 =
                              queen5821.
                                x;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5743 =
                              ((int) t5741) !=
                            ((int) t5742);
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5743) {
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5744 =
                                  yPos5759;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5745 =
                                  queen5821.
                                    y;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5743 = ((int) t5744) !=
                                ((int) t5745);
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5746 =
                              t5743;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5746) {
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5747 =
                                  ((x10.array.Array_2)(board));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5748 =
                                  xPos5760;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5749 =
                                  ((long)(((int)(t5748))));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5750 =
                                  yPos5759;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5751 =
                                  ((long)(((int)(t5750))));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5752 =
                                  x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5747).$apply$G((long)(t5749),
                                                                                                        (long)(t5751)));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5753 =
                                  QUEEN;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5746 = ((int) t5752) ==
                                ((int) t5753);
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5754 =
                              t5746;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5754) {
                                
//#line 113 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5755 =
                              xPos5760;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5756 =
                              ((t5755) - (((int)(1))));
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos5760 = t5756;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5757 =
                              yPos5759;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5758 =
                              ((t5757) + (((int)(1))));
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos5759 = t5758;
                        }
                    }}catch (final java.lang.NullPointerException id$5819) {
                        
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5822 =
                      idx5824;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5823 =
                      ((t5822) + (((long)(1L))));
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx5824 = t5823;
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
boolean t5514 =
              this.validDiag$O();
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5514) {
                
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5514 = this.validVert$O();
            }
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5515 =
              t5514;
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5515) {
                
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5515 = this.validHoriz$O();
            }
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5516 =
              t5515;
            
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return t5516;
        }
        
        
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public void
                                                                                                               print(
                                                                                                               ){
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i5240min5241 =
              0;
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5517 =
              size;
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i5240max5242 =
              ((t5517) - (((int)(1))));
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i5848 =
              i5240min5241;
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5849 =
                  i5848;
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5850 =
                  ((t5849) <= (((int)(i5240max5242))));
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5850)) {
                    
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                }
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int y5845 =
                  i5848;
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i5224min5841 =
                  0;
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5842 =
                  size;
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i5224max5843 =
                  ((t5842) - (((int)(1))));
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i5838 =
                  i5224min5841;
                
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5839 =
                      i5838;
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5840 =
                      ((t5839) <= (((int)(i5224max5843))));
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5840)) {
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int x5835 =
                      i5838;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t5829 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5830 =
                      ((x10.array.Array_2)(board));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5831 =
                      ((long)(((int)(x5835))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5832 =
                      ((long)(((int)(y5845))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5833 =
                      x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5830).$apply$G((long)(t5831),
                                                                                            (long)(t5832)));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.String t5834 =
                      (("-") + ((x10.core.Int.$box(t5833))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5829.print(((java.lang.String)(t5834)));
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5836 =
                      i5838;
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5837 =
                      ((t5836) + (((int)(1))));
                    
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i5838 = t5837;
                }
                
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t5844 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5844.println(((java.lang.Object)("-")));
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5846 =
                  i5848;
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5847 =
                  ((t5846) + (((int)(1))));
                
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i5848 = t5847;
            }
        }
        
        
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private void
                                                                                                               place(
                                                                                                               final Tile someTile){
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5538 =
              ((x10.array.Array_2)(board));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5536 =
              someTile.
                x;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5539 =
              ((long)(((int)(t5536))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5537 =
              someTile.
                y;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5540 =
              ((long)(((int)(t5537))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int occupation =
              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t5538).$apply$G((long)(t5539),
                                                                                    (long)(t5540)));
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t5541 =
              ((int) occupation) ==
            ((int) 2);
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t5541)) {
                
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t5541 = ((int) occupation) ==
                ((int) 3);
            }
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t5543 =
              t5541;
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t5543) {
                
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.RuntimeException t5542 =
                  ((java.lang.RuntimeException)(new java.lang.RuntimeException("Placing on a wrong place!")));
                
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw t5542;
            }
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t5546 =
              ((x10.array.Array_2)(board));
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5544 =
              someTile.
                x;
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5547 =
              ((long)(((int)(t5544))));
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5545 =
              someTile.
                y;
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t5548 =
              ((long)(((int)(t5545))));
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t5549 =
              someTile.
                tileType;
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
((x10.array.Array_2<x10.core.Int>)t5546).$set__2x10$array$Array_2$$T$G((long)(t5547),
                                                                                                                                                                                        (long)(t5548),
                                                                                                                                                                                        x10.core.Int.$box(t5549));
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

