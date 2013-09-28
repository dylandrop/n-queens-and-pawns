
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
final long t4547 =
              ((long)(((int)(1))));
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail ps =
              new x10.core.Rail<Tile>(Tile.$RTT, t4547);
            
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4548 =
              ((long)(((int)(4))));
            
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail qs =
              new x10.core.Rail<Tile>(Tile.$RTT, t4548);
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4549 =
              ((long)(((int)(0))));
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4550 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(0)),
                                                               ((int)(2)),
                                                               ((int)(3)));
            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])ps.value)[(int)t4549] = t4550;
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4551 =
              ((long)(((int)(0))));
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4552 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(0)),
                                                               ((int)(1)),
                                                               ((int)(2)));
            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4551] = t4552;
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4553 =
              ((long)(((int)(1))));
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4554 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(0)),
                                                               ((int)(3)),
                                                               ((int)(2)));
            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4553] = t4554;
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4555 =
              ((long)(((int)(2))));
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4556 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(2)),
                                                               ((int)(0)),
                                                               ((int)(2)));
            
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4555] = t4556;
            
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4557 =
              ((long)(((int)(3))));
            
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4558 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(3)),
                                                               ((int)(2)),
                                                               ((int)(2)));
            
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])qs.value)[(int)t4557] = t4558;
            
//#line 35 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board board =
              new Board((java.lang.System[]) null).Board$$init$S(((int)(4)),
                                                                 ((x10.core.Rail)(ps)),
                                                                 ((x10.core.Rail)(qs)), (Board.__1$1Tile$2__2$1Tile$2) null);
            
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
board.print();
            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.io.Printer t4559 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4560 =
              board.valid$O();
            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4559.println(x10.core.Boolean.$box(t4560));
            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4561 =
              ((long)(((int)(42))));
            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4561;
        }
        
        
//#line 40 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public x10.util.ArrayList
                                                                                                   generateBoards__1$1Tile$2(
                                                                                                   final int size,
                                                                                                   final x10.util.ArrayList pawns){
            
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t =
              ((x10.util.ArrayList)(new x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.util.ArrayList.$RTT, Solver.Node.$RTT)).x10$util$ArrayList$$init$S()));
            
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int x4787 =
              0;
            
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4788 =
                  x4787;
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4789 =
                  ((t4788) < (((int)(size))));
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4789)) {
                    
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int y4767 =
                  0;
                
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4768 =
                      y4767;
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4769 =
                      ((t4768) < (((int)(size))));
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4769)) {
                        
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4758 =
                      ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
                    
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4759 =
                      x4787;
                    
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4760 =
                      y4767;
                    
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4761 =
                      this.safe__0$1Tile$2__1$1Tile$2$O(((x10.util.ArrayList)(pawns)),
                                                        ((x10.util.ArrayList)(t4758)),
                                                        (int)(t4759),
                                                        (int)(t4760));
                    
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4761) {
                        
//#line 45 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4762 =
                          x4787;
                        
//#line 45 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4763 =
                          y4767;
                        
//#line 45 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4764 =
                          this.genSubLayer__1$1Tile$2((int)(size),
                                                      ((x10.util.ArrayList)(pawns)),
                                                      (int)(t4762),
                                                      (int)(t4763));
                        
//#line 45 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).add__0x10$util$ArrayList$$T$O(((x10.util.ArrayList)(t4764)));
                    }
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4765 =
                      y4767;
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4766 =
                      ((t4765) + (((int)(1))));
                    
//#line 43 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
y4767 = t4766;
                }
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4770 =
                  x4787;
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4771 =
                  ((t4770) + (((int)(1))));
                
