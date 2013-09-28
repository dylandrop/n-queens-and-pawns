
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
final long t3368 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3369 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3370 =
                                                                                                                     ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array_2$$init$S(t3368,
                                                                                                                                                                                                                                                      t3369)));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.board = ((x10.array.Array_2)(t3370));
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3684 =
                                                                                                                     ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3685 =
                                                                                                                     ((x10.core.Rail<Tile>)rail3684).
                                                                                                                       size;
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3674 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3684$value3970 =
                                                                                                                         ((Tile[])rail3684.value);
                                                                                                                       
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                    true;
                                                                                                                                                                                                                    ) {
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3675 =
                                                                                                                             idx3674;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3676 =
                                                                                                                             ((t3675) < (((long)(size3685))));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3676)) {
                                                                                                                               
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3670 =
                                                                                                                             idx3674;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile pawn3671 =
                                                                                                                             ((Tile)(((Tile)rail3684$value3970[(int)t3670])));
                                                                                                                           
//#line 20 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(pawn3671)));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3672 =
                                                                                                                             idx3674;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3673 =
                                                                                                                             ((t3672) + (((long)(1L))));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3674 = t3673;
                                                                                                                       }
                                                                                                                   }
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3686 =
                                                                                                                     ((x10.core.Rail)(queens));
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3687 =
                                                                                                                     ((x10.core.Rail<Tile>)rail3686).
                                                                                                                       size;
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3681 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3686$value3971 =
                                                                                                                         ((Tile[])rail3686.value);
                                                                                                                       
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                    true;
                                                                                                                                                                                                                    ) {
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3682 =
                                                                                                                             idx3681;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3683 =
                                                                                                                             ((t3682) < (((long)(size3687))));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3683)) {
                                                                                                                               
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3677 =
                                                                                                                             idx3681;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3678 =
                                                                                                                             ((Tile)(((Tile)rail3686$value3971[(int)t3677])));
                                                                                                                           
//#line 23 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(queen3678)));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3679 =
                                                                                                                             idx3681;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3680 =
                                                                                                                             ((t3679) + (((long)(1L))));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3681 = t3680;
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
final x10.core.Rail rail3744 =
              ((x10.core.Rail)(queens));
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3745 =
              ((x10.core.Rail<Tile>)rail3744).
                size;
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3741 =
              0L;
            {
                
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3744$value3972 =
                  ((Tile[])rail3744.value);
                
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3742 =
                      idx3741;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3743 =
                      ((t3742) < (((long)(size3745))));
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3743)) {
                        
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3737 =
                      idx3741;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3738 =
                      ((Tile)(((Tile)rail3744$value3972[(int)t3737])));
                    
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int xPos3714 =
                      queen3738.
                        x;
                    
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3715 =
                          xPos3714;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3716 =
                          size;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3717 =
                          ((t3715) < (((int)(t3716))));
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3717) {
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3718 =
                              ((x10.array.Array_2)(board));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3719 =
                              xPos3714;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3720 =
                              ((long)(((int)(t3719))));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3721 =
                              queen3738.
                                y;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3722 =
                              ((long)(((int)(t3721))));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3723 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3718).$apply$G((long)(t3720),
                                                                                                    (long)(t3722)));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3724 =
                              PAWN;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3717 = ((int) t3723) !=
                            ((int) t3724);
                        }
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3725 =
                          t3717;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3725)) {
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3688 =
                          xPos3714;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3689 =
                          queen3738.
                            x;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3690 =
                          ((int) t3688) !=
                        ((int) t3689);
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3690) {
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3691 =
                              ((x10.array.Array_2)(board));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3692 =
                              xPos3714;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3693 =
                              ((long)(((int)(t3692))));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3694 =
                              queen3738.
                                y;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3695 =
                              ((long)(((int)(t3694))));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3696 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3691).$apply$G((long)(t3693),
                                                                                                    (long)(t3695)));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3697 =
                              QUEEN;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3690 = ((int) t3696) ==
                            ((int) t3697);
                        }
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3698 =
                          t3690;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3698) {
                            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3699 =
                          xPos3714;
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3700 =
                          ((t3699) + (((int)(1))));
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3714 = t3700;
                    }
                    
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3726 =
                      queen3738.
                        x;
                    
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3714 = t3726;
                    
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3727 =
                          xPos3714;
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3728 =
                          ((t3727) >= (((int)(0))));
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3728) {
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3729 =
                              ((x10.array.Array_2)(board));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3730 =
                              xPos3714;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3731 =
                              ((long)(((int)(t3730))));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3732 =
                              queen3738.
                                y;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3733 =
                              ((long)(((int)(t3732))));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3734 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3729).$apply$G((long)(t3731),
                                                                                                    (long)(t3733)));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3735 =
                              PAWN;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3728 = ((int) t3734) !=
                            ((int) t3735);
                        }
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3736 =
                          t3728;
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3736)) {
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3701 =
                          xPos3714;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3702 =
                          queen3738.
                            x;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3703 =
                          ((int) t3701) !=
                        ((int) t3702);
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3703) {
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3704 =
                              ((x10.array.Array_2)(board));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3705 =
                              xPos3714;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3706 =
                              ((long)(((int)(t3705))));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3707 =
                              queen3738.
                                y;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3708 =
                              ((long)(((int)(t3707))));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3709 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3704).$apply$G((long)(t3706),
                                                                                                    (long)(t3708)));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3710 =
                              QUEEN;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3703 = ((int) t3709) ==
                            ((int) t3710);
                        }
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3711 =
                          t3703;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3711) {
                            
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3712 =
                          xPos3714;
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3713 =
                          ((t3712) - (((int)(1))));
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3714 = t3713;
                    }
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3739 =
                      idx3741;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3740 =
                      ((t3739) + (((long)(1L))));
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3741 = t3740;
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
final x10.core.Rail rail3802 =
              ((x10.core.Rail)(queens));
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3803 =
              ((x10.core.Rail<Tile>)rail3802).
                size;
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3799 =
              0L;
            {
                
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3802$value3973 =
                  ((Tile[])rail3802.value);
                
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3800 =
                      idx3799;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3801 =
                      ((t3800) < (((long)(size3803))));
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3801)) {
                        
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3795 =
                      idx3799;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3796 =
                      ((Tile)(((Tile)rail3802$value3973[(int)t3795])));
                    
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int yPos3772 =
                      queen3796.
                        y;
                    
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3773 =
                          yPos3772;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3774 =
                          size;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3775 =
                          ((t3773) < (((int)(t3774))));
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3775) {
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3776 =
                              ((x10.array.Array_2)(board));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3777 =
                              queen3796.
                                x;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3778 =
                              ((long)(((int)(t3777))));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3779 =
                              yPos3772;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3780 =
                              ((long)(((int)(t3779))));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3781 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3776).$apply$G((long)(t3778),
                                                                                                    (long)(t3780)));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3782 =
                              PAWN;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3775 = ((int) t3781) !=
                            ((int) t3782);
                        }
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3783 =
                          t3775;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3783)) {
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3746 =
                          yPos3772;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3747 =
                          queen3796.
                            y;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3748 =
                          ((int) t3746) !=
                        ((int) t3747);
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3748) {
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3749 =
                              ((x10.array.Array_2)(board));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3750 =
                              queen3796.
                                x;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3751 =
                              ((long)(((int)(t3750))));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3752 =
                              yPos3772;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3753 =
                              ((long)(((int)(t3752))));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3754 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3749).$apply$G((long)(t3751),
                                                                                                    (long)(t3753)));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3755 =
                              QUEEN;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3748 = ((int) t3754) ==
                            ((int) t3755);
                        }
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3756 =
                          t3748;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3756) {
                            
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3757 =
                          yPos3772;
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3758 =
                          ((t3757) + (((int)(1))));
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3772 = t3758;
                    }
                    
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3784 =
                      queen3796.
                        y;
                    
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3772 = t3784;
                    
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3785 =
                          yPos3772;
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3786 =
                          ((t3785) >= (((int)(0))));
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3786) {
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3787 =
                              ((x10.array.Array_2)(board));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3788 =
                              queen3796.
                                x;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3789 =
                              ((long)(((int)(t3788))));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3790 =
                              yPos3772;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3791 =
                              ((long)(((int)(t3790))));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3792 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3787).$apply$G((long)(t3789),
                                                                                                    (long)(t3791)));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3793 =
                              PAWN;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3786 = ((int) t3792) !=
                            ((int) t3793);
                        }
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3794 =
                          t3786;
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3794)) {
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3759 =
                          yPos3772;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3760 =
                          queen3796.
                            y;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3761 =
                          ((int) t3759) !=
                        ((int) t3760);
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3761) {
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3762 =
                              ((x10.array.Array_2)(board));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3763 =
                              queen3796.
                                x;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3764 =
                              ((long)(((int)(t3763))));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3765 =
                              yPos3772;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3766 =
                              ((long)(((int)(t3765))));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3767 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3762).$apply$G((long)(t3764),
                                                                                                    (long)(t3766)));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3768 =
                              QUEEN;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3761 = ((int) t3767) ==
                            ((int) t3768);
                        }
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3769 =
                          t3761;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3769) {
                            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3770 =
                          yPos3772;
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3771 =
                          ((t3770) - (((int)(1))));
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3772 = t3771;
                    }
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3797 =
                      idx3799;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3798 =
                      ((t3797) + (((long)(1L))));
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3799 = t3798;
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
final x10.core.Rail rail3943 =
              ((x10.core.Rail)(queens));
            
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3944 =
              ((x10.core.Rail<Tile>)rail3943).
                size;
            
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3940 =
              0L;
            {
                
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3943$value3974 =
                  ((Tile[])rail3943.value);
                
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3941 =
                      idx3940;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3942 =
                      ((t3941) < (((long)(size3944))));
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3942)) {
                        
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3936 =
                      idx3940;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3937 =
                      ((Tile)(((Tile)rail3943$value3974[(int)t3936])));
                    
//#line 69 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int yPos3876 =
                      queen3937.
                        y;
                    
//#line 70 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int xPos3877 =
                      queen3937.
                        x;
                    
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3878 =
                          xPos3877;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3879 =
                          size;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3880 =
                          ((t3878) < (((int)(t3879))));
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3880) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3881 =
                              yPos3876;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3882 =
                              size;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3880 = ((t3881) < (((int)(t3882))));
                        }
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3883 =
                          t3880;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3883) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3884 =
                              ((x10.array.Array_2)(board));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3885 =
                              xPos3877;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3886 =
                              ((long)(((int)(t3885))));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3887 =
                              yPos3876;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3888 =
                              ((long)(((int)(t3887))));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3889 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3884).$apply$G((long)(t3886),
                                                                                                    (long)(t3888)));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3890 =
                              PAWN;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3883 = ((int) t3889) !=
                            ((int) t3890);
                        }
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3891 =
                          t3883;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3891)) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3804 =
                          xPos3877;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3805 =
                          queen3937.
                            x;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3806 =
                          ((int) t3804) !=
                        ((int) t3805);
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3806) {
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3807 =
                              yPos3876;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3808 =
                              queen3937.
                                y;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3806 = ((int) t3807) !=
                            ((int) t3808);
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3809 =
                          t3806;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3809) {
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3810 =
                              ((x10.array.Array_2)(board));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3811 =
                              xPos3877;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3812 =
                              ((long)(((int)(t3811))));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3813 =
                              yPos3876;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3814 =
                              ((long)(((int)(t3813))));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3815 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3810).$apply$G((long)(t3812),
                                                                                                    (long)(t3814)));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3816 =
                              QUEEN;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3809 = ((int) t3815) ==
                            ((int) t3816);
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3817 =
                          t3809;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3817) {
                            
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3818 =
                          xPos3877;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3819 =
                          ((t3818) + (((int)(1))));
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3877 = t3819;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3820 =
                          yPos3876;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3821 =
                          ((t3820) + (((int)(1))));
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3876 = t3821;
                    }
                    
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3892 =
                      queen3937.
                        y;
                    
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3876 = t3892;
                    
