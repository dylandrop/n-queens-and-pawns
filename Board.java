
@x10.runtime.impl.java.X10Generated public class Board extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Board> $RTT = x10.rtt.NamedType.<Board> make(
    "Board", Board.class
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Board $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Board.class + " calling"); } 
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
    
        
//#line 9 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public x10.array.Array_2<x10.core.Int> board;
        
//#line 10 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public int size;
        
//#line 11 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public x10.core.Rail<Tile> pawns;
        
//#line 12 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public x10.core.Rail<Tile> queens;
        
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public int OPEN;
        
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public int QUEEN;
        
//#line 13 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public int PAWN;
        
        
//#line 15 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
// creation method for java code (1-phase java constructor)
        public Board(final int size,
                     final x10.core.Rail<Tile> pawns,
                     final x10.core.Rail<Tile> queens, __1$1Tile$2__2$1Tile$2 $dummy){this((java.lang.System[]) null);
                                                                                          Board$$init$S(size,pawns,queens, (Board.__1$1Tile$2__2$1Tile$2) null);}
        
        // constructor for non-virtual call
        final public Board Board$$init$S(final int size,
                                         final x10.core.Rail<Tile> pawns,
                                         final x10.core.Rail<Tile> queens, __1$1Tile$2__2$1Tile$2 $dummy) { {
                                                                                                                   
//#line 15 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
;
                                                                                                                   
//#line 15 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"

                                                                                                                   
//#line 8 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.__fieldInitializers_Board();
                                                                                                                   
//#line 16 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.size = size;
                                                                                                                   
//#line 16 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.pawns = ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 16 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.queens = ((x10.core.Rail)(queens));
                                                                                                                   
//#line 17 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int max =
                                                                                                                     size;
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3380 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3381 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3382 =
                                                                                                                     ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array_2$$init$S(t3380,
                                                                                                                                                                                                                                                      t3381)));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.board = ((x10.array.Array_2)(t3382));
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3690 =
                                                                                                                     ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3691 =
                                                                                                                     ((x10.core.Rail<Tile>)rail3690).
                                                                                                                       size;
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3680 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3690$value3976 =
                                                                                                                         ((Tile[])rail3690.value);
                                                                                                                       
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                    true;
                                                                                                                                                                                                                    ) {
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3681 =
                                                                                                                             idx3680;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3682 =
                                                                                                                             ((t3681) < (((long)(size3691))));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3682)) {
                                                                                                                               
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3676 =
                                                                                                                             idx3680;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile pawn3677 =
                                                                                                                             ((Tile)(((Tile)rail3690$value3976[(int)t3676])));
                                                                                                                           
//#line 20 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(pawn3677)));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3678 =
                                                                                                                             idx3680;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3679 =
                                                                                                                             ((t3678) + (((long)(1L))));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3680 = t3679;
                                                                                                                       }
                                                                                                                   }
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3692 =
                                                                                                                     ((x10.core.Rail)(queens));
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3693 =
                                                                                                                     ((x10.core.Rail<Tile>)rail3692).
                                                                                                                       size;
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3687 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3692$value3977 =
                                                                                                                         ((Tile[])rail3692.value);
                                                                                                                       
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                    true;
                                                                                                                                                                                                                    ) {
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3688 =
                                                                                                                             idx3687;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3689 =
                                                                                                                             ((t3688) < (((long)(size3693))));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3689)) {
                                                                                                                               
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3683 =
                                                                                                                             idx3687;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3684 =
                                                                                                                             ((Tile)(((Tile)rail3692$value3977[(int)t3683])));
                                                                                                                           
//#line 23 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(queen3684)));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3685 =
                                                                                                                             idx3687;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3686 =
                                                                                                                             ((t3685) + (((long)(1L))));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3687 = t3686;
                                                                                                                       }
                                                                                                                   }
                                                                                                               }
                                                                                                               return this;
                                                                                                               }
        
        
        
