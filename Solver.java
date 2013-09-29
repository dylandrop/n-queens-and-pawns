
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
        $_obj.arr2 = $deserializer.readRef();
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
        if (arr2 instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.arr2);
        } else {
        $serializer.write(this.arr2);
        }
        
    }
    
    // constructor just for allocation
    public Solver(final java.lang.System[] $dummy) { 
    }
    
        
//#line 16 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public int solutions;
        
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail<Tile> arr;
        
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail<Tile> arr2;
        
        
//#line 26 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public long
                                                                                                               solve__1$1Tile$2$O(
                                                                                                               final int size,
                                                                                                               final x10.util.ArrayList pawns){
            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6758 =
              this.queensForBoard((int)(size));
            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.arr = ((x10.core.Rail)(t6758));
            
//#line 32 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6759 =
              ((long)(((int)(size))));
            
//#line 32 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6760 =
              ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t6759)));
            
//#line 32 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.arr2 = ((x10.core.Rail)(t6760));
            {
                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.lang.FinishState x10$__var0 =
                  x10.lang.Runtime.startFinish();
                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                    {
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6762 =
                          ((long)(((int)(size))));
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6763 =
                          ((x10.core.Rail<Tile>)
                            ((x10.util.ArrayList<Tile>)pawns).toRail());
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6761 =
                          ((long)(((int)(size))));
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6764 =
                          ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t6761)));
                        
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.boardCombos__3$1Tile$2__4$1Tile$2((long)(t6762),
                                                                                                                                                                    (int)(0),
                                                                                                                                                                    (int)(size),
                                                                                                                                                                    ((x10.core.Rail)(t6763)),
                                                                                                                                                                    ((x10.core.Rail)(t6764)),
                                                                                                                                                                    (int)(0),
                                                                                                                                                                    (int)(0));
                    }
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                    
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
throw new java.lang.RuntimeException();
                }finally {{
                     
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var0)));
                 }}
                }
            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6765 =
              solutions;
            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6766 =
              ((long)(((int)(t6765))));
            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6766;
            }
        
        
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public void
                                                                                                               boardCombos__3$1Tile$2__4$1Tile$2(
                                                                                                               final long len,
                                                                                                               final int startPos,
                                                                                                               final int size,
                                                                                                               final x10.core.Rail pawns,
                                                                                                               final x10.core.Rail queens,
                                                                                                               final int occupied,
                                                                                                               final int takenUpTo){
            
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6767 =
              ((int) size) ==
            ((int) 0);
            
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6767) {
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6770 =
              ((long) len) ==
            ((long) 0L);
            
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6770) {
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.enterAtomic();
                    {
                        
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver x6474 =
                          ((Solver)(this));
                        
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6768 =
                          x6474.
                            solutions;
                        
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6769 =
                          ((t6768) + (((int)(1))));
                        
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x6474.solutions = t6769;
                    }
                }}finally {{
                      
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.exitAtomic();
                  }}
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
                }
            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6771 =
              ((x10.core.Rail<Tile>)pawns).
                size;
            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6838 =
              ((long) t6771) ==
            ((long) 0L);
            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6838) {
                
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Solver.$Closure$0(this,
                                                                                                                                                                                                 size,
                                                                                                                                                                                                 queens,
                                                                                                                                                                                                 pawns,
                                                                                                                                                                                                 takenUpTo,
                                                                                                                                                                                                 occupied,
                                                                                                                                                                                                 len, (Solver.$Closure$0.__2$1Tile$2__3$1Tile$2) null))));
            } else {
                
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Solver.$Closure$1(this,
                                                                                                                                                                                                 startPos,
                                                                                                                                                                                                 len,
                                                                                                                                                                                                 queens,
                                                                                                                                                                                                 pawns,
                                                                                                                                                                                                 occupied,
                                                                                                                                                                                                 size, (Solver.$Closure$1.__3$1Tile$2__4$1Tile$2) null))));
            }
            }
        
        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                                cloneArray__0$1Tile$2(
                                                                                                                final x10.core.Rail x){
            
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6839 =
              ((x10.core.Rail<Tile>)x).
                size;
            
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail out =
              new x10.core.Rail<Tile>(Tile.$RTT, ((long)(t6839)));
            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
long i7072 =
              0L;
            {
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] x$value7228 =
                  ((Tile[])x.value);
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7073 =
                      i7072;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7074 =
                      ((x10.core.Rail<Tile>)x).
                        size;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7075 =
                      ((t7073) < (((long)(t7074))));
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t7075)) {
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7066 =
                      out;
                    
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7067 =
                      i7072;
                    
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7068 =
                      i7072;
                    
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7069 =
                      ((Tile)x$value7228[(int)t7068]);
                    
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t7066.value)[(int)t7067] = t7069;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7070 =
                      i7072;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7071 =
                      ((t7070) + (((long)(1L))));
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i7072 = t7071;
                }
            }
            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6850 =
              out;
            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6850;
        }
        
        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public boolean
                                                                                                                safe__0$1Tile$2__1$1Tile$2$O(
                                                                                                                final x10.core.Rail pawns,
                                                                                                                final x10.core.Rail qRail,
                                                                                                                final int x,
                                                                                                                final int y){
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean out =
              true;
            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6851 =
              ((x10.core.Rail<Tile>)pawns).
                size;
            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6852 =
              ((long) t6851) ==
            ((long) 0L);
            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6852) {
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
            }
            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6853 =
              ((x10.core.Rail<Tile>)qRail).
                size;
            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6854 =
              ((long) t6853) ==
            ((long) 0L);
            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6854) {
                
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
            }
            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i7193 =
              0;
            {
                
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] pawns$value7229 =
                  ((Tile[])pawns.value);
                
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7194 =
                      i7193;
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7195 =
                      ((long)(((int)(t7194))));
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7196 =
                      ((x10.core.Rail<Tile>)pawns).
                        size;
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7197 =
                      ((t7195) < (((long)(t7196))));
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t7197)) {
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7076 =
                      i7193;
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7077 =
                      ((long)(((int)(t7076))));
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7078 =
                      ((Tile)pawns$value7229[(int)t7077]);
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7079 =
                      t7078.
                        x;
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7080 =
                      ((int) t7079) ==
                    ((int) x);
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7080) {
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7081 =
                          i7193;
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7082 =
                          ((long)(((int)(t7081))));
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7083 =
                          ((Tile)pawns$value7229[(int)t7082]);
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7084 =
                          t7083.
                            y;
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7080 = ((int) t7084) ==
                        ((int) y);
                    }
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7085 =
                      t7080;
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7085) {
                        
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                    }
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7086 =
                      i7193;
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7087 =
                      ((t7086) + (((int)(1))));
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i7193 = t7087;
                }
            }
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i7198 =
              0;
            {
                
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] qRail$value7230 =
                  ((Tile[])qRail.value);
                
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7199 =
                      i7198;
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7200 =
                      ((long)(((int)(t7199))));
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7201 =
                      ((x10.core.Rail<Tile>)qRail).
                        size;
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7202 =
                      ((t7200) < (((long)(t7201))));
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t7202)) {
                        
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7088 =
                          i7198;
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7089 =
                          ((long)(((int)(t7088))));
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7090 =
                          ((Tile)qRail$value7230[(int)t7089]);
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7091 =
                          t7090.
                            x;
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7092 =
                          ((int) t7091) ==
                        ((int) x);
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7092) {
                            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7093 =
                              i7198;
                            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7094 =
                              ((long)(((int)(t7093))));
                            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7095 =
                              ((Tile)qRail$value7230[(int)t7094]);
                            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7096 =
                              t7095.
                                y;
                            
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7092 = ((int) t7096) ==
                            ((int) y);
                        }
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7097 =
                          t7092;
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7097) {
                            
//#line 125 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7098 =
                          i7198;
                        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7099 =
                          ((long)(((int)(t7098))));
                        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7100 =
                          ((Tile)qRail$value7230[(int)t7099]);
                        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7101 =
                          t7100.
                            x;
                        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7102 =
                          ((int) t7101) ==
                        ((int) x);
                        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7102) {
                            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7103 =
                              i7198;
                            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7104 =
                              ((long)(((int)(t7103))));
                            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7105 =
                              ((Tile)qRail$value7230[(int)t7104]);
                            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7106 =
                              t7105.
                                y;
                            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7107 =
                              ((y) - (((int)(1))));
                            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7102 = ((int) t7106) ==
                            ((int) t7107);
                        }
                        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7108 =
                          t7102;
                        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7108) {
                            
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7109 =
                          i7198;
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7110 =
                          ((long)(((int)(t7109))));
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7111 =
                          ((Tile)qRail$value7230[(int)t7110]);
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7112 =
                          t7111.
                            x;
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7113 =
                          ((int) t7112) ==
                        ((int) x);
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7113) {
                            
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7114 =
                              i7198;
                            
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7115 =
                              ((long)(((int)(t7114))));
                            
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7116 =
                              ((Tile)qRail$value7230[(int)t7115]);
                            
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7117 =
                              t7116.
                                y;
                            
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7118 =
                              ((y) + (((int)(1))));
                            
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7113 = ((int) t7117) ==
                            ((int) t7118);
                        }
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7119 =
                          t7113;
                        
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7119) {
                            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7120 =
                          i7198;
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7121 =
                          ((long)(((int)(t7120))));
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7122 =
                          ((Tile)qRail$value7230[(int)t7121]);
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7123 =
                          t7122.
                            x;
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7124 =
                          ((x) - (((int)(1))));
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7125 =
                          ((int) t7123) ==
                        ((int) t7124);
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7125) {
                            
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7126 =
                              i7198;
                            
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7127 =
                              ((long)(((int)(t7126))));
                            
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7128 =
                              ((Tile)qRail$value7230[(int)t7127]);
                            
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7129 =
                              t7128.
                                y;
                            
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7125 = ((int) t7129) ==
                            ((int) y);
                        }
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7130 =
                          t7125;
                        
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7130) {
                            
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7131 =
                          i7198;
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7132 =
                          ((long)(((int)(t7131))));
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7133 =
                          ((Tile)qRail$value7230[(int)t7132]);
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7134 =
                          t7133.
                            x;
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7135 =
                          ((x) + (((int)(1))));
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7136 =
                          ((int) t7134) ==
                        ((int) t7135);
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7136) {
                            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7137 =
                              i7198;
                            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7138 =
                              ((long)(((int)(t7137))));
                            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7139 =
                              ((Tile)qRail$value7230[(int)t7138]);
                            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7140 =
                              t7139.
                                y;
                            
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7136 = ((int) t7140) ==
                            ((int) y);
                        }
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7141 =
                          t7136;
                        
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7141) {
                            
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7142 =
                          i7198;
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7143 =
                          ((long)(((int)(t7142))));
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7144 =
                          ((Tile)qRail$value7230[(int)t7143]);
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7145 =
                          t7144.
                            x;
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7146 =
                          ((x) + (((int)(1))));
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7147 =
                          ((int) t7145) ==
                        ((int) t7146);
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7147) {
                            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7148 =
                              i7198;
                            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7149 =
                              ((long)(((int)(t7148))));
                            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7150 =
                              ((Tile)qRail$value7230[(int)t7149]);
                            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7151 =
                              t7150.
                                y;
                            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7152 =
                              ((y) + (((int)(1))));
                            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7147 = ((int) t7151) ==
                            ((int) t7152);
                        }
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7153 =
                          t7147;
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7153) {
                            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7154 =
                          i7198;
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7155 =
                          ((long)(((int)(t7154))));
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7156 =
                          ((Tile)qRail$value7230[(int)t7155]);
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7157 =
                          t7156.
                            x;
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7158 =
                          ((x) - (((int)(1))));
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7159 =
                          ((int) t7157) ==
                        ((int) t7158);
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7159) {
                            
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7160 =
                              i7198;
                            
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7161 =
                              ((long)(((int)(t7160))));
                            
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7162 =
                              ((Tile)qRail$value7230[(int)t7161]);
                            
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7163 =
                              t7162.
                                y;
                            
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7164 =
                              ((y) + (((int)(1))));
                            
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7159 = ((int) t7163) ==
                            ((int) t7164);
                        }
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7165 =
                          t7159;
                        
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7165) {
                            
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7166 =
                          i7198;
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7167 =
                          ((long)(((int)(t7166))));
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7168 =
                          ((Tile)qRail$value7230[(int)t7167]);
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7169 =
                          t7168.
                            x;
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7170 =
                          ((x) + (((int)(1))));
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7171 =
                          ((int) t7169) ==
                        ((int) t7170);
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7171) {
                            
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7172 =
                              i7198;
                            
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7173 =
                              ((long)(((int)(t7172))));
                            
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7174 =
                              ((Tile)qRail$value7230[(int)t7173]);
                            
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7175 =
                              t7174.
                                y;
                            
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7176 =
                              ((y) - (((int)(1))));
                            
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7171 = ((int) t7175) ==
                            ((int) t7176);
                        }
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7177 =
                          t7171;
                        
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7177) {
                            
//#line 147 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7178 =
                          i7198;
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7179 =
                          ((long)(((int)(t7178))));
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7180 =
                          ((Tile)qRail$value7230[(int)t7179]);
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7181 =
                          t7180.
                            x;
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7182 =
                          ((x) - (((int)(1))));
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t7183 =
                          ((int) t7181) ==
                        ((int) t7182);
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7183) {
                            
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7184 =
                              i7198;
                            
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7185 =
                              ((long)(((int)(t7184))));
                            
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7186 =
                              ((Tile)qRail$value7230[(int)t7185]);
                            
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7187 =
                              t7186.
                                y;
                            
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7188 =
                              ((y) - (((int)(1))));
                            
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t7183 = ((int) t7187) ==
                            ((int) t7188);
                        }
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7189 =
                          t7183;
                        
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7189) {
                            
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                    }}catch (final java.lang.NullPointerException id$7190) {
                        
//#line 155 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
                    }
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7191 =
                      i7198;
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7192 =
                      ((t7191) + (((int)(1))));
                    
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i7198 = t7192;
                }
            }
            
