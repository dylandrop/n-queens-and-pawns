
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
final long t3405 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3406 =
                                                                                                                     ((long)(((int)(max))));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3407 =
                                                                                                                     ((x10.array.Array_2)(new x10.array.Array_2<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).x10$array$Array_2$$init$S(t3405,
                                                                                                                                                                                                                                                      t3406)));
                                                                                                                   
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.board = ((x10.array.Array_2)(t3407));
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3714 =
                                                                                                                     ((x10.core.Rail)(pawns));
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3715 =
                                                                                                                     ((x10.core.Rail<Tile>)rail3714).
                                                                                                                       size;
                                                                                                                   
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3704 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3714$value3997 =
                                                                                                                         ((Tile[])rail3714.value);
                                                                                                                       
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                    true;
                                                                                                                                                                                                                    ) {
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3705 =
                                                                                                                             idx3704;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3706 =
                                                                                                                             ((t3705) < (((long)(size3715))));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3706)) {
                                                                                                                               
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3700 =
                                                                                                                             idx3704;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile pawn3701 =
                                                                                                                             ((Tile)(((Tile)rail3714$value3997[(int)t3700])));
                                                                                                                           
//#line 20 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(pawn3701)));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3702 =
                                                                                                                             idx3704;
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3703 =
                                                                                                                             ((t3702) + (((long)(1L))));
                                                                                                                           
//#line 19 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3704 = t3703;
                                                                                                                       }
                                                                                                                   }
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.core.Rail rail3716 =
                                                                                                                     ((x10.core.Rail)(queens));
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3717 =
                                                                                                                     ((x10.core.Rail<Tile>)rail3716).
                                                                                                                       size;
                                                                                                                   
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3711 =
                                                                                                                     0L;
                                                                                                                   {
                                                                                                                       
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3716$value3998 =
                                                                                                                         ((Tile[])rail3716.value);
                                                                                                                       
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                                                                                                                                    true;
                                                                                                                                                                                                                    ) {
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3712 =
                                                                                                                             idx3711;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3713 =
                                                                                                                             ((t3712) < (((long)(size3717))));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3713)) {
                                                                                                                               
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                                                                                                                           }
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3707 =
                                                                                                                             idx3711;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3708 =
                                                                                                                             ((Tile)(((Tile)rail3716$value3998[(int)t3707])));
                                                                                                                           
//#line 23 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
this.place(((Tile)(queen3708)));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3709 =
                                                                                                                             idx3711;
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3710 =
                                                                                                                             ((t3709) + (((long)(1L))));
                                                                                                                           
