
@x10.runtime.impl.java.X10Generated public class Board extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Board> $RTT = x10.rtt.NamedType.<Board> make(
    "Board", Board.class
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Board $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
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

                                                                                                                   
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Board this9214 =
                                                                                                                     this;
                                                                                                                   
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this9214.OPEN = 1;
                                                                                                                   
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this9214.QUEEN = 2;
                                                                                                                   
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this9214.PAWN = 3;
                                                                                                                   
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
final x10.array.Array_2 alloc6446 =
                                                                                                                     ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT)));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9215 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9216 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
alloc6446.x10$array$Array_2$$init$S(t9215,
                                                                                                                                                                                                                                                           t9216);
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.board = ((x10.array.Array_2)(alloc6446));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail9217 =
                                                                                                                     ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size9218 =
                                                                                                                     ((x10.core.Rail<Tile>)rail9217).
                                                                                                                       size;
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx9203 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail9217$value9762 =
                                                                                                                         ((Tile[])rail9217.value);
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9204 =
                                                                                                                             idx9203;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9205 =
                                                                                                                             ((t9204) < (((long)(size9218))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9205)) {
                                                                                                                               
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9199 =
                                                                                                                             idx9203;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile pawn9200 =
                                                                                                                             ((Tile)(((Tile)rail9217$value9762[(int)t9199])));
                                                                                                                           
//#line 20 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(pawn9200)));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9201 =
                                                                                                                             idx9203;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9202 =
                                                                                                                             ((t9201) + (((long)(1L))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx9203 = t9202;
                                                                                                                       }
                                                                                                                   }
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail9219 =
                                                                                                                     ((x10.core.Rail)(queens));
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size9220 =
                                                                                                                     ((x10.core.Rail<Tile>)rail9219).
                                                                                                                       size;
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx9211 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail9219$value9763 =
                                                                                                                         ((Tile[])rail9219.value);
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9212 =
                                                                                                                             idx9211;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9213 =
                                                                                                                             ((t9212) < (((long)(size9220))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9213)) {
                                                                                                                               
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9207 =
                                                                                                                             idx9211;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen9208 =
                                                                                                                             ((Tile)(((Tile)rail9219$value9763[(int)t9207])));
                                                                                                                           
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                                                                                                                               
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(queen9208)));
                                                                                                                           }}catch (final java.lang.NullPointerException id$9206) {
                                                                                                                               
//#line 27 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9209 =
                                                                                                                             idx9211;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9210 =
                                                                                                                             ((t9209) + (((long)(1L))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx9211 = t9210;
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
final x10.core.Rail rail9330 =
              ((x10.core.Rail)(queens));
            
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size9331 =
              ((x10.core.Rail<Tile>)rail9330).
                size;
            
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx9327 =
              0L;
            {
                
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail9330$value9764 =
                  ((Tile[])rail9330.value);
                
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9328 =
                      idx9327;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9329 =
                      ((t9328) < (((long)(size9331))));
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9329)) {
                        
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9323 =
                      idx9327;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen9324 =
                      ((Tile)(((Tile)rail9330$value9764[(int)t9323])));
                    
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos9299 =
                          queen9324.
                            x;
                        
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9300 =
                              xPos9299;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9301 =
                              size;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9302 =
                              ((t9300) < (((int)(t9301))));
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9302) {
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9303 =
                                  ((x10.array.Array_2)(board));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9304 =
                                  xPos9299;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9305 =
                                  ((long)(((int)(t9304))));
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9306 =
                                  queen9324.
                                    y;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9307 =
                                  ((long)(((int)(t9306))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9308 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9221 =
                                  ((i9305) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9221)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9222 =
                                      ((x10.array.Array_2<x10.core.Int>)this9303).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9221 = ((i9305) >= (((long)(t9222))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9223 =
                                  t9221;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9223)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9223 = ((j9307) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9224 =
                                  t9223;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9224)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9225 =
                                      ((x10.array.Array_2<x10.core.Int>)this9303).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9224 = ((j9307) >= (((long)(t9225))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9226 =
                                  t9224;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9226) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9305),
                                                                                                                                                       (long)(j9307));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9227 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9303).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9228 =
                                  i9305;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9229 =
                                  j9307;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9230 =
                                  ((x10.array.Array_2<x10.core.Int>)this9303).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9231 =
                                  ((i9228) * (((long)(t9230))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9232 =
                                  ((j9229) + (((long)(t9231))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9233 =
                                  ((int[])r9227.value)[(int)i9232];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9308 = t9233;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9309 =
                                  ret9308;
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9302 = ((int) t9309) !=
                                ((int) 3);
                            }
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9310 =
                              t9302;
                            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9310)) {
                                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9247 =
                              xPos9299;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9248 =
                              queen9324.
                                x;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9249 =
                              ((int) t9247) !=
                            ((int) t9248);
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9249) {
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9250 =
                                  ((x10.array.Array_2)(board));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9251 =
                                  xPos9299;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9252 =
                                  ((long)(((int)(t9251))));
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9253 =
                                  queen9324.
                                    y;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9254 =
                                  ((long)(((int)(t9253))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9255 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9234 =
                                  ((i9252) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9234)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9235 =
                                      ((x10.array.Array_2<x10.core.Int>)this9250).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9234 = ((i9252) >= (((long)(t9235))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9236 =
                                  t9234;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9236)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9236 = ((j9254) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9237 =
                                  t9236;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9237)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9238 =
                                      ((x10.array.Array_2<x10.core.Int>)this9250).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9237 = ((j9254) >= (((long)(t9238))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9239 =
                                  t9237;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9239) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9252),
                                                                                                                                                       (long)(j9254));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9240 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9250).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9241 =
                                  i9252;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9242 =
                                  j9254;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9243 =
                                  ((x10.array.Array_2<x10.core.Int>)this9250).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9244 =
                                  ((i9241) * (((long)(t9243))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9245 =
                                  ((j9242) + (((long)(t9244))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9246 =
                                  ((int[])r9240.value)[(int)i9245];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9255 = t9246;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9256 =
                                  ret9255;
                                
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9249 = ((int) t9256) ==
                                ((int) 2);
                            }
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9257 =
                              t9249;
                            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9257) {
                                
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9258 =
                              xPos9299;
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9259 =
                              ((t9258) + (((int)(1))));
                            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9299 = t9259;
                        }
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9311 =
                          queen9324.
                            x;
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9299 = t9311;
                        
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9312 =
                              xPos9299;
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9313 =
                              ((t9312) >= (((int)(0))));
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9313) {
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9314 =
                                  ((x10.array.Array_2)(board));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9315 =
                                  xPos9299;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9316 =
                                  ((long)(((int)(t9315))));
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9317 =
                                  queen9324.
                                    y;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9318 =
                                  ((long)(((int)(t9317))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9319 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9260 =
                                  ((i9316) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9260)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9261 =
                                      ((x10.array.Array_2<x10.core.Int>)this9314).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9260 = ((i9316) >= (((long)(t9261))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9262 =
                                  t9260;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9262)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9262 = ((j9318) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9263 =
                                  t9262;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9263)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9264 =
                                      ((x10.array.Array_2<x10.core.Int>)this9314).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9263 = ((j9318) >= (((long)(t9264))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9265 =
                                  t9263;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9265) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9316),
                                                                                                                                                       (long)(j9318));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9266 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9314).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9267 =
                                  i9316;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9268 =
                                  j9318;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9269 =
                                  ((x10.array.Array_2<x10.core.Int>)this9314).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9270 =
                                  ((i9267) * (((long)(t9269))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9271 =
                                  ((j9268) + (((long)(t9270))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9272 =
                                  ((int[])r9266.value)[(int)i9271];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9319 = t9272;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9320 =
                                  ret9319;
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9313 = ((int) t9320) !=
                                ((int) 3);
                            }
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9321 =
                              t9313;
                            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9321)) {
                                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9286 =
                              xPos9299;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9287 =
                              queen9324.
                                x;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9288 =
                              ((int) t9286) !=
                            ((int) t9287);
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9288) {
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9289 =
                                  ((x10.array.Array_2)(board));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9290 =
                                  xPos9299;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9291 =
                                  ((long)(((int)(t9290))));
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9292 =
                                  queen9324.
                                    y;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9293 =
                                  ((long)(((int)(t9292))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9294 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9273 =
                                  ((i9291) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9273)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9274 =
                                      ((x10.array.Array_2<x10.core.Int>)this9289).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9273 = ((i9291) >= (((long)(t9274))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9275 =
                                  t9273;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9275)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9275 = ((j9293) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9276 =
                                  t9275;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9276)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9277 =
                                      ((x10.array.Array_2<x10.core.Int>)this9289).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9276 = ((j9293) >= (((long)(t9277))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9278 =
                                  t9276;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9278) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9291),
                                                                                                                                                       (long)(j9293));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9279 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9289).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9280 =
                                  i9291;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9281 =
                                  j9293;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9282 =
                                  ((x10.array.Array_2<x10.core.Int>)this9289).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9283 =
                                  ((i9280) * (((long)(t9282))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9284 =
                                  ((j9281) + (((long)(t9283))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9285 =
                                  ((int[])r9279.value)[(int)i9284];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9294 = t9285;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9295 =
                                  ret9294;
                                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9288 = ((int) t9295) ==
                                ((int) 2);
                            }
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9296 =
                              t9288;
                            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9296) {
                                
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9297 =
                              xPos9299;
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9298 =
                              ((t9297) - (((int)(1))));
                            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9299 = t9298;
                        }
                    }}catch (final java.lang.NullPointerException id$9322) {
                        
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9325 =
                      idx9327;
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9326 =
                      ((t9325) + (((long)(1L))));
                    
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx9327 = t9326;
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
final x10.core.Rail rail9441 =
              ((x10.core.Rail)(queens));
            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size9442 =
              ((x10.core.Rail<Tile>)rail9441).
                size;
            
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx9438 =
              0L;
            {
                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail9441$value9765 =
                  ((Tile[])rail9441.value);
                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9439 =
                      idx9438;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9440 =
                      ((t9439) < (((long)(size9442))));
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9440)) {
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9434 =
                      idx9438;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen9435 =
                      ((Tile)(((Tile)rail9441$value9765[(int)t9434])));
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos9410 =
                          queen9435.
                            y;
                        
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9411 =
                              yPos9410;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9412 =
                              size;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9413 =
                              ((t9411) < (((int)(t9412))));
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9413) {
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9414 =
                                  ((x10.array.Array_2)(board));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9415 =
                                  queen9435.
                                    x;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9416 =
                                  ((long)(((int)(t9415))));
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9417 =
                                  yPos9410;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9418 =
                                  ((long)(((int)(t9417))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9419 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9332 =
                                  ((i9416) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9332)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9333 =
                                      ((x10.array.Array_2<x10.core.Int>)this9414).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9332 = ((i9416) >= (((long)(t9333))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9334 =
                                  t9332;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9334)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9334 = ((j9418) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9335 =
                                  t9334;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9335)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9336 =
                                      ((x10.array.Array_2<x10.core.Int>)this9414).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9335 = ((j9418) >= (((long)(t9336))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9337 =
                                  t9335;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9337) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9416),
                                                                                                                                                       (long)(j9418));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9338 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9414).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9339 =
                                  i9416;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9340 =
                                  j9418;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9341 =
                                  ((x10.array.Array_2<x10.core.Int>)this9414).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9342 =
                                  ((i9339) * (((long)(t9341))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9343 =
                                  ((j9340) + (((long)(t9342))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9344 =
                                  ((int[])r9338.value)[(int)i9343];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9419 = t9344;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9420 =
                                  ret9419;
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9413 = ((int) t9420) !=
                                ((int) 3);
                            }
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9421 =
                              t9413;
                            
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9421)) {
                                
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9358 =
                              yPos9410;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9359 =
                              queen9435.
                                y;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9360 =
                              ((int) t9358) !=
                            ((int) t9359);
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9360) {
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9361 =
                                  ((x10.array.Array_2)(board));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9362 =
                                  queen9435.
                                    x;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9363 =
                                  ((long)(((int)(t9362))));
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9364 =
                                  yPos9410;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9365 =
                                  ((long)(((int)(t9364))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9366 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9345 =
                                  ((i9363) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9345)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9346 =
                                      ((x10.array.Array_2<x10.core.Int>)this9361).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9345 = ((i9363) >= (((long)(t9346))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9347 =
                                  t9345;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9347)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9347 = ((j9365) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9348 =
                                  t9347;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9348)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9349 =
                                      ((x10.array.Array_2<x10.core.Int>)this9361).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9348 = ((j9365) >= (((long)(t9349))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9350 =
                                  t9348;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9350) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9363),
                                                                                                                                                       (long)(j9365));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9351 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9361).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9352 =
                                  i9363;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9353 =
                                  j9365;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9354 =
                                  ((x10.array.Array_2<x10.core.Int>)this9361).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9355 =
                                  ((i9352) * (((long)(t9354))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9356 =
                                  ((j9353) + (((long)(t9355))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9357 =
                                  ((int[])r9351.value)[(int)i9356];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9366 = t9357;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9367 =
                                  ret9366;
                                
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9360 = ((int) t9367) ==
                                ((int) 2);
                            }
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9368 =
                              t9360;
                            
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9368) {
                                
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9369 =
                              yPos9410;
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9370 =
                              ((t9369) + (((int)(1))));
                            
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9410 = t9370;
                        }
                        
//#line 67 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9422 =
                          queen9435.
                            y;
                        
//#line 67 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9410 = t9422;
                        
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9423 =
                              yPos9410;
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9424 =
                              ((t9423) >= (((int)(0))));
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9424) {
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9425 =
                                  ((x10.array.Array_2)(board));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9426 =
                                  queen9435.
                                    x;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9427 =
                                  ((long)(((int)(t9426))));
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9428 =
                                  yPos9410;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9429 =
                                  ((long)(((int)(t9428))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9430 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9371 =
                                  ((i9427) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9371)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9372 =
                                      ((x10.array.Array_2<x10.core.Int>)this9425).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9371 = ((i9427) >= (((long)(t9372))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9373 =
                                  t9371;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9373)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9373 = ((j9429) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9374 =
                                  t9373;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9374)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9375 =
                                      ((x10.array.Array_2<x10.core.Int>)this9425).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9374 = ((j9429) >= (((long)(t9375))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9376 =
                                  t9374;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9376) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9427),
                                                                                                                                                       (long)(j9429));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9377 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9425).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9378 =
                                  i9427;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9379 =
                                  j9429;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9380 =
                                  ((x10.array.Array_2<x10.core.Int>)this9425).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9381 =
                                  ((i9378) * (((long)(t9380))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9382 =
                                  ((j9379) + (((long)(t9381))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9383 =
                                  ((int[])r9377.value)[(int)i9382];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9430 = t9383;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9431 =
                                  ret9430;
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9424 = ((int) t9431) !=
                                ((int) 3);
                            }
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9432 =
                              t9424;
                            
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9432)) {
                                
//#line 68 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9397 =
                              yPos9410;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9398 =
                              queen9435.
                                y;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9399 =
                              ((int) t9397) !=
                            ((int) t9398);
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9399) {
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9400 =
                                  ((x10.array.Array_2)(board));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9401 =
                                  queen9435.
                                    x;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9402 =
                                  ((long)(((int)(t9401))));
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9403 =
                                  yPos9410;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9404 =
                                  ((long)(((int)(t9403))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9405 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9384 =
                                  ((i9402) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9384)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9385 =
                                      ((x10.array.Array_2<x10.core.Int>)this9400).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9384 = ((i9402) >= (((long)(t9385))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9386 =
                                  t9384;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9386)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9386 = ((j9404) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9387 =
                                  t9386;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9387)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9388 =
                                      ((x10.array.Array_2<x10.core.Int>)this9400).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9387 = ((j9404) >= (((long)(t9388))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9389 =
                                  t9387;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9389) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9402),
                                                                                                                                                       (long)(j9404));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9390 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9400).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9391 =
                                  i9402;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9392 =
                                  j9404;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9393 =
                                  ((x10.array.Array_2<x10.core.Int>)this9400).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9394 =
                                  ((i9391) * (((long)(t9393))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9395 =
                                  ((j9392) + (((long)(t9394))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9396 =
                                  ((int[])r9390.value)[(int)i9395];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9405 = t9396;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9406 =
                                  ret9405;
                                
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9399 = ((int) t9406) ==
                                ((int) 2);
                            }
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9407 =
                              t9399;
                            
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9407) {
                                
//#line 70 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9408 =
                              yPos9410;
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9409 =
                              ((t9408) - (((int)(1))));
                            
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9410 = t9409;
                        }
                    }}catch (final java.lang.NullPointerException id$9433) {
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9436 =
                      idx9438;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9437 =
                      ((t9436) + (((long)(1L))));
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx9438 = t9437;
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
final x10.core.Rail rail9687 =
              ((x10.core.Rail)(queens));
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size9688 =
              ((x10.core.Rail<Tile>)rail9687).
                size;
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx9684 =
              0L;
            {
                
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail9687$value9766 =
                  ((Tile[])rail9687.value);
                
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9685 =
                      idx9684;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9686 =
                      ((t9685) < (((long)(size9688))));
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9686)) {
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9680 =
                      idx9684;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen9681 =
                      ((Tile)(((Tile)rail9687$value9766[(int)t9680])));
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos9619 =
                          queen9681.
                            y;
                        
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos9620 =
                          queen9681.
                            x;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9621 =
                              xPos9620;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9622 =
                              size;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9623 =
                              ((t9621) < (((int)(t9622))));
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9623) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9624 =
                                  yPos9619;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9625 =
                                  size;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9623 = ((t9624) < (((int)(t9625))));
                            }
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9626 =
                              t9623;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9626) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9627 =
                                  ((x10.array.Array_2)(board));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9628 =
                                  xPos9620;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9629 =
                                  ((long)(((int)(t9628))));
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9630 =
                                  yPos9619;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9631 =
                                  ((long)(((int)(t9630))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9632 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9443 =
                                  ((i9629) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9443)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9444 =
                                      ((x10.array.Array_2<x10.core.Int>)this9627).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9443 = ((i9629) >= (((long)(t9444))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9445 =
                                  t9443;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9445)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9445 = ((j9631) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9446 =
                                  t9445;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9446)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9447 =
                                      ((x10.array.Array_2<x10.core.Int>)this9627).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9446 = ((j9631) >= (((long)(t9447))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9448 =
                                  t9446;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9448) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9629),
                                                                                                                                                       (long)(j9631));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9449 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9627).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9450 =
                                  i9629;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9451 =
                                  j9631;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9452 =
                                  ((x10.array.Array_2<x10.core.Int>)this9627).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9453 =
                                  ((i9450) * (((long)(t9452))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9454 =
                                  ((j9451) + (((long)(t9453))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9455 =
                                  ((int[])r9449.value)[(int)i9454];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9632 = t9455;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9633 =
                                  ret9632;
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9626 = ((int) t9633) !=
                                ((int) 3);
                            }
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9634 =
                              t9626;
                            
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9634)) {
                                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9469 =
                              xPos9620;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9470 =
                              queen9681.
                                x;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9471 =
                              ((int) t9469) !=
                            ((int) t9470);
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9471) {
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9472 =
                                  yPos9619;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9473 =
                                  queen9681.
                                    y;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9471 = ((int) t9472) !=
                                ((int) t9473);
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9474 =
                              t9471;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9474) {
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9475 =
                                  ((x10.array.Array_2)(board));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9476 =
                                  xPos9620;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9477 =
                                  ((long)(((int)(t9476))));
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9478 =
                                  yPos9619;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9479 =
                                  ((long)(((int)(t9478))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9480 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9456 =
                                  ((i9477) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9456)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9457 =
                                      ((x10.array.Array_2<x10.core.Int>)this9475).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9456 = ((i9477) >= (((long)(t9457))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9458 =
                                  t9456;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9458)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9458 = ((j9479) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9459 =
                                  t9458;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9459)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9460 =
                                      ((x10.array.Array_2<x10.core.Int>)this9475).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9459 = ((j9479) >= (((long)(t9460))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9461 =
                                  t9459;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9461) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9477),
                                                                                                                                                       (long)(j9479));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9462 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9475).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9463 =
                                  i9477;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9464 =
                                  j9479;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9465 =
                                  ((x10.array.Array_2<x10.core.Int>)this9475).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9466 =
                                  ((i9463) * (((long)(t9465))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9467 =
                                  ((j9464) + (((long)(t9466))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9468 =
                                  ((int[])r9462.value)[(int)i9467];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9480 = t9468;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9481 =
                                  ret9480;
                                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9474 = ((int) t9481) ==
                                ((int) 2);
                            }
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9482 =
                              t9474;
                            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9482) {
                                
//#line 89 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9483 =
                              xPos9620;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9484 =
                              ((t9483) + (((int)(1))));
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9620 = t9484;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9485 =
                              yPos9619;
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9486 =
                              ((t9485) + (((int)(1))));
                            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9619 = t9486;
                        }
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9635 =
                          queen9681.
                            y;
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9619 = t9635;
                        
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9636 =
                          queen9681.
                            x;
                        
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9620 = t9636;
                        
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9637 =
                              xPos9620;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9638 =
                              ((t9637) >= (((int)(0))));
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9638) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9639 =
                                  yPos9619;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9638 = ((t9639) >= (((int)(0))));
                            }
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9640 =
                              t9638;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9640) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9641 =
                                  ((x10.array.Array_2)(board));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9642 =
                                  xPos9620;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9643 =
                                  ((long)(((int)(t9642))));
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9644 =
                                  yPos9619;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9645 =
                                  ((long)(((int)(t9644))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9646 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9487 =
                                  ((i9643) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9487)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9488 =
                                      ((x10.array.Array_2<x10.core.Int>)this9641).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9487 = ((i9643) >= (((long)(t9488))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9489 =
                                  t9487;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9489)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9489 = ((j9645) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9490 =
                                  t9489;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9490)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9491 =
                                      ((x10.array.Array_2<x10.core.Int>)this9641).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9490 = ((j9645) >= (((long)(t9491))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9492 =
                                  t9490;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9492) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9643),
                                                                                                                                                       (long)(j9645));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9493 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9641).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9494 =
                                  i9643;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9495 =
                                  j9645;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9496 =
                                  ((x10.array.Array_2<x10.core.Int>)this9641).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9497 =
                                  ((i9494) * (((long)(t9496))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9498 =
                                  ((j9495) + (((long)(t9497))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9499 =
                                  ((int[])r9493.value)[(int)i9498];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9646 = t9499;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9647 =
                                  ret9646;
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9640 = ((int) t9647) !=
                                ((int) 3);
                            }
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9648 =
                              t9640;
                            
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9648)) {
                                
//#line 95 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9513 =
                              xPos9620;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9514 =
                              queen9681.
                                x;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9515 =
                              ((int) t9513) !=
                            ((int) t9514);
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9515) {
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9516 =
                                  yPos9619;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9517 =
                                  queen9681.
                                    y;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9515 = ((int) t9516) !=
                                ((int) t9517);
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9518 =
                              t9515;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9518) {
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9519 =
                                  ((x10.array.Array_2)(board));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9520 =
                                  xPos9620;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9521 =
                                  ((long)(((int)(t9520))));
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9522 =
                                  yPos9619;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9523 =
                                  ((long)(((int)(t9522))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9524 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9500 =
                                  ((i9521) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9500)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9501 =
                                      ((x10.array.Array_2<x10.core.Int>)this9519).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9500 = ((i9521) >= (((long)(t9501))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9502 =
                                  t9500;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9502)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9502 = ((j9523) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9503 =
                                  t9502;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9503)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9504 =
                                      ((x10.array.Array_2<x10.core.Int>)this9519).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9503 = ((j9523) >= (((long)(t9504))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9505 =
                                  t9503;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9505) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9521),
                                                                                                                                                       (long)(j9523));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9506 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9519).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9507 =
                                  i9521;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9508 =
                                  j9523;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9509 =
                                  ((x10.array.Array_2<x10.core.Int>)this9519).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9510 =
                                  ((i9507) * (((long)(t9509))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9511 =
                                  ((j9508) + (((long)(t9510))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9512 =
                                  ((int[])r9506.value)[(int)i9511];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9524 = t9512;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9525 =
                                  ret9524;
                                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9518 = ((int) t9525) ==
                                ((int) 2);
                            }
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9526 =
                              t9518;
                            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9526) {
                                
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9527 =
                              xPos9620;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9528 =
                              ((t9527) - (((int)(1))));
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9620 = t9528;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9529 =
                              yPos9619;
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9530 =
                              ((t9529) - (((int)(1))));
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9619 = t9530;
                        }
                        
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9649 =
                          queen9681.
                            y;
                        
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9619 = t9649;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9650 =
                          queen9681.
                            x;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9620 = t9650;
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9651 =
                              xPos9620;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9652 =
                              size;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9653 =
                              ((t9651) < (((int)(t9652))));
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9653) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9654 =
                                  yPos9619;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9653 = ((t9654) >= (((int)(0))));
                            }
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9655 =
                              t9653;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9655) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9656 =
                                  ((x10.array.Array_2)(board));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9657 =
                                  xPos9620;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9658 =
                                  ((long)(((int)(t9657))));
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9659 =
                                  yPos9619;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9660 =
                                  ((long)(((int)(t9659))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9661 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9531 =
                                  ((i9658) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9531)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9532 =
                                      ((x10.array.Array_2<x10.core.Int>)this9656).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9531 = ((i9658) >= (((long)(t9532))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9533 =
                                  t9531;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9533)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9533 = ((j9660) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9534 =
                                  t9533;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9534)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9535 =
                                      ((x10.array.Array_2<x10.core.Int>)this9656).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9534 = ((j9660) >= (((long)(t9535))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9536 =
                                  t9534;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9536) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9658),
                                                                                                                                                       (long)(j9660));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9537 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9656).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9538 =
                                  i9658;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9539 =
                                  j9660;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9540 =
                                  ((x10.array.Array_2<x10.core.Int>)this9656).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9541 =
                                  ((i9538) * (((long)(t9540))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9542 =
                                  ((j9539) + (((long)(t9541))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9543 =
                                  ((int[])r9537.value)[(int)i9542];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9661 = t9543;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9662 =
                                  ret9661;
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9655 = ((int) t9662) !=
                                ((int) 3);
                            }
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9663 =
                              t9655;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9663)) {
                                
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9557 =
                              xPos9620;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9558 =
                              queen9681.
                                x;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9559 =
                              ((int) t9557) !=
                            ((int) t9558);
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9559) {
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9560 =
                                  yPos9619;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9561 =
                                  queen9681.
                                    y;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9559 = ((int) t9560) !=
                                ((int) t9561);
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9562 =
                              t9559;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9562) {
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9563 =
                                  ((x10.array.Array_2)(board));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9564 =
                                  xPos9620;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9565 =
                                  ((long)(((int)(t9564))));
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9566 =
                                  yPos9619;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9567 =
                                  ((long)(((int)(t9566))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9568 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9544 =
                                  ((i9565) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9544)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9545 =
                                      ((x10.array.Array_2<x10.core.Int>)this9563).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9544 = ((i9565) >= (((long)(t9545))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9546 =
                                  t9544;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9546)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9546 = ((j9567) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9547 =
                                  t9546;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9547)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9548 =
                                      ((x10.array.Array_2<x10.core.Int>)this9563).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9547 = ((j9567) >= (((long)(t9548))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9549 =
                                  t9547;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9549) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9565),
                                                                                                                                                       (long)(j9567));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9550 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9563).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9551 =
                                  i9565;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9552 =
                                  j9567;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9553 =
                                  ((x10.array.Array_2<x10.core.Int>)this9563).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9554 =
                                  ((i9551) * (((long)(t9553))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9555 =
                                  ((j9552) + (((long)(t9554))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9556 =
                                  ((int[])r9550.value)[(int)i9555];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9568 = t9556;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9569 =
                                  ret9568;
                                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9562 = ((int) t9569) ==
                                ((int) 2);
                            }
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9570 =
                              t9562;
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9570) {
                                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9571 =
                              xPos9620;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9572 =
                              ((t9571) + (((int)(1))));
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9620 = t9572;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9573 =
                              yPos9619;
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9574 =
                              ((t9573) - (((int)(1))));
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9619 = t9574;
                        }
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9664 =
                          queen9681.
                            y;
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9619 = t9664;
                        
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9665 =
                          queen9681.
                            x;
                        
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9620 = t9665;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9666 =
                              xPos9620;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9667 =
                              ((t9666) >= (((int)(0))));
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9667) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9668 =
                                  yPos9619;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9669 =
                                  size;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9667 = ((t9668) < (((int)(t9669))));
                            }
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9670 =
                              t9667;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9670) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9671 =
                                  ((x10.array.Array_2)(board));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9672 =
                                  xPos9620;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9673 =
                                  ((long)(((int)(t9672))));
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9674 =
                                  yPos9619;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9675 =
                                  ((long)(((int)(t9674))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9676 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9575 =
                                  ((i9673) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9575)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9576 =
                                      ((x10.array.Array_2<x10.core.Int>)this9671).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9575 = ((i9673) >= (((long)(t9576))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9577 =
                                  t9575;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9577)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9577 = ((j9675) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9578 =
                                  t9577;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9578)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9579 =
                                      ((x10.array.Array_2<x10.core.Int>)this9671).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9578 = ((j9675) >= (((long)(t9579))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9580 =
                                  t9578;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9580) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9673),
                                                                                                                                                       (long)(j9675));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9581 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9671).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9582 =
                                  i9673;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9583 =
                                  j9675;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9584 =
                                  ((x10.array.Array_2<x10.core.Int>)this9671).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9585 =
                                  ((i9582) * (((long)(t9584))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9586 =
                                  ((j9583) + (((long)(t9585))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9587 =
                                  ((int[])r9581.value)[(int)i9586];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9676 = t9587;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9677 =
                                  ret9676;
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9670 = ((int) t9677) !=
                                ((int) 3);
                            }
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9678 =
                              t9670;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9678)) {
                                
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9601 =
                              xPos9620;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9602 =
                              queen9681.
                                x;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9603 =
                              ((int) t9601) !=
                            ((int) t9602);
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9603) {
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9604 =
                                  yPos9619;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9605 =
                                  queen9681.
                                    y;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9603 = ((int) t9604) !=
                                ((int) t9605);
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9606 =
                              t9603;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9606) {
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9607 =
                                  ((x10.array.Array_2)(board));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9608 =
                                  xPos9620;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9609 =
                                  ((long)(((int)(t9608))));
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9610 =
                                  yPos9619;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9611 =
                                  ((long)(((int)(t9610))));
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9612 =
                                   0;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9588 =
                                  ((i9609) < (((long)(0L))));
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9588)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9589 =
                                      ((x10.array.Array_2<x10.core.Int>)this9607).
                                        numElems_1;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9588 = ((i9609) >= (((long)(t9589))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9590 =
                                  t9588;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9590)) {
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9590 = ((j9611) < (((long)(0L))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9591 =
                                  t9590;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9591)) {
                                    
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9592 =
                                      ((x10.array.Array_2<x10.core.Int>)this9607).
                                        numElems_2;
                                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9591 = ((j9611) >= (((long)(t9592))));
                                }
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9593 =
                                  t9591;
                                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9593) {
                                    
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9609),
                                                                                                                                                       (long)(j9611));
                                }
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9594 =
                                  ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9607).
                                                     raw));
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9595 =
                                  i9609;
                                
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9596 =
                                  j9611;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9597 =
                                  ((x10.array.Array_2<x10.core.Int>)this9607).
                                    numElems_2;
                                
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9598 =
                                  ((i9595) * (((long)(t9597))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9599 =
                                  ((j9596) + (((long)(t9598))));
                                
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9600 =
                                  ((int[])r9594.value)[(int)i9599];
                                
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9612 = t9600;
                                
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9613 =
                                  ret9612;
                                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9606 = ((int) t9613) ==
                                ((int) 2);
                            }
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9614 =
                              t9606;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9614) {
                                
//#line 113 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9615 =
                              xPos9620;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9616 =
                              ((t9615) - (((int)(1))));
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos9620 = t9616;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9617 =
                              yPos9619;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9618 =
                              ((t9617) + (((int)(1))));
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos9619 = t9618;
                        }
                    }}catch (final java.lang.NullPointerException id$9679) {
                        
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9682 =
                      idx9684;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t9683 =
                      ((t9682) + (((long)(1L))));
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx9684 = t9683;
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
boolean valid_1 =
              true;
            
//#line 127 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean valid_2 =
              true;
            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean valid_3 =
              true;
            {
                
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.lang.FinishState x10$__var1 =
                  x10.lang.Runtime.startFinish();
                {
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean[] $valid_19759 =
                      new boolean[1];
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
$valid_19759[(int)0]=valid_1;
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean[] $valid_29760 =
                      new boolean[1];
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
$valid_29760[(int)0]=valid_2;
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean[] $valid_39761 =
                      new boolean[1];
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
$valid_39761[(int)0]=valid_3;
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        {
                            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Board.$Closure$1(this,
                                                                                                                                                                                                            $valid_19759))));
                            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Board.$Closure$2(this,
                                                                                                                                                                                                            $valid_29760))));
                            
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Board.$Closure$3(this,
                                                                                                                                                                                                            $valid_39761))));
                        }
                    }}catch (java.lang.Throwable __lowerer__var__0__) {
                        
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                        
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw new java.lang.RuntimeException();
                    }finally {{
                         
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var1)));
                     }}
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
valid_1 = ((boolean)$valid_19759[(int)0]);
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
valid_2 = ((boolean)$valid_29760[(int)0]);
                    
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
valid_3 = ((boolean)$valid_39761[(int)0]);
                    }
                }
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9147 =
              valid_1;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9147) {
                
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9147 = valid_2;
            }
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9148 =
              t9147;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9148) {
                
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9148 = valid_3;
            }
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9149 =
              t9148;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return t9149;
            }
        
        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public void
                                                                                                               print(
                                                                                                               ){
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9150 =
              size;
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i6574max6576 =
              ((t9150) - (((int)(1))));
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i9721 =
              0;
            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9722 =
                  i9721;
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9723 =
                  ((t9722) <= (((int)(i6574max6576))));
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9723)) {
                    
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                }
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int y9718 =
                  i9721;
                
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9715 =
                  size;
                
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i6558max9716 =
                  ((t9715) - (((int)(1))));
                
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i9712 =
                  0;
                
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9713 =
                      i9712;
                    
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9714 =
                      ((t9713) <= (((int)(i6558max9716))));
                    
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9714)) {
                        
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int x9709 =
                      i9712;
                    
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t9702 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this9703 =
                      ((x10.array.Array_2)(board));
                    
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9704 =
                      ((long)(((int)(x9709))));
                    
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9705 =
                      ((long)(((int)(y9718))));
                    
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret9706 =
                       0;
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9689 =
                      ((i9704) < (((long)(0L))));
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9689)) {
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9690 =
                          ((x10.array.Array_2<x10.core.Int>)this9703).
                            numElems_1;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9689 = ((i9704) >= (((long)(t9690))));
                    }
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9691 =
                      t9689;
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9691)) {
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9691 = ((j9705) < (((long)(0L))));
                    }
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9692 =
                      t9691;
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9692)) {
                        
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9693 =
                          ((x10.array.Array_2<x10.core.Int>)this9703).
                            numElems_2;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9692 = ((j9705) >= (((long)(t9693))));
                    }
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9694 =
                      t9692;
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9694) {
                        
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i9704),
                                                                                                                                           (long)(j9705));
                    }
                    
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9695 =
                      ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this9703).
                                         raw));
                    
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9696 =
                      i9704;
                    
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9697 =
                      j9705;
                    
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9698 =
                      ((x10.array.Array_2<x10.core.Int>)this9703).
                        numElems_2;
                    
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9699 =
                      ((i9696) * (((long)(t9698))));
                    
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9700 =
                      ((j9697) + (((long)(t9699))));
                    
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9701 =
                      ((int[])r9695.value)[(int)i9700];
                    
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret9706 = t9701;
                    
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t9707 =
                      ret9706;
                    
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.String t9708 =
                      (("-") + ((x10.core.Int.$box(t9707))));
                    
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9702.print(((java.lang.String)(t9708)));
                    
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9710 =
                      i9712;
                    
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9711 =
                      ((t9710) + (((int)(1))));
                    
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i9712 = t9711;
                }
                