//#line 27 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                  validHoriz$O(
                                                                                                  ){
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3750 =
              ((x10.core.Rail)(queens));
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3751 =
              ((x10.core.Rail<Tile>)rail3750).
                size;
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3747 =
              0L;
            {
                
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3750$value3978 =
                  ((Tile[])rail3750.value);
                
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3748 =
                      idx3747;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3749 =
                      ((t3748) < (((long)(size3751))));
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3749)) {
                        
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3743 =
                      idx3747;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3744 =
                      ((Tile)(((Tile)rail3750$value3978[(int)t3743])));
                    
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int xPos3720 =
                      queen3744.
                        x;
                    
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3721 =
                          xPos3720;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3722 =
                          size;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3723 =
                          ((t3721) < (((int)(t3722))));
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3723) {
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3724 =
                              ((x10.array.Array_2)(board));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3725 =
                              xPos3720;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3726 =
                              ((long)(((int)(t3725))));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3727 =
                              queen3744.
                                y;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3728 =
                              ((long)(((int)(t3727))));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3729 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3724).$apply$G((long)(t3726),
                                                                                                    (long)(t3728)));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3730 =
                              PAWN;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3723 = ((int) t3729) !=
                            ((int) t3730);
                        }
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3731 =
                          t3723;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3731)) {
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3694 =
                          xPos3720;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3695 =
                          queen3744.
                            x;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3696 =
                          ((int) t3694) !=
                        ((int) t3695);
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3696) {
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3697 =
                              ((x10.array.Array_2)(board));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3698 =
                              xPos3720;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3699 =
                              ((long)(((int)(t3698))));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3700 =
                              queen3744.
                                y;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3701 =
                              ((long)(((int)(t3700))));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3702 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3697).$apply$G((long)(t3699),
                                                                                                    (long)(t3701)));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3703 =
                              QUEEN;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3696 = ((int) t3702) ==
                            ((int) t3703);
                        }
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3704 =
                          t3696;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3704) {
                            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3705 =
                          xPos3720;
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3706 =
                          ((t3705) + (((int)(1))));
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3720 = t3706;
                    }
                    
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3732 =
                      queen3744.
                        x;
                    
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3720 = t3732;
                    
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3733 =
                          xPos3720;
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3734 =
                          ((t3733) >= (((int)(0))));
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3734) {
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3735 =
                              ((x10.array.Array_2)(board));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3736 =
                              xPos3720;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3737 =
                              ((long)(((int)(t3736))));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3738 =
                              queen3744.
                                y;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3739 =
                              ((long)(((int)(t3738))));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3740 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3735).$apply$G((long)(t3737),
                                                                                                    (long)(t3739)));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3741 =
                              PAWN;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3734 = ((int) t3740) !=
                            ((int) t3741);
                        }
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3742 =
                          t3734;
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3742)) {
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3707 =
                          xPos3720;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3708 =
                          queen3744.
                            x;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3709 =
                          ((int) t3707) !=
                        ((int) t3708);
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3709) {
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3710 =
                              ((x10.array.Array_2)(board));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3711 =
                              xPos3720;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3712 =
                              ((long)(((int)(t3711))));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3713 =
                              queen3744.
                                y;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3714 =
                              ((long)(((int)(t3713))));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3715 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3710).$apply$G((long)(t3712),
                                                                                                    (long)(t3714)));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3716 =
                              QUEEN;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3709 = ((int) t3715) ==
                            ((int) t3716);
                        }
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3717 =
                          t3709;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3717) {
                            
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3718 =
                          xPos3720;
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3719 =
                          ((t3718) - (((int)(1))));
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3720 = t3719;
                    }
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3745 =
                      idx3747;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3746 =
                      ((t3745) + (((long)(1L))));
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3747 = t3746;
                }
            }
            
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validHoriz$P$O(
          final Board Board){
            return Board.validHoriz$O();
        }
        
        