//#line 159 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6981 =
              out;
            
//#line 159 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6981;
        }
        
        
//#line 161 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                                queensForBoard(
                                                                                                                final int ofSize){
            
//#line 162 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6984 =
              ((int) ofSize) ==
            ((int) 0);
            
//#line 162 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t6984) {
                
//#line 163 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6982 =
                  ((long)(((int)(0))));
                
//#line 163 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6983 =
                  ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t6982)));
                
//#line 163 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t6983;
            }
            
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6985 =
              ((ofSize) * (((int)(ofSize))));
            
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6986 =
              ((long)(((int)(t6985))));
            
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail queens =
              new x10.core.Rail<Tile>(Tile.$RTT, t6986);
            
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i7217 =
              1;
            {
                
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] queens$value7231 =
                  ((Tile[])queens.value);
                
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7218 =
                      i7217;
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7219 =
                      ((ofSize) * (((int)(ofSize))));
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7220 =
                      ((t7218) <= (((int)(t7219))));
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t7220)) {
                        
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7205 =
                      i7217;
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7206 =
                      ((t7205) - (((int)(1))));
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int x7207 =
                      ((t7206) % (((int)(ofSize))));
                    
//#line 168 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7208 =
                      i7217;
                    
//#line 168 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7209 =
                      ((t7208) - (((int)(1))));
                    
//#line 168 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int y7210 =
                      ((t7209) / (((int)(ofSize))));
                    
//#line 169 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7211 =
                      i7217;
                    
//#line 169 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7212 =
                      ((long)(((int)(t7211))));
                    
//#line 169 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7213 =
                      ((t7212) - (((long)(1L))));
                    
//#line 169 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile alloc7214 =
                      new Tile((java.lang.System[]) null);
                    
//#line 169 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7203 =
                      x7207;
                    
//#line 169 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7204 =
                      y7210;
                    
//#line 169 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
alloc7214.Tile$$init$S(t7203,
                                                                                                                                                 t7204,
                                                                                                                                                 ((int)(2)));
                    
//#line 169 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
queens$value7231[(int)t7213]=alloc7214;
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7215 =
                      i7217;
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7216 =
                      ((t7215) + (((int)(1))));
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i7217 = t7216;
                }
            }
            
