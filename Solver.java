
@x10.runtime.impl.java.X10Generated public class Solver extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Solver> $RTT = x10.rtt.NamedType.<Solver> make(
    "Solver", Solver.class
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Solver $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Solver.class + " calling"); } 
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
final x10.core.Rail t4540 =
              this.queensForBoard((int)(size));
            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.arr = ((x10.core.Rail)(t4540));
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
final long t4542 =
                          ((long)(((int)(size))));
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4543 =
                          ((x10.core.Rail<Tile>)
                            ((x10.util.ArrayList<Tile>)pawns).toRail());
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4541 =
                          ((long)(((int)(size))));
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4544 =
                          ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t4541)));
                        
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.boardCombos__3$1Tile$2__4$1Tile$2((long)(t4542),
                                                                                                                                                                    (int)(0),
                                                                                                                                                                    (int)(size),
                                                                                                                                                                    ((x10.core.Rail)(t4543)),
                                                                                                                                                                    ((x10.core.Rail)(t4544)),
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
final int t4545 =
              solutions;
            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4546 =
              ((long)(((int)(t4545))));
            
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4546;
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
final boolean t4547 =
              ((int) size) ==
            ((int) 0);
            
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4547) {
                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4550 =
              ((long) len) ==
            ((long) 0L);
            
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4550) {
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                    
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.lang.Runtime.enterAtomic();
                    {
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver x4538 =
                          ((Solver)(this));
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
;
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4548 =
                          x4538.
                            solutions;
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4549 =
                          ((t4548) + (((int)(1))));
                        
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x4538.solutions = t4549;
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
final long t4586 =
              ((x10.core.Rail<Tile>)x).
                size;
            
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail out =
              new x10.core.Rail<Tile>(Tile.$RTT, ((long)(t4586)));
            
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
long i4791 =
              0L;
            {
                
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] x$value4944 =
                  ((Tile[])x.value);
                
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4792 =
                      i4791;
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4793 =
                      ((x10.core.Rail<Tile>)x).
                        size;
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4794 =
                      ((t4792) < (((long)(t4793))));
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4794)) {
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4785 =
                      out;
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4786 =
                      i4791;
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4787 =
                      i4791;
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4788 =
                      ((Tile)x$value4944[(int)t4787]);
                    
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t4785.value)[(int)t4786] = t4788;
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4789 =
                      i4791;
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4790 =
                      ((t4789) + (((long)(1L))));
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4791 = t4790;
                }
            }
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4597 =
              out;
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4597;
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
final long t4598 =
              ((x10.core.Rail<Tile>)pawns).
                size;
            
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4599 =
              ((long) t4598) ==
            ((long) 0L);
            
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4599) {
                
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
            }
            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4600 =
              ((x10.core.Rail<Tile>)qRail).
                size;
            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4601 =
              ((long) t4600) ==
            ((long) 0L);
            
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4601) {
                
//#line 89 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
            }
            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4912 =
              0;
            {
                
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] pawns$value4945 =
                  ((Tile[])pawns.value);
                
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4913 =
                      i4912;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4914 =
                      ((long)(((int)(t4913))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4915 =
                      ((x10.core.Rail<Tile>)pawns).
                        size;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4916 =
                      ((t4914) < (((long)(t4915))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4916)) {
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4795 =
                      i4912;
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4796 =
                      ((long)(((int)(t4795))));
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4797 =
                      ((Tile)pawns$value4945[(int)t4796]);
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4798 =
                      t4797.
                        x;
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4799 =
                      ((int) t4798) ==
                    ((int) x);
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4799) {
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4800 =
                          i4912;
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4801 =
                          ((long)(((int)(t4800))));
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4802 =
                          ((Tile)pawns$value4945[(int)t4801]);
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4803 =
                          t4802.
                            y;
                        
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4799 = ((int) t4803) ==
                        ((int) y);
                    }
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4804 =
                      t4799;
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4804) {
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                    }
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4805 =
                      i4912;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4806 =
                      ((t4805) + (((int)(1))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4912 = t4806;
                }
            }
            
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4917 =
              0;
            {
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] qRail$value4946 =
                  ((Tile[])qRail.value);
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4918 =
                      i4917;
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4919 =
                      ((long)(((int)(t4918))));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4920 =
                      ((x10.core.Rail<Tile>)qRail).
                        size;
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4921 =
                      ((t4919) < (((long)(t4920))));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4921)) {
                        
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4807 =
                          i4917;
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4808 =
                          ((long)(((int)(t4807))));
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4809 =
                          ((Tile)qRail$value4946[(int)t4808]);
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4810 =
                          t4809.
                            x;
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4811 =
                          ((int) t4810) ==
                        ((int) x);
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4811) {
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4812 =
                              i4917;
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4813 =
                              ((long)(((int)(t4812))));
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4814 =
                              ((Tile)qRail$value4946[(int)t4813]);
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4815 =
                              t4814.
                                y;
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4811 = ((int) t4815) ==
                            ((int) y);
                        }
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4816 =
                          t4811;
                        
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4816) {
                            
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4817 =
                          i4917;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4818 =
                          ((long)(((int)(t4817))));
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4819 =
                          ((Tile)qRail$value4946[(int)t4818]);
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4820 =
                          t4819.
                            x;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4821 =
                          ((int) t4820) ==
                        ((int) x);
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4821) {
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4822 =
                              i4917;
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4823 =
                              ((long)(((int)(t4822))));
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4824 =
                              ((Tile)qRail$value4946[(int)t4823]);
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4825 =
                              t4824.
                                y;
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4826 =
                              ((y) - (((int)(1))));
                            
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4821 = ((int) t4825) ==
                            ((int) t4826);
                        }
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4827 =
                          t4821;
                        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4827) {
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4828 =
                          i4917;
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4829 =
                          ((long)(((int)(t4828))));
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4830 =
                          ((Tile)qRail$value4946[(int)t4829]);
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4831 =
                          t4830.
                            x;
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4832 =
                          ((int) t4831) ==
                        ((int) x);
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4832) {
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4833 =
                              i4917;
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4834 =
                              ((long)(((int)(t4833))));
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4835 =
                              ((Tile)qRail$value4946[(int)t4834]);
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4836 =
                              t4835.
                                y;
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4837 =
                              ((y) + (((int)(1))));
                            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4832 = ((int) t4836) ==
                            ((int) t4837);
                        }
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4838 =
                          t4832;
                        
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4838) {
                            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4839 =
                          i4917;
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4840 =
                          ((long)(((int)(t4839))));
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4841 =
                          ((Tile)qRail$value4946[(int)t4840]);
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4842 =
                          t4841.
                            x;
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4843 =
                          ((x) - (((int)(1))));
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4844 =
                          ((int) t4842) ==
                        ((int) t4843);
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4844) {
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4845 =
                              i4917;
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4846 =
                              ((long)(((int)(t4845))));
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4847 =
                              ((Tile)qRail$value4946[(int)t4846]);
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4848 =
                              t4847.
                                y;
                            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4844 = ((int) t4848) ==
                            ((int) y);
                        }
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4849 =
                          t4844;
                        
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4849) {
                            
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4850 =
                          i4917;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4851 =
                          ((long)(((int)(t4850))));
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4852 =
                          ((Tile)qRail$value4946[(int)t4851]);
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4853 =
                          t4852.
                            x;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4854 =
                          ((x) + (((int)(1))));
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4855 =
                          ((int) t4853) ==
                        ((int) t4854);
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4855) {
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4856 =
                              i4917;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4857 =
                              ((long)(((int)(t4856))));
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4858 =
                              ((Tile)qRail$value4946[(int)t4857]);
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4859 =
                              t4858.
                                y;
                            
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4855 = ((int) t4859) ==
                            ((int) y);
                        }
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4860 =
                          t4855;
                        
