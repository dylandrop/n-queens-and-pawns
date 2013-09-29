
@x10.runtime.impl.java.X10Generated public class Solver extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Solver> $RTT = x10.rtt.NamedType.<Solver> make(
    "Solver", Solver.class
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Solver $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        $_obj.solutions = $deserializer.readInt();
        $_obj.arr = $deserializer.readRef();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        Solver $_obj = new Solver((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.solutions);
        if (arr instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.arr);
        } else {
        $serializer.write(this.arr);
        }
        
    }
    
    // constructor just for allocation
    public Solver(final java.lang.System[] $dummy) { 
    }
    
        
//#line 16 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public int solutions;
        
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail<Tile> arr;
        
        
//#line 25 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public long
                                                                                                               solve__1$1Tile$2$O(
                                                                                                               final int size,
                                                                                                               final x10.util.ArrayList pawns){
            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6595 =
              this.queensForBoard((int)(size));
            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.arr = ((x10.core.Rail)(t6595));
            {
                
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.lang.FinishState x10$__var0 =
                  x10.lang.Runtime.startFinish();
                
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                    {
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6597 =
                          ((long)(((int)(size))));
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6598 =
                          ((x10.core.Rail<Tile>)
                            ((x10.util.ArrayList<Tile>)pawns).toRail());
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6596 =
                          ((long)(((int)(size))));
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6599 =
                          ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t6596)));
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.boardCombos__3$1Tile$2__4$1Tile$2((long)(t6597),
                                                                                                                                                                    (int)(0),
                                                                                                                                                                    (int)(size),
                                                                                                                                                                    ((x10.core.Rail)(t6598)),
                                                                                                                                                                    ((x10.core.Rail)(t6599)),
                                                                                                                                                                    (int)(0));
                    }
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                    
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
throw new java.lang.RuntimeException();
                }finally {{
                     
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var0)));
                 }}
                }
            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6600 =
              solutions;
            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6601 =
              ((long)(((int)(t6600))));
            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6601;
            }
        
        
