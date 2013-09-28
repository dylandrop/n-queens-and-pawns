
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
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        Solver $_obj = new Solver((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public Solver(final java.lang.System[] $dummy) { 
    }
    
        
        
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public long
                                                                                                   solve__1$1Tile$2$O(
                                                                                                   final int size,
                                                                                                   final x10.util.ArrayList pawns){
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail ps =
              new x10.core.Rail<Tile>(Tile.$RTT);
            
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4605 =
              ((long)(((int)(4))));
            
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail qs =
              new x10.core.Rail<Tile>(Tile.$RTT, t4605);
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4606 =
              ((long)(((int)(0))));
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4607 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(0)),
                                                               ((int)(1)),
                                                               ((int)(2)));
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4606] = t4607;
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4608 =
              ((long)(((int)(1))));
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4609 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(1)),
                                                               ((int)(3)),
                                                               ((int)(2)));
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4608] = t4609;
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4610 =
              ((long)(((int)(2))));
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4611 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(2)),
                                                               ((int)(0)),
                                                               ((int)(2)));
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4610] = t4611;
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4612 =
              ((long)(((int)(3))));
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4613 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(3)),
                                                               ((int)(2)),
                                                               ((int)(2)));
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4612] = t4613;
            
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board board =
              new Board((java.lang.System[]) null).Board$$init$S(((int)(4)),
                                                                 ((x10.core.Rail)(ps)),
                                                                 ((x10.core.Rail)(qs)), (Board.__1$1Tile$2__2$1Tile$2) null);
            
//#line 35 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
board.print();
            
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.io.Printer t4614 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4615 =
              board.valid$O();
            
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4614.println(x10.core.Boolean.$box(t4615));
            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4616 =
              ((long)(((int)(42))));
            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4616;
        }
        
        
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public x10.util.ArrayList
                                                                                                   generateBoards__1$1Tile$2(
                                                                                                   final int size,
                                                                                                   final x10.util.ArrayList pawns){
            
//#line 40 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t =
              ((x10.util.ArrayList)(new x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.util.ArrayList.$RTT, Solver.Node.$RTT)).x10$util$ArrayList$$init$S()));
            
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int x4861 =
              0;
            
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4862 =
                  x4861;
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4863 =
                  ((t4862) < (((int)(size))));
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4863)) {
                    
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int y4841 =
                  0;
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4842 =
                      y4841;
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4843 =
                      ((t4842) < (((int)(size))));
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4843)) {
                        
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4832 =
                      ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4833 =
                      x4861;
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4834 =
                      y4841;
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4835 =
                      this.safe__0$1Tile$2__1$1Tile$2$O(((x10.util.ArrayList)(pawns)),
                                                        ((x10.util.ArrayList)(t4832)),
                                                        (int)(t4833),
                                                        (int)(t4834));
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4835) {
                        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4836 =
                          x4861;
                        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4837 =
                          y4841;
                        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4838 =
                          this.genSubLayer__1$1Tile$2((int)(size),
                                                      ((x10.util.ArrayList)(pawns)),
                                                      (int)(t4836),
                                                      (int)(t4837));
                        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).add__0x10$util$ArrayList$$T$O(((x10.util.ArrayList)(t4838)));
                    }
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4839 =
                      y4841;
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4840 =
                      ((t4839) + (((int)(1))));
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
y4841 = t4840;
                }
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4844 =
                  x4861;
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4845 =
                  ((t4844) + (((int)(1))));
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x4861 = t4845;
            }
            