//#line 42 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x4787 = t4771;
            }
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.io.Printer t4579 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4579.println(((java.lang.Object)("finishes adding")));
            
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList out =
              ((x10.util.ArrayList)(new x10.util.ArrayList<Solver.Node>((java.lang.System[]) null, Solver.Node.$RTT).x10$util$ArrayList$$init$S()));
            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i4790 =
              0;
            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4791 =
                  i4790;
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4792 =
                  ((long)(((int)(t4791))));
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4793 =
                  ((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).size$O();
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4794 =
                  ((t4792) < (((long)(t4793))));
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4794)) {
                    
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4782 =
                  i4790;
                
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4783 =
                  ((long)(((int)(t4782))));
                
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList tempAL4784 =
                  ((x10.util.ArrayList<x10.util.ArrayList<Solver.Node>>)t).get$G((long)(t4783));
                
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int j4777 =
                  0;
                
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4778 =
                      j4777;
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4779 =
                      ((long)(((int)(t4778))));
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4780 =
                      ((x10.util.ArrayList<Solver.Node>)tempAL4784).size$O();
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4781 =
                      ((t4779) < (((long)(t4780))));
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4781)) {
                        
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4772 =
                      j4777;
                    
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4773 =
                      ((long)(((int)(t4772))));
                    
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node t4774 =
                      ((x10.util.ArrayList<Solver.Node>)tempAL4784).get$G((long)(t4773));
                    
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Solver.Node>)out).add__0x10$util$ArrayList$$T$O(((Solver.Node)(t4774)));
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4775 =
                      j4777;
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4776 =
                      ((t4775) + (((int)(1))));
                    
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
j4777 = t4776;
                }
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4785 =
                  i4790;
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4786 =
                  ((t4785) + (((int)(1))));
                
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i4790 = t4786;
            }
            
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return out;
        }
        
        
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public x10.util.ArrayList
                                                                                                   genSubLayer__1$1Tile$2(
                                                                                                   final int size,
                                                                                                   final x10.util.ArrayList pawns,
                                                                                                   final int xInit,
                                                                                                   final int yInit){
            
//#line 60 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList out =
              ((x10.util.ArrayList)(new x10.util.ArrayList<Solver.Node>((java.lang.System[]) null, Solver.Node.$RTT).x10$util$ArrayList$$init$S()));
            
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList qRail =
              ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
            
//#line 62 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4599 =
              ((long)(((int)(0))));
            
//#line 62 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4600 =
              new Tile((java.lang.System[]) null).Tile$$init$S(((int)(xInit)),
                                                               ((int)(yInit)),
                                                               ((int)(2)));
            
//#line 62 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Tile>)qRail).$set__1x10$util$ArrayList$$T$G((long)(t4599),
                                                                                                                                                                      ((Tile)(t4600)));
            
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.recGen__0$1Solver$Node$2__1$1Tile$2__3$1Tile$2(((x10.util.ArrayList)(out)),
                                                                                                                                                         ((x10.util.ArrayList)(pawns)),
                                                                                                                                                         (int)(size),
                                                                                                                                                         ((x10.util.ArrayList)(qRail)),
                                                                                                                                                         (int)(1));
            
//#line 67 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return out;
        }
        
        