//#line 22 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3711 = t3710;
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
final x10.core.Rail rail3774 =
              ((x10.core.Rail)(queens));
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3775 =
              ((x10.core.Rail<Tile>)rail3774).
                size;
            
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3771 =
              0L;
            {
                
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3774$value3999 =
                  ((Tile[])rail3774.value);
                
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3772 =
                      idx3771;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3773 =
                      ((t3772) < (((long)(size3775))));
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3773)) {
                        
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3767 =
                      idx3771;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3768 =
                      ((Tile)(((Tile)rail3774$value3999[(int)t3767])));
                    
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int xPos3744 =
                      queen3768.
                        x;
                    
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3745 =
                          xPos3744;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3746 =
                          size;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3747 =
                          ((t3745) < (((int)(t3746))));
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3747) {
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3748 =
                              ((x10.array.Array_2)(board));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3749 =
                              xPos3744;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3750 =
                              ((long)(((int)(t3749))));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3751 =
                              queen3768.
                                y;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3752 =
                              ((long)(((int)(t3751))));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3753 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3748).$apply$G((long)(t3750),
                                                                                                    (long)(t3752)));
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3754 =
                              PAWN;
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3747 = ((int) t3753) !=
                            ((int) t3754);
                        }
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3755 =
                          t3747;
                        
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3755)) {
                            
//#line 30 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3718 =
                          xPos3744;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3719 =
                          queen3768.
                            x;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3720 =
                          ((int) t3718) !=
                        ((int) t3719);
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3720) {
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3721 =
                              ((x10.array.Array_2)(board));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3722 =
                              xPos3744;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3723 =
                              ((long)(((int)(t3722))));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3724 =
                              queen3768.
                                y;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3725 =
                              ((long)(((int)(t3724))));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3726 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3721).$apply$G((long)(t3723),
                                                                                                    (long)(t3725)));
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3727 =
                              QUEEN;
                            
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3720 = ((int) t3726) ==
                            ((int) t3727);
                        }
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3728 =
                          t3720;
                        
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3728) {
                            
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3729 =
                          xPos3744;
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3730 =
                          ((t3729) + (((int)(1))));
                        
//#line 34 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3744 = t3730;
                    }
                    
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3756 =
                      queen3768.
                        x;
                    
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3744 = t3756;
                    
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3757 =
                          xPos3744;
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3758 =
                          ((t3757) >= (((int)(0))));
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3758) {
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3759 =
                              ((x10.array.Array_2)(board));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3760 =
                              xPos3744;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3761 =
                              ((long)(((int)(t3760))));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3762 =
                              queen3768.
                                y;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3763 =
                              ((long)(((int)(t3762))));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3764 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3759).$apply$G((long)(t3761),
                                                                                                    (long)(t3763)));
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3765 =
                              PAWN;
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3758 = ((int) t3764) !=
                            ((int) t3765);
                        }
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3766 =
                          t3758;
                        
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3766)) {
                            
//#line 37 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3731 =
                          xPos3744;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3732 =
                          queen3768.
                            x;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3733 =
                          ((int) t3731) !=
                        ((int) t3732);
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3733) {
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3734 =
                              ((x10.array.Array_2)(board));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3735 =
                              xPos3744;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3736 =
                              ((long)(((int)(t3735))));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3737 =
                              queen3768.
                                y;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3738 =
                              ((long)(((int)(t3737))));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3739 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3734).$apply$G((long)(t3736),
                                                                                                    (long)(t3738)));
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3740 =
                              QUEEN;
                            
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3733 = ((int) t3739) ==
                            ((int) t3740);
                        }
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3741 =
                          t3733;
                        
//#line 38 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3741) {
                            
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3742 =
                          xPos3744;
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3743 =
                          ((t3742) - (((int)(1))));
                        
//#line 41 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3744 = t3743;
                    }
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3769 =
                      idx3771;
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3770 =
                      ((t3769) + (((long)(1L))));
                    