//#line 47 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.io.Printer t4634 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 47 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4634.println(((java.lang.Object)("finishes adding")));
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList out =
              ((x10.util.ArrayList)(new x10.util.ArrayList<Solver.Node>((java.lang.System[]) null, Solver.Node.$RTT).x10$util$ArrayList$$init$S()));
            
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i4864 =
              0;
            
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4865 =
                  i4864;
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4866 =
                  ((long)(((int)(t4865))));
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4867 =
                  ((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).size$O();
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4868 =
                  ((t4866) < (((long)(t4867))));
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4868)) {
                    
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4856 =
                  i4864;
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4857 =
                  ((long)(((int)(t4856))));
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList tempAL4858 =
                  ((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).get$G((long)(t4857));
                
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int j4851 =
                  0;
                
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4852 =
                      j4851;
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4853 =
                      ((long)(((int)(t4852))));
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4854 =
                      ((x10.util.ArrayList<Solver.Node>)tempAL4858).size$O();
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4855 =
                      ((t4853) < (((long)(t4854))));
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4855)) {
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4846 =
                      j4851;
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4847 =
                      ((long)(((int)(t4846))));
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node t4848 =
                      ((x10.util.ArrayList<Solver.Node>)tempAL4858).get$G((long)(t4847));
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Solver.Node>)out).add__0x10$util$ArrayList$$T$O(((Solver.Node)(t4848)));
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4849 =
                      j4851;
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4850 =
                      ((t4849) + (((int)(1))));
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
j4851 = t4850;
                }
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4859 =
                  i4864;
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4860 =
                  ((t4859) + (((int)(1))));
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i4864 = t4860;
            }
            
//#line 55 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return out;
        }
        
        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public x10.util.ArrayList
                                                                                                   genSubLayer__1$1Tile$2(
                                                                                                   final int size,
                                                                                                   final x10.util.ArrayList pawns,
                                                                                                   final int xInit,
                                                                                                   final int yInit){
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList out =
              ((x10.util.ArrayList)(new x10.util.ArrayList<Solver.Node>((java.lang.System[]) null, Solver.Node.$RTT).x10$util$ArrayList$$init$S()));
            
//#line 60 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList qRail =
              ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
            
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4654 =
              ((long)(((int)(0))));
            
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4655 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(xInit)),
                                                               ((int)(yInit)),
                                                               ((int)(2)));
            
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Tile>)qRail).$set__1x10$util$ArrayList$$T$G((long)(t4654),
                                                                                                                                                                      ((Tile)(t4655)));
            
//#line 63 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.recGen__0$1Solver$Node$2__1$1Tile$2__3$1Tile$2(((x10.util.ArrayList)(out)),
                                                                                                                                                         ((x10.util.ArrayList)(pawns)),
                                                                                                                                                         (int)(size),
                                                                                                                                                         ((x10.util.ArrayList)(qRail)),
                                                                                                                                                         (int)(1));
            
//#line 66 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return out;
        }
        
        
//#line 69 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public void
                                                                                                   recGen__0$1Solver$Node$2__1$1Tile$2__3$1Tile$2(
                                                                                                   final x10.util.ArrayList nodes,
                                                                                                   final x10.util.ArrayList pawns,
                                                                                                   final int size,
                                                                                                   final x10.util.ArrayList qRail,
                                                                                                   final int occupied){
            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4661 =
              ((int) size) ==
            ((int) occupied);
            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4661) {
                
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4656 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)pawns).toRail());
                
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4657 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)qRail).toRail());
                
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n =
                  ((Solver.Node)(new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(this,
                                                                                                t4656,
                                                                                                t4657,
                                                                                                ((int)(size)), (Solver.Node.__1$1Tile$2__2$1Tile$2) null)));
                
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4658 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)pawns).toRail());
                
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4659 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)qRail).toRail());
                
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node t4660 =
                  ((Solver.Node)(new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(this,
                                                                                                t4658,
                                                                                                t4659,
                                                                                                ((int)(size)), (Solver.Node.__1$1Tile$2__2$1Tile$2) null)));
                
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Solver.Node>)nodes).add__0x10$util$ArrayList$$T$O(((Solver.Node)(t4660)));
                
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x10.util.ArrayList qTemp =
              ((x10.util.ArrayList<Tile>)
                ((x10.util.ArrayList<Tile>)qRail).clone());
            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int x4886 =
              0;
            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4887 =
                  x4886;
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4888 =
                  ((t4887) < (((int)(size))));
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4888)) {
                    
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int y4881 =
                  0;
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4882 =
                      y4881;
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4883 =
                      ((t4882) < (((int)(size))));
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4883)) {
                        
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4869 =
                      x4886;
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4870 =
                      y4881;
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4871 =
                      this.safe__0$1Tile$2__1$1Tile$2$O(((x10.util.ArrayList)(pawns)),
                                                        ((x10.util.ArrayList)(qRail)),
                                                        (int)(t4869),
                                                        (int)(t4870));
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4871) {
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4872 =
                          qTemp;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4873 =
                          ((long)(((int)(occupied))));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4874 =
                          x4886;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4875 =
                          y4881;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4876 =
                          new Tile((java.lang.System[]) null).Tile$$init$S(t4874,
                                                                           t4875,
                                                                           ((int)(2)));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Tile>)t4872).$set__1x10$util$ArrayList$$T$G((long)(t4873),
                                                                                                                                                                                  ((Tile)(t4876)));
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4877 =
                          qTemp;
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4878 =
                          ((occupied) + (((int)(1))));
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.recGen__0$1Solver$Node$2__1$1Tile$2__3$1Tile$2(((x10.util.ArrayList)(nodes)),
                                                                                                                                                                     ((x10.util.ArrayList)(pawns)),
                                                                                                                                                                     (int)(size),
                                                                                                                                                                     ((x10.util.ArrayList)(t4877)),
                                                                                                                                                                     (int)(t4878));
                    }
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4879 =
                      y4881;
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4880 =
                      ((t4879) + (((int)(1))));
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
y4881 = t4880;
                }
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4884 =
                  x4886;
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4885 =
                  ((t4884) + (((int)(1))));
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x4886 = t4885;
            }
        }
        
        