//#line 70 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public void
                                                                                                   recGen__0$1Solver$Node$2__1$1Tile$2__3$1Tile$2(
                                                                                                   final x10.util.ArrayList nodes,
                                                                                                   final x10.util.ArrayList pawns,
                                                                                                   final int size,
                                                                                                   final x10.util.ArrayList qRail,
                                                                                                   final int occupied){
            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4606 =
              ((int) size) ==
            ((int) occupied);
            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4606) {
                
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4601 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)pawns).toRail());
                
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4602 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)qRail).toRail());
                
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n =
                  ((Solver.Node)(new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(this,
                                                                                                t4601,
                                                                                                t4602,
                                                                                                ((int)(size)), (Solver.Node.__1$1Tile$2__2$1Tile$2) null)));
                
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4603 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)pawns).toRail());
                
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4604 =
                  ((x10.core.Rail<Tile>)
                    ((x10.util.ArrayList<Tile>)qRail).toRail());
                
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node t4605 =
                  ((Solver.Node)(new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(this,
                                                                                                t4603,
                                                                                                t4604,
                                                                                                ((int)(size)), (Solver.Node.__1$1Tile$2__2$1Tile$2) null)));
                
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Solver.Node>)nodes).add__0x10$util$ArrayList$$T$O(((Solver.Node)(t4605)));
                
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 78 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x10.util.ArrayList qTemp =
              ((x10.util.ArrayList<Tile>)
                ((x10.util.ArrayList<Tile>)qRail).clone());
            
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int x4812 =
              0;
            
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4813 =
                  x4812;
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4814 =
                  ((t4813) < (((int)(size))));
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4814)) {
                    
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int y4807 =
                  0;
                
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4808 =
                      y4807;
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4809 =
                      ((t4808) < (((int)(size))));
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4809)) {
                        
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4795 =
                      x4812;
                    
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4796 =
                      y4807;
                    
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4797 =
                      this.safe__0$1Tile$2__1$1Tile$2$O(((x10.util.ArrayList)(pawns)),
                                                        ((x10.util.ArrayList)(qRail)),
                                                        (int)(t4795),
                                                        (int)(t4796));
                    
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4797) {
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4798 =
                          qTemp;
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4799 =
                          ((long)(((int)(occupied))));
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4800 =
                          x4812;
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4801 =
                          y4807;
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4802 =
                          new Tile((java.lang.System[]) null).Tile$$init$S(t4800,
                                                                           t4801,
                                                                           ((int)(2)));
                        
//#line 84 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
((x10.util.ArrayList<Tile>)t4798).$set__1x10$util$ArrayList$$T$G((long)(t4799),
                                                                                                                                                                                  ((Tile)(t4802)));
                        
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final x10.util.ArrayList t4803 =
                          qTemp;
                        
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4804 =
                          ((occupied) + (((int)(1))));
                        
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.recGen__0$1Solver$Node$2__1$1Tile$2__3$1Tile$2(((x10.util.ArrayList)(nodes)),
                                                                                                                                                                     ((x10.util.ArrayList)(pawns)),
                                                                                                                                                                     (int)(size),
                                                                                                                                                                     ((x10.util.ArrayList)(t4803)),
                                                                                                                                                                     (int)(t4804));
                    }
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4805 =
                      y4807;
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4806 =
                      ((t4805) + (((int)(1))));
                    
//#line 82 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
y4807 = t4806;
                }
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4810 =
                  x4812;
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4811 =
                  ((t4810) + (((int)(1))));
                
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
x4812 = t4811;
            }
        }
        
        
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public boolean
                                                                                                   safe__0$1Tile$2__1$1Tile$2$O(
                                                                                                   final x10.util.ArrayList pawns,
                                                                                                   final x10.util.ArrayList qRail,
                                                                                                   final int x,
                                                                                                   final int y){
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean out =
              true;
            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i4931 =
              0;
            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4932 =
                  i4931;
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4933 =
                  ((long)(((int)(t4932))));
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4934 =
                  ((x10.util.ArrayList<Tile>)pawns).size$O();
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4935 =
                  ((t4933) < (((long)(t4934))));
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4935)) {
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4815 =
                  i4931;
                
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4816 =
                  ((long)(((int)(t4815))));
                
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4817 =
                  ((x10.util.ArrayList<Tile>)pawns).$apply$G((long)(t4816));
                
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4818 =
                  t4817.
                    x;
                
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4819 =
                  ((int) t4818) ==
                ((int) x);
                
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4819) {
                    
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4820 =
                      i4931;
                    
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4821 =
                      ((long)(((int)(t4820))));
                    
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4822 =
                      ((x10.util.ArrayList<Tile>)pawns).$apply$G((long)(t4821));
                    
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4823 =
                      t4822.
                        y;
                    
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4819 = ((int) t4823) ==
                    ((int) y);
                }
                
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4824 =
                  t4819;
                
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4824) {
                    
//#line 97 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
out = false;
                }
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4825 =
                  i4931;
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4826 =
                  ((t4825) + (((int)(1))));
                
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i4931 = t4826;
            }
            
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
int i4936 =
              0;
            
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                           true;
                                                                                                           ) {
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4937 =
                  i4936;
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4938 =
                  ((long)(((int)(t4937))));
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4939 =
                  ((x10.util.ArrayList<Tile>)qRail).size$O();
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4940 =
                  ((t4938) < (((long)(t4939))));
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4940)) {
                    
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4827 =
                  i4936;
                
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4828 =
                  ((long)(((int)(t4827))));
                
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4829 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4828));
                
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4830 =
                  t4829.
                    x;
                
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4831 =
                  ((int) t4830) ==
                ((int) x);
                
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4831) {
                    
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4832 =
                      i4936;
                    
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4833 =
                      ((long)(((int)(t4832))));
                    
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4834 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4833));
                    
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4835 =
                      t4834.
                        y;
                    
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4831 = ((int) t4835) ==
                    ((int) y);
                }
                
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4836 =
                  t4831;
                
