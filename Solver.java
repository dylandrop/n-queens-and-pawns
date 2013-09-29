
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
            
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4542 =
              ((long)(((int)(size))));
            
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4543 =
              ((x10.core.Rail<Tile>)
                ((x10.util.ArrayList<Tile>)pawns).toRail());
            
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4541 =
              ((long)(((int)(size))));
            
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4544 =
              ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t4541)));
            
//#line 34 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.boardCombos__3$1Tile$2__4$1Tile$2((long)(t4542),
                                                                                                                                                        (int)(0),
                                                                                                                                                        (int)(size),
                                                                                                                                                        ((x10.core.Rail)(t4543)),
                                                                                                                                                        ((x10.core.Rail)(t4544)),
                                                                                                                                                        (int)(0));
            
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4545 =
              solutions;
            
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4546 =
              ((long)(((int)(t4545))));
            
//#line 35 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4546;
        }
        
        
//#line 38 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public void
                                                                                                               boardCombos__3$1Tile$2__4$1Tile$2(
                                                                                                               final long len,
                                                                                                               final int startPos,
                                                                                                               final int size,
                                                                                                               final x10.core.Rail pawns,
                                                                                                               final x10.core.Rail queens,
                                                                                                               final int occupied){
            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4547 =
              ((int) size) ==
            ((int) 0);
            
//#line 40 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4547) {
                
//#line 41 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4550 =
              ((long) len) ==
            ((long) 0L);
            
//#line 42 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4550) {
                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver x4538 =
                  ((Solver)(this));
                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
;
                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4548 =
                  x4538.
                    solutions;
                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4549 =
                  ((t4548) + (((int)(1))));
                
//#line 43 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x4538.solutions = t4549;
                
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return;
            }
            
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4785 =
              startPos;
            
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4786 =
                  i4785;
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4787 =
                  ((long)(((int)(t4786))));
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4788 =
                  ((x10.core.Rail)(arr));
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4789 =
                  ((x10.core.Rail<Tile>)t4788).
                    size;
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4790 =
                  ((t4789) - (((long)(len))));
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4791 =
                  ((t4787) <= (((long)(t4790))));
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4791)) {
                    
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                }
                
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail qTemp4754 =
                  this.cloneArray__0$1Tile$2(((x10.core.Rail)(queens)));
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4755 =
                  qTemp4754;
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4756 =
                  ((x10.core.Rail)(arr));
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4757 =
                  i4785;
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4758 =
                  ((long)(((int)(t4757))));
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4759 =
                  ((Tile[])t4756.value)[(int)t4758];
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4760 =
                  t4759.
                    x;
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4761 =
                  ((x10.core.Rail)(arr));
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4762 =
                  i4785;
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4763 =
                  ((long)(((int)(t4762))));
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4764 =
                  ((Tile[])t4761.value)[(int)t4763];
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4765 =
                  t4764.
                    y;
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4766 =
                  this.safe__0$1Tile$2__1$1Tile$2$O(((x10.core.Rail)(pawns)),
                                                    ((x10.core.Rail)(t4755)),
                                                    (int)(t4760),
                                                    (int)(t4765));
                
//#line 49 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4766) {
                    
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4767 =
                      qTemp4754;
                    
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4768 =
                      ((long)(((int)(occupied))));
                    
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4769 =
                      ((x10.core.Rail)(arr));
                    
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4770 =
                      i4785;
                    
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4771 =
                      ((long)(((int)(t4770))));
                    
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4772 =
                      ((Tile[])t4769.value)[(int)t4771];
                    
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t4767.value)[(int)t4768] = t4772;
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4773 =
                      qTemp4754;
                    
//#line 54 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver.Node n4774 =
                      new Solver.Node((java.lang.System[]) null).Solver$Node$$init$S(this,
                                                                                     ((x10.core.Rail)(pawns)),
                                                                                     t4773,
                                                                                     ((int)(size)), (Solver.Node.__1$1Tile$2__2$1Tile$2) null);
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4775 =
                      ((Board)(n4774.
                                 board));
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4776 =
                      t4775.valid$O();
                    
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4776) {
                        
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int oTemp4777 =
                          ((occupied) + (((int)(1))));
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4778 =
                          ((len) - (((long)(1L))));
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4779 =
                          i4785;
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4780 =
                          ((t4779) + (((int)(1))));
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4781 =
                          qTemp4754;
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4782 =
                          oTemp4777;
                        
//#line 60 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.boardCombos__3$1Tile$2__4$1Tile$2((long)(t4778),
                                                                                                                                                                    (int)(t4780),
                                                                                                                                                                    (int)(size),
                                                                                                                                                                    ((x10.core.Rail)(pawns)),
                                                                                                                                                                    ((x10.core.Rail)(t4781)),
                                                                                                                                                                    (int)(t4782));
                    }
                }
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4783 =
                  i4785;
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4784 =
                  ((t4783) + (((int)(1))));
                