//#line 41 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public void
                                                                                                               boardCombos__3$1Tile$2__4$1Tile$2(
                                                                                                               final long len,
                                                                                                               final int startPos,
                                                                                                               final int size,
                                                                                                               final x10.core.Rail pawns,
                                                                                                               final x10.core.Rail queens,
                                                                                                               final int occupied){
            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6602 =
              ((int) size) ==
            ((int) 0);
            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6602) {
                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6605 =
              ((long) len) ==
            ((long) 0L);
            
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6605) {
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                    
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.enterAtomic();
                    {
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver x6279 =
                          ((Solver)(this));
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6603 =
                          x6279.
                            solutions;
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6604 =
                          ((t6603) + (((int)(1))));
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x6279.solutions = t6604;
                    }
                }}finally {{
                      
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.exitAtomic();
                  }}
                
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
                }
            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Solver.$Closure$0(this,
                                                                                                                                                                                             startPos,
                                                                                                                                                                                             len,
                                                                                                                                                                                             queens,
                                                                                                                                                                                             pawns,
                                                                                                                                                                                             occupied,
                                                                                                                                                                                             size, (Solver.$Closure$0.__3$1Tile$2__4$1Tile$2) null))));
            }
        
        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                               cloneArray__0$1Tile$2(
                                                                                                               final x10.core.Rail x){
            
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6641 =
              ((x10.core.Rail<Tile>)x).
                size;
            
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail out =
              new x10.core.Rail<Tile>(Tile.$RTT, ((long)(t6641)));
            
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
long i6844 =
              0L;
            {
                
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] x$value6998 =
                  ((Tile[])x.value);
                
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6845 =
                      i6844;
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6846 =
                      ((x10.core.Rail<Tile>)x).
                        size;
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6847 =
                      ((t6845) < (((long)(t6846))));
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t6847)) {
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6838 =
                      out;
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6839 =
                      i6844;
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6840 =
                      i6844;
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6841 =
                      ((Tile)x$value6998[(int)t6840]);
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t6838.value)[(int)t6839] = t6841;
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6842 =
                      i6844;
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6843 =
                      ((t6842) + (((long)(1L))));
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i6844 = t6843;
                }
            }
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6652 =
              out;
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6652;
        }
        
        
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public boolean
                                                                                                               safe__0$1Tile$2__1$1Tile$2$O(
                                                                                                               final x10.core.Rail pawns,
                                                                                                               final x10.core.Rail qRail,
                                                                                                               final int x,
                                                                                                               final int y){
            
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean out =
              true;
            
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6653 =
              ((x10.core.Rail<Tile>)pawns).
                size;
            
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6654 =
              ((long) t6653) ==
            ((long) 0L);
            
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6654) {
                
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
            }
            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6655 =
              ((x10.core.Rail<Tile>)qRail).
                size;
            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6656 =
              ((long) t6655) ==
            ((long) 0L);
            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6656) {
                
//#line 89 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
            }
            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i6965 =
              0;
            {
                
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] pawns$value6999 =
                  ((Tile[])pawns.value);
                
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6966 =
                      i6965;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6967 =
                      ((long)(((int)(t6966))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6968 =
                      ((x10.core.Rail<Tile>)pawns).
                        size;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6969 =
                      ((t6967) < (((long)(t6968))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t6969)) {
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6848 =
                      i6965;
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6849 =
                      ((long)(((int)(t6848))));
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6850 =
                      ((Tile)pawns$value6999[(int)t6849]);
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6851 =
                      t6850.
                        x;
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6852 =
                      ((int) t6851) ==
                    ((int) x);
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6852) {
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6853 =
                          i6965;
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6854 =
                          ((long)(((int)(t6853))));
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6855 =
                          ((Tile)pawns$value6999[(int)t6854]);
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6856 =
                          t6855.
                            y;
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6852 = ((int) t6856) ==
                        ((int) y);
                    }
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6857 =
                      t6852;
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6857) {
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                    }
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6858 =
                      i6965;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6859 =
                      ((t6858) + (((int)(1))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i6965 = t6859;
                }
            }
            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i6970 =
              0;
            {
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] qRail$value7000 =
                  ((Tile[])qRail.value);
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6971 =
                      i6970;
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6972 =
                      ((long)(((int)(t6971))));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6973 =
                      ((x10.core.Rail<Tile>)qRail).
                        size;
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6974 =
                      ((t6972) < (((long)(t6973))));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t6974)) {
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6860 =
                          i6970;
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6861 =
                          ((long)(((int)(t6860))));
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6862 =
                          ((Tile)qRail$value7000[(int)t6861]);
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6863 =
                          t6862.
                            x;
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6864 =
                          ((int) t6863) ==
                        ((int) x);
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6864) {
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6865 =
                              i6970;
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6866 =
                              ((long)(((int)(t6865))));
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6867 =
                              ((Tile)qRail$value7000[(int)t6866]);
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6868 =
                              t6867.
                                y;
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6864 = ((int) t6868) ==
                            ((int) y);
                        }
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6869 =
                          t6864;
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6869) {
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6870 =
                          i6970;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6871 =
                          ((long)(((int)(t6870))));
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6872 =
                          ((Tile)qRail$value7000[(int)t6871]);
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6873 =
                          t6872.
                            x;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6874 =
                          ((int) t6873) ==
                        ((int) x);
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6874) {
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6875 =
                              i6970;
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6876 =
                              ((long)(((int)(t6875))));
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6877 =
                              ((Tile)qRail$value7000[(int)t6876]);
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6878 =
                              t6877.
                                y;
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6879 =
                              ((y) - (((int)(1))));
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6874 = ((int) t6878) ==
                            ((int) t6879);
                        }
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6880 =
                          t6874;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6880) {
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6881 =
                          i6970;
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6882 =
                          ((long)(((int)(t6881))));
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6883 =
                          ((Tile)qRail$value7000[(int)t6882]);
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6884 =
                          t6883.
                            x;
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6885 =
                          ((int) t6884) ==
                        ((int) x);
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6885) {
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6886 =
                              i6970;
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6887 =
                              ((long)(((int)(t6886))));
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6888 =
                              ((Tile)qRail$value7000[(int)t6887]);
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6889 =
                              t6888.
                                y;
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6890 =
                              ((y) + (((int)(1))));
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6885 = ((int) t6889) ==
                            ((int) t6890);
                        }
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6891 =
                          t6885;
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6891) {
                            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6892 =
                          i6970;
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6893 =
                          ((long)(((int)(t6892))));
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6894 =
                          ((Tile)qRail$value7000[(int)t6893]);
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6895 =
                          t6894.
                            x;
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6896 =
                          ((x) - (((int)(1))));
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6897 =
                          ((int) t6895) ==
                        ((int) t6896);
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6897) {
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6898 =
                              i6970;
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6899 =
                              ((long)(((int)(t6898))));
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6900 =
                              ((Tile)qRail$value7000[(int)t6899]);
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6901 =
                              t6900.
                                y;
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6897 = ((int) t6901) ==
                            ((int) y);
                        }
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6902 =
                          t6897;
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6902) {
                            
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6903 =
                          i6970;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6904 =
                          ((long)(((int)(t6903))));
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6905 =
                          ((Tile)qRail$value7000[(int)t6904]);
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6906 =
                          t6905.
                            x;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6907 =
                          ((x) + (((int)(1))));
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6908 =
                          ((int) t6906) ==
                        ((int) t6907);
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6908) {
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6909 =
                              i6970;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6910 =
                              ((long)(((int)(t6909))));
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6911 =
                              ((Tile)qRail$value7000[(int)t6910]);
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6912 =
                              t6911.
                                y;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6908 = ((int) t6912) ==
                            ((int) y);
                        }
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6913 =
                          t6908;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6913) {
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6914 =
                          i6970;
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6915 =
                          ((long)(((int)(t6914))));
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6916 =
                          ((Tile)qRail$value7000[(int)t6915]);
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6917 =
                          t6916.
                            x;
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6918 =
                          ((x) + (((int)(1))));
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6919 =
                          ((int) t6917) ==
                        ((int) t6918);
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6919) {
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6920 =
                              i6970;
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6921 =
                              ((long)(((int)(t6920))));
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6922 =
                              ((Tile)qRail$value7000[(int)t6921]);
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6923 =
                              t6922.
                                y;
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6924 =
                              ((y) + (((int)(1))));
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6919 = ((int) t6923) ==
                            ((int) t6924);
                        }
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6925 =
                          t6919;
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6925) {
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6926 =
                          i6970;
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6927 =
                          ((long)(((int)(t6926))));
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6928 =
                          ((Tile)qRail$value7000[(int)t6927]);
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6929 =
                          t6928.
                            x;
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6930 =
                          ((x) - (((int)(1))));
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6931 =
                          ((int) t6929) ==
                        ((int) t6930);
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6931) {
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6932 =
                              i6970;
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6933 =
                              ((long)(((int)(t6932))));
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6934 =
                              ((Tile)qRail$value7000[(int)t6933]);
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6935 =
                              t6934.
                                y;
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6936 =
                              ((y) + (((int)(1))));
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6931 = ((int) t6935) ==
                            ((int) t6936);
                        }
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6937 =
                          t6931;
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6937) {
                            
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6938 =
                          i6970;
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6939 =
                          ((long)(((int)(t6938))));
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6940 =
                          ((Tile)qRail$value7000[(int)t6939]);
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6941 =
                          t6940.
                            x;
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6942 =
                          ((x) + (((int)(1))));
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6943 =
                          ((int) t6941) ==
                        ((int) t6942);
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6943) {
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6944 =
                              i6970;
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6945 =
                              ((long)(((int)(t6944))));
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6946 =
                              ((Tile)qRail$value7000[(int)t6945]);
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6947 =
                              t6946.
                                y;
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6948 =
                              ((y) - (((int)(1))));
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6943 = ((int) t6947) ==
                            ((int) t6948);
                        }
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6949 =
                          t6943;
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6949) {
                            
//#line 121 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6950 =
                          i6970;
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6951 =
                          ((long)(((int)(t6950))));
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6952 =
                          ((Tile)qRail$value7000[(int)t6951]);
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6953 =
                          t6952.
                            x;
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6954 =
                          ((x) - (((int)(1))));
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t6955 =
                          ((int) t6953) ==
                        ((int) t6954);
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6955) {
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6956 =
                              i6970;
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6957 =
                              ((long)(((int)(t6956))));
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6958 =
                              ((Tile)qRail$value7000[(int)t6957]);
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6959 =
                              t6958.
                                y;
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6960 =
                              ((y) - (((int)(1))));
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6955 = ((int) t6959) ==
                            ((int) t6960);
                        }
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6961 =
                          t6955;
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6961) {
                            
//#line 125 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                    }}catch (final java.lang.NullPointerException id$6962) {
                        
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
                    }
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6963 =
                      i6970;
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6964 =
                      ((t6963) + (((int)(1))));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i6970 = t6964;
                }
            }
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6783 =
              out;
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6783;
        }
        
        
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                                queensForBoard(
                                                                                                                final int ofSize){
            
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6786 =
              ((int) ofSize) ==
            ((int) 0);
            
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6786) {
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6784 =
                  ((long)(((int)(0))));
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6785 =
                  ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t6784)));
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6785;
            }
            
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6787 =
              ((ofSize) * (((int)(ofSize))));
            
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6788 =
              ((long)(((int)(t6787))));
            
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail queens =
              new x10.core.Rail<Tile>(Tile.$RTT, t6788);
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i6989 =
              1;
            {
                
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] queens$value7001 =
                  ((Tile[])queens.value);
                
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6990 =
                      i6989;
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6991 =
                      ((ofSize) * (((int)(ofSize))));
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6992 =
                      ((t6990) <= (((int)(t6991))));
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t6992)) {
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6977 =
                      i6989;
                    
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6978 =
                      ((t6977) - (((int)(1))));
                    
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int x6979 =
                      ((t6978) % (((int)(ofSize))));
                    
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6980 =
                      i6989;
                    
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6981 =
                      ((t6980) - (((int)(1))));
                    
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int y6982 =
                      ((t6981) / (((int)(ofSize))));
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6983 =
                      i6989;
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6984 =
                      ((long)(((int)(t6983))));
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6985 =
                      ((t6984) - (((long)(1L))));
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile alloc6986 =
                      new Tile((java.lang.System[]) null);
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6975 =
                      x6979;
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6976 =
                      y6982;
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
alloc6986.Tile$$init$S(t6975,
                                                                                                                                                 t6976,
                                                                                                                                                 ((int)(2)));
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
queens$value7001[(int)t6985]=alloc6986;
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6987 =
                      i6989;
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6988 =
                      ((t6987) + (((int)(1))));
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i6989 = t6988;
                }
            }
            
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return queens;
        }
        
        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