//#line 101 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4836) {
                    
//#line 102 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4837 =
                  i4936;
                
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4838 =
                  ((long)(((int)(t4837))));
                
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4839 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4838));
                
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4840 =
                  t4839.
                    x;
                
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4841 =
                  ((int) t4840) ==
                ((int) x);
                
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4841) {
                    
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4842 =
                      i4936;
                    
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4843 =
                      ((long)(((int)(t4842))));
                    
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4844 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4843));
                    
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4845 =
                      t4844.
                        y;
                    
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4846 =
                      ((y) - (((int)(1))));
                    
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4841 = ((int) t4845) ==
                    ((int) t4846);
                }
                
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4847 =
                  t4841;
                
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4847) {
                    
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4848 =
                  i4936;
                
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4849 =
                  ((long)(((int)(t4848))));
                
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4850 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4849));
                
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4851 =
                  t4850.
                    x;
                
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4852 =
                  ((int) t4851) ==
                ((int) x);
                
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4852) {
                    
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4853 =
                      i4936;
                    
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4854 =
                      ((long)(((int)(t4853))));
                    
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4855 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4854));
                    
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4856 =
                      t4855.
                        y;
                    
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4857 =
                      ((y) + (((int)(1))));
                    
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4852 = ((int) t4856) ==
                    ((int) t4857);
                }
                
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4858 =
                  t4852;
                
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4858) {
                    
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4859 =
                  i4936;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4860 =
                  ((long)(((int)(t4859))));
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4861 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4860));
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4862 =
                  t4861.
                    x;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4863 =
                  ((x) - (((int)(1))));
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4864 =
                  ((int) t4862) ==
                ((int) t4863);
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4864) {
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4865 =
                      i4936;
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4866 =
                      ((long)(((int)(t4865))));
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4867 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4866));
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4868 =
                      t4867.
                        y;
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4864 = ((int) t4868) ==
                    ((int) y);
                }
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4869 =
                  t4864;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4869) {
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4870 =
                  i4936;
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4871 =
                  ((long)(((int)(t4870))));
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4872 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4871));
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4873 =
                  t4872.
                    x;
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4874 =
                  ((x) + (((int)(1))));
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4875 =
                  ((int) t4873) ==
                ((int) t4874);
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4875) {
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4876 =
                      i4936;
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4877 =
                      ((long)(((int)(t4876))));
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4878 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4877));
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4879 =
                      t4878.
                        y;
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4875 = ((int) t4879) ==
                    ((int) y);
                }
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4880 =
                  t4875;
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4880) {
                    
//#line 115 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4881 =
                  i4936;
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4882 =
                  ((long)(((int)(t4881))));
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4883 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4882));
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4884 =
                  t4883.
                    x;
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4885 =
                  ((x) + (((int)(1))));
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4886 =
                  ((int) t4884) ==
                ((int) t4885);
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4886) {
                    
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4887 =
                      i4936;
                    
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4888 =
                      ((long)(((int)(t4887))));
                    
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4889 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4888));
                    
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4890 =
                      t4889.
                        y;
                    
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4891 =
                      ((y) + (((int)(1))));
                    
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4886 = ((int) t4890) ==
                    ((int) t4891);
                }
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4892 =
                  t4886;
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4892) {
                    
//#line 118 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4893 =
                  i4936;
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4894 =
                  ((long)(((int)(t4893))));
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4895 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4894));
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4896 =
                  t4895.
                    x;
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4897 =
                  ((x) - (((int)(1))));
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4898 =
                  ((int) t4896) ==
                ((int) t4897);
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4898) {
                    
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4899 =
                      i4936;
                    
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4900 =
                      ((long)(((int)(t4899))));
                    
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4901 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4900));
                    
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4902 =
                      t4901.
                        y;
                    
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4903 =
                      ((y) + (((int)(1))));
                    
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4898 = ((int) t4902) ==
                    ((int) t4903);
                }
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4904 =
                  t4898;
                
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4904) {
                    
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4905 =
                  i4936;
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4906 =
                  ((long)(((int)(t4905))));
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4907 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4906));
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4908 =
                  t4907.
                    x;
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4909 =
                  ((x) + (((int)(1))));
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4910 =
                  ((int) t4908) ==
                ((int) t4909);
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4910) {
                    
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4911 =
                      i4936;
                    
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4912 =
                      ((long)(((int)(t4911))));
                    
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4913 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4912));
                    
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4914 =
                      t4913.
                        y;
                    
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4915 =
                      ((y) - (((int)(1))));
                    
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4910 = ((int) t4914) ==
                    ((int) t4915);
                }
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4916 =
                  t4910;
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4916) {
                    
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4917 =
                  i4936;
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4918 =
                  ((long)(((int)(t4917))));
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4919 =
                  ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4918));
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4920 =
                  t4919.
                    x;
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4921 =
                  ((x) - (((int)(1))));
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4922 =
                  ((int) t4920) ==
                ((int) t4921);
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4922) {
                    
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4923 =
                      i4936;
                    
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final long t4924 =
                      ((long)(((int)(t4923))));
                    
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4925 =
                      ((x10.util.ArrayList<Tile>)qRail).$apply$G((long)(t4924));
                    
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4926 =
                      t4925.
                        y;
                    
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4927 =
                      ((y) - (((int)(1))));
                    
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
t4922 = ((int) t4926) ==
                    ((int) t4927);
                }
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4928 =
                  t4922;
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
if (t4928) {
                    
//#line 127 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                }
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4929 =
                  i4936;
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final int t4930 =
                  ((t4929) + (((int)(1))));
                
//#line 100 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
i4936 = t4930;
            }
            