//#line 47 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                  validVert$O(
                                                                                                  ){
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3808 =
              ((x10.core.Rail)(queens));
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3809 =
              ((x10.core.Rail<Tile>)rail3808).
                size;
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3805 =
              0L;
            {
                
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3808$value3979 =
                  ((Tile[])rail3808.value);
                
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3806 =
                      idx3805;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3807 =
                      ((t3806) < (((long)(size3809))));
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3807)) {
                        
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3801 =
                      idx3805;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3802 =
                      ((Tile)(((Tile)rail3808$value3979[(int)t3801])));
                    
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int yPos3778 =
                      queen3802.
                        y;
                    
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3779 =
                          yPos3778;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3780 =
                          size;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3781 =
                          ((t3779) < (((int)(t3780))));
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3781) {
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3782 =
                              ((x10.array.Array_2)(board));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3783 =
                              queen3802.
                                x;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3784 =
                              ((long)(((int)(t3783))));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3785 =
                              yPos3778;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3786 =
                              ((long)(((int)(t3785))));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3787 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3782).$apply$G((long)(t3784),
                                                                                                    (long)(t3786)));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3788 =
                              PAWN;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3781 = ((int) t3787) !=
                            ((int) t3788);
                        }
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3789 =
                          t3781;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3789)) {
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3752 =
                          yPos3778;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3753 =
                          queen3802.
                            y;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3754 =
                          ((int) t3752) !=
                        ((int) t3753);
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3754) {
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3755 =
                              ((x10.array.Array_2)(board));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3756 =
                              queen3802.
                                x;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3757 =
                              ((long)(((int)(t3756))));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3758 =
                              yPos3778;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3759 =
                              ((long)(((int)(t3758))));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3760 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3755).$apply$G((long)(t3757),
                                                                                                    (long)(t3759)));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3761 =
                              QUEEN;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3754 = ((int) t3760) ==
                            ((int) t3761);
                        }
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3762 =
                          t3754;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3762) {
                            
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3763 =
                          yPos3778;
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3764 =
                          ((t3763) + (((int)(1))));
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3778 = t3764;
                    }
                    
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3790 =
                      queen3802.
                        y;
                    
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3778 = t3790;
                    
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3791 =
                          yPos3778;
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3792 =
                          ((t3791) >= (((int)(0))));
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3792) {
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3793 =
                              ((x10.array.Array_2)(board));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3794 =
                              queen3802.
                                x;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3795 =
                              ((long)(((int)(t3794))));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3796 =
                              yPos3778;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3797 =
                              ((long)(((int)(t3796))));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3798 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3793).$apply$G((long)(t3795),
                                                                                                    (long)(t3797)));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3799 =
                              PAWN;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3792 = ((int) t3798) !=
                            ((int) t3799);
                        }
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3800 =
                          t3792;
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3800)) {
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3765 =
                          yPos3778;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3766 =
                          queen3802.
                            y;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3767 =
                          ((int) t3765) !=
                        ((int) t3766);
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3767) {
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3768 =
                              ((x10.array.Array_2)(board));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3769 =
                              queen3802.
                                x;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3770 =
                              ((long)(((int)(t3769))));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3771 =
                              yPos3778;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3772 =
                              ((long)(((int)(t3771))));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3773 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3768).$apply$G((long)(t3770),
                                                                                                    (long)(t3772)));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3774 =
                              QUEEN;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3767 = ((int) t3773) ==
                            ((int) t3774);
                        }
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3775 =
                          t3767;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3775) {
                            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3776 =
                          yPos3778;
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3777 =
                          ((t3776) - (((int)(1))));
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3778 = t3777;
                    }
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3803 =
                      idx3805;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3804 =
                      ((t3803) + (((long)(1L))));
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3805 = t3804;
                }
            }
            
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validVert$P$O(
          final Board Board){
            return Board.validVert$O();
        }
        
        