//#line 78 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3893 =
                      queen3937.
                        x;
                    
//#line 78 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3877 = t3893;
                    
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3894 =
                          xPos3877;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3895 =
                          ((t3894) >= (((int)(0))));
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3895) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3896 =
                              yPos3876;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3895 = ((t3896) >= (((int)(0))));
                        }
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3897 =
                          t3895;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3897) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3898 =
                              ((x10.array.Array_2)(board));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3899 =
                              xPos3877;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3900 =
                              ((long)(((int)(t3899))));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3901 =
                              yPos3876;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3902 =
                              ((long)(((int)(t3901))));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3903 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3898).$apply$G((long)(t3900),
                                                                                                    (long)(t3902)));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3904 =
                              PAWN;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3897 = ((int) t3903) !=
                            ((int) t3904);
                        }
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3905 =
                          t3897;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3905)) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3822 =
                          xPos3877;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3823 =
                          queen3937.
                            x;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3824 =
                          ((int) t3822) !=
                        ((int) t3823);
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3824) {
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3825 =
                              yPos3876;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3826 =
                              queen3937.
                                y;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3824 = ((int) t3825) !=
                            ((int) t3826);
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3827 =
                          t3824;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3827) {
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3828 =
                              ((x10.array.Array_2)(board));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3829 =
                              xPos3877;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3830 =
                              ((long)(((int)(t3829))));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3831 =
                              yPos3876;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3832 =
                              ((long)(((int)(t3831))));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3833 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3828).$apply$G((long)(t3830),
                                                                                                    (long)(t3832)));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3834 =
                              QUEEN;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3827 = ((int) t3833) ==
                            ((int) t3834);
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3835 =
                          t3827;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3835) {
                            
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3836 =
                          xPos3877;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3837 =
                          ((t3836) - (((int)(1))));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3877 = t3837;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3838 =
                          yPos3876;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3839 =
                          ((t3838) - (((int)(1))));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3876 = t3839;
                    }
                    
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3906 =
                      queen3937.
                        y;
                    
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3876 = t3906;
                    