//#line 46 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4785 = t4784;
            }
        }
        
        
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                               cloneArray__0$1Tile$2(
                                                                                                               final x10.core.Rail x){
            
//#line 70 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4586 =
              ((x10.core.Rail<Tile>)x).
                size;
            
//#line 70 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
x10.core.Rail out =
              new x10.core.Rail<Tile>(Tile.$RTT, ((long)(t4586)));
            
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
long i4798 =
              0L;
            {
                
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] x$value4947 =
                  ((Tile[])x.value);
                
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4799 =
                      i4798;
                    
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4800 =
                      ((x10.core.Rail<Tile>)x).
                        size;
                    
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4801 =
                      ((t4799) < (((long)(t4800))));
                    
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4801)) {
                        
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4792 =
                      out;
                    
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4793 =
                      i4798;
                    
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4794 =
                      i4798;
                    
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4795 =
                      ((Tile)x$value4947[(int)t4794]);
                    
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
((Tile[])t4792.value)[(int)t4793] = t4795;
                    
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4796 =
                      i4798;
                    
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4797 =
                      ((t4796) + (((long)(1L))));
                    
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4798 = t4797;
                }
            }
            
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4597 =
              out;
            
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4597;
        }
        
        
//#line 78 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public boolean
                                                                                                               safe__0$1Tile$2__1$1Tile$2$O(
                                                                                                               final x10.core.Rail pawns,
                                                                                                               final x10.core.Rail qRail,
                                                                                                               final int x,
                                                                                                               final int y){
            
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean out =
              true;
            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4598 =
              ((x10.core.Rail<Tile>)pawns).
                size;
            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4599 =
              ((long) t4598) ==
            ((long) 0L);
            
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4599) {
                
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
            }
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4600 =
              ((x10.core.Rail<Tile>)qRail).
                size;
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4601 =
              ((long) t4600) ==
            ((long) 0L);
            
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4601) {
                
//#line 84 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
            }
            
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4919 =
              0;
            {
                
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] pawns$value4948 =
                  ((Tile[])pawns.value);
                
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4920 =
                      i4919;
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4921 =
                      ((long)(((int)(t4920))));
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4922 =
                      ((x10.core.Rail<Tile>)pawns).
                        size;
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4923 =
                      ((t4921) < (((long)(t4922))));
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4923)) {
                        
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4802 =
                      i4919;
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4803 =
                      ((long)(((int)(t4802))));
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4804 =
                      ((Tile)pawns$value4948[(int)t4803]);
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4805 =
                      t4804.
                        x;
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4806 =
                      ((int) t4805) ==
                    ((int) x);
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4806) {
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4807 =
                          i4919;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4808 =
                          ((long)(((int)(t4807))));
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4809 =
                          ((Tile)pawns$value4948[(int)t4808]);
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4810 =
                          t4809.
                            y;
                        
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4806 = ((int) t4810) ==
                        ((int) y);
                    }
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4811 =
                      t4806;
                    
//#line 87 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4811) {
                        