//#line 171 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return queens;
        }
        
        
//#line 175 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
                
//#line 176 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public Board board;
                
                
//#line 177 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
                                                                                                                     
//#line 177 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"

                                                                                                                     
//#line 175 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node this7221 =
                                                                                                                       this;
                                                                                                                     
//#line 178 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board alloc6147 =
                                                                                                                       ((Board)(new Board((java.lang.System[]) null)));
                                                                                                                     
//#line 178 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
alloc6147.Board$$init$S(((int)(size)),
                                                                                                                                                                                                                                                   ((x10.core.Rail)(pawns)),
                                                                                                                                                                                                                                                   ((x10.core.Rail)(queens)), (Board.__1$1Tile$2__2$1Tile$2) null);
                                                                                                                     
//#line 178 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.board = ((Board)(alloc6147));
                                                                                                                 }
                                                                                                                 return this;
                                                                                                                 }
                
                
                
//#line 175 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver.Node
                                                                                                                        Solver$Node$$this$Solver$Node(
                                                                                                                        ){
                    
//#line 175 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.Node.this;
                }
                
                
//#line 175 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                                        Solver$Node$$this$Solver(
                                                                                                                        ){
                    
//#line 175 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t7002 =
                      this.
                        out$;
                    
//#line 175 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t7002;
                }
                
                