//#line 86 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3907 =
                      queen3937.
                        x;
                    
//#line 86 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3877 = t3907;
                    
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3908 =
                          xPos3877;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3909 =
                          size;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3910 =
                          ((t3908) < (((int)(t3909))));
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3910) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3911 =
                              yPos3876;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3910 = ((t3911) >= (((int)(0))));
                        }
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3912 =
                          t3910;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3912) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3913 =
                              ((x10.array.Array_2)(board));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3914 =
                              xPos3877;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3915 =
                              ((long)(((int)(t3914))));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3916 =
                              yPos3876;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3917 =
                              ((long)(((int)(t3916))));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3918 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3913).$apply$G((long)(t3915),
                                                                                                    (long)(t3917)));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3919 =
                              PAWN;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3912 = ((int) t3918) !=
                            ((int) t3919);
                        }
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3920 =
                          t3912;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3920)) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3840 =
                          xPos3877;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3841 =
                          queen3937.
                            x;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3842 =
                          ((int) t3840) !=
                        ((int) t3841);
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3842) {
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3843 =
                              yPos3876;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3844 =
                              queen3937.
                                y;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3842 = ((int) t3843) !=
                            ((int) t3844);
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3845 =
                          t3842;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3845) {
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3846 =
                              ((x10.array.Array_2)(board));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3847 =
                              xPos3877;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3848 =
                              ((long)(((int)(t3847))));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3849 =
                              yPos3876;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3850 =
                              ((long)(((int)(t3849))));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3851 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3846).$apply$G((long)(t3848),
                                                                                                    (long)(t3850)));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3852 =
                              QUEEN;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3845 = ((int) t3851) ==
                            ((int) t3852);
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3853 =
                          t3845;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3853) {
                            
//#line 89 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3854 =
                          xPos3877;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3855 =
                          ((t3854) + (((int)(1))));
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3877 = t3855;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3856 =
                          yPos3876;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3857 =
                          ((t3856) - (((int)(1))));
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3876 = t3857;
                    }
                    
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3921 =
                      queen3937.
                        y;
                    
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3876 = t3921;
                    
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3922 =
                      queen3937.
                        x;
                    
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3877 = t3922;
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3923 =
                          xPos3877;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3924 =
                          ((t3923) >= (((int)(0))));
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3924) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3925 =
                              yPos3876;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3926 =
                              size;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3924 = ((t3925) < (((int)(t3926))));
                        }
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3927 =
                          t3924;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3927) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3928 =
                              ((x10.array.Array_2)(board));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3929 =
                              xPos3877;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3930 =
                              ((long)(((int)(t3929))));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3931 =
                              yPos3876;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3932 =
                              ((long)(((int)(t3931))));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3933 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3928).$apply$G((long)(t3930),
                                                                                                    (long)(t3932)));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3934 =
                              PAWN;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3927 = ((int) t3933) !=
                            ((int) t3934);
                        }
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3935 =
                          t3927;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3935)) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3858 =
                          xPos3877;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3859 =
                          queen3937.
                            x;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3860 =
                          ((int) t3858) !=
                        ((int) t3859);
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3860) {
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3861 =
                              yPos3876;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3862 =
                              queen3937.
                                y;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3860 = ((int) t3861) !=
                            ((int) t3862);
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3863 =
                          t3860;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3863) {
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3864 =
                              ((x10.array.Array_2)(board));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3865 =
                              xPos3877;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3866 =
                              ((long)(((int)(t3865))));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3867 =
                              yPos3876;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3868 =
                              ((long)(((int)(t3867))));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3869 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3864).$apply$G((long)(t3866),
                                                                                                    (long)(t3868)));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3870 =
                              QUEEN;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3863 = ((int) t3869) ==
                            ((int) t3870);
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3871 =
                          t3863;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3871) {
                            
//#line 97 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3872 =
                          xPos3877;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3873 =
                          ((t3872) - (((int)(1))));
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3877 = t3873;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3874 =
                          yPos3876;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3875 =
                          ((t3874) + (((int)(1))));
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3876 = t3875;
                    }
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3938 =
                      idx3940;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3939 =
                      ((t3938) + (((long)(1L))));
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3940 = t3939;
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
final x10.io.Printer t3627 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3628 =
              this.validDiag$O();
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3627.println(x10.core.Boolean.$box(t3628));
            
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3629 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3630 =
              this.validVert$O();
            