//#line 88 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                    }
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4812 =
                      i4919;
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4813 =
                      ((t4812) + (((int)(1))));
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4919 = t4813;
                }
            }
            
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4924 =
              0;
            {
                
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] qRail$value4949 =
                  ((Tile[])qRail.value);
                
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4925 =
                      i4924;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4926 =
                      ((long)(((int)(t4925))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4927 =
                      ((x10.core.Rail<Tile>)qRail).
                        size;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4928 =
                      ((t4926) < (((long)(t4927))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4928)) {
                        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
try {{
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4814 =
                          i4924;
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4815 =
                          ((long)(((int)(t4814))));
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4816 =
                          ((Tile)qRail$value4949[(int)t4815]);
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4817 =
                          t4816.
                            x;
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4818 =
                          ((int) t4817) ==
                        ((int) x);
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4818) {
                            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4819 =
                              i4924;
                            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4820 =
                              ((long)(((int)(t4819))));
                            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4821 =
                              ((Tile)qRail$value4949[(int)t4820]);
                            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4822 =
                              t4821.
                                y;
                            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4818 = ((int) t4822) ==
                            ((int) y);
                        }
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4823 =
                          t4818;
                        
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4823) {
                            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4824 =
                          i4924;
                        
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4825 =
                          ((long)(((int)(t4824))));
                        
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4826 =
                          ((Tile)qRail$value4949[(int)t4825]);
                        
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4827 =
                          t4826.
                            x;
                        
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4828 =
                          ((int) t4827) ==
                        ((int) x);
                        
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4828) {
                            
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4829 =
                              i4924;
                            
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4830 =
                              ((long)(((int)(t4829))));
                            
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4831 =
                              ((Tile)qRail$value4949[(int)t4830]);
                            
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4832 =
                              t4831.
                                y;
                            
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4833 =
                              ((y) - (((int)(1))));
                            
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4828 = ((int) t4832) ==
                            ((int) t4833);
                        }
                        
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4834 =
                          t4828;
                        
//#line 97 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4834) {
                            
//#line 98 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4835 =
                          i4924;
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4836 =
                          ((long)(((int)(t4835))));
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4837 =
                          ((Tile)qRail$value4949[(int)t4836]);
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4838 =
                          t4837.
                            x;
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4839 =
                          ((int) t4838) ==
                        ((int) x);
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4839) {
                            
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4840 =
                              i4924;
                            
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4841 =
                              ((long)(((int)(t4840))));
                            
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4842 =
                              ((Tile)qRail$value4949[(int)t4841]);
                            
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4843 =
                              t4842.
                                y;
                            
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4844 =
                              ((y) + (((int)(1))));
                            
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4839 = ((int) t4843) ==
                            ((int) t4844);
                        }
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4845 =
                          t4839;
                        
//#line 100 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4845) {
                            
//#line 101 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4846 =
                          i4924;
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4847 =
                          ((long)(((int)(t4846))));
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4848 =
                          ((Tile)qRail$value4949[(int)t4847]);
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4849 =
                          t4848.
                            x;
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4850 =
                          ((x) - (((int)(1))));
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4851 =
                          ((int) t4849) ==
                        ((int) t4850);
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4851) {
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4852 =
                              i4924;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4853 =
                              ((long)(((int)(t4852))));
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4854 =
                              ((Tile)qRail$value4949[(int)t4853]);
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4855 =
                              t4854.
                                y;
                            
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4851 = ((int) t4855) ==
                            ((int) y);
                        }
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4856 =
                          t4851;
                        
//#line 103 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4856) {
                            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4857 =
                          i4924;
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4858 =
                          ((long)(((int)(t4857))));
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4859 =
                          ((Tile)qRail$value4949[(int)t4858]);
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4860 =
                          t4859.
                            x;
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4861 =
                          ((x) + (((int)(1))));
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4862 =
                          ((int) t4860) ==
                        ((int) t4861);
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4862) {
                            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4863 =
                              i4924;
                            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4864 =
                              ((long)(((int)(t4863))));
                            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4865 =
                              ((Tile)qRail$value4949[(int)t4864]);
                            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4866 =
                              t4865.
                                y;
                            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4862 = ((int) t4866) ==
                            ((int) y);
                        }
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4867 =
                          t4862;
                        
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4867) {
                            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4868 =
                          i4924;
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4869 =
                          ((long)(((int)(t4868))));
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4870 =
                          ((Tile)qRail$value4949[(int)t4869]);
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4871 =
                          t4870.
                            x;
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4872 =
                          ((x) + (((int)(1))));
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4873 =
                          ((int) t4871) ==
                        ((int) t4872);
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4873) {
                            
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4874 =
                              i4924;
                            
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4875 =
                              ((long)(((int)(t4874))));
                            
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4876 =
                              ((Tile)qRail$value4949[(int)t4875]);
                            
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4877 =
                              t4876.
                                y;
                            
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4878 =
                              ((y) + (((int)(1))));
                            
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4873 = ((int) t4877) ==
                            ((int) t4878);
                        }
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4879 =
                          t4873;
                        
//#line 109 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4879) {
                            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4880 =
                          i4924;
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4881 =
                          ((long)(((int)(t4880))));
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4882 =
                          ((Tile)qRail$value4949[(int)t4881]);
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4883 =
                          t4882.
                            x;
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4884 =
                          ((x) - (((int)(1))));
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4885 =
                          ((int) t4883) ==
                        ((int) t4884);
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4885) {
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4886 =
                              i4924;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4887 =
                              ((long)(((int)(t4886))));
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4888 =
                              ((Tile)qRail$value4949[(int)t4887]);
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4889 =
                              t4888.
                                y;
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4890 =
                              ((y) + (((int)(1))));
                            
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4885 = ((int) t4889) ==
                            ((int) t4890);
                        }
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4891 =
                          t4885;
                        
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4891) {
                            
//#line 113 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4892 =
                          i4924;
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4893 =
                          ((long)(((int)(t4892))));
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4894 =
                          ((Tile)qRail$value4949[(int)t4893]);
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4895 =
                          t4894.
                            x;
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4896 =
                          ((x) + (((int)(1))));
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4897 =
                          ((int) t4895) ==
                        ((int) t4896);
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4897) {
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4898 =
                              i4924;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4899 =
                              ((long)(((int)(t4898))));
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4900 =
                              ((Tile)qRail$value4949[(int)t4899]);
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4901 =
                              t4900.
                                y;
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4902 =
                              ((y) - (((int)(1))));
                            
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4897 = ((int) t4901) ==
                            ((int) t4902);
                        }
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4903 =
                          t4897;
                        