//#line 28 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3771 = t3770;
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
final x10.core.Rail rail3832 =
              ((x10.core.Rail)(queens));
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3833 =
              ((x10.core.Rail<Tile>)rail3832).
                size;
            
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3829 =
              0L;
            {
                
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3832$value4000 =
                  ((Tile[])rail3832.value);
                
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3830 =
                      idx3829;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3831 =
                      ((t3830) < (((long)(size3833))));
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3831)) {
                        
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3825 =
                      idx3829;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3826 =
                      ((Tile)(((Tile)rail3832$value4000[(int)t3825])));
                    
//#line 49 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int yPos3802 =
                      queen3826.
                        y;
                    
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3803 =
                          yPos3802;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3804 =
                          size;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3805 =
                          ((t3803) < (((int)(t3804))));
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3805) {
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3806 =
                              ((x10.array.Array_2)(board));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3807 =
                              queen3826.
                                x;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3808 =
                              ((long)(((int)(t3807))));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3809 =
                              yPos3802;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3810 =
                              ((long)(((int)(t3809))));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3811 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3806).$apply$G((long)(t3808),
                                                                                                    (long)(t3810)));
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3812 =
                              PAWN;
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3805 = ((int) t3811) !=
                            ((int) t3812);
                        }
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3813 =
                          t3805;
                        
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3813)) {
                            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3776 =
                          yPos3802;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3777 =
                          queen3826.
                            y;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3778 =
                          ((int) t3776) !=
                        ((int) t3777);
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3778) {
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3779 =
                              ((x10.array.Array_2)(board));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3780 =
                              queen3826.
                                x;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3781 =
                              ((long)(((int)(t3780))));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3782 =
                              yPos3802;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3783 =
                              ((long)(((int)(t3782))));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3784 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3779).$apply$G((long)(t3781),
                                                                                                    (long)(t3783)));
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3785 =
                              QUEEN;
                            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3778 = ((int) t3784) ==
                            ((int) t3785);
                        }
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3786 =
                          t3778;
                        
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3786) {
                            
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3787 =
                          yPos3802;
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3788 =
                          ((t3787) + (((int)(1))));
                        
//#line 54 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3802 = t3788;
                    }
                    
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3814 =
                      queen3826.
                        y;
                    
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3802 = t3814;
                    
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3815 =
                          yPos3802;
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3816 =
                          ((t3815) >= (((int)(0))));
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3816) {
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3817 =
                              ((x10.array.Array_2)(board));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3818 =
                              queen3826.
                                x;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3819 =
                              ((long)(((int)(t3818))));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3820 =
                              yPos3802;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3821 =
                              ((long)(((int)(t3820))));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3822 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3817).$apply$G((long)(t3819),
                                                                                                    (long)(t3821)));
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3823 =
                              PAWN;
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3816 = ((int) t3822) !=
                            ((int) t3823);
                        }
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3824 =
                          t3816;
                        
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3824)) {
                            
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3789 =
                          yPos3802;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3790 =
                          queen3826.
                            y;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3791 =
                          ((int) t3789) !=
                        ((int) t3790);
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3791) {
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3792 =
                              ((x10.array.Array_2)(board));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3793 =
                              queen3826.
                                x;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3794 =
                              ((long)(((int)(t3793))));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3795 =
                              yPos3802;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3796 =
                              ((long)(((int)(t3795))));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3797 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3792).$apply$G((long)(t3794),
                                                                                                    (long)(t3796)));
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3798 =
                              QUEEN;
                            
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3791 = ((int) t3797) ==
                            ((int) t3798);
                        }
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3799 =
                          t3791;
                        
//#line 58 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3799) {
                            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3800 =
                          yPos3802;
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3801 =
                          ((t3800) - (((int)(1))));
                        
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3802 = t3801;
                    }
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3827 =
                      idx3829;
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3828 =
                      ((t3827) + (((long)(1L))));
                    
//#line 48 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3829 = t3828;
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
final x10.core.Rail rail3973 =
              ((x10.core.Rail)(queens));
            
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long size3974 =
              ((x10.core.Rail<Tile>)rail3973).
                size;
            
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
long idx3970 =
              0L;
            {
                
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile[] rail3973$value4001 =
                  ((Tile[])rail3973.value);
                
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                             true;
                                                                                                             ) {
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3971 =
                      idx3970;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3972 =
                      ((t3971) < (((long)(size3974))));
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3972)) {
                        
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3966 =
                      idx3970;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final Tile queen3967 =
                      ((Tile)(((Tile)rail3973$value4001[(int)t3966])));
                    
//#line 69 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int yPos3906 =
                      queen3967.
                        y;
                    
//#line 70 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int xPos3907 =
                      queen3967.
                        x;
                    
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3908 =
                          xPos3907;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3909 =
                          size;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3910 =
                          ((t3908) < (((int)(t3909))));
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3910) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3911 =
                              yPos3906;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3912 =
                              size;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3910 = ((t3911) < (((int)(t3912))));
                        }
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3913 =
                          t3910;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3913) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3914 =
                              ((x10.array.Array_2)(board));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3915 =
                              xPos3907;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3916 =
                              ((long)(((int)(t3915))));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3917 =
                              yPos3906;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3918 =
                              ((long)(((int)(t3917))));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3919 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3914).$apply$G((long)(t3916),
                                                                                                    (long)(t3918)));
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3920 =
                              PAWN;
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3913 = ((int) t3919) !=
                            ((int) t3920);
                        }
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3921 =
                          t3913;
                        
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3921)) {
                            
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3834 =
                          xPos3907;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3835 =
                          queen3967.
                            x;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3836 =
                          ((int) t3834) !=
                        ((int) t3835);
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3836) {
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3837 =
                              yPos3906;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3838 =
                              queen3967.
                                y;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3836 = ((int) t3837) !=
                            ((int) t3838);
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3839 =
                          t3836;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3839) {
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3840 =
                              ((x10.array.Array_2)(board));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3841 =
                              xPos3907;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3842 =
                              ((long)(((int)(t3841))));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3843 =
                              yPos3906;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3844 =
                              ((long)(((int)(t3843))));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3845 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3840).$apply$G((long)(t3842),
                                                                                                    (long)(t3844)));
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3846 =
                              QUEEN;
                            
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3839 = ((int) t3845) ==
                            ((int) t3846);
                        }
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3847 =
                          t3839;
                        
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3847) {
                            
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3848 =
                          xPos3907;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3849 =
                          ((t3848) + (((int)(1))));
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3907 = t3849;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3850 =
                          yPos3906;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3851 =
                          ((t3850) + (((int)(1))));
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3906 = t3851;
                    }
                    
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3922 =
                      queen3967.
                        y;
                    
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3906 = t3922;
                    
