
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
final Board this10803 =
                                                                                                                     this;
                                                                                                                   
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this10803.OPEN = 1;
                                                                                                                   
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this10803.QUEEN = 2;
                                                                                                                   
//#line 8 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this10803.PAWN = 3;
                                                                                                                   
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
final x10.array.Array_2 alloc6653 =
                                                                                                                     ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT)));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10804 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10805 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
alloc6653.x10$array$Array_2$$init$S(t10804,
                                                                                                                                                                                                                                                           t10805);
                                                                                                                   
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.board = ((x10.array.Array_2)(alloc6653));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail10806 =
                                                                                                                     ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size10807 =
                                                                                                                     ((x10.core.Rail<Tile>)rail10806).
                                                                                                                       size;
                                                                                                                   
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx10792 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail10806$value11208 =
                                                                                                                         ((Tile[])rail10806.value);
                                                                                                                       
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10793 =
                                                                                                                             idx10792;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10794 =
                                                                                                                             ((t10793) < (((long)(size10807))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10794)) {
                                                                                                                               
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10788 =
                                                                                                                             idx10792;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile pawn10789 =
                                                                                                                             ((Tile)(((Tile)rail10806$value11208[(int)t10788])));
                                                                                                                           
//#line 20 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(pawn10789)));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10790 =
                                                                                                                             idx10792;
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10791 =
                                                                                                                             ((t10790) + (((long)(1L))));
                                                                                                                           
//#line 19 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx10792 = t10791;
                                                                                                                       }
                                                                                                                   }
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail10808 =
                                                                                                                     ((x10.core.Rail)(queens));
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size10809 =
                                                                                                                     ((x10.core.Rail<Tile>)rail10808).
                                                                                                                       size;
                                                                                                                   
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx10800 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail10808$value11209 =
                                                                                                                         ((Tile[])rail10808.value);
                                                                                                                       
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                                true;
                                                                                                                                                                                                                                ) {
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10801 =
                                                                                                                             idx10800;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10802 =
                                                                                                                             ((t10801) < (((long)(size10809))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10802)) {
                                                                                                                               
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10796 =
                                                                                                                             idx10800;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen10797 =
                                                                                                                             ((Tile)(((Tile)rail10808$value11209[(int)t10796])));
                                                                                                                           
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                                                                                                                               
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(queen10797)));
                                                                                                                           }}catch (final java.lang.NullPointerException id$10795) {
                                                                                                                               
//#line 27 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10798 =
                                                                                                                             idx10800;
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10799 =
                                                                                                                             ((t10798) + (((long)(1L))));
                                                                                                                           
//#line 22 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx10800 = t10799;
                                                                                                                       }
                                                                                                                   }
                                                                                                               }
                                                                                                               return this;
                                                                                                               }
        
        
        