@x10.runtime.impl.java.X10Generated public static class Node extends x10.core.Ref implements x10.serialization.X10JavaSerializable
                                                                                                              {
            private static final long serialVersionUID = 1L;
            public static final x10.rtt.RuntimeType<Node> $RTT = x10.rtt.NamedType.<Node> make(
            "Solver.Node", Node.class
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            public x10.rtt.Type<?> $getParam(int i) {return null;}
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Solver.Node $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                $_obj.board = $deserializer.readRef();
                $_obj.out$ = $deserializer.readRef();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                Solver.Node $_obj = new Solver.Node((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (board instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.board);
                } else {
                $serializer.write(this.board);
                }
                if (out$ instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.out$);
                } else {
                $serializer.write(this.out$);
                }
                
            }
            
            // constructor just for allocation
            public Node(final java.lang.System[] $dummy) { 
            }
            
                
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public Solver out$;
                
//#line 150 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public Board board;
                
                
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
// creation method for java code (1-phase java constructor)
                public Node(final Solver out$,
                            final x10.core.Rail<Tile> pawns,
                            final x10.core.Rail<Tile> queens,
                            final int size, __1$1Tile$2__2$1Tile$2 $dummy){this((java.lang.System[]) null);
                                                                               Solver$Node$$init$S(out$,pawns,queens,size, (Solver.Node.__1$1Tile$2__2$1Tile$2) null);}
                
                // constructor for non-virtual call
                final public Solver.Node Solver$Node$$init$S(final Solver out$,
                                                             final x10.core.Rail<Tile> pawns,
                                                             final x10.core.Rail<Tile> queens,
                                                             final int size, __1$1Tile$2__2$1Tile$2 $dummy) { {
                                                                                                                     
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.out$ = out$;
                                                                                                                     
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"

                                                                                                                     
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node this6993 =
                                                                                                                       this;
                                                                                                                     
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board alloc5958 =
                                                                                                                       ((Board)(new Board((java.lang.System[]) null)));
                                                                                                                     
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
alloc5958.Board$$init$S(((int)(size)),
                                                                                                                                                                                                                                                   ((x10.core.Rail)(pawns)),
                                                                                                                                                                                                                                                   ((x10.core.Rail)(queens)), (Board.__1$1Tile$2__2$1Tile$2) null);
                                                                                                                     
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.board = ((Board)(alloc5958));
                                                                                                                 }
                                                                                                                 return this;
                                                                                                                 }
                
                
                
//#line 155 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public boolean
                                                                                                                        check$O(
                                                                                                                        ){
                    
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t6804 =
                      ((Board)(board));
                    
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6805 =
                      t6804.valid$O();
                    
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6805;
                }
                
                
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver.Node
                                                                                                                        Solver$Node$$this$Solver$Node(
                                                                                                                        ){
                    
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.Node.this;
                }
                
                
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                                        Solver$Node$$this$Solver(
                                                                                                                        ){
                    
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6806 =
                      this.
                        out$;
                    
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6806;
                }
                
                
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public void
                                                                                                                        __fieldInitializers_Solver_Node(
                                                                                                                        ){
                    
                }
            // synthetic type for parameter mangling
            public static final class __1$1Tile$2__2$1Tile$2 {}
            
        }
        
        
        
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                               Solver$$this$Solver(
                                                                                                               ){
            
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.this;
        }
        
        