//#line 111 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4860) {
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4861 =
                          i4917;
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4862 =
                          ((long)(((int)(t4861))));
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4863 =
                          ((Tile)qRail$value4946[(int)t4862]);
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4864 =
                          t4863.
                            x;
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4865 =
                          ((x) + (((int)(1))));
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4866 =
                          ((int) t4864) ==
                        ((int) t4865);
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4866) {
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4867 =
                              i4917;
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4868 =
                              ((long)(((int)(t4867))));
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4869 =
                              ((Tile)qRail$value4946[(int)t4868]);
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4870 =
                              t4869.
                                y;
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4871 =
                              ((y) + (((int)(1))));
                            
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4866 = ((int) t4870) ==
                            ((int) t4871);
                        }
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4872 =
                          t4866;
                        
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4872) {
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4873 =
                          i4917;
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4874 =
                          ((long)(((int)(t4873))));
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4875 =
                          ((Tile)qRail$value4946[(int)t4874]);
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4876 =
                          t4875.
                            x;
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4877 =
                          ((x) - (((int)(1))));
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4878 =
                          ((int) t4876) ==
                        ((int) t4877);
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4878) {
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4879 =
                              i4917;
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4880 =
                              ((long)(((int)(t4879))));
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4881 =
                              ((Tile)qRail$value4946[(int)t4880]);
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4882 =
                              t4881.
                                y;
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4883 =
                              ((y) + (((int)(1))));
                            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4878 = ((int) t4882) ==
                            ((int) t4883);
                        }
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4884 =
                          t4878;
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4884) {
                            
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4885 =
                          i4917;
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4886 =
                          ((long)(((int)(t4885))));
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4887 =
                          ((Tile)qRail$value4946[(int)t4886]);
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4888 =
                          t4887.
                            x;
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4889 =
                          ((x) + (((int)(1))));
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4890 =
                          ((int) t4888) ==
                        ((int) t4889);
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4890) {
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4891 =
                              i4917;
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4892 =
                              ((long)(((int)(t4891))));
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4893 =
                              ((Tile)qRail$value4946[(int)t4892]);
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4894 =
                              t4893.
                                y;
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4895 =
                              ((y) - (((int)(1))));
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4890 = ((int) t4894) ==
                            ((int) t4895);
                        }
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4896 =
                          t4890;
                        
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4896) {
                            
//#line 121 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4897 =
                          i4917;
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4898 =
                          ((long)(((int)(t4897))));
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4899 =
                          ((Tile)qRail$value4946[(int)t4898]);
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4900 =
                          t4899.
                            x;
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4901 =
                          ((x) - (((int)(1))));
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4902 =
                          ((int) t4900) ==
                        ((int) t4901);
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4902) {
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4903 =
                              i4917;
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4904 =
                              ((long)(((int)(t4903))));
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4905 =
                              ((Tile)qRail$value4946[(int)t4904]);
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4906 =
                              t4905.
                                y;
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4907 =
                              ((y) - (((int)(1))));
                            
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4902 = ((int) t4906) ==
                            ((int) t4907);
                        }
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4908 =
                          t4902;
                        