//#line 32 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validHoriz$O(
                                                                                                              final int x,
                                                                                                              final int y){
            
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos =
                  x;
                
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                    
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10438 =
                      xPos;
                    
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10439 =
                      size;
                    
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10451 =
                      ((t10438) < (((int)(t10439))));
                    
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10451) {
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8317 =
                          ((x10.array.Array_2)(board));
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10440 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8315 =
                          ((long)(((int)(t10440))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8316 =
                          ((long)(((int)(y))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8318 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10810 =
                          ((i8315) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10810)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10811 =
                              ((x10.array.Array_2<x10.core.Int>)this8317).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10810 = ((i8315) >= (((long)(t10811))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10812 =
                          t10810;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10812)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10812 = ((j8316) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10813 =
                          t10812;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10813)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10814 =
                              ((x10.array.Array_2<x10.core.Int>)this8317).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10813 = ((j8316) >= (((long)(t10814))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10815 =
                          t10813;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10815) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8315),
                                                                                                                                               (long)(j8316));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10816 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8317).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10817 =
                          i8315;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10818 =
                          j8316;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10819 =
                          ((x10.array.Array_2<x10.core.Int>)this8317).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10820 =
                          ((i10817) * (((long)(t10819))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10821 =
                          ((j10818) + (((long)(t10820))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10822 =
                          ((int[])r10816.value)[(int)i10821];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8318 = t10822;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10450 =
                          ret8318;
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10451 = ((int) t10450) !=
                        ((int) 3);
                    }
                    
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10468 =
                      t10451;
                    
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10468)) {
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10836 =
                      xPos;
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10837 =
                      ((int) t10836) !=
                    ((int) x);
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10837) {
                        
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this10838 =
                          ((x10.array.Array_2)(board));
                        
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10839 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10840 =
                          ((long)(((int)(t10839))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10841 =
                          ((long)(((int)(y))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret10842 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10823 =
                          ((i10840) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10823)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10824 =
                              ((x10.array.Array_2<x10.core.Int>)this10838).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10823 = ((i10840) >= (((long)(t10824))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10825 =
                          t10823;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10825)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10825 = ((j10841) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10826 =
                          t10825;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10826)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10827 =
                              ((x10.array.Array_2<x10.core.Int>)this10838).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10826 = ((j10841) >= (((long)(t10827))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10828 =
                          t10826;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10828) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i10840),
                                                                                                                                               (long)(j10841));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10829 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this10838).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10830 =
                          i10840;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10831 =
                          j10841;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10832 =
                          ((x10.array.Array_2<x10.core.Int>)this10838).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10833 =
                          ((i10830) * (((long)(t10832))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10834 =
                          ((j10831) + (((long)(t10833))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10835 =
                          ((int[])r10829.value)[(int)i10834];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret10842 = t10835;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10843 =
                          ret10842;
                        
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10837 = ((int) t10843) ==
                        ((int) 2);
                    }
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10844 =
                      t10837;
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10844) {
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                    }
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10845 =
                      xPos;
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10846 =
                      ((t10845) + (((int)(1))));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = t10846;
                }
                
//#line 41 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = x;
                
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                    
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10469 =
                      xPos;
                    
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10481 =
                      ((t10469) >= (((int)(0))));
                    
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10481) {
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8881 =
                          ((x10.array.Array_2)(board));
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10470 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8879 =
                          ((long)(((int)(t10470))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8880 =
                          ((long)(((int)(y))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8882 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10847 =
                          ((i8879) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10847)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10848 =
                              ((x10.array.Array_2<x10.core.Int>)this8881).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10847 = ((i8879) >= (((long)(t10848))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10849 =
                          t10847;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10849)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10849 = ((j8880) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10850 =
                          t10849;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10850)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10851 =
                              ((x10.array.Array_2<x10.core.Int>)this8881).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10850 = ((j8880) >= (((long)(t10851))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10852 =
                          t10850;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10852) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8879),
                                                                                                                                               (long)(j8880));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10853 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8881).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10854 =
                          i8879;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10855 =
                          j8880;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10856 =
                          ((x10.array.Array_2<x10.core.Int>)this8881).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10857 =
                          ((i10854) * (((long)(t10856))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10858 =
                          ((j10855) + (((long)(t10857))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10859 =
                          ((int[])r10853.value)[(int)i10858];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8882 = t10859;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10480 =
                          ret8882;
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10481 = ((int) t10480) !=
                        ((int) 3);
                    }
                    
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10498 =
                      t10481;
                    
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10498)) {
                        
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10873 =
                      xPos;
                    
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10874 =
                      ((int) t10873) !=
                    ((int) x);
                    
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10874) {
                        
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this10875 =
                          ((x10.array.Array_2)(board));
                        
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10876 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10877 =
                          ((long)(((int)(t10876))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10878 =
                          ((long)(((int)(y))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret10879 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10860 =
                          ((i10877) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10860)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10861 =
                              ((x10.array.Array_2<x10.core.Int>)this10875).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10860 = ((i10877) >= (((long)(t10861))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10862 =
                          t10860;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10862)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10862 = ((j10878) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10863 =
                          t10862;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10863)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10864 =
                              ((x10.array.Array_2<x10.core.Int>)this10875).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10863 = ((j10878) >= (((long)(t10864))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10865 =
                          t10863;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10865) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i10877),
                                                                                                                                               (long)(j10878));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10866 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this10875).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10867 =
                          i10877;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10868 =
                          j10878;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10869 =
                          ((x10.array.Array_2<x10.core.Int>)this10875).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10870 =
                          ((i10867) * (((long)(t10869))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10871 =
                          ((j10868) + (((long)(t10870))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10872 =
                          ((int[])r10866.value)[(int)i10871];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret10879 = t10872;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10880 =
                          ret10879;
                        
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10874 = ((int) t10880) ==
                        ((int) 2);
                    }
                    
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10881 =
                      t10874;
                    
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10881) {
                        
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                    }
                    
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10882 =
                      xPos;
                    
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10883 =
                      ((t10882) - (((int)(1))));
                    
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = t10883;
                }
            }}catch (final java.lang.NullPointerException id$1344) {
                
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
            }
            
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validHoriz$P$O(
          final int x,
          final int y,
          final Board Board){
            return Board.validHoriz$O((int)(x),
                                      (int)(y));
        }
        
        
//#line 55 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validVert$O(
                                                                                                              final int x,
                                                                                                              final int y){
            
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos =
                  y;
                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10499 =
                      yPos;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10500 =
                      size;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10512 =
                      ((t10499) < (((int)(t10500))));
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10512) {
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8899 =
                          ((x10.array.Array_2)(board));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8897 =
                          ((long)(((int)(x))));
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10501 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8898 =
                          ((long)(((int)(t10501))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8900 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10884 =
                          ((i8897) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10884)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10885 =
                              ((x10.array.Array_2<x10.core.Int>)this8899).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10884 = ((i8897) >= (((long)(t10885))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10886 =
                          t10884;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10886)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10886 = ((j8898) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10887 =
                          t10886;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10887)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10888 =
                              ((x10.array.Array_2<x10.core.Int>)this8899).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10887 = ((j8898) >= (((long)(t10888))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10889 =
                          t10887;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10889) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8897),
                                                                                                                                               (long)(j8898));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10890 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8899).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10891 =
                          i8897;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10892 =
                          j8898;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10893 =
                          ((x10.array.Array_2<x10.core.Int>)this8899).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10894 =
                          ((i10891) * (((long)(t10893))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10895 =
                          ((j10892) + (((long)(t10894))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10896 =
                          ((int[])r10890.value)[(int)i10895];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8900 = t10896;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10511 =
                          ret8900;
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10512 = ((int) t10511) !=
                        ((int) 3);
                    }
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10529 =
                      t10512;
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10529)) {
                        
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10910 =
                      yPos;
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10911 =
                      ((int) t10910) !=
                    ((int) y);
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10911) {
                        
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this10912 =
                          ((x10.array.Array_2)(board));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10913 =
                          ((long)(((int)(x))));
                        
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10914 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10915 =
                          ((long)(((int)(t10914))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret10916 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10897 =
                          ((i10913) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10897)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10898 =
                              ((x10.array.Array_2<x10.core.Int>)this10912).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10897 = ((i10913) >= (((long)(t10898))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10899 =
                          t10897;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10899)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10899 = ((j10915) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10900 =
                          t10899;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10900)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10901 =
                              ((x10.array.Array_2<x10.core.Int>)this10912).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10900 = ((j10915) >= (((long)(t10901))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10902 =
                          t10900;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10902) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i10913),
                                                                                                                                               (long)(j10915));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10903 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this10912).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10904 =
                          i10913;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10905 =
                          j10915;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10906 =
                          ((x10.array.Array_2<x10.core.Int>)this10912).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10907 =
                          ((i10904) * (((long)(t10906))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10908 =
                          ((j10905) + (((long)(t10907))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10909 =
                          ((int[])r10903.value)[(int)i10908];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret10916 = t10909;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10917 =
                          ret10916;
                        
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10911 = ((int) t10917) ==
                        ((int) 2);
                    }
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10918 =
                      t10911;
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10918) {
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                    }
                    
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10919 =
                      yPos;
                    
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10920 =
                      ((t10919) + (((int)(1))));
                    
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = t10920;
                }
                
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = y;
                
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10530 =
                      yPos;
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10542 =
                      ((t10530) >= (((int)(0))));
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10542) {
                        
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8917 =
                          ((x10.array.Array_2)(board));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8915 =
                          ((long)(((int)(x))));
                        
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10531 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8916 =
                          ((long)(((int)(t10531))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8918 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10921 =
                          ((i8915) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10921)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10922 =
                              ((x10.array.Array_2<x10.core.Int>)this8917).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10921 = ((i8915) >= (((long)(t10922))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10923 =
                          t10921;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10923)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10923 = ((j8916) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10924 =
                          t10923;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10924)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10925 =
                              ((x10.array.Array_2<x10.core.Int>)this8917).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10924 = ((j8916) >= (((long)(t10925))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10926 =
                          t10924;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10926) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8915),
                                                                                                                                               (long)(j8916));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10927 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8917).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10928 =
                          i8915;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10929 =
                          j8916;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10930 =
                          ((x10.array.Array_2<x10.core.Int>)this8917).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10931 =
                          ((i10928) * (((long)(t10930))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10932 =
                          ((j10929) + (((long)(t10931))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10933 =
                          ((int[])r10927.value)[(int)i10932];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8918 = t10933;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10541 =
                          ret8918;
                        
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10542 = ((int) t10541) !=
                        ((int) 3);
                    }
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10559 =
                      t10542;
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10559)) {
                        
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10947 =
                      yPos;
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10948 =
                      ((int) t10947) !=
                    ((int) y);
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10948) {
                        
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this10949 =
                          ((x10.array.Array_2)(board));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10950 =
                          ((long)(((int)(x))));
                        
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10951 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10952 =
                          ((long)(((int)(t10951))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret10953 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10934 =
                          ((i10950) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10934)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10935 =
                              ((x10.array.Array_2<x10.core.Int>)this10949).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10934 = ((i10950) >= (((long)(t10935))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10936 =
                          t10934;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10936)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10936 = ((j10952) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10937 =
                          t10936;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10937)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10938 =
                              ((x10.array.Array_2<x10.core.Int>)this10949).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10937 = ((j10952) >= (((long)(t10938))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10939 =
                          t10937;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10939) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i10950),
                                                                                                                                               (long)(j10952));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10940 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this10949).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10941 =
                          i10950;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10942 =
                          j10952;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10943 =
                          ((x10.array.Array_2<x10.core.Int>)this10949).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10944 =
                          ((i10941) * (((long)(t10943))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10945 =
                          ((j10942) + (((long)(t10944))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10946 =
                          ((int[])r10940.value)[(int)i10945];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret10953 = t10946;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10954 =
                          ret10953;
                        
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10948 = ((int) t10954) ==
                        ((int) 2);
                    }
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10955 =
                      t10948;
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10955) {
                        
//#line 67 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                    }
                    
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10956 =
                      yPos;
                    
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10957 =
                      ((t10956) - (((int)(1))));
                    
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = t10957;
                }
            }}catch (final java.lang.NullPointerException id$1345) {
                
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
            }
            
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validVert$P$O(
          final int x,
          final int y,
          final Board Board){
            return Board.validVert$O((int)(x),
                                     (int)(y));
        }
        
        
//#line 78 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                              validDiag$O(
                                                                                                              final int x,
                                                                                                              final int y){
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int yPos =
                  y;
                
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int xPos =
                  x;
                
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10560 =
                      xPos;
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10561 =
                      size;
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10564 =
                      ((t10560) < (((int)(t10561))));
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10564) {
                        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10562 =
                          yPos;
                        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10563 =
                          size;
                        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10564 = ((t10562) < (((int)(t10563))));
                    }
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10577 =
                      t10564;
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10577) {
                        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8935 =
                          ((x10.array.Array_2)(board));
                        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10565 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8933 =
                          ((long)(((int)(t10565))));
                        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10566 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8934 =
                          ((long)(((int)(t10566))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8936 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10958 =
                          ((i8933) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10958)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10959 =
                              ((x10.array.Array_2<x10.core.Int>)this8935).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10958 = ((i8933) >= (((long)(t10959))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10960 =
                          t10958;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10960)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10960 = ((j8934) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10961 =
                          t10960;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10961)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10962 =
                              ((x10.array.Array_2<x10.core.Int>)this8935).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10961 = ((j8934) >= (((long)(t10962))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10963 =
                          t10961;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10963) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8933),
                                                                                                                                               (long)(j8934));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10964 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8935).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10965 =
                          i8933;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10966 =
                          j8934;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10967 =
                          ((x10.array.Array_2<x10.core.Int>)this8935).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10968 =
                          ((i10965) * (((long)(t10967))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10969 =
                          ((j10966) + (((long)(t10968))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10970 =
                          ((int[])r10964.value)[(int)i10969];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8936 = t10970;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10576 =
                          ret8936;
                        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10577 = ((int) t10576) !=
                        ((int) 3);
                    }
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10599 =
                      t10577;
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10599)) {
                        
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10984 =
                      xPos;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10985 =
                      ((int) t10984) !=
                    ((int) x);
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10985) {
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10986 =
                          yPos;
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10985 = ((int) t10986) !=
                        ((int) y);
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10987 =
                      t10985;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10987) {
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this10988 =
                          ((x10.array.Array_2)(board));
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10989 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10990 =
                          ((long)(((int)(t10989))));
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10991 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10992 =
                          ((long)(((int)(t10991))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret10993 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10971 =
                          ((i10990) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10971)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10972 =
                              ((x10.array.Array_2<x10.core.Int>)this10988).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10971 = ((i10990) >= (((long)(t10972))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10973 =
                          t10971;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10973)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10973 = ((j10992) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t10974 =
                          t10973;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t10974)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10975 =
                              ((x10.array.Array_2<x10.core.Int>)this10988).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t10974 = ((j10992) >= (((long)(t10975))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t10976 =
                          t10974;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t10976) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i10990),
                                                                                                                                               (long)(j10992));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r10977 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this10988).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10978 =
                          i10990;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10979 =
                          j10992;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10980 =
                          ((x10.array.Array_2<x10.core.Int>)this10988).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t10981 =
                          ((i10978) * (((long)(t10980))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i10982 =
                          ((j10979) + (((long)(t10981))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t10983 =
                          ((int[])r10977.value)[(int)i10982];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret10993 = t10983;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10994 =
                          ret10993;
                        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10987 = ((int) t10994) ==
                        ((int) 2);
                    }
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10995 =
                      t10987;
                    
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10995) {
                        
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                    }
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10996 =
                      xPos;
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10997 =
                      ((t10996) + (((int)(1))));
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = t10997;
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10998 =
                      yPos;
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10999 =
                      ((t10998) + (((int)(1))));
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = t10999;
                }
                
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = y;
                
//#line 89 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = x;
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10600 =
                      xPos;
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10602 =
                      ((t10600) >= (((int)(0))));
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10602) {
                        
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10601 =
                          yPos;
                        
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10602 = ((t10601) >= (((int)(0))));
                    }
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10615 =
                      t10602;
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10615) {
                        
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8953 =
                          ((x10.array.Array_2)(board));
                        
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10603 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8951 =
                          ((long)(((int)(t10603))));
                        
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10604 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8952 =
                          ((long)(((int)(t10604))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8954 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11000 =
                          ((i8951) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11000)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11001 =
                              ((x10.array.Array_2<x10.core.Int>)this8953).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11000 = ((i8951) >= (((long)(t11001))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11002 =
                          t11000;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11002)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11002 = ((j8952) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11003 =
                          t11002;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11003)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11004 =
                              ((x10.array.Array_2<x10.core.Int>)this8953).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11003 = ((j8952) >= (((long)(t11004))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11005 =
                          t11003;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11005) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8951),
                                                                                                                                               (long)(j8952));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11006 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8953).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11007 =
                          i8951;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11008 =
                          j8952;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11009 =
                          ((x10.array.Array_2<x10.core.Int>)this8953).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11010 =
                          ((i11007) * (((long)(t11009))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11011 =
                          ((j11008) + (((long)(t11010))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t11012 =
                          ((int[])r11006.value)[(int)i11011];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8954 = t11012;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10614 =
                          ret8954;
                        
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10615 = ((int) t10614) !=
                        ((int) 3);
                    }
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10637 =
                      t10615;
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10637)) {
                        
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11026 =
                      xPos;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t11027 =
                      ((int) t11026) !=
                    ((int) x);
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11027) {
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11028 =
                          yPos;
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11027 = ((int) t11028) !=
                        ((int) y);
                    }
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t11029 =
                      t11027;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11029) {
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this11030 =
                          ((x10.array.Array_2)(board));
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11031 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11032 =
                          ((long)(((int)(t11031))));
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11033 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11034 =
                          ((long)(((int)(t11033))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret11035 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11013 =
                          ((i11032) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11013)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11014 =
                              ((x10.array.Array_2<x10.core.Int>)this11030).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11013 = ((i11032) >= (((long)(t11014))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11015 =
                          t11013;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11015)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11015 = ((j11034) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11016 =
                          t11015;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11016)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11017 =
                              ((x10.array.Array_2<x10.core.Int>)this11030).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11016 = ((j11034) >= (((long)(t11017))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11018 =
                          t11016;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11018) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i11032),
                                                                                                                                               (long)(j11034));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11019 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this11030).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11020 =
                          i11032;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11021 =
                          j11034;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11022 =
                          ((x10.array.Array_2<x10.core.Int>)this11030).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11023 =
                          ((i11020) * (((long)(t11022))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11024 =
                          ((j11021) + (((long)(t11023))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t11025 =
                          ((int[])r11019.value)[(int)i11024];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret11035 = t11025;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t11036 =
                          ret11035;
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11029 = ((int) t11036) ==
                        ((int) 2);
                    }
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t11037 =
                      t11029;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11037) {
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                    }
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11038 =
                      xPos;
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11039 =
                      ((t11038) - (((int)(1))));
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = t11039;
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11040 =
                      yPos;
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11041 =
                      ((t11040) - (((int)(1))));
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = t11041;
                }
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = y;
                
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = x;
                
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                    
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10638 =
                      xPos;
                    
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10639 =
                      size;
                    
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10641 =
                      ((t10638) < (((int)(t10639))));
                    
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10641) {
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10640 =
                          yPos;
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10641 = ((t10640) >= (((int)(0))));
                    }
                    
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10654 =
                      t10641;
                    
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10654) {
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8971 =
                          ((x10.array.Array_2)(board));
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10642 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8969 =
                          ((long)(((int)(t10642))));
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10643 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8970 =
                          ((long)(((int)(t10643))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8972 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11042 =
                          ((i8969) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11042)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11043 =
                              ((x10.array.Array_2<x10.core.Int>)this8971).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11042 = ((i8969) >= (((long)(t11043))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11044 =
                          t11042;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11044)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11044 = ((j8970) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11045 =
                          t11044;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11045)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11046 =
                              ((x10.array.Array_2<x10.core.Int>)this8971).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11045 = ((j8970) >= (((long)(t11046))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11047 =
                          t11045;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11047) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8969),
                                                                                                                                               (long)(j8970));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11048 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8971).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11049 =
                          i8969;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11050 =
                          j8970;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11051 =
                          ((x10.array.Array_2<x10.core.Int>)this8971).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11052 =
                          ((i11049) * (((long)(t11051))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11053 =
                          ((j11050) + (((long)(t11052))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t11054 =
                          ((int[])r11048.value)[(int)i11053];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8972 = t11054;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10653 =
                          ret8972;
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10654 = ((int) t10653) !=
                        ((int) 3);
                    }
                    
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10676 =
                      t10654;
                    
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10676)) {
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11068 =
                      xPos;
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t11069 =
                      ((int) t11068) !=
                    ((int) x);
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11069) {
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11070 =
                          yPos;
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11069 = ((int) t11070) !=
                        ((int) y);
                    }
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t11071 =
                      t11069;
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11071) {
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this11072 =
                          ((x10.array.Array_2)(board));
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11073 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11074 =
                          ((long)(((int)(t11073))));
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11075 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11076 =
                          ((long)(((int)(t11075))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret11077 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11055 =
                          ((i11074) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11055)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11056 =
                              ((x10.array.Array_2<x10.core.Int>)this11072).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11055 = ((i11074) >= (((long)(t11056))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11057 =
                          t11055;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11057)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11057 = ((j11076) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11058 =
                          t11057;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11058)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11059 =
                              ((x10.array.Array_2<x10.core.Int>)this11072).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11058 = ((j11076) >= (((long)(t11059))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11060 =
                          t11058;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11060) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i11074),
                                                                                                                                               (long)(j11076));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11061 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this11072).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11062 =
                          i11074;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11063 =
                          j11076;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11064 =
                          ((x10.array.Array_2<x10.core.Int>)this11072).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11065 =
                          ((i11062) * (((long)(t11064))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11066 =
                          ((j11063) + (((long)(t11065))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t11067 =
                          ((int[])r11061.value)[(int)i11066];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret11077 = t11067;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t11078 =
                          ret11077;
                        
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11071 = ((int) t11078) ==
                        ((int) 2);
                    }
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t11079 =
                      t11071;
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11079) {
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                    }
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11080 =
                      xPos;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11081 =
                      ((t11080) + (((int)(1))));
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = t11081;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11082 =
                      yPos;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11083 =
                      ((t11082) - (((int)(1))));
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = t11083;
                }
                
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = y;
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = x;
                
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                    
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10677 =
                      xPos;
                    
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10680 =
                      ((t10677) >= (((int)(0))));
                    
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10680) {
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10678 =
                          yPos;
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10679 =
                          size;
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10680 = ((t10678) < (((int)(t10679))));
                    }
                    
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10693 =
                      t10680;
                    
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10693) {
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this8989 =
                          ((x10.array.Array_2)(board));
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10681 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i8987 =
                          ((long)(((int)(t10681))));
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10682 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j8988 =
                          ((long)(((int)(t10682))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret8990 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11084 =
                          ((i8987) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11084)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11085 =
                              ((x10.array.Array_2<x10.core.Int>)this8989).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11084 = ((i8987) >= (((long)(t11085))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11086 =
                          t11084;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11086)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11086 = ((j8988) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11087 =
                          t11086;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11087)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11088 =
                              ((x10.array.Array_2<x10.core.Int>)this8989).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11087 = ((j8988) >= (((long)(t11088))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11089 =
                          t11087;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11089) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i8987),
                                                                                                                                               (long)(j8988));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11090 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this8989).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11091 =
                          i8987;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11092 =
                          j8988;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11093 =
                          ((x10.array.Array_2<x10.core.Int>)this8989).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11094 =
                          ((i11091) * (((long)(t11093))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11095 =
                          ((j11092) + (((long)(t11094))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t11096 =
                          ((int[])r11090.value)[(int)i11095];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret8990 = t11096;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t10692 =
                          ret8990;
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10693 = ((int) t10692) !=
                        ((int) 3);
                    }
                    
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10715 =
                      t10693;
                    
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10715)) {
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11110 =
                      xPos;
                    
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t11111 =
                      ((int) t11110) !=
                    ((int) x);
                    
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11111) {
                        
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11112 =
                          yPos;
                        
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11111 = ((int) t11112) !=
                        ((int) y);
                    }
                    
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t11113 =
                      t11111;
                    
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11113) {
                        
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this11114 =
                          ((x10.array.Array_2)(board));
                        
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11115 =
                          xPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11116 =
                          ((long)(((int)(t11115))));
                        
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11117 =
                          yPos;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11118 =
                          ((long)(((int)(t11117))));
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret11119 =
                           0;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11097 =
                          ((i11116) < (((long)(0L))));
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11097)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11098 =
                              ((x10.array.Array_2<x10.core.Int>)this11114).
                                numElems_1;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11097 = ((i11116) >= (((long)(t11098))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11099 =
                          t11097;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11099)) {
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11099 = ((j11118) < (((long)(0L))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11100 =
                          t11099;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11100)) {
                            
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11101 =
                              ((x10.array.Array_2<x10.core.Int>)this11114).
                                numElems_2;
                            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11100 = ((j11118) >= (((long)(t11101))));
                        }
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11102 =
                          t11100;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11102) {
                            
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i11116),
                                                                                                                                               (long)(j11118));
                        }
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11103 =
                          ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this11114).
                                             raw));
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11104 =
                          i11116;
                        
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11105 =
                          j11118;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11106 =
                          ((x10.array.Array_2<x10.core.Int>)this11114).
                            numElems_2;
                        
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11107 =
                          ((i11104) * (((long)(t11106))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11108 =
                          ((j11105) + (((long)(t11107))));
                        
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t11109 =
                          ((int[])r11103.value)[(int)i11108];
                        
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret11119 = t11109;
                        
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t11120 =
                          ret11119;
                        
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11113 = ((int) t11120) ==
                        ((int) 2);
                    }
                    
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t11121 =
                      t11113;
                    
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11121) {
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                    }
                    
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11122 =
                      xPos;
                    
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11123 =
                      ((t11122) - (((int)(1))));
                    
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
xPos = t11123;
                    
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11124 =
                      yPos;
                    
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11125 =
                      ((t11124) + (((int)(1))));
                    
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
yPos = t11125;
                }
            }}catch (final java.lang.NullPointerException id$1346) {
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
            }
            
//#line 116 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validDiag$P$O(
          final int x,
          final int y,
          final Board Board){
            return Board.validDiag$O((int)(x),
                                     (int)(y));
        }
        
        
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public boolean
                                                                                                               valid$O(
                                                                                                               final int x,
                                                                                                               final int y){
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail t10716 =
              ((x10.core.Rail)(pawns));
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t10717 =
              ((x10.core.Rail<Tile>)t10716).
                size;
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10735 =
              ((long) t10717) ==
            ((long) 0L);
            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10735) {
                
//#line 121 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
try {{
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail11144 =
                      ((x10.core.Rail)(queens));
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long size11145 =
                      ((x10.core.Rail<Tile>)rail11144).
                        size;
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
long idx11141 =
                      0L;
                    {
                        
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail11144$value11210 =
                          ((Tile[])rail11144.value);
                        
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t11142 =
                              idx11141;
                            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t11143 =
                              ((t11142) < (((long)(size11145))));
                            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t11143)) {
                                
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                            }
                            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t11137 =
                              idx11141;
                            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen11138 =
                              ((Tile)(((Tile)rail11144$value11210[(int)t11137])));
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11126 =
                              queen11138.
                                x;
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t11127 =
                              ((int) t11126) ==
                            ((int) x);
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t11127)) {
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11128 =
                                  queen11138.
                                    y;
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11127 = ((int) t11128) ==
                                ((int) y);
                            }
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t11129 =
                              t11127;
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t11129)) {
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11130 =
                                  queen11138.
                                    y;
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11131 =
                                  ((t11130) - (((int)(y))));
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11132 =
                                  java.lang.Math.abs(((int)(t11131)));
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11133 =
                                  queen11138.
                                    x;
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11134 =
                                  ((t11133) - (((int)(x))));
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11135 =
                                  java.lang.Math.abs(((int)(t11134)));
                                
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11129 = ((int) t11132) ==
                                ((int) t11135);
                            }
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t11136 =
                              t11129;
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t11136) {
                                
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return false;
                            }
                            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t11139 =
                              idx11141;
                            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final long t11140 =
                              ((t11139) + (((long)(1L))));
                            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
idx11141 = t11140;
                        }
                    }
                    
//#line 127 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
                }}catch (final java.lang.NullPointerException id$1347) {
                    
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return true;
                }
            }
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10736 =
              this.validHoriz$O((int)(x),
                                (int)(y));
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10736) {
                
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10736 = this.validDiag$O((int)(x),
                                                                                                                                               (int)(y));
            }
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10737 =
              t10736;
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10737) {
                
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10737 = this.validVert$O((int)(x),
                                                                                                                                               (int)(y));
            }
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10738 =
              t10737;
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
return t10738;
        }
        
        
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
public void
                                                                                                               print(
                                                                                                               ){
            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10739 =
              size;
            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i6737max6739 =
              ((t10739) - (((int)(1))));
            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i11178 =
              0;
            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11179 =
                  i11178;
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t11180 =
                  ((t11179) <= (((int)(i6737max6739))));
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t11180)) {
                    
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                }
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int y11175 =
                  i11178;
                
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11172 =
                  size;
                
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int i6721max11173 =
                  ((t11172) - (((int)(1))));
                
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
int i11169 =
                  0;
                
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11170 =
                      i11169;
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t11171 =
                      ((t11170) <= (((int)(i6721max11173))));
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t11171)) {
                        
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int x11166 =
                      i11169;
                    
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t11159 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this11160 =
                      ((x10.array.Array_2)(board));
                    
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11161 =
                      ((long)(((int)(x11166))));
                    
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11162 =
                      ((long)(((int)(y11175))));
                    
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret11163 =
                       0;
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11146 =
                      ((i11161) < (((long)(0L))));
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11146)) {
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11147 =
                          ((x10.array.Array_2<x10.core.Int>)this11160).
                            numElems_1;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11146 = ((i11161) >= (((long)(t11147))));
                    }
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11148 =
                      t11146;
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11148)) {
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11148 = ((j11162) < (((long)(0L))));
                    }
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11149 =
                      t11148;
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11149)) {
                        
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11150 =
                          ((x10.array.Array_2<x10.core.Int>)this11160).
                            numElems_2;
                        
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11149 = ((j11162) >= (((long)(t11150))));
                    }
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11151 =
                      t11149;
                    
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11151) {
                        
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i11161),
                                                                                                                                           (long)(j11162));
                    }
                    
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11152 =
                      ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this11160).
                                         raw));
                    
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11153 =
                      i11161;
                    
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11154 =
                      j11162;
                    
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11155 =
                      ((x10.array.Array_2<x10.core.Int>)this11160).
                        numElems_2;
                    
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11156 =
                      ((i11153) * (((long)(t11155))));
                    
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11157 =
                      ((j11154) + (((long)(t11156))));
                    
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t11158 =
                      ((int[])r11152.value)[(int)i11157];
                    
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret11163 = t11158;
                    
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int t11164 =
                      ret11163;
                    
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.String t11165 =
                      (("-") + ((x10.core.Int.$box(t11164))));
                    
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11159.print(((java.lang.String)(t11165)));
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11167 =
                      i11169;
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11168 =
                      ((t11167) + (((int)(1))));
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i11169 = t11168;
                }
                
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t11174 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t11174.println(((java.lang.Object)("-")));
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11176 =
                  i11178;
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t11177 =
                  ((t11176) + (((int)(1))));
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
i11178 = t11177;
            }
        }
        
        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