//#line 148 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t9717 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 148 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9717.println(((java.lang.Object)("-")));
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9719 =
                  i9721;
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9720 =
                  ((t9719) + (((int)(1))));
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i9721 = t9720;
            }
        }
        
        
//#line 153 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private void
                                                                                                               place(
                                                                                                               final Tile someTile){
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8786 =
              ((x10.array.Array_2)(board));
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9175 =
              someTile.
                x;
            
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8784 =
              ((long)(((int)(t9175))));
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9176 =
              someTile.
                y;
            
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8785 =
              ((long)(((int)(t9176))));
            
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8787 =
               0;
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9724 =
              ((i8784) < (((long)(0L))));
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9724)) {
                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9725 =
                  ((x10.array.Array_2<x10.core.Int>)this8786).
                    numElems_1;
                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9724 = ((i8784) >= (((long)(t9725))));
            }
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9726 =
              t9724;
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9726)) {
                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9726 = ((j8785) < (((long)(0L))));
            }
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9727 =
              t9726;
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9727)) {
                
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9728 =
                  ((x10.array.Array_2<x10.core.Int>)this8786).
                    numElems_2;
                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9727 = ((j8785) >= (((long)(t9728))));
            }
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9729 =
              t9727;
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9729) {
                
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8784),
                                                                                                                                   (long)(j8785));
            }
            
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9730 =
              ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8786).
                                 raw));
            
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9731 =
              i8784;
            
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9732 =
              j8785;
            
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9733 =
              ((x10.array.Array_2<x10.core.Int>)this8786).
                numElems_2;
            
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9734 =
              ((i9731) * (((long)(t9733))));
            
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9735 =
              ((j9732) + (((long)(t9734))));
            
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t9736 =
              ((int[])r9730.value)[(int)i9735];
            
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8787 = t9736;
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int occupation =
              ret8787;
            
