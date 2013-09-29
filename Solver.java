
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
final x10.core.Rail t3745 =
              this.queensForBoard((int)(size));
            
//#line 30 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.arr = ((x10.core.Rail)(t3745));
            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i3953 =
              0;
            
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3954 =
                  i3953;
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3955 =
                  ((long)(((int)(t3954))));
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t3956 =
                  ((x10.core.Rail)(arr));
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3957 =
                  ((x10.core.Rail<Tile>)t3956).
                    size;
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3958 =
                  ((t3955) < (((long)(t3957))));
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t3958)) {
                    
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3951 =
                  i3953;
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3952 =
                  ((t3951) + (((int)(1))));
                
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i3953 = t3952;
            }
            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3754 =
              ((long)(((int)(size))));
            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t3755 =
              ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
            
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.boardCombos__3$1Tile$2__4$1Tile$2((long)(t3754),
                                                                                                                                                        (int)(0),
                                                                                                                                                        (int)(size),
                                                                                                                                                        ((x10.util.ArrayList)(pawns)),
                                                                                                                                                        ((x10.util.ArrayList)(t3755)),
                                                                                                                                                        (int)(0));
            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3756 =
              solutions;
            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3757 =
              ((long)(((int)(t3756))));
            
//#line 37 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t3757;
        }
        
        
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public void
                                                                                                               boardCombos__3$1Tile$2__4$1Tile$2(
                                                                                                               final long len,
                                                                                                               final int startPos,
                                                                                                               final int size,
                                                                                                               final x10.util.ArrayList pawns,
                                                                                                               final x10.util.ArrayList queens,
                                                                                                               final int occupied){
            
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3758 =
              ((int) size) ==
            ((int) 0);
            
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t3758) {
                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3761 =
              ((long) len) ==
            ((long) 0L);
            
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t3761) {
                
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver x3743 =
                  ((Solver)(this));
                
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
;
                
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3759 =
                  x3743.
                    solutions;
                
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3760 =
                  ((t3759) + (((int)(1))));
                
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x3743.solutions = t3760;
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i3992 =
              startPos;
            
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3993 =
                  i3992;
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3994 =
                  ((long)(((int)(t3993))));
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t3995 =
                  ((x10.core.Rail)(arr));
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3996 =
                  ((x10.core.Rail<Tile>)t3995).
                    size;
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3997 =
                  ((t3996) - (((long)(len))));
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3998 =
                  ((t3994) <= (((long)(t3997))));
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t3998)) {
                    
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.util.ArrayList qTemp3959 =
                  ((x10.util.ArrayList<Tile>)
                    ((x10.util.ArrayList<Tile>)queens).clone());
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t3960 =
                  qTemp3959;
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t3961 =
                  ((x10.core.Rail)(arr));
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3962 =
                  i3992;
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3963 =
                  ((long)(((int)(t3962))));
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t3964 =
                  ((Tile[])t3961.value)[(int)t3963];
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3965 =
                  t3964.
                    x;
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t3966 =
                  ((x10.core.Rail)(arr));
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3967 =
                  i3992;
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3968 =
                  ((long)(((int)(t3967))));
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t3969 =
                  ((Tile[])t3966.value)[(int)t3968];
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3970 =
                  t3969.
                    y;
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3971 =
                  this.safe__0$1Tile$2__1$1Tile$2$O(((x10.util.ArrayList)(pawns)),
                                                    ((x10.util.ArrayList)(t3960)),
                                                    (int)(t3965),
                                                    (int)(t3970));
                
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t3971) {
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t3972 =
                      qTemp3959;
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3973 =
                      ((long)(((int)(occupied))));
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t3974 =
                      ((x10.core.Rail)(arr));
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3975 =
                      i3992;
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3976 =
                      ((long)(((int)(t3975))));
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t3977 =
                      ((Tile[])t3974.value)[(int)t3976];
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Tile>)t3972).$set__1x10$util$ArrayList$$T$G((long)(t3973),
                                                                                                                                                                                          ((Tile)(t3977)));
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t3978 =
                      ((x10.core.Rail<Tile>)
                        ((x10.util.ArrayList<Tile>)pawns).toRail());
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t3979 =
                      qTemp3959;
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t3980 =
                      ((x10.core.Rail<Tile>)
                        ((x10.util.ArrayList<Tile>)t3979).toRail());
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n3981 =
                      new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(this,
                                                                                     t3978,
                                                                                     t3980,
                                                                                     ((int)(size)), (Solver.Node.__1$1Tile$2__2$1Tile$2) null);
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t3982 =
                      ((Board)(n3981.
                                 board));
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3983 =
                      t3982.valid$O();
                    