//#line 107 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3629.println(x10.core.Boolean.$box(t3630));
            
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3631 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3632 =
              this.validHoriz$O();
            
//#line 108 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3631.println(x10.core.Boolean.$box(t3632));
            
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3633 =
              this.validDiag$O();
            
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3633) {
                
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3633 = this.validVert$O();
            }
            
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3634 =
              t3633;
            
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3634) {
                
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3634 = this.validHoriz$O();
            }
            
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3635 =
              t3634;
            
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return t3635;
        }
        
        
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public void
                                                                                                   print(
                                                                                                   ){
            
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3353min3967 =
              0;
            
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3968 =
              size;
            
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3353max3969 =
              ((t3968) - (((int)(1))));
            
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int i3964 =
              i3353min3967;
            
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3965 =
                  i3964;
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3966 =
                  ((t3965) <= (((int)(i3353max3969))));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3966)) {
                    
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                }
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int y3961 =
                  i3964;
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3337min3957 =
                  0;
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3958 =
                  size;
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3337max3959 =
                  ((t3958) - (((int)(1))));
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int i3954 =
                  i3337min3957;
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3955 =
                      i3954;
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3956 =
                      ((t3955) <= (((int)(i3337max3959))));
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3956)) {
                        
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int x3951 =
                      i3954;
                    
//#line 115 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3945 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 115 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3946 =
                      ((x10.array.Array_2)(board));
                    
//#line 115 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3947 =
                      ((long)(((int)(x3951))));
                    
//#line 115 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3948 =
                      ((long)(((int)(y3961))));
                    
//#line 115 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3949 =
                      x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3946).$apply$G((long)(t3947),
                                                                                            (long)(t3948)));
                    