//#line 123 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4908) {
                            
//#line 125 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                    }}catch (final java.lang.NullPointerException id$4909) {
                        
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
                    }
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4910 =
                      i4917;
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4911 =
                      ((t4910) + (((int)(1))));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4917 = t4911;
                }
            }
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4728 =
              out;
            
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4728;
        }
        
        
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                                queensForBoard(
                                                                                                                final int ofSize){
            
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4731 =
              ((int) ofSize) ==
            ((int) 0);
            
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4731) {
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4729 =
                  ((long)(((int)(0))));
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4730 =
                  ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t4729)));
                
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4730;
            }
            
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4732 =
              ((ofSize) * (((int)(ofSize))));
            
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4733 =
              ((long)(((int)(t4732))));
            
//#line 139 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail queens =
              new x10.core.Rail<Tile>(Tile.$RTT, t4733);
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4936 =
              1;
            {
                
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] queens$value4947 =
                  ((Tile[])queens.value);
                
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4937 =
                      i4936;
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4938 =
                      ((ofSize) * (((int)(ofSize))));
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4939 =
                      ((t4937) <= (((int)(t4938))));
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4939)) {
                        
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4922 =
                      i4936;
                    
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4923 =
                      ((t4922) - (((int)(1))));
                    
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int x4924 =
                      ((t4923) % (((int)(ofSize))));
                    
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4925 =
                      i4936;
                    
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4926 =
                      ((t4925) - (((int)(1))));
                    
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int y4927 =
                      ((t4926) / (((int)(ofSize))));
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4928 =
                      i4936;
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4929 =
                      ((long)(((int)(t4928))));
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4930 =
                      ((t4929) - (((long)(1L))));
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4931 =
                      x4924;
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4932 =
                      y4927;
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4933 =
                      new Tile((java.lang.System[]) null).Tile$$init$S(t4931,
                                                                       t4932,
                                                                       ((int)(2)));
                    
//#line 143 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
queens$value4947[(int)t4930]=t4933;
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4934 =
                      i4936;
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4935 =
                      ((t4934) + (((int)(1))));
                    
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4936 = t4935;
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
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Solver.Node $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Node.class + " calling"); } 
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
;
                                                                                                                     
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"

                                                                                                                     
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.__fieldInitializers_Solver_Node();
                                                                                                                     
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4750 =
                                                                                                                       ((Board)(new Board((java.lang.System[]) null).Board$$init$S(((int)(size)),
                                                                                                                                                                                   ((x10.core.Rail)(pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(queens)), (Board.__1$1Tile$2__2$1Tile$2) null)));
                                                                                                                     
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.board = ((Board)(t4750));
                                                                                                                 }
                                                                                                                 return this;
                                                                                                                 }
                
                
                