//#line 78 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3923 =
                      queen3967.
                        x;
                    
//#line 78 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3907 = t3923;
                    
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3924 =
                          xPos3907;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3925 =
                          ((t3924) >= (((int)(0))));
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3925) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3926 =
                              yPos3906;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3925 = ((t3926) >= (((int)(0))));
                        }
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3927 =
                          t3925;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3927) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3928 =
                              ((x10.array.Array_2)(board));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3929 =
                              xPos3907;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3930 =
                              ((long)(((int)(t3929))));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3931 =
                              yPos3906;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3932 =
                              ((long)(((int)(t3931))));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3933 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3928).$apply$G((long)(t3930),
                                                                                                    (long)(t3932)));
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3934 =
                              PAWN;
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3927 = ((int) t3933) !=
                            ((int) t3934);
                        }
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3935 =
                          t3927;
                        
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3935)) {
                            
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3852 =
                          xPos3907;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3853 =
                          queen3967.
                            x;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3854 =
                          ((int) t3852) !=
                        ((int) t3853);
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3854) {
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3855 =
                              yPos3906;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3856 =
                              queen3967.
                                y;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3854 = ((int) t3855) !=
                            ((int) t3856);
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3857 =
                          t3854;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3857) {
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3858 =
                              ((x10.array.Array_2)(board));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3859 =
                              xPos3907;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3860 =
                              ((long)(((int)(t3859))));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3861 =
                              yPos3906;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3862 =
                              ((long)(((int)(t3861))));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3863 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3858).$apply$G((long)(t3860),
                                                                                                    (long)(t3862)));
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3864 =
                              QUEEN;
                            
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3857 = ((int) t3863) ==
                            ((int) t3864);
                        }
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3865 =
                          t3857;
                        
//#line 80 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3865) {
                            
//#line 81 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3866 =
                          xPos3907;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3867 =
                          ((t3866) - (((int)(1))));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3907 = t3867;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3868 =
                          yPos3906;
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3869 =
                          ((t3868) - (((int)(1))));
                        
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3906 = t3869;
                    }
                    
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3936 =
                      queen3967.
                        y;
                    
//#line 85 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3906 = t3936;
                    
//#line 86 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3937 =
                      queen3967.
                        x;
                    