//#line 15 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
// creation method for java code (1-phase java constructor)
        public Solver(){this((java.lang.System[]) null);
                            Solver$$init$S();}
        
        // constructor for non-virtual call
        final public Solver Solver$$init$S() { {
                                                      
//#line 15 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"

                                                      
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver this6592 =
                                                        this;
                                                      
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this6592.solutions = 0;
                                                      
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this6592.arr = null;
                                                  }
                                                  return this;
                                                  }
        
        
        
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public void
                                                                                                               __fieldInitializers_Solver(
                                                                                                               ){
            
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.solutions = 0;
            
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.arr = null;
        }
        
        @x10.runtime.impl.java.X10Generated final public static class $Closure$0 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            public static final x10.rtt.RuntimeType<$Closure$0> $RTT = x10.rtt.StaticVoidFunType.<$Closure$0> make(
            $Closure$0.class, new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            public x10.rtt.Type<?> $getParam(int i) {return null;}
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Solver.$Closure$0 $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                $_obj.out$$ = $deserializer.readRef();
                $_obj.startPos = $deserializer.readInt();
                $_obj.len = $deserializer.readLong();
                $_obj.queens = $deserializer.readRef();
                $_obj.pawns = $deserializer.readRef();
                $_obj.occupied = $deserializer.readInt();
                $_obj.size = $deserializer.readInt();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                Solver.$Closure$0 $_obj = new Solver.$Closure$0((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (out$$ instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.out$$);
                } else {
                $serializer.write(this.out$$);
                }
                $serializer.write(this.startPos);
                $serializer.write(this.len);
                if (queens instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.queens);
                } else {
                $serializer.write(this.queens);
                }
                if (pawns instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.pawns);
                } else {
                $serializer.write(this.pawns);
                }
                $serializer.write(this.occupied);
                $serializer.write(this.size);
                
            }
            
            // constructor just for allocation
            public $Closure$0(final java.lang.System[] $dummy) { 
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                        
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i =
                          this.
                            startPos;
                        
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6607 =
                              i;
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6610 =
                              ((long)(((int)(t6607))));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6608 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6609 =
                              ((x10.core.Rail<Tile>)t6608).
                                size;
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6611 =
                              ((t6609) - (((long)(this.
                                                    len))));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6640 =
                              ((t6610) <= (((long)(t6611))));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t6640)) {
                                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                            }
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail qTemp6808 =
                              this.
                                out$$.cloneArray__0$1Tile$2(((x10.core.Rail)(this.
                                                                               queens)));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6809 =
                              qTemp6808;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6810 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6811 =
                              i;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6812 =
                              ((long)(((int)(t6811))));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6813 =
                              ((Tile[])t6810.value)[(int)t6812];
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6814 =
                              t6813.
                                x;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6815 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6816 =
                              i;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6817 =
                              ((long)(((int)(t6816))));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6818 =
                              ((Tile[])t6815.value)[(int)t6817];
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6819 =
                              t6818.
                                y;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6820 =
                              this.
                                out$$.safe__0$1Tile$2__1$1Tile$2$O(((x10.core.Rail)(this.
                                                                                      pawns)),
                                                                   ((x10.core.Rail)(t6809)),
                                                                   (int)(t6814),
                                                                   (int)(t6819));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6820) {
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6821 =
                                  qTemp6808;
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6822 =
                                  ((long)(((int)(this.
                                                   occupied))));
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6823 =
                                  ((x10.core.Rail)(this.
                                                     out$$.
                                                     arr));
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6824 =
                                  i;
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6825 =
                                  ((long)(((int)(t6824))));
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t6826 =
                                  ((Tile[])t6823.value)[(int)t6825];
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t6821.value)[(int)t6822] = t6826;
                                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n6827 =
                                  new Solver.Node((java.lang.System[]) null);
                                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6807 =
                                  qTemp6808;
                                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