//#line 115 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.String t3950 =
                      (("|") + ((x10.core.Int.$box(t3949))));
                    
//#line 115 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3945.print(((java.lang.String)(t3950)));
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3952 =
                      i3954;
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3953 =
                      ((t3952) + (((int)(1))));
                    
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
i3954 = t3953;
                }
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3960 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 117 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3960.print(((java.lang.String)("|\n")));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3962 =
                  i3964;
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3963 =
                  ((t3962) + (((int)(1))));
                
//#line 113 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
i3964 = t3963;
            }
            
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3655 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3655.print(((java.lang.String)("\n")));
        }
        
        
//#line 123 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
private void
                                                                                                   place(
                                                                                                   final Tile someTile){
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3658 =
              ((x10.array.Array_2)(board));
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3656 =
              someTile.
                x;
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3659 =
              ((long)(((int)(t3656))));
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3657 =
              someTile.
                y;
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3660 =
              ((long)(((int)(t3657))));
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int occupation =
              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3658).$apply$G((long)(t3659),
                                                                                    (long)(t3660)));
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3661 =
              ((int) occupation) ==
            ((int) 2);
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3661)) {
                
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3661 = ((int) occupation) ==
                ((int) 3);
            }
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3663 =
              t3661;
            
//#line 125 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3663) {
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.RuntimeException t3662 =
                  ((java.lang.RuntimeException)(new java.lang.RuntimeException("Placing on a wrong place!")));
                
//#line 126 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
throw t3662;
            }
            
//#line 128 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3666 =
              ((x10.array.Array_2)(board));
            
//#line 128 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3664 =
              someTile.
                x;
            
//#line 128 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3667 =
              ((long)(((int)(t3664))));
            
//#line 128 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3665 =
              someTile.
                y;
            
//#line 128 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3668 =
              ((long)(((int)(t3665))));
            
//#line 128 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3669 =
              someTile.
                tileType;
            
//#line 128 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
((x10.array.Array_2<x10.core.Int>)t3666).$set__2x10$array$Array_2$$T$G((long)(t3667),
                                                                                                                                                                            (long)(t3668),
                                                                                                                                                                            x10.core.Int.$box(t3669));
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