//#line 67 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
private boolean
                                                                                                  validDiag$O(
                                                                                                  ){
            
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3949 =
              ((x10.core.Rail)(queens));
            
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3950 =
              ((x10.core.Rail<Tile>)rail3949).
                size;
            
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3946 =
              0L;
            {
                
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3949$value3980 =
                  ((Tile[])rail3949.value);
                
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3947 =
                      idx3946;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3948 =
                      ((t3947) < (((long)(size3950))));
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3948)) {
                        
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3942 =
                      idx3946;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3943 =
                      ((Tile)(((Tile)rail3949$value3980[(int)t3942])));
                    
//#line 69 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int yPos3882 =
                      queen3943.
                        y;
                    
//#line 70 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int xPos3883 =
                      queen3943.
                        x;
                    
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3884 =
                          xPos3883;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3885 =
                          size;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3886 =
                          ((t3884) < (((int)(t3885))));
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3886) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3887 =
                              yPos3882;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3888 =
                              size;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3886 = ((t3887) < (((int)(t3888))));
                        }
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3889 =
                          t3886;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3889) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3890 =
                              ((x10.array.Array_2)(board));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3891 =
                              xPos3883;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3892 =
                              ((long)(((int)(t3891))));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3893 =
                              yPos3882;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3894 =
                              ((long)(((int)(t3893))));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3895 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3890).$apply$G((long)(t3892),
                                                                                                    (long)(t3894)));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3896 =
                              PAWN;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3889 = ((int) t3895) !=
                            ((int) t3896);
                        }
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3897 =
                          t3889;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3897)) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3810 =
                          xPos3883;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3811 =
                          queen3943.
                            x;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3812 =
                          ((int) t3810) !=
                        ((int) t3811);
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3812) {
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3813 =
                              yPos3882;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3814 =
                              queen3943.
                                y;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3812 = ((int) t3813) !=
                            ((int) t3814);
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3815 =
                          t3812;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3815) {
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3816 =
                              ((x10.array.Array_2)(board));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3817 =
                              xPos3883;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3818 =
                              ((long)(((int)(t3817))));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3819 =
                              yPos3882;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3820 =
                              ((long)(((int)(t3819))));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3821 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3816).$apply$G((long)(t3818),
                                                                                                    (long)(t3820)));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3822 =
                              QUEEN;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3815 = ((int) t3821) ==
                            ((int) t3822);
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3823 =
                          t3815;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3823) {
                            
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3824 =
                          xPos3883;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3825 =
                          ((t3824) + (((int)(1))));
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3883 = t3825;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3826 =
                          yPos3882;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3827 =
                          ((t3826) + (((int)(1))));
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3882 = t3827;
                    }
                    
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3898 =
                      queen3943.
                        y;
                    
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3882 = t3898;
                    
//#line 78 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3899 =
                      queen3943.
                        x;
                    
//#line 78 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3883 = t3899;
                    
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3900 =
                          xPos3883;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3901 =
                          ((t3900) >= (((int)(0))));
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3901) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3902 =
                              yPos3882;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3901 = ((t3902) >= (((int)(0))));
                        }
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3903 =
                          t3901;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3903) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3904 =
                              ((x10.array.Array_2)(board));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3905 =
                              xPos3883;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3906 =
                              ((long)(((int)(t3905))));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3907 =
                              yPos3882;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3908 =
                              ((long)(((int)(t3907))));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3909 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3904).$apply$G((long)(t3906),
                                                                                                    (long)(t3908)));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3910 =
                              PAWN;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3903 = ((int) t3909) !=
                            ((int) t3910);
                        }
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3911 =
                          t3903;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3911)) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3828 =
                          xPos3883;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3829 =
                          queen3943.
                            x;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3830 =
                          ((int) t3828) !=
                        ((int) t3829);
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3830) {
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3831 =
                              yPos3882;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3832 =
                              queen3943.
                                y;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3830 = ((int) t3831) !=
                            ((int) t3832);
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3833 =
                          t3830;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3833) {
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3834 =
                              ((x10.array.Array_2)(board));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3835 =
                              xPos3883;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3836 =
                              ((long)(((int)(t3835))));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3837 =
                              yPos3882;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3838 =
                              ((long)(((int)(t3837))));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3839 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3834).$apply$G((long)(t3836),
                                                                                                    (long)(t3838)));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3840 =
                              QUEEN;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3833 = ((int) t3839) ==
                            ((int) t3840);
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3841 =
                          t3833;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3841) {
                            
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3842 =
                          xPos3883;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3843 =
                          ((t3842) - (((int)(1))));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3883 = t3843;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3844 =
                          yPos3882;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3845 =
                          ((t3844) - (((int)(1))));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3882 = t3845;
                    }
                    
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3912 =
                      queen3943.
                        y;
                    
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3882 = t3912;
                    
//#line 86 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3913 =
                      queen3943.
                        x;
                    