//#line 86 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3907 = t3937;
                    
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3938 =
                          xPos3907;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3939 =
                          size;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3940 =
                          ((t3938) < (((int)(t3939))));
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3940) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3941 =
                              yPos3906;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3940 = ((t3941) >= (((int)(0))));
                        }
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3942 =
                          t3940;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3942) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3943 =
                              ((x10.array.Array_2)(board));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3944 =
                              xPos3907;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3945 =
                              ((long)(((int)(t3944))));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3946 =
                              yPos3906;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3947 =
                              ((long)(((int)(t3946))));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3948 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3943).$apply$G((long)(t3945),
                                                                                                    (long)(t3947)));
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3949 =
                              PAWN;
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3942 = ((int) t3948) !=
                            ((int) t3949);
                        }
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3950 =
                          t3942;
                        
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3950)) {
                            
//#line 87 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3870 =
                          xPos3907;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3871 =
                          queen3967.
                            x;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3872 =
                          ((int) t3870) !=
                        ((int) t3871);
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3872) {
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3873 =
                              yPos3906;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3874 =
                              queen3967.
                                y;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3872 = ((int) t3873) !=
                            ((int) t3874);
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3875 =
                          t3872;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3875) {
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3876 =
                              ((x10.array.Array_2)(board));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3877 =
                              xPos3907;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3878 =
                              ((long)(((int)(t3877))));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3879 =
                              yPos3906;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3880 =
                              ((long)(((int)(t3879))));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3881 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3876).$apply$G((long)(t3878),
                                                                                                    (long)(t3880)));
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3882 =
                              QUEEN;
                            
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3875 = ((int) t3881) ==
                            ((int) t3882);
                        }
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3883 =
                          t3875;
                        
//#line 88 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3883) {
                            
//#line 89 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3884 =
                          xPos3907;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3885 =
                          ((t3884) + (((int)(1))));
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3907 = t3885;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3886 =
                          yPos3906;
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3887 =
                          ((t3886) - (((int)(1))));
                        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3906 = t3887;
                    }
                    
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3951 =
                      queen3967.
                        y;
                    
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3906 = t3951;
                    
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3952 =
                      queen3967.
                        x;
                    
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3907 = t3952;
                    
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
while (true) {
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3953 =
                          xPos3907;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3954 =
                          ((t3953) >= (((int)(0))));
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3954) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3955 =
                              yPos3906;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3956 =
                              size;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3954 = ((t3955) < (((int)(t3956))));
                        }
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3957 =
                          t3954;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3957) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3958 =
                              ((x10.array.Array_2)(board));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3959 =
                              xPos3907;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3960 =
                              ((long)(((int)(t3959))));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3961 =
                              yPos3906;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3962 =
                              ((long)(((int)(t3961))));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3963 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3958).$apply$G((long)(t3960),
                                                                                                    (long)(t3962)));
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3964 =
                              PAWN;
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3957 = ((int) t3963) !=
                            ((int) t3964);
                        }
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3965 =
                          t3957;
                        
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3965)) {
                            
//#line 95 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3888 =
                          xPos3907;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3889 =
                          queen3967.
                            x;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3890 =
                          ((int) t3888) !=
                        ((int) t3889);
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3890) {
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3891 =
                              yPos3906;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3892 =
                              queen3967.
                                y;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3890 = ((int) t3891) !=
                            ((int) t3892);
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3893 =
                          t3890;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3893) {
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3894 =
                              ((x10.array.Array_2)(board));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3895 =
                              xPos3907;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3896 =
                              ((long)(((int)(t3895))));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3897 =
                              yPos3906;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3898 =
                              ((long)(((int)(t3897))));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3899 =
                              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3894).$apply$G((long)(t3896),
                                                                                                    (long)(t3898)));
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3900 =
                              QUEEN;
                            
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3893 = ((int) t3899) ==
                            ((int) t3900);
                        }
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3901 =
                          t3893;
                        
//#line 96 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3901) {
                            
//#line 97 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return false;
                        }
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3902 =
                          xPos3907;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3903 =
                          ((t3902) - (((int)(1))));
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
xPos3907 = t3903;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3904 =
                          yPos3906;
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3905 =
                          ((t3904) + (((int)(1))));
                        
