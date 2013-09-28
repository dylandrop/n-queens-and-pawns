
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
final long t4541 =
              ((long)(((int)(4))));
            
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail qs =
              new x10.core.Rail<Tile>(Tile.$RTT, t4541);
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4542 =
              ((long)(((int)(0))));
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4543 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(0)),
                                                               ((int)(1)),
                                                               ((int)(2)));
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4542] = t4543;
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4544 =
              ((long)(((int)(1))));
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4545 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(1)),
                                                               ((int)(3)),
                                                               ((int)(2)));
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4544] = t4545;
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4546 =
              ((long)(((int)(2))));
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4547 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(2)),
                                                               ((int)(0)),
                                                               ((int)(2)));
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4546] = t4547;
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4548 =
              ((long)(((int)(3))));
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4549 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(3)),
                                                               ((int)(2)),
                                                               ((int)(2)));
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4548] = t4549;
            
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board board =
              new Board((java.lang.System[]) null).Board$$init$S(((int)(4)),
                                                                 ((x10.core.Rail)(ps)),
                                                                 ((x10.core.Rail)(qs)), (Board.__1$1Tile$2__2$1Tile$2) null);
            
//#line 35 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
board.print();
            
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.io.Printer t4550 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4551 =
              board.valid$O();
            
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4550.println(x10.core.Boolean.$box(t4551));
            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4552 =
              ((long)(((int)(42))));
            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4552;
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
int x4778 =
              0;
            
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4779 =
                  x4778;
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4780 =
                  ((t4779) < (((int)(size))));
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4780)) {
                    
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int y4758 =
                  0;
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4759 =
                      y4758;
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4760 =
                      ((t4759) < (((int)(size))));
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4760)) {
                        
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4749 =
                      ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4750 =
                      x4778;
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4751 =
                      y4758;
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4752 =
                      this.safe__0$1Tile$2__1$1Tile$2$O(((x10.util.ArrayList)(pawns)),
                                                        ((x10.util.ArrayList)(t4749)),
                                                        (int)(t4750),
                                                        (int)(t4751));
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4752) {
                        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4753 =
                          x4778;
                        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4754 =
                          y4758;
                        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4755 =
                          this.genSubLayer__1$1Tile$2((int)(size),
                                                      ((x10.util.ArrayList)(pawns)),
                                                      (int)(t4753),
                                                      (int)(t4754));
                        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).add__0x10$util$ArrayList$$T$O(((x10.util.ArrayList)(t4755)));
                    }
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4756 =
                      y4758;
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4757 =
                      ((t4756) + (((int)(1))));
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
y4758 = t4757;
                }
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4761 =
                  x4778;
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4762 =
                  ((t4761) + (((int)(1))));
                
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x4778 = t4762;
            }
            