//#line 86 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3883 = t3913;
                    
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3914 =
                          xPos3883;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3915 =
                          size;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3916 =
                          ((t3914) < (((int)(t3915))));
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3916) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3917 =
                              yPos3882;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3916 = ((t3917) >= (((int)(0))));
                        }
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3918 =
                          t3916;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3918) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3919 =
                              ((x10.array.Array_2)(board));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3920 =
                              xPos3883;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3921 =
                              ((long)(((int)(t3920))));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3922 =
                              yPos3882;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3923 =
                              ((long)(((int)(t3922))));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3924 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3919).$apply$G((long)(t3921),
                                                                                                    (long)(t3923)));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3925 =
                              PAWN;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3918 = ((int) t3924) !=
                            ((int) t3925);
                        }
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3926 =
                          t3918;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3926)) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3846 =
                          xPos3883;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3847 =
                          queen3943.
                            x;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3848 =
                          ((int) t3846) !=
                        ((int) t3847);
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3848) {
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3849 =
                              yPos3882;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3850 =
                              queen3943.
                                y;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3848 = ((int) t3849) !=
                            ((int) t3850);
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3851 =
                          t3848;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3851) {
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3852 =
                              ((x10.array.Array_2)(board));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3853 =
                              xPos3883;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3854 =
                              ((long)(((int)(t3853))));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3855 =
                              yPos3882;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3856 =
                              ((long)(((int)(t3855))));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3857 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3852).$apply$G((long)(t3854),
                                                                                                    (long)(t3856)));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3858 =
                              QUEEN;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3851 = ((int) t3857) ==
                            ((int) t3858);
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3859 =
                          t3851;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3859) {
                            
//#line 89 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3860 =
                          xPos3883;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3861 =
                          ((t3860) + (((int)(1))));
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3883 = t3861;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3862 =
                          yPos3882;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3863 =
                          ((t3862) - (((int)(1))));
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3882 = t3863;
                    }
                    
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3927 =
                      queen3943.
                        y;
                    
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3882 = t3927;
                    
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3928 =
                      queen3943.
                        x;
                    
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3883 = t3928;
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3929 =
                          xPos3883;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3930 =
                          ((t3929) >= (((int)(0))));
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3930) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3931 =
                              yPos3882;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3932 =
                              size;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3930 = ((t3931) < (((int)(t3932))));
                        }
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3933 =
                          t3930;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3933) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3934 =
                              ((x10.array.Array_2)(board));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3935 =
                              xPos3883;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3936 =
                              ((long)(((int)(t3935))));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3937 =
                              yPos3882;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3938 =
                              ((long)(((int)(t3937))));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3939 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3934).$apply$G((long)(t3936),
                                                                                                    (long)(t3938)));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3940 =
                              PAWN;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3933 = ((int) t3939) !=
                            ((int) t3940);
                        }
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3941 =
                          t3933;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3941)) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3864 =
                          xPos3883;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3865 =
                          queen3943.
                            x;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3866 =
                          ((int) t3864) !=
                        ((int) t3865);
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3866) {
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3867 =
                              yPos3882;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3868 =
                              queen3943.
                                y;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3866 = ((int) t3867) !=
                            ((int) t3868);
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3869 =
                          t3866;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3869) {
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3870 =
                              ((x10.array.Array_2)(board));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3871 =
                              xPos3883;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3872 =
                              ((long)(((int)(t3871))));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3873 =
                              yPos3882;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3874 =
                              ((long)(((int)(t3873))));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3875 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3870).$apply$G((long)(t3872),
                                                                                                    (long)(t3874)));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3876 =
                              QUEEN;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3869 = ((int) t3875) ==
                            ((int) t3876);
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3877 =
                          t3869;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3877) {
                            
//#line 97 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3878 =
                          xPos3883;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3879 =
                          ((t3878) - (((int)(1))));
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3883 = t3879;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3880 =
                          yPos3882;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3881 =
                          ((t3880) + (((int)(1))));
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3882 = t3881;
                    }
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3944 =
                      idx3946;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3945 =
                      ((t3944) + (((long)(1L))));
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3946 = t3945;
                }
            }
            