//#line 58 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t3983) {
                        
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int oTemp3984 =
                          ((occupied) + (((int)(1))));
                        
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3985 =
                          ((len) - (((long)(1L))));
                        
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3986 =
                          i3992;
                        
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3987 =
                          ((t3986) + (((int)(1))));
                        
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t3988 =
                          qTemp3959;
                        
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3989 =
                          oTemp3984;
                        
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.boardCombos__3$1Tile$2__4$1Tile$2((long)(t3985),
                                                                                                                                                                    (int)(t3987),
                                                                                                                                                                    (int)(size),
                                                                                                                                                                    ((x10.util.ArrayList)(pawns)),
                                                                                                                                                                    ((x10.util.ArrayList)(t3988)),
                                                                                                                                                                    (int)(t3989));
                    }
                }
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3990 =
                  i3992;
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3991 =
                  ((t3990) + (((int)(1))));
                
//#line 48 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i3992 = t3991;
            }
        }
        
        
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public boolean
                                                                                                               safe__0$1Tile$2__1$1Tile$2$O(
                                                                                                               final x10.util.ArrayList pawns,
                                                                                                               final x10.util.ArrayList qRail,
                                                                                                               final int x,
                                                                                                               final int y){
            
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean out =
              true;
            
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4115 =
              0;
            
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4116 =
                  i4115;
                
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4117 =
                  ((long)(((int)(t4116))));
                
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4118 =
                  ((x10.util.ArrayList<Tile>)pawns).size$O();
                
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4119 =
                  ((t4117) < (((long)(t4118))));
                
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4119)) {
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3999 =
                  i4115;
                
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4000 =
                  ((long)(((int)(t3999))));
                
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4001 =
                  ((x10.util.ArrayList<Tile>)pawns).$apply$G((long)(t4000));
                
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4002 =
                  t4001.
                    x;
                
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4003 =
                  ((int) t4002) ==
                ((int) x);
                
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4003) {
                    
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4004 =
                      i4115;
                    
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4005 =
                      ((long)(((int)(t4004))));
                    
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4006 =
                      ((x10.util.ArrayList<Tile>)pawns).$apply$G((long)(t4005));
                    
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4007 =
                      t4006.
                        y;
                    
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4003 = ((int) t4007) ==
                    ((int) y);
                }
                
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4008 =
                  t4003;
                
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4008) {
                    
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4009 =
                  i4115;
                
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4010 =
                  ((t4009) + (((int)(1))));
                
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4115 = t4010;
            }
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4120 =
              0;
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4121 =
                  i4120;
                
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4122 =
                  ((long)(((int)(t4121))));
                
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4123 =
                  ((x10.util.ArrayList<Tile>)qRail).size$O();
                
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4124 =
                  ((t4122) < (((long)(t4123))));
                
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4124)) {
                    
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4011 =
                  i4120;
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4012 =
                  ((long)(((int)(t4011))));
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4013 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4012));
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4014 =
                  t4013.
                    x;
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4015 =
                  ((int) t4014) ==
                ((int) x);
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4015) {
                    
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4016 =
                      i4120;
                    
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4017 =
                      ((long)(((int)(t4016))));
                    
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4018 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4017));
                    
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4019 =
                      t4018.
                        y;
                    
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4015 = ((int) t4019) ==
                    ((int) y);
                }
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4020 =
                  t4015;
                
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4020) {
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4021 =
                  i4120;
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4022 =
                  ((long)(((int)(t4021))));
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4023 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4022));
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4024 =
                  t4023.
                    x;
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4025 =
                  ((int) t4024) ==
                ((int) x);
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4025) {
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4026 =
                      i4120;
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4027 =
                      ((long)(((int)(t4026))));
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4028 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4027));
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4029 =
                      t4028.
                        y;
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4030 =
                      ((y) - (((int)(1))));
                    
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4025 = ((int) t4029) ==
                    ((int) t4030);
                }
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4031 =
                  t4025;
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4031) {
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4032 =
                  i4120;
                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4033 =
                  ((long)(((int)(t4032))));
                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4034 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4033));
                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4035 =
                  t4034.
                    x;
                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4036 =
                  ((int) t4035) ==
                ((int) x);
                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4036) {
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4037 =
                      i4120;
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4038 =
                      ((long)(((int)(t4037))));
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4039 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4038));
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4040 =
                      t4039.
                        y;
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4041 =
                      ((y) + (((int)(1))));
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4036 = ((int) t4040) ==
                    ((int) t4041);
                }
                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4042 =
                  t4036;
                
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4042) {
                    
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4043 =
                  i4120;
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4044 =
                  ((long)(((int)(t4043))));
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4045 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4044));
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4046 =
                  t4045.
                    x;
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4047 =
                  ((x) - (((int)(1))));
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4048 =
                  ((int) t4046) ==
                ((int) t4047);
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4048) {
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4049 =
                      i4120;
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4050 =
                      ((long)(((int)(t4049))));
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4051 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4050));
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4052 =
                      t4051.
                        y;
                    
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4048 = ((int) t4052) ==
                    ((int) y);
                }
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4053 =
                  t4048;
                