private void
                                                                                                               place(
                                                                                                               final Tile someTile){
            
//#line 147 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this10404 =
              ((x10.array.Array_2)(board));
            
//#line 147 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10764 =
              someTile.
                x;
            
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10402 =
              ((long)(((int)(t10764))));
            
//#line 147 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10765 =
              someTile.
                y;
            
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10403 =
              ((long)(((int)(t10765))));
            
//#line 142 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret10405 =
               0;
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11181 =
              ((i10402) < (((long)(0L))));
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11181)) {
                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11182 =
                  ((x10.array.Array_2<x10.core.Int>)this10404).
                    numElems_1;
                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11181 = ((i10402) >= (((long)(t11182))));
            }
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11183 =
              t11181;
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11183)) {
                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11183 = ((j10403) < (((long)(0L))));
            }
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11184 =
              t11183;
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11184)) {
                
//#line 144 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11185 =
                  ((x10.array.Array_2<x10.core.Int>)this10404).
                    numElems_2;
                
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11184 = ((j10403) >= (((long)(t11185))));
            }
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11186 =
              t11184;
            
//#line 143 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11186) {
                
//#line 145 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i10402),
                                                                                                                                   (long)(j10403));
            }
            
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11187 =
              ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this10404).
                                 raw));
            
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11188 =
              i10402;
            
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11189 =
              j10403;
            
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11190 =
              ((x10.array.Array_2<x10.core.Int>)this10404).
                numElems_2;
            
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11191 =
              ((i11188) * (((long)(t11190))));
            
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11192 =
              ((j11189) + (((long)(t11191))));
            