//#line 115 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4903) {
                            
//#line 116 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4904 =
                          i4924;
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4905 =
                          ((long)(((int)(t4904))));
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4906 =
                          ((Tile)qRail$value4949[(int)t4905]);
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4907 =
                          t4906.
                            x;
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4908 =
                          ((x) - (((int)(1))));
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
boolean t4909 =
                          ((int) t4907) ==
                        ((int) t4908);
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4909) {
                            
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4910 =
                              i4924;
                            
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4911 =
                              ((long)(((int)(t4910))));
                            
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4912 =
                              ((Tile)qRail$value4949[(int)t4911]);
                            
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4913 =
                              t4912.
                                y;
                            
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4914 =
                              ((y) - (((int)(1))));
                            
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t4909 = ((int) t4913) ==
                            ((int) t4914);
                        }
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4915 =
                          t4909;
                        
//#line 118 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4915) {
                            
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return false;
                        }
                    }}catch (final java.lang.NullPointerException id$4916) {
                        
//#line 124 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return true;
                    }
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4917 =
                      i4924;
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4918 =
                      ((t4917) + (((int)(1))));
                    
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4924 = t4918;
                }
            }
            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4728 =
              out;
            
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4728;
        }
        
        
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public x10.core.Rail
                                                                                                                queensForBoard(
                                                                                                                final int ofSize){
            
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4731 =
              ((int) ofSize) ==
            ((int) 0);
            
//#line 131 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (t4731) {
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4729 =
                  ((long)(((int)(0))));
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail t4730 =
                  ((x10.core.Rail)(new x10.core.Rail<Tile>(Tile.$RTT, t4729)));
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4730;
            }
            
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4732 =
              ((ofSize) * (((int)(ofSize))));
            
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4733 =
              ((long)(((int)(t4732))));
            
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final x10.core.Rail queens =
              new x10.core.Rail<Tile>(Tile.$RTT, t4733);
            
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int i4943 =
              1;
            {
                
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile[] queens$value4950 =
                  ((Tile[])queens.value);
                
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4944 =
                      i4943;
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4945 =
                      ((ofSize) * (((int)(ofSize))));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4946 =
                      ((t4944) <= (((int)(t4945))));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
if (!(t4946)) {
                        
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
break;
                    }
                    
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4929 =
                      i4943;
                    
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4930 =
                      ((t4929) - (((int)(1))));
                    
//#line 136 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int x4931 =
                      ((t4930) % (((int)(ofSize))));
                    
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4932 =
                      i4943;
                    
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4933 =
                      ((t4932) - (((int)(1))));
                    
//#line 137 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
int y4934 =
                      ((t4933) / (((int)(ofSize))));
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4935 =
                      i4943;
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4936 =
                      ((long)(((int)(t4935))));
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final long t4937 =
                      ((t4936) - (((long)(1L))));
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4938 =
                      x4931;
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4939 =
                      y4934;
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Tile t4940 =
                      new Tile((java.lang.System[]) null).Tile$$init$S(t4938,
                                                                       t4939,
                                                                       ((int)(2)));
                    
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
queens$value4950[(int)t4937]=t4940;
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4941 =
                      i4943;
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final int t4942 =
                      ((t4941) + (((int)(1))));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
i4943 = t4942;
                }
            }
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return queens;
        }
        
        
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
                
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
public Board board;
                
                
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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
                                                                                                                     
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
;
                                                                                                                     
//#line 146 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"

                                                                                                                     
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.__fieldInitializers_Solver_Node();
                                                                                                                     
//#line 147 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4750 =
                                                                                                                       ((Board)(new Board((java.lang.System[]) null).Board$$init$S(((int)(size)),
                                                                                                                                                                                   ((x10.core.Rail)(pawns)),
                                                                                                                                                                                   ((x10.core.Rail)(queens)), (Board.__1$1Tile$2__2$1Tile$2) null)));
                                                                                                                     
//#line 147 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
this.board = ((Board)(t4750));
                                                                                                                 }
                                                                                                                 return this;
                                                                                                                 }
                
                
                
//#line 150 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public boolean
                                                                                                                        check$O(
                                                                                                                        ){
                    
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Board t4751 =
                      ((Board)(board));
                    
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final boolean t4752 =
                      t4751.valid$O();
                    
//#line 151 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4752;
                }
                
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver.Node
                                                                                                                        Solver$Node$$this$Solver$Node(
                                                                                                                        ){
                    
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return Solver.Node.this;
                }
                
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final public Solver
                                                                                                                        Solver$Node$$this$Solver(
                                                                                                                        ){
                    
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t4753 =
                      this.
                        out$;
                    
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
return t4753;
                }
                
                
//#line 144 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
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