//#line 175 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
final Solver this6755 =
                                                        this;
                                                      
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this6755.solutions = 0;
                                                      
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this6755.arr = null;
                                                      
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this6755.arr2 = null;
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
            
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.arr2 = null;
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
                $_obj.size = $deserializer.readInt();
                $_obj.queens = $deserializer.readRef();
                $_obj.pawns = $deserializer.readRef();
                $_obj.takenUpTo = $deserializer.readInt();
                $_obj.occupied = $deserializer.readInt();
                $_obj.len = $deserializer.readLong();
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
                $serializer.write(this.size);
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
                $serializer.write(this.takenUpTo);
                $serializer.write(this.occupied);
                $serializer.write(this.len);
                
            }
            
            // constructor just for allocation
            public $Closure$0(final java.lang.System[] $dummy) { 
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                        
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i =
                          0;
                        
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6773 =
                              i;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6792 =
                              ((t6773) < (((int)(this.
                                                   size))));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t6792)) {
                                
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                            }
                            
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail qTemp7005 =
                              this.
                                out$$.cloneArray__0$1Tile$2(((x10.core.Rail)(this.
                                                                               queens)));
                            
//#line 55 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7006 =
                              qTemp7005;
                            
//#line 55 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7007 =
                              i;
                            
//#line 55 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7008 =
                              this.
                                out$$.safe__0$1Tile$2__1$1Tile$2$O(((x10.core.Rail)(this.
                                                                                      pawns)),
                                                                   ((x10.core.Rail)(t7006)),
                                                                   (int)(t7007),
                                                                   (int)(this.
                                                                           takenUpTo));
                            