//#line 99 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
yPos3906 = t3905;
                    }
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3968 =
                      idx3970;
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3969 =
                      ((t3968) + (((long)(1L))));
                    
//#line 68 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
idx3970 = t3969;
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
boolean t3664 =
              this.validDiag$O();
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3664) {
                
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3664 = this.validVert$O();
            }
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3665 =
              t3664;
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3665) {
                
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3665 = this.validHoriz$O();
            }
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3666 =
              t3665;
            
//#line 106 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
return t3666;
        }
        
        
//#line 109 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
public void
                                                                                                   print(
                                                                                                   ){
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3390min3391 =
              0;
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3667 =
              size;
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3390max3392 =
              ((t3667) - (((int)(1))));
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int i3994 =
              i3390min3391;
            
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                          true;
                                                                                                          ) {
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3995 =
                  i3994;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3996 =
                  ((t3995) <= (((int)(i3390max3392))));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3996)) {
                    
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                }
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int y3991 =
                  i3994;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3374min3987 =
                  0;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3988 =
                  size;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int i3374max3989 =
                  ((t3988) - (((int)(1))));
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
int i3984 =
                  i3374min3987;
                
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
for (;
                                                                                                              true;
                                                                                                              ) {
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3985 =
                      i3984;
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3986 =
                      ((t3985) <= (((int)(i3374max3989))));
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3986)) {
                        
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
break;
                    }
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int x3981 =
                      i3984;
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3975 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3976 =
                      ((x10.array.Array_2)(board));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3977 =
                      ((long)(((int)(x3981))));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3978 =
                      ((long)(((int)(y3991))));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3979 =
                      x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3976).$apply$G((long)(t3977),
                                                                                            (long)(t3978)));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.String t3980 =
                      (("-") + ((x10.core.Int.$box(t3979))));
                    
//#line 112 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3975.print(((java.lang.String)(t3980)));
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3982 =
                      i3984;
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3983 =
                      ((t3982) + (((int)(1))));
                    
//#line 111 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
i3984 = t3983;
                }
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.io.Printer t3990 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 114 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3990.println(((java.lang.Object)("-")));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3992 =
                  i3994;
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3993 =
                  ((t3992) + (((int)(1))));
                
//#line 110 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
i3994 = t3993;
            }
        }
        
        
//#line 119 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
private void
                                                                                                   place(
                                                                                                   final Tile someTile){
            
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3688 =
              ((x10.array.Array_2)(board));
            
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3686 =
              someTile.
                x;
            
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3689 =
              ((long)(((int)(t3686))));
            
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3687 =
              someTile.
                y;
            
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3690 =
              ((long)(((int)(t3687))));
            
//#line 120 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int occupation =
              x10.core.Int.$unbox(((x10.array.Array_2<x10.core.Int>)t3688).$apply$G((long)(t3689),
                                                                                    (long)(t3690)));
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
boolean t3691 =
              ((int) occupation) ==
            ((int) 2);
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (!(t3691)) {
                
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
t3691 = ((int) occupation) ==
                ((int) 3);
            }
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final boolean t3693 =
              t3691;
            
//#line 121 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
if (t3693) {
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final java.lang.RuntimeException t3692 =
                  ((java.lang.RuntimeException)(new java.lang.RuntimeException("Placing on a wrong place!")));
                
//#line 122 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
throw t3692;
            }
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final x10.array.Array_2 t3696 =
              ((x10.array.Array_2)(board));
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3694 =
              someTile.
                x;
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3697 =
              ((long)(((int)(t3694))));
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3695 =
              someTile.
                y;
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final long t3698 =
              ((long)(((int)(t3695))));
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
final int t3699 =
              someTile.
                tileType;
            
//#line 124 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Board.x10"
((x10.array.Array_2<x10.core.Int>)t3696).$set__2x10$array$Array_2$$T$G((long)(t3697),
                                                                                                                                                                            (long)(t3698),
                                                                                                                                                                            x10.core.Int.$box(t3699));
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