//#line 90 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4053) {
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4054 =
                  i4120;
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4055 =
                  ((long)(((int)(t4054))));
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4056 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4055));
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4057 =
                  t4056.
                    x;
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4058 =
                  ((x) + (((int)(1))));
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4059 =
                  ((int) t4057) ==
                ((int) t4058);
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4059) {
                    
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4060 =
                      i4120;
                    
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4061 =
                      ((long)(((int)(t4060))));
                    
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4062 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4061));
                    
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4063 =
                      t4062.
                        y;
                    
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4059 = ((int) t4063) ==
                    ((int) y);
                }
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4064 =
                  t4059;
                
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4064) {
                    
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4065 =
                  i4120;
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4066 =
                  ((long)(((int)(t4065))));
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4067 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4066));
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4068 =
                  t4067.
                    x;
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4069 =
                  ((x) + (((int)(1))));
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4070 =
                  ((int) t4068) ==
                ((int) t4069);
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4070) {
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4071 =
                      i4120;
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4072 =
                      ((long)(((int)(t4071))));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4073 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4072));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4074 =
                      t4073.
                        y;
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4075 =
                      ((y) + (((int)(1))));
                    
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4070 = ((int) t4074) ==
                    ((int) t4075);
                }
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4076 =
                  t4070;
                
//#line 96 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4076) {
                    
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4077 =
                  i4120;
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4078 =
                  ((long)(((int)(t4077))));
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4079 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4078));
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4080 =
                  t4079.
                    x;
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4081 =
                  ((x) - (((int)(1))));
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4082 =
                  ((int) t4080) ==
                ((int) t4081);
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4082) {
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4083 =
                      i4120;
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4084 =
                      ((long)(((int)(t4083))));
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4085 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4084));
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4086 =
                      t4085.
                        y;
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4087 =
                      ((y) + (((int)(1))));
                    
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4082 = ((int) t4086) ==
                    ((int) t4087);
                }
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4088 =
                  t4082;
                