//#line 55 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7008) {
                                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n7009 =
                                  new Solver.Node((java.lang.System[]) null);
                                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7004 =
                                  qTemp7005;
                                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
n7009.Solver$Node$$init$S(((Solver)(this.
                                                                                                                                                                           out$$)),
                                                                                                                                                               this.
                                                                                                                                                                 pawns,
                                                                                                                                                               t7004,
                                                                                                                                                               this.
                                                                                                                                                                 size, (Solver.Node.__1$1Tile$2__2$1Tile$2) null);
                                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t7010 =
                                  ((Board)(n7009.
                                             board));
                                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7011 =
                                  i;
                                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7012 =
                                  t7010.valid$O((int)(t7011),
                                                (int)(this.
                                                        takenUpTo));
                                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7012) {
                                    
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int oTemp7013 =
                                      ((this.
                                          occupied) + (((int)(1))));
                                    
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7014 =
                                      qTemp7005;
                                    
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7015 =
                                      ((long)(((int)(this.
                                                       occupied))));
                                    
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile alloc7016 =
                                      new Tile((java.lang.System[]) null);
                                    
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7003 =
                                      i;
                                    
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
alloc7016.Tile$$init$S(t7003,
                                                                                                                                                                this.
                                                                                                                                                                  takenUpTo,
                                                                                                                                                                ((int)(2)));
                                    
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t7014.value)[(int)t7015] = alloc7016;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7017 =
                                      ((this.
                                          len) - (((long)(1L))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7018 =
                                      i;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7019 =
                                      ((t7018) + (((int)(1))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7020 =
                                      qTemp7005;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7021 =
                                      oTemp7013;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7022 =
                                      ((this.
                                          takenUpTo) + (((int)(1))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.
                                                                                                                                           out$$.boardCombos__3$1Tile$2__4$1Tile$2((long)(t7017),
                                                                                                                                                                                   (int)(t7019),
                                                                                                                                                                                   (int)(this.
                                                                                                                                                                                           size),
                                                                                                                                                                                   ((x10.core.Rail)(this.
                                                                                                                                                                                                      pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(t7020)),
                                                                                                                                                                                   (int)(t7021),
                                                                                                                                                                                   (int)(t7022));
                                }
                            }
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7023 =
                              i;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7024 =
                              ((t7023) + (((int)(1))));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i = t7024;
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public Solver out$$;
                public int size;
                public x10.core.Rail<Tile> queens;
                public x10.core.Rail<Tile> pawns;
                public int takenUpTo;
                public int occupied;
                public long len;
                
                public $Closure$0(final Solver out$$,
                                  final int size,
                                  final x10.core.Rail<Tile> queens,
                                  final x10.core.Rail<Tile> pawns,
                                  final int takenUpTo,
                                  final int occupied,
                                  final long len, __2$1Tile$2__3$1Tile$2 $dummy) { {
                                                                                          this.out$$ = out$$;
                                                                                          this.size = size;
                                                                                          this.queens = ((x10.core.Rail)(queens));
                                                                                          this.pawns = ((x10.core.Rail)(pawns));
                                                                                          this.takenUpTo = takenUpTo;
                                                                                          this.occupied = occupied;
                                                                                          this.len = len;
                                                                                      }}
                // synthetic type for parameter mangling
                public static final class __2$1Tile$2__3$1Tile$2 {}
                
            }
            
        @x10.runtime.impl.java.X10Generated final public static class $Closure$1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            public static final x10.rtt.RuntimeType<$Closure$1> $RTT = x10.rtt.StaticVoidFunType.<$Closure$1> make(
            $Closure$1.class, new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            public x10.rtt.Type<?> $getParam(int i) {return null;}
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Solver.$Closure$1 $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
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
            
                Solver.$Closure$1 $_obj = new Solver.$Closure$1((java.lang.System[]) null);
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
            public $Closure$1(final java.lang.System[] $dummy) { 
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                        
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i =
                          this.
                            startPos;
                        
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t6794 =
                              i;
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6797 =
                              ((long)(((int)(t6794))));
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t6795 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6796 =
                              ((x10.core.Rail<Tile>)t6795).
                                size;
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t6798 =
                              ((t6796) - (((long)(this.
                                                    len))));
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t6837 =
                              ((t6797) <= (((long)(t6798))));
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t6837)) {
                                
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                            }
                            
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail qTemp7026 =
                              this.
                                out$$.cloneArray__0$1Tile$2(((x10.core.Rail)(this.
                                                                               queens)));
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7027 =
                              qTemp7026;
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7028 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7029 =
                              i;
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7030 =
                              ((long)(((int)(t7029))));
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7031 =
                              ((Tile[])t7028.value)[(int)t7030];
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7032 =
                              t7031.
                                x;
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7033 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7034 =
                              i;
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7035 =
                              ((long)(((int)(t7034))));
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7036 =
                              ((Tile[])t7033.value)[(int)t7035];
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7037 =
                              t7036.
                                y;
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7038 =
                              this.
                                out$$.safe__0$1Tile$2__1$1Tile$2$O(((x10.core.Rail)(this.
                                                                                      pawns)),
                                                                   ((x10.core.Rail)(t7027)),
                                                                   (int)(t7032),
                                                                   (int)(t7037));
                            
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7038) {
                                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7039 =
                                  qTemp7026;
                                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7040 =
                                  ((long)(((int)(this.
                                                   occupied))));
                                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7041 =
                                  ((x10.core.Rail)(this.
                                                     out$$.
                                                     arr));
                                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7042 =
                                  i;
                                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7043 =
                                  ((long)(((int)(t7042))));
                                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7044 =
                                  ((Tile[])t7041.value)[(int)t7043];
                                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t7039.value)[(int)t7040] = t7044;
                                
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n7045 =
                                  new Solver.Node((java.lang.System[]) null);
                                
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7025 =
                                  qTemp7026;
                                
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
n7045.Solver$Node$$init$S(((Solver)(this.
                                                                                                                                                                           out$$)),
                                                                                                                                                               this.
                                                                                                                                                                 pawns,
                                                                                                                                                               t7025,
                                                                                                                                                               this.
                                                                                                                                                                 size, (Solver.Node.__1$1Tile$2__2$1Tile$2) null);
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t7046 =
                                  ((Board)(n7045.
                                             board));
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7047 =
                                  ((x10.core.Rail)(this.
                                                     out$$.
                                                     arr));
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7048 =
                                  i;
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7049 =
                                  ((long)(((int)(t7048))));
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7050 =
                                  ((Tile[])t7047.value)[(int)t7049];
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7051 =
                                  t7050.
                                    x;
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7052 =
                                  ((x10.core.Rail)(this.
                                                     out$$.
                                                     arr));
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7053 =
                                  i;
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7054 =
                                  ((long)(((int)(t7053))));
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t7055 =
                                  ((Tile[])t7052.value)[(int)t7054];
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7056 =
                                  t7055.
                                    y;
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t7057 =
                                  t7046.valid$O((int)(t7051),
                                                (int)(t7056));
                                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t7057) {
                                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int oTemp7058 =
                                      ((this.
                                          occupied) + (((int)(1))));
                                    
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t7059 =
                                      ((this.
                                          len) - (((long)(1L))));
                                    
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7060 =
                                      i;
                                    
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7061 =
                                      ((t7060) + (((int)(1))));
                                    
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t7062 =
                                      qTemp7026;
                                    
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7063 =
                                      oTemp7058;
                                    
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.
                                                                                                                                           out$$.boardCombos__3$1Tile$2__4$1Tile$2((long)(t7059),
                                                                                                                                                                                   (int)(t7061),
                                                                                                                                                                                   (int)(this.
                                                                                                                                                                                           size),
                                                                                                                                                                                   ((x10.core.Rail)(this.
                                                                                                                                                                                                      pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(t7062)),
                                                                                                                                                                                   (int)(t7063),
                                                                                                                                                                                   (int)(0));
                                }
                            }
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7064 =
                              i;
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t7065 =
                              ((t7064) + (((int)(1))));
                            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i = t7065;
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
                
                public $Closure$1(final Solver out$$,
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
        
        