n6827.Solver$Node$$init$S(((Solver)(this.
                                                                                                                                                                           out$$)),
                                                                                                                                                               this.
                                                                                                                                                                 pawns,
                                                                                                                                                               t6807,
                                                                                                                                                               this.
                                                                                                                                                                 size, (Solver.Node.__1$1Tile$2__2$1Tile$2) null);
                                
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t6828 =
                                  ((Board)(n6827.
                                             board));
                                
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6829 =
                                  t6828.valid$O();
                                
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6829) {
                                    
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int oTemp6830 =
                                      ((this.
                                          occupied) + (((int)(1))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6831 =
                                      ((this.
                                          len) - (((long)(1L))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6832 =
                                      i;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6833 =
                                      ((t6832) + (((int)(1))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6834 =
                                      qTemp6808;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6835 =
                                      oTemp6830;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.
                                                                                                                                           out$$.boardCombos__3$1Tile$2__4$1Tile$2((long)(t6831),
                                                                                                                                                                                   (int)(t6833),
                                                                                                                                                                                   (int)(this.
                                                                                                                                                                                           size),
                                                                                                                                                                                   ((x10.core.Rail)(this.
                                                                                                                                                                                                      pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(t6834)),
                                                                                                                                                                                   (int)(t6835));
                                }
                            }
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6836 =
                              i;
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6837 =
                              ((t6836) + (((int)(1))));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i = t6837;
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public Solver out$$;
                public int startPos;
                public long len;
                public x10.core.Rail<Tile> queens;
                public x10.core.Rail<Tile> pawns;
                public int occupied;
                public int size;
                
                public $Closure$0(final Solver out$$,
                                  final int startPos,
                                  final long len,
                                  final x10.core.Rail<Tile> queens,
                                  final x10.core.Rail<Tile> pawns,
                                  final int occupied,
                                  final int size, __3$1Tile$2__4$1Tile$2 $dummy) { {
                                                                                          this.out$$ = out$$;
                                                                                          this.startPos = startPos;
                                                                                          this.len = len;
                                                                                          this.queens = ((x10.core.Rail)(queens));
                                                                                          this.pawns = ((x10.core.Rail)(pawns));
                                                                                          this.occupied = occupied;
                                                                                          this.size = size;
                                                                                      }}
                // synthetic type for parameter mangling
                public static final class __3$1Tile$2__4$1Tile$2 {}
                
            }
            
        
        }
        
        