//#line 99 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4088) {
                    
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4089 =
                  i4120;
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4090 =
                  ((long)(((int)(t4089))));
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4091 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4090));
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4092 =
                  t4091.
                    x;
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4093 =
                  ((x) + (((int)(1))));
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4094 =
                  ((int) t4092) ==
                ((int) t4093);
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4094) {
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4095 =
                      i4120;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4096 =
                      ((long)(((int)(t4095))));
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4097 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4096));
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4098 =
                      t4097.
                        y;
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4099 =
                      ((y) - (((int)(1))));
                    
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4094 = ((int) t4098) ==
                    ((int) t4099);
                }
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4100 =
                  t4094;
                
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4100) {
                    
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4101 =
                  i4120;
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4102 =
                  ((long)(((int)(t4101))));
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4103 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4102));
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4104 =
                  t4103.
                    x;
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4105 =
                  ((x) - (((int)(1))));
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4106 =
                  ((int) t4104) ==
                ((int) t4105);
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4106) {
                    
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4107 =
                      i4120;
                    
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4108 =
                      ((long)(((int)(t4107))));
                    
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4109 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4108));
                    
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4110 =
                      t4109.
                        y;
                    
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4111 =
                      ((y) - (((int)(1))));
                    
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4106 = ((int) t4110) ==
                    ((int) t4111);
                }
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4112 =
                  t4106;
                
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4112) {
                    
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4113 =
                  i4120;
                
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4114 =
                  ((t4113) + (((int)(1))));
                
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4120 = t4114;
            }
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3925 =
              out;
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t3925;
        }
        
        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                                queensForBoard(
                                                                                                                final int ofSize){
            
//#line 113 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3928 =
              ((int) ofSize) ==
            ((int) 0);
            
//#line 113 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t3928) {
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3926 =
                  ((long)(((int)(0))));
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t3927 =
                  ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t3926)));
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t3927;
            }
            
//#line 116 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t3929 =
              ((ofSize) * (((int)(ofSize))));
            
//#line 116 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t3930 =
              ((long)(((int)(t3929))));
            
//#line 116 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail queens =
              new x10.core.Rail<Tile>(Tile.$RTT, t3930);
            
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4139 =
              1;
            {
                
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] queens$value4143 =
                  ((Tile[])queens.value);
                
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4140 =
                      i4139;
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4141 =
                      ((ofSize) * (((int)(ofSize))));
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4142 =
                      ((t4140) <= (((int)(t4141))));
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4142)) {
                        
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4125 =
                      i4139;
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4126 =
                      ((t4125) - (((int)(1))));
                    
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int x4127 =
                      ((t4126) % (((int)(ofSize))));
                    
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4128 =
                      i4139;
                    
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4129 =
                      ((t4128) - (((int)(1))));
                    
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int y4130 =
                      ((t4129) / (((int)(ofSize))));
                    
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4131 =
                      i4139;
                    
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4132 =
                      ((long)(((int)(t4131))));
                    
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4133 =
                      ((t4132) - (((long)(1L))));
                    
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4134 =
                      x4127;
                    
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4135 =
                      y4130;
                    
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4136 =
                      new Tile((java.lang.System[]) null).Tile$$init$S(t4134,
                                                                       t4135,
                                                                       ((int)(2)));
                    
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
queens$value4143[(int)t4133]=t4136;
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4137 =
                      i4139;
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4138 =
                      ((t4137) + (((int)(1))));
                    
//#line 117 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4139 = t4138;
                }
            }
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return queens;
        }
        
        
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
                
//#line 127 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public Board board;
                
                
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
                                                                                                                     
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
;
                                                                                                                     
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"

                                                                                                                     
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.__fieldInitializers_Solver_Node();
                                                                                                                     
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t3947 =
                                                                                                                       ((Board)(new Board((java.lang.System[]) null).Board$$init$S(((int)(size)),
                                                                                                                                                                                   ((x10.core.Rail)(pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(queens)), (Board.__1$1Tile$2__2$1Tile$2) null)));
                                                                                                                     
//#line 129 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.board = ((Board)(t3947));
                                                                                                                 }
                                                                                                                 return this;
                                                                                                                 }
                
                
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public boolean
                                                                                                                        check$O(
                                                                                                                        ){
                    
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t3948 =
                      ((Board)(board));
                    
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t3949 =
                      t3948.valid$O();
                    
//#line 133 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t3949;
                }
                
                
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver.Node
                                                                                                                        Solver$Node$$this$Solver$Node(
                                                                                                                        ){
                    
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.Node.this;
                }
                
                
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                                        Solver$Node$$this$Solver(
                                                                                                                        ){
                    
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t3950 =
                      this.
                        out$;
                    
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t3950;
                }
                
                
//#line 126 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
    
}