//#line 47 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.io.Printer t4570 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 47 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4570.println(((java.lang.Object)("finishes adding")));
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList out =
              ((x10.util.ArrayList)(new x10.util.ArrayList<Solver.Node>((java.lang.System[]) null, Solver.Node.$RTT).x10$util$ArrayList$$init$S()));
            
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i4781 =
              0;
            
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4782 =
                  i4781;
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4783 =
                  ((long)(((int)(t4782))));
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4784 =
                  ((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).size$O();
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4785 =
                  ((t4783) < (((long)(t4784))));
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4785)) {
                    
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4773 =
                  i4781;
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4774 =
                  ((long)(((int)(t4773))));
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList tempAL4775 =
                  ((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).get$G((long)(t4774));
                
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int j4768 =
                  0;
                
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4769 =
                      j4768;
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4770 =
                      ((long)(((int)(t4769))));
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4771 =
                      ((x10.util.ArrayList<Solver.Node>)tempAL4775).size$O();
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4772 =
                      ((t4770) < (((long)(t4771))));
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4772)) {
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4763 =
                      j4768;
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4764 =
                      ((long)(((int)(t4763))));
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node t4765 =
                      ((x10.util.ArrayList<Solver.Node>)tempAL4775).get$G((long)(t4764));
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Solver.Node>)out).add__0x10$util$ArrayList$$T$O(((Solver.Node)(t4765)));
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4766 =
                      j4768;
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4767 =
                      ((t4766) + (((int)(1))));
                    
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
j4768 = t4767;
                }
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4776 =
                  i4781;
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4777 =
                  ((t4776) + (((int)(1))));
                
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i4781 = t4777;
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
final long t4590 =
              ((long)(((int)(0))));
            
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4591 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(xInit)),
                                                               ((int)(yInit)),
                                                               ((int)(2)));
            
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Tile>)qRail).$set__1x10$util$ArrayList$$T$G((long)(t4590),
                                                                                                                                                                      ((Tile)(t4591)));
            
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
final boolean t4597 =
              ((int) size) ==
            ((int) occupied);
            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4597) {
                
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4592 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)pawns).toRail());
                
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4593 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)qRail).toRail());
                
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n =
                  ((Solver.Node)(new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(this,
                                                                                                t4592,
                                                                                                t4593,
                                                                                                ((int)(size)), (Solver.Node.__1$1Tile$2__2$1Tile$2) null)));
                
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4594 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)pawns).toRail());
                
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4595 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)qRail).toRail());
                
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node t4596 =
                  ((Solver.Node)(new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(this,
                                                                                                t4594,
                                                                                                t4595,
                                                                                                ((int)(size)), (Solver.Node.__1$1Tile$2__2$1Tile$2) null)));
                
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Solver.Node>)nodes).add__0x10$util$ArrayList$$T$O(((Solver.Node)(t4596)));
                
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x10.util.ArrayList qTemp =
              ((x10.util.ArrayList<Tile>)
                ((x10.util.ArrayList<Tile>)qRail).clone());
            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int x4803 =
              0;
            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4804 =
                  x4803;
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4805 =
                  ((t4804) < (((int)(size))));
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4805)) {
                    
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int y4798 =
                  0;
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4799 =
                      y4798;
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4800 =
                      ((t4799) < (((int)(size))));
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4800)) {
                        
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4786 =
                      x4803;
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4787 =
                      y4798;
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4788 =
                      this.safe__0$1Tile$2__1$1Tile$2$O(((x10.util.ArrayList)(pawns)),
                                                        ((x10.util.ArrayList)(qRail)),
                                                        (int)(t4786),
                                                        (int)(t4787));
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4788) {
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4789 =
                          qTemp;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4790 =
                          ((long)(((int)(occupied))));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4791 =
                          x4803;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4792 =
                          y4798;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4793 =
                          new Tile((java.lang.System[]) null).Tile$$init$S(t4791,
                                                                           t4792,
                                                                           ((int)(2)));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Tile>)t4789).$set__1x10$util$ArrayList$$T$G((long)(t4790),
                                                                                                                                                                                  ((Tile)(t4793)));
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4794 =
                          qTemp;
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4795 =
                          ((occupied) + (((int)(1))));
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.recGen__0$1Solver$Node$2__1$1Tile$2__3$1Tile$2(((x10.util.ArrayList)(nodes)),
                                                                                                                                                                     ((x10.util.ArrayList)(pawns)),
                                                                                                                                                                     (int)(size),
                                                                                                                                                                     ((x10.util.ArrayList)(t4794)),
                                                                                                                                                                     (int)(t4795));
                    }
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4796 =
                      y4798;
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4797 =
                      ((t4796) + (((int)(1))));
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
y4798 = t4797;
                }
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4801 =
                  x4803;
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4802 =
                  ((t4801) + (((int)(1))));
                
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x4803 = t4802;
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
int i4922 =
              0;
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4923 =
                  i4922;
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4924 =
                  ((long)(((int)(t4923))));
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4925 =
                  ((x10.util.ArrayList<Tile>)pawns).size$O();
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4926 =
                  ((t4924) < (((long)(t4925))));
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4926)) {
                    
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4806 =
                  i4922;
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4807 =
                  ((long)(((int)(t4806))));
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4808 =
                  ((x10.util.ArrayList<Tile>)pawns).$apply$G((long)(t4807));
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4809 =
                  t4808.
                    x;
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4810 =
                  ((int) t4809) ==
                ((int) x);
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4810) {
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4811 =
                      i4922;
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4812 =
                      ((long)(((int)(t4811))));
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4813 =
                      ((x10.util.ArrayList<Tile>)pawns).$apply$G((long)(t4812));
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4814 =
                      t4813.
                        y;
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4810 = ((int) t4814) ==
                    ((int) y);
                }
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4815 =
                  t4810;
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4815) {
                    
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
out = false;
                }
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4816 =
                  i4922;
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4817 =
                  ((t4816) + (((int)(1))));
                
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i4922 = t4817;
            }
            
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i4927 =
              0;
            
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4928 =
                  i4927;
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4929 =
                  ((long)(((int)(t4928))));
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4930 =
                  ((x10.util.ArrayList<Tile>)qRail).size$O();
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4931 =
                  ((t4929) < (((long)(t4930))));
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4931)) {
                    
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4818 =
                  i4927;
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4819 =
                  ((long)(((int)(t4818))));
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4820 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4819));
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4821 =
                  t4820.
                    x;
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4822 =
                  ((int) t4821) ==
                ((int) x);
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4822) {
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4823 =
                      i4927;
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4824 =
                      ((long)(((int)(t4823))));
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4825 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4824));
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4826 =
                      t4825.
                        y;
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4822 = ((int) t4826) ==
                    ((int) y);
                }
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4827 =
                  t4822;
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4827) {
                    
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4828 =
                  i4927;
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4829 =
                  ((long)(((int)(t4828))));
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4830 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4829));
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4831 =
                  t4830.
                    x;
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4832 =
                  ((int) t4831) ==
                ((int) x);
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4832) {
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4833 =
                      i4927;
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4834 =
                      ((long)(((int)(t4833))));
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4835 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4834));
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4836 =
                      t4835.
                        y;
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4837 =
                      ((y) - (((int)(1))));
                    
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4832 = ((int) t4836) ==
                    ((int) t4837);
                }
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4838 =
                  t4832;
                