//#line 155 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public boolean
                                                                                                                        check$O(
                                                                                                                        ){
                    
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4751 =
                      ((Board)(board));
                    
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4752 =
                      t4751.valid$O();
                    
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4752;
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
final Solver t4753 =
                      this.
                        out$;
                    
//#line 149 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4753;
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
;
                                                      
//#line 15 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"

                                                      
//#line 14 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.__fieldInitializers_Solver();
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
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Solver.$Closure$0 $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$0.class + " calling"); } 
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
final int t4552 =
                              i;
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4555 =
                              ((long)(((int)(t4552))));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4553 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4554 =
                              ((x10.core.Rail<Tile>)t4553).
                                size;
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4556 =
                              ((t4554) - (((long)(this.
                                                    len))));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4585 =
                              ((t4555) <= (((long)(t4556))));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4585)) {
                                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                            }
                            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail qTemp4754 =
                              this.
                                out$$.cloneArray__0$1Tile$2(((x10.core.Rail)(this.
                                                                               queens)));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4755 =
                              qTemp4754;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4756 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4757 =
                              i;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4758 =
                              ((long)(((int)(t4757))));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4759 =
                              ((Tile[])t4756.value)[(int)t4758];
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4760 =
                              t4759.
                                x;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4761 =
                              ((x10.core.Rail)(this.
                                                 out$$.
                                                 arr));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4762 =
                              i;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4763 =
                              ((long)(((int)(t4762))));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4764 =
                              ((Tile[])t4761.value)[(int)t4763];
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4765 =
                              t4764.
                                y;
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4766 =
                              this.
                                out$$.safe__0$1Tile$2__1$1Tile$2$O(((x10.core.Rail)(this.
                                                                                      pawns)),
                                                                   ((x10.core.Rail)(t4755)),
                                                                   (int)(t4760),
                                                                   (int)(t4765));
                            
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4766) {
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4767 =
                                  qTemp4754;
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4768 =
                                  ((long)(((int)(this.
                                                   occupied))));
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4769 =
                                  ((x10.core.Rail)(this.
                                                     out$$.
                                                     arr));
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4770 =
                                  i;
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4771 =
                                  ((long)(((int)(t4770))));
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4772 =
                                  ((Tile[])t4769.value)[(int)t4771];
                                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t4767.value)[(int)t4768] = t4772;
                                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4773 =
                                  qTemp4754;
                                
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n4774 =
                                  new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(((Solver)(this.
                                                                                                             out$$)),
                                                                                                 this.
                                                                                                   pawns,
                                                                                                 t4773,
                                                                                                 this.
                                                                                                   size, (Solver.Node.__1$1Tile$2__2$1Tile$2) null);
                                
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4775 =
                                  ((Board)(n4774.
                                             board));
                                
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4776 =
                                  t4775.valid$O();
                                
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4776) {
                                    
//#line 63 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int oTemp4777 =
                                      ((this.
                                          occupied) + (((int)(1))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4778 =
                                      ((this.
                                          len) - (((long)(1L))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4779 =
                                      i;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4780 =
                                      ((t4779) + (((int)(1))));
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4781 =
                                      qTemp4754;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4782 =
                                      oTemp4777;
                                    
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.
                                                                                                                                           out$$.boardCombos__3$1Tile$2__4$1Tile$2((long)(t4778),
                                                                                                                                                                                   (int)(t4780),
                                                                                                                                                                                   (int)(this.
                                                                                                                                                                                           size),
                                                                                                                                                                                   ((x10.core.Rail)(this.
                                                                                                                                                                                                      pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(t4781)),
                                                                                                                                                                                   (int)(t4782));
                                }
                            }
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4783 =
                              i;
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4784 =
                              ((t4783) + (((int)(1))));
                            
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i = t4784;
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
        
        