//#line 155 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t9186 =
              ((int) occupation) ==
            ((int) 2);
            
//#line 155 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t9186)) {
                
//#line 155 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t9186 = ((int) occupation) ==
                ((int) 3);
            }
            
//#line 155 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9188 =
              t9186;
            
//#line 155 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t9188) {
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.RuntimeException t9187 =
                  ((java.lang.RuntimeException)(new java.lang.RuntimeException("Placing on a wrong place!")));
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw t9187;
            }
            
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8796 =
              ((x10.array.Array_2)(board));
            
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9189 =
              someTile.
                x;
            
//#line 169 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8793 =
              ((long)(((int)(t9189))));
            
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t9190 =
              someTile.
                y;
            
//#line 169 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8794 =
              ((long)(((int)(t9190))));
            
//#line 169 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int v8795 =
              someTile.
                tileType;
            
//#line 169 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8797 =
               0;
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9737 =
              ((i8793) < (((long)(0L))));
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9737)) {
                
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9738 =
                  ((x10.array.Array_2<x10.core.Int>)this8796).
                    numElems_1;
                
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9737 = ((i8793) >= (((long)(t9738))));
            }
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9739 =
              t9737;
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9739)) {
                
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9739 = ((j8794) < (((long)(0L))));
            }
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t9740 =
              t9739;
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t9740)) {
                
//#line 171 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9741 =
                  ((x10.array.Array_2<x10.core.Int>)this8796).
                    numElems_2;
                
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t9740 = ((j8794) >= (((long)(t9741))));
            }
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t9742 =
              t9740;
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t9742) {
                
//#line 172 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8793),
                                                                                                                                   (long)(j8794));
            }
            