//#line 102 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return true;
        }
        
        public static boolean
          validDiag$P$O(
          final Board Board){
            return Board.validDiag$O();
        }
        
        
//#line 105 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public boolean
                                                                                                   valid$O(
                                                                                                   ){
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3639 =
              this.validDiag$O();
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3639) {
                
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3639 = this.validVert$O();
            }
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3640 =
              t3639;
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3640) {
                
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3640 = this.validHoriz$O();
            }
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3641 =
              t3640;
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return t3641;
        }
        
        
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public void
                                                                                                   print(
                                                                                                   ){
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3365min3973 =
              0;
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3974 =
              size;
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3365max3975 =
              ((t3974) - (((int)(1))));
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int i3970 =
              i3365min3973;
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3971 =
                  i3970;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3972 =
                  ((t3971) <= (((int)(i3365max3975))));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3972)) {
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                }
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int y3967 =
                  i3970;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3349min3963 =
                  0;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3964 =
                  size;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3349max3965 =
                  ((t3964) - (((int)(1))));
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int i3960 =
                  i3349min3963;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3961 =
                      i3960;
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3962 =
                      ((t3961) <= (((int)(i3349max3965))));
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3962)) {
                        
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int x3957 =
                      i3960;
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3951 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3952 =
                      ((x10.array.Array_2)(board));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3953 =
                      ((long)(((int)(x3957))));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3954 =
                      ((long)(((int)(y3967))));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3955 =
                      x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3952).$apply$G((long)(t3953),
                                                                                            (long)(t3954)));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.String t3956 =
                      (("|") + ((x10.core.Int.$box(t3955))));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3951.print(((java.lang.String)(t3956)));
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3958 =
                      i3960;
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3959 =
                      ((t3958) + (((int)(1))));
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
i3960 = t3959;
                }
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3966 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3966.print(((java.lang.String)("|\n")));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3968 =
                  i3970;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3969 =
                  ((t3968) + (((int)(1))));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
i3970 = t3969;
            }
            
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3661 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 116 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3661.print(((java.lang.String)("\n")));
        }
        
        
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
private void
                                                                                                   place(
                                                                                                   final Tile someTile){
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3664 =
              ((x10.array.Array_2)(board));
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3662 =
              someTile.
                x;
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3665 =
              ((long)(((int)(t3662))));
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3663 =
              someTile.
                y;
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3666 =
              ((long)(((int)(t3663))));
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int occupation =
              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3664).$apply$G((long)(t3665),
                                                                                    (long)(t3666)));
            
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3667 =
              ((int) occupation) ==
            ((int) 2);
            
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3667)) {
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3667 = ((int) occupation) ==
                ((int) 3);
            }
            
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3669 =
              t3667;
            
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3669) {
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.RuntimeException t3668 =
                  ((java.lang.RuntimeException)(new java.lang.RuntimeException("Placing on a wrong place!")));
                
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
throw t3668;
            }
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3672 =
              ((x10.array.Array_2)(board));
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3670 =
              someTile.
                x;
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3673 =
              ((long)(((int)(t3670))));
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3671 =
              someTile.
                y;
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3674 =
              ((long)(((int)(t3671))));
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3675 =
              someTile.
                tileType;
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
((x10.array.Array_2<x10.core.Int>)t3672).$set__2x10$array$Array_2$$T$G((long)(t3673),
                                                                                                                                                                            (long)(t3674),
                                                                                                                                                                            x10.core.Int.$box(t3675));
        }
        
        public static void
          place$P(
          final Tile someTile,
          final Board Board){
            Board.place(((Tile)(someTile)));
        }
        
        
//#line 8 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final public Board
                                                                                                 Board$$this$Board(
                                                                                                 ){
            
//#line 8 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return Board.this;
        }
        
        
//#line 8 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final public void
                                                                                                 __fieldInitializers_Board(
                                                                                                 ){
            
//#line 8 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.OPEN = 1;
            
//#line 8 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.QUEEN = 2;
            
//#line 8 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.PAWN = 3;
        }
    // synthetic type for parameter mangling
    public static final class __1$1Tile$2__2$1Tile$2 {}
    
}