//#line 92 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public boolean
                                                                                                   safe__0$1Tile$2__1$1Tile$2$O(
                                                                                                   final x10.util.ArrayList pawns,
                                                                                                   final x10.util.ArrayList qRail,
                                                                                                   final int x,
                                                                                                   final int y){
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean out =
              true;
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i5005 =
              0;
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5006 =
                  i5005;
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t5007 =
                  ((long)(((int)(t5006))));
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t5008 =
                  ((x10.util.ArrayList<Tile>)pawns).size$O();
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t5009 =
                  ((t5007) < (((long)(t5008))));
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t5009)) {
                    
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4889 =
                  i5005;
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4890 =
                  ((long)(((int)(t4889))));
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4891 =
                  ((x10.util.ArrayList<Tile>)pawns).$apply$G((long)(t4890));
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4892 =
                  t4891.
                    x;
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4893 =
                  ((int) t4892) ==
                ((int) x);
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4893) {
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4894 =
                      i5005;
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4895 =
                      ((long)(((int)(t4894))));
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4896 =
                      ((x10.util.ArrayList<Tile>)pawns).$apply$G((long)(t4895));
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4897 =
                      t4896.
                        y;
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4893 = ((int) t4897) ==
                    ((int) y);
                }
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4898 =
                  t4893;
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4898) {
                    
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
out = false;
                }
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4899 =
                  i5005;
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4900 =
                  ((t4899) + (((int)(1))));
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i5005 = t4900;
            }
            
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i5010 =
              0;
            
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5011 =
                  i5010;
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t5012 =
                  ((long)(((int)(t5011))));
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t5013 =
                  ((x10.util.ArrayList<Tile>)qRail).size$O();
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t5014 =
                  ((t5012) < (((long)(t5013))));
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t5014)) {
                    
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4901 =
                  i5010;
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4902 =
                  ((long)(((int)(t4901))));
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4903 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4902));
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4904 =
                  t4903.
                    x;
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4905 =
                  ((int) t4904) ==
                ((int) x);
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4905) {
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4906 =
                      i5010;
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4907 =
                      ((long)(((int)(t4906))));
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4908 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4907));
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4909 =
                      t4908.
                        y;
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4905 = ((int) t4909) ==
                    ((int) y);
                }
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4910 =
                  t4905;
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4910) {
                    
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4911 =
                  i5010;
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4912 =
                  ((long)(((int)(t4911))));
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4913 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4912));
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4914 =
                  t4913.
                    x;
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4915 =
                  ((int) t4914) ==
                ((int) x);
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4915) {
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4916 =
                      i5010;
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4917 =
                      ((long)(((int)(t4916))));
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4918 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4917));
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4919 =
                      t4918.
                        y;
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4920 =
                      ((y) - (((int)(1))));
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4915 = ((int) t4919) ==
                    ((int) t4920);
                }
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4921 =
                  t4915;
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4921) {
                    
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4922 =
                  i5010;
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4923 =
                  ((long)(((int)(t4922))));
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4924 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4923));
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4925 =
                  t4924.
                    x;
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4926 =
                  ((int) t4925) ==
                ((int) x);
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4926) {
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4927 =
                      i5010;
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4928 =
                      ((long)(((int)(t4927))));
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4929 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4928));
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4930 =
                      t4929.
                        y;
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4931 =
                      ((y) + (((int)(1))));
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4926 = ((int) t4930) ==
                    ((int) t4931);
                }
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4932 =
                  t4926;
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4932) {
                    
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4933 =
                  i5010;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4934 =
                  ((long)(((int)(t4933))));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4935 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4934));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4936 =
                  t4935.
                    x;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4937 =
                  ((x) - (((int)(1))));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4938 =
                  ((int) t4936) ==
                ((int) t4937);
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4938) {
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4939 =
                      i5010;
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4940 =
                      ((long)(((int)(t4939))));
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4941 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4940));
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4942 =
                      t4941.
                        y;
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4938 = ((int) t4942) ==
                    ((int) y);
                }
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4943 =
                  t4938;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4943) {
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4944 =
                  i5010;
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4945 =
                  ((long)(((int)(t4944))));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4946 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4945));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4947 =
                  t4946.
                    x;
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4948 =
                  ((x) + (((int)(1))));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4949 =
                  ((int) t4947) ==
                ((int) t4948);
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4949) {
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4950 =
                      i5010;
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4951 =
                      ((long)(((int)(t4950))));
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4952 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4951));
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4953 =
                      t4952.
                        y;
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4949 = ((int) t4953) ==
                    ((int) y);
                }
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4954 =
                  t4949;
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4954) {
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4955 =
                  i5010;
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4956 =
                  ((long)(((int)(t4955))));
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4957 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4956));
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4958 =
                  t4957.
                    x;
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4959 =
                  ((x) + (((int)(1))));
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4960 =
                  ((int) t4958) ==
                ((int) t4959);
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4960) {
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4961 =
                      i5010;
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4962 =
                      ((long)(((int)(t4961))));
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4963 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4962));
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4964 =
                      t4963.
                        y;
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4965 =
                      ((y) + (((int)(1))));
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4960 = ((int) t4964) ==
                    ((int) t4965);
                }
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4966 =
                  t4960;
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4966) {
                    
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4967 =
                  i5010;
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4968 =
                  ((long)(((int)(t4967))));
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4969 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4968));
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4970 =
                  t4969.
                    x;
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4971 =
                  ((x) - (((int)(1))));
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4972 =
                  ((int) t4970) ==
                ((int) t4971);
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4972) {
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4973 =
                      i5010;
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4974 =
                      ((long)(((int)(t4973))));
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4975 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4974));
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4976 =
                      t4975.
                        y;
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4977 =
                      ((y) + (((int)(1))));
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4972 = ((int) t4976) ==
                    ((int) t4977);
                }
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4978 =
                  t4972;
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4978) {
                    
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4979 =
                  i5010;
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4980 =
                  ((long)(((int)(t4979))));
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4981 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4980));
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4982 =
                  t4981.
                    x;
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4983 =
                  ((x) + (((int)(1))));
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4984 =
                  ((int) t4982) ==
                ((int) t4983);
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4984) {
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4985 =
                      i5010;
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4986 =
                      ((long)(((int)(t4985))));
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4987 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4986));
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4988 =
                      t4987.
                        y;
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4989 =
                      ((y) - (((int)(1))));
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4984 = ((int) t4988) ==
                    ((int) t4989);
                }
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4990 =
                  t4984;
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4990) {
                    
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4991 =
                  i5010;
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4992 =
                  ((long)(((int)(t4991))));
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4993 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4992));
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4994 =
                  t4993.
                    x;
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4995 =
                  ((x) - (((int)(1))));
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4996 =
                  ((int) t4994) ==
                ((int) t4995);
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4996) {
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4997 =
                      i5010;
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4998 =
                      ((long)(((int)(t4997))));
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4999 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4998));
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5000 =
                      t4999.
                        y;
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5001 =
                      ((y) - (((int)(1))));
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4996 = ((int) t5000) ==
                    ((int) t5001);
                }
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t5002 =
                  t4996;
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t5002) {
                    
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5003 =
                  i5010;
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5004 =
                  ((t5003) + (((int)(1))));
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i5010 = t5004;
            }
            