//#line 41 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r9743 =
              ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8796).
                                 raw));
            
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i9744 =
              i8793;
            
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j9745 =
              j8794;
            
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9746 =
              ((x10.array.Array_2<x10.core.Int>)this8796).
                numElems_2;
            
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t9747 =
              ((i9744) * (((long)(t9746))));
            
//#line 41 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i9748 =
              ((j9745) + (((long)(t9747))));
            
//#line 41 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int v9749 =
              v8795;
            
//#line 40 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
int ret9750 =
               0;
            
//#line 42 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
((int[])r9743.value)[(int)i9748] = v9749;
            
//#line 43 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
ret9750 = v9749;
            
//#line 175 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8797 = v8795;
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
        
        @x10.runtime.impl.java.X10Generated final public static class $Closure$1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            public static final x10.rtt.RuntimeType<$Closure$1> $RTT = x10.rtt.StaticVoidFunType.<$Closure$1> make(
            $Closure$1.class, new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            public x10.rtt.Type<?> $getParam(int i) {return null;}
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Board.$Closure$1 $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                $_obj.out$$ = $deserializer.readRef();
                $_obj.$valid_19759 = $deserializer.readRef();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                Board.$Closure$1 $_obj = new Board.$Closure$1((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (out$$ instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.out$$);
                } else {
                $serializer.write(this.out$$);
                }
                $serializer.write(this.$valid_19759);
                
            }
            
            // constructor just for allocation
            public $Closure$1(final java.lang.System[] $dummy) { 
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9144 =
                          this.
                            out$$.validDiag$O();
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.
                                                                                                                               $valid_19759[(int)0]=t9144;
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public Board out$$;
                public boolean[] $valid_19759;
                
                public $Closure$1(final Board out$$,
                                  final boolean[] $valid_19759) { {
                                                                         this.out$$ = out$$;
                                                                         this.$valid_19759 = $valid_19759;
                                                                     }}
                
            }
            
        @x10.runtime.impl.java.X10Generated final public static class $Closure$2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            public static final x10.rtt.RuntimeType<$Closure$2> $RTT = x10.rtt.StaticVoidFunType.<$Closure$2> make(
            $Closure$2.class, new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            public x10.rtt.Type<?> $getParam(int i) {return null;}
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Board.$Closure$2 $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                $_obj.out$$ = $deserializer.readRef();
                $_obj.$valid_29760 = $deserializer.readRef();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                Board.$Closure$2 $_obj = new Board.$Closure$2((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (out$$ instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.out$$);
                } else {
                $serializer.write(this.out$$);
                }
                $serializer.write(this.$valid_29760);
                
            }
            
            // constructor just for allocation
            public $Closure$2(final java.lang.System[] $dummy) { 
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9145 =
                          this.
                            out$$.validVert$O();
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.
                                                                                                                               $valid_29760[(int)0]=t9145;
                    }}catch (java.lang.Error __lowerer__var__2__) {
                        
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw __lowerer__var__2__;
                    }catch (java.lang.Throwable __lowerer__var__3__) {
                        
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
                    }
                }
                
                public Board out$$;
                public boolean[] $valid_29760;
                
                public $Closure$2(final Board out$$,
                                  final boolean[] $valid_29760) { {
                                                                         this.out$$ = out$$;
                                                                         this.$valid_29760 = $valid_29760;
                                                                     }}
                
            }
            
        @x10.runtime.impl.java.X10Generated final public static class $Closure$3 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            public static final x10.rtt.RuntimeType<$Closure$3> $RTT = x10.rtt.StaticVoidFunType.<$Closure$3> make(
            $Closure$3.class, new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            public x10.rtt.Type<?> $getParam(int i) {return null;}
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Board.$Closure$3 $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                $_obj.out$$ = $deserializer.readRef();
                $_obj.$valid_39761 = $deserializer.readRef();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                Board.$Closure$3 $_obj = new Board.$Closure$3((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (out$$ instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.out$$);
                } else {
                $serializer.write(this.out$$);
                }
                $serializer.write(this.$valid_39761);
                
            }
            
            // constructor just for allocation
            public $Closure$3(final java.lang.System[] $dummy) { 
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t9146 =
                          this.
                            out$$.validHoriz$O();
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.
                                                                                                                               $valid_39761[(int)0]=t9146;
                    }}catch (java.lang.Error __lowerer__var__4__) {
                        
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw __lowerer__var__4__;
                    }catch (java.lang.Throwable __lowerer__var__5__) {
                        
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__5__) ? (java.lang.RuntimeException)(__lowerer__var__5__) : new x10.lang.WrappedThrowable(__lowerer__var__5__);
                    }
                }
                
                public Board out$$;
                public boolean[] $valid_39761;
                
                public $Closure$3(final Board out$$,
                                  final boolean[] $valid_39761) { {
                                                                         this.out$$ = out$$;
                                                                         this.$valid_39761 = $valid_39761;
                                                                     }}
                
            }
            
        // synthetic type for parameter mangling
        public static final class __1$1Tile$2__2$1Tile$2 {}
        
        }
        
        