//#line 38 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int t11193 =
              ((int[])r11187.value)[(int)i11192];
            
//#line 147 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret10405 = t11193;
            
//#line 147 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int occupation =
              ret10405;
            
//#line 148 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
boolean t10775 =
              ((int) occupation) ==
            ((int) 2);
            
//#line 148 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (!(t10775)) {
                
//#line 148 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
t10775 = ((int) occupation) ==
                ((int) 3);
            }
            
//#line 148 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final boolean t10777 =
              t10775;
            
//#line 148 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
if (t10777) {
                
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.RuntimeException t10776 =
                  ((java.lang.RuntimeException)(new java.lang.RuntimeException("Placing on a wrong place!")));
                
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
throw t10776;
            }
            
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 this10414 =
              ((x10.array.Array_2)(board));
            
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10778 =
              someTile.
                x;
            
//#line 169 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i10411 =
              ((long)(((int)(t10778))));
            
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Board.x10"
final int t10779 =
              someTile.
                y;
            
//#line 169 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j10412 =
              ((long)(((int)(t10779))));
            
//#line 169 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final int v10413 =
              someTile.
                tileType;
            
//#line 169 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
int ret10415 =
               0;
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11194 =
              ((i10411) < (((long)(0L))));
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11194)) {
                
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11195 =
                  ((x10.array.Array_2<x10.core.Int>)this10414).
                    numElems_1;
                
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11194 = ((i10411) >= (((long)(t11195))));
            }
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11196 =
              t11194;
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11196)) {
                
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11196 = ((j10412) < (((long)(0L))));
            }
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
boolean t11197 =
              t11196;
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (!(t11197)) {
                
//#line 171 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11198 =
                  ((x10.array.Array_2<x10.core.Int>)this10414).
                    numElems_2;
                
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
t11197 = ((j10412) >= (((long)(t11198))));
            }
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final boolean t11199 =
              t11197;
            
//#line 170 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
if (t11199) {
                
//#line 172 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
x10.array.Array.raiseBoundsError((long)(i10411),
                                                                                                                                   (long)(j10412));
            }
            
//#line 41 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final x10.core.Rail r11200 =
              ((x10.core.Rail)(((x10.array.Array<x10.core.Int>)this10414).
                                 raw));
            
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long i11201 =
              i10411;
            
//#line 130 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long j11202 =
              j10412;
            
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11203 =
              ((x10.array.Array_2<x10.core.Int>)this10414).
                numElems_2;
            
//#line 131 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
final long t11204 =
              ((i11201) * (((long)(t11203))));
            
//#line 41 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final long i11205 =
              ((j11202) + (((long)(t11204))));
            
//#line 41 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
final int v11206 =
              v10413;
            
//#line 40 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
int ret11207 =
               0;
            
//#line 42 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
((int[])r11200.value)[(int)i11205] = v11206;
            
//#line 43 .. "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/lang/Unsafe.x10"
ret11207 = v11206;
            
//#line 175 . "/Users/dobridobrev/bin/x102/stdlib/x10.jar:x10/array/Array_2.x10"
ret10415 = v10413;
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