//#line 130 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4808 =
              out;
            
//#line 130 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4808;
        }
        
        
//#line 133 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                    queensForBoard(
                                                                                                    final int ofSize){
            
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4811 =
              ((int) ofSize) ==
            ((int) 0);
            
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4811) {
                
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4809 =
                  ((long)(((int)(0))));
                
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4810 =
                  ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t4809)));
                
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4810;
            }
            
//#line 137 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4812 =
              ((long)(((int)(ofSize))));
            
//#line 137 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail queens =
              new x10.core.Rail<Tile>(Tile.$RTT, t4812);
            
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i5029 =
              1;
            {
                
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] queens$value5032 =
                  ((Tile[])queens.value);
                
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                               true;
                                                                                                               ) {
                    
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5030 =
                      i5029;
                    
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t5031 =
                      ((t5030) <= (((int)(ofSize))));
                    
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t5031)) {
                        
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 139 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5015 =
                      i5029;
                    
//#line 139 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5016 =
                      ((t5015) - (((int)(1))));
                    
//#line 139 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int x5017 =
                      ((t5016) % (((int)(ofSize))));
                    
//#line 140 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5018 =
                      i5029;
                    
//#line 140 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5019 =
                      ((t5018) - (((int)(1))));
                    
//#line 140 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int y5020 =
                      ((t5019) / (((int)(ofSize))));
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5021 =
                      i5029;
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5022 =
                      ((t5021) - (((int)(1))));
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t5023 =
                      ((long)(((int)(t5022))));
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5024 =
                      x5017;
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5025 =
                      y5020;
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t5026 =
                      new Tile((java.lang.System[]) null).Tile$$init$S(t5024,
                                                                       t5025,
                                                                       ((int)(2)));
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
queens$value5032[(int)t5023]=t5026;
                    
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5027 =
                      i5029;
                    
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t5028 =
                      ((t5027) + (((int)(1))));
                    
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i5029 = t5028;
                }
            }
            