//#line 104 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4838) {
                    
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4839 =
                  i4927;
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4840 =
                  ((long)(((int)(t4839))));
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4841 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4840));
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4842 =
                  t4841.
                    x;
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4843 =
                  ((int) t4842) ==
                ((int) x);
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4843) {
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4844 =
                      i4927;
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4845 =
                      ((long)(((int)(t4844))));
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4846 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4845));
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4847 =
                      t4846.
                        y;
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4848 =
                      ((y) + (((int)(1))));
                    
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4843 = ((int) t4847) ==
                    ((int) t4848);
                }
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4849 =
                  t4843;
                
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4849) {
                    
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4850 =
                  i4927;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4851 =
                  ((long)(((int)(t4850))));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4852 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4851));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4853 =
                  t4852.
                    x;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4854 =
                  ((x) - (((int)(1))));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4855 =
                  ((int) t4853) ==
                ((int) t4854);
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4855) {
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4856 =
                      i4927;
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4857 =
                      ((long)(((int)(t4856))));
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4858 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4857));
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4859 =
                      t4858.
                        y;
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4855 = ((int) t4859) ==
                    ((int) y);
                }
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4860 =
                  t4855;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4860) {
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4861 =
                  i4927;
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4862 =
                  ((long)(((int)(t4861))));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4863 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4862));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4864 =
                  t4863.
                    x;
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4865 =
                  ((x) + (((int)(1))));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4866 =
                  ((int) t4864) ==
                ((int) t4865);
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4866) {
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4867 =
                      i4927;
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4868 =
                      ((long)(((int)(t4867))));
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4869 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4868));
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4870 =
                      t4869.
                        y;
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4866 = ((int) t4870) ==
                    ((int) y);
                }
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4871 =
                  t4866;
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4871) {
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4872 =
                  i4927;
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4873 =
                  ((long)(((int)(t4872))));
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4874 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4873));
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4875 =
                  t4874.
                    x;
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4876 =
                  ((x) + (((int)(1))));
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4877 =
                  ((int) t4875) ==
                ((int) t4876);
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4877) {
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4878 =
                      i4927;
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4879 =
                      ((long)(((int)(t4878))));
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4880 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4879));
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4881 =
                      t4880.
                        y;
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4882 =
                      ((y) + (((int)(1))));
                    
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4877 = ((int) t4881) ==
                    ((int) t4882);
                }
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4883 =
                  t4877;
                
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4883) {
                    
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4884 =
                  i4927;
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4885 =
                  ((long)(((int)(t4884))));
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4886 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4885));
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4887 =
                  t4886.
                    x;
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4888 =
                  ((x) - (((int)(1))));
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4889 =
                  ((int) t4887) ==
                ((int) t4888);
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4889) {
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4890 =
                      i4927;
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4891 =
                      ((long)(((int)(t4890))));
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4892 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4891));
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4893 =
                      t4892.
                        y;
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4894 =
                      ((y) + (((int)(1))));
                    
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4889 = ((int) t4893) ==
                    ((int) t4894);
                }
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4895 =
                  t4889;
                
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4895) {
                    
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4896 =
                  i4927;
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4897 =
                  ((long)(((int)(t4896))));
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4898 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4897));
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4899 =
                  t4898.
                    x;
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4900 =
                  ((x) + (((int)(1))));
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4901 =
                  ((int) t4899) ==
                ((int) t4900);
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4901) {
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4902 =
                      i4927;
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4903 =
                      ((long)(((int)(t4902))));
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4904 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4903));
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4905 =
                      t4904.
                        y;
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4906 =
                      ((y) - (((int)(1))));
                    
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4901 = ((int) t4905) ==
                    ((int) t4906);
                }
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4907 =
                  t4901;
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4907) {
                    
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4908 =
                  i4927;
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4909 =
                  ((long)(((int)(t4908))));
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4910 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4909));
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4911 =
                  t4910.
                    x;
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4912 =
                  ((x) - (((int)(1))));
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4913 =
                  ((int) t4911) ==
                ((int) t4912);
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4913) {
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4914 =
                      i4927;
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4915 =
                      ((long)(((int)(t4914))));
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4916 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4915));
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4917 =
                      t4916.
                        y;
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4918 =
                      ((y) - (((int)(1))));
                    
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4913 = ((int) t4917) ==
                    ((int) t4918);
                }
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4919 =
                  t4913;
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4919) {
                    
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4920 =
                  i4927;
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4921 =
                  ((t4920) + (((int)(1))));
                
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i4927 = t4921;
            }
            