//#line 131 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4753 =
              out;
            
//#line 131 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4753;
        }
        
        
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
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
                
//#line 136 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
public Board board;
                
                
//#line 137 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
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
                                                                                                                     
//#line 137 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
;
                                                                                                                     
//#line 137 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"

                                                                                                                     
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.__fieldInitializers_Solver_Node();
                                                                                                                     
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4754 =
                                                                                                                       ((Board)(new Board((java.lang.System[]) null).Board$$init$S(((int)(size)),
                                                                                                                                                                                   ((x10.core.Rail)(pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(queens)), (Board.__1$1Tile$2__2$1Tile$2) null)));
                                                                                                                     
//#line 138 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
this.board = ((Board)(t4754));
                                                                                                                 }
                                                                                                                 return this;
                                                                                                                 }
                
                
                
//#line 141 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public boolean
                                                                                                            check$O(
                                                                                                            ){
                    
//#line 142 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4755 =
                      ((Board)(board));
                    
//#line 142 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4756 =
                      t4755.valid$O();
                    
//#line 142 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4756;
                }
                
                
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver.Node
                                                                                                            Solver$Node$$this$Solver$Node(
                                                                                                            ){
                    
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.Node.this;
                }
                
                
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                            Solver$Node$$this$Solver(
                                                                                                            ){
                    
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t4757 =
                      this.
                        out$;
                    
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
return t4757;
                }
                
                
//#line 135 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Solver.x10"
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