//#line 143 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return queens;
        }
        
        
//#line 147 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
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
            
                
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public Solver out$;
                
//#line 148 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public Board board;
                
                
//#line 149 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
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
                                                                                                                     
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.out$ = out$;
                                                                                                                     
//#line 149 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
;
                                                                                                                     
//#line 149 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"

                                                                                                                     
//#line 147 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.__fieldInitializers_Solver_Node();
                                                                                                                     
//#line 150 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4828 =
                                                                                                                       ((Board)(new Board((java.lang.System[]) null).Board$$init$S(((int)(size)),
                                                                                                                                                                                   ((x10.core.Rail)(pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(queens)), (Board.__1$1Tile$2__2$1Tile$2) null)));
                                                                                                                     
//#line 150 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.board = ((Board)(t4828));
                                                                                                                 }
                                                                                                                 return this;
                                                                                                                 }
                
                
                
//#line 153 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public boolean
                                                                                                            check$O(
                                                                                                            ){
                    
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4829 =
                      ((Board)(board));
                    
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4830 =
                      t4829.valid$O();
                    
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4830;
                }
                
                
//#line 147 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver.Node
                                                                                                            Solver$Node$$this$Solver$Node(
                                                                                                            ){
                    
//#line 147 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.Node.this;
                }
                
                
//#line 147 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                            Solver$Node$$this$Solver(
                                                                                                            ){
                    
//#line 147 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t4831 =
                      this.
                        out$;
                    
//#line 147 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4831;
                }
                
                
//#line 147 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public void
                                                                                                            __fieldInitializers_Solver_Node(
                                                                                                            ){
                    
                }
            // synthetic type for parameter mangling
            public static final class __1$1Tile$2__2$1Tile$2 {}
            
        }
        
        
        
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                   Solver$$this$Solver(
                                                                                                   ){
            
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.this;
        }
        
        
//#line 14 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
// creation method for java code (1-phase java constructor)
        public Solver(){this((java.lang.System[]) null);
                            Solver$$init$S();}
        
        // constructor for non-virtual call
        final public Solver Solver$$init$S() { {
                                                      
//#line 14 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
;
                                                      
//#line 14 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"

                                                      
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.__fieldInitializers_Solver();
                                                  }
                                                  return this;
                                                  }
        
        
        
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public void
                                                                                                   __fieldInitializers_Solver(
                                                                                                   ){
            
        }
    
}