//#line 130 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4744 =
              out;
            
//#line 130 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4744;
        }
        
        
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
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
                
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public Board board;
                
                
//#line 136 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
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
                                                                                                                     
//#line 136 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
;
                                                                                                                     
//#line 136 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"

                                                                                                                     
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.__fieldInitializers_Solver_Node();
                                                                                                                     
//#line 137 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4745 =
                                                                                                                       ((Board)(new Board((java.lang.System[]) null).Board$$init$S(((int)(size)),
                                                                                                                                                                                   ((x10.core.Rail)(pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(queens)), (Board.__1$1Tile$2__2$1Tile$2) null)));
                                                                                                                     
//#line 137 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.board = ((Board)(t4745));
                                                                                                                 }
                                                                                                                 return this;
                                                                                                                 }
                
                
                
//#line 140 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public boolean
                                                                                                            check$O(
                                                                                                            ){
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4746 =
                      ((Board)(board));
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4747 =
                      t4746.valid$O();
                    
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4747;
                }
                
                
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver.Node
                                                                                                            Solver$Node$$this$Solver$Node(
                                                                                                            ){
                    
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.Node.this;
                }
                
                
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                            Solver$Node$$this$Solver(
                                                                                                            ){
                    
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t4748 =
                      this.
                        out$;
                    
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4748;
                }
                
                
//#line 134 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
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

