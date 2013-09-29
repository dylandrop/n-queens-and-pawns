@x10.runtime.impl.java.X10Generated public class Tile extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Tile> $RTT = x10.rtt.NamedStructType.<Tile> make(
    "Tile", Tile.class, new x10.rtt.Type[] {x10.rtt.Types.STRUCT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Tile $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Tile.class + " calling"); } 
        $_obj.x = $deserializer.readInt();
        $_obj.y = $deserializer.readInt();
        $_obj.tileType = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        Tile $_obj = new Tile((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.x);
        $serializer.write(this.y);
        $serializer.write(this.tileType);
        
    }
    
    // zero value constructor
    public Tile(final java.lang.System $dummy) { this.x = 0; this.y = 0; this.tileType = 0; }
    // constructor just for allocation
    public Tile(final java.lang.System[] $dummy) { 
    }
    
        
//#line 3 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
public int x;
        
//#line 4 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
public int y;
        
//#line 5 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
public int tileType;
        
        
//#line 6 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
// creation method for java code (1-phase java constructor)
        public Tile(final int x,
                    final int y,
                    final int tileType){this((java.lang.System[]) null);
                                            Tile$$init$S(x,y,tileType);}
        
        // constructor for non-virtual call
        final public Tile Tile$$init$S(final int x,
                                       final int y,
                                       final int tileType) { {
                                                                    
//#line 6 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
;
                                                                    
//#line 6 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"

                                                                    
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
this.__fieldInitializers_Tile();
                                                                    
//#line 7 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
this.x = x;
                                                                    
//#line 7 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
this.y = y;
                                                                    
//#line 7 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
this.tileType = tileType;
                                                                }
                                                                return this;
                                                                }
        
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                            typeName(
                                                                                                            ){try {return x10.rtt.Types.typeName(this);}
        catch (java.lang.Throwable exc$5049) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5049);
        }
        }
        
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                            toString(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t3482 =
              "struct Tile: x=";
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3483 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t3484 =
              ((t3482) + ((x10.core.Int.$box(t3483))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t3485 =
              ((t3484) + (" y="));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3486 =
              this.
                y;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t3487 =
              ((t3485) + ((x10.core.Int.$box(t3486))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t3488 =
              ((t3487) + (" tileType="));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3489 =
              this.
                tileType;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t3490 =
              ((t3488) + ((x10.core.Int.$box(t3489))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t3490;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public int
                                                                                                            hashCode(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
int result =
              1;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3491 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3493 =
              ((8191) * (((int)(t3491))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3492 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3494 =
              x10.rtt.Types.hashCode(t3492);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3495 =
              ((t3493) + (((int)(t3494))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t3495;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3496 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3498 =
              ((8191) * (((int)(t3496))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3497 =
              this.
                y;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3499 =
              x10.rtt.Types.hashCode(t3497);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3500 =
              ((t3498) + (((int)(t3499))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t3500;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3501 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3503 =
              ((8191) * (((int)(t3501))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3502 =
              this.
                tileType;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3504 =
              x10.rtt.Types.hashCode(t3502);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3505 =
              ((t3503) + (((int)(t3504))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t3505;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3506 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t3506;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            equals(
                                                                                                            java.lang.Object other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t3507 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t3508 =
              Tile.$RTT.isInstance(t3507);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t3509 =
              !(t3508);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t3509) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t3510 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t3511 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t3510));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t3512 =
              this.equals$O(((Tile)(t3511)));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t3512;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            equals$O(
                                                                                                            Tile other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3514 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t3513 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3515 =
              t3513.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t3519 =
              ((int) t3514) ==
            ((int) t3515);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t3519) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3517 =
                  this.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t3516 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3518 =
                  t3516.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t3519 = ((int) t3517) ==
                ((int) t3518);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t3523 =
              t3519;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t3523) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3521 =
                  this.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t3520 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3522 =
                  t3520.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t3523 = ((int) t3521) ==
                ((int) t3522);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t3524 =
              t3523;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t3524;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            _struct_equals$O(
                                                                                                            java.lang.Object other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t3525 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t3526 =
              Tile.$RTT.isInstance(t3525);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t3527 =
              !(t3526);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t3527) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t3528 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t3529 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t3528));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t3530 =
              this._struct_equals$O(((Tile)(t3529)));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t3530;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            _struct_equals$O(
                                                                                                            Tile other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3532 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t3531 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3533 =
              t3531.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t3537 =
              ((int) t3532) ==
            ((int) t3533);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t3537) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3535 =
                  this.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t3534 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3536 =
                  t3534.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t3537 = ((int) t3535) ==
                ((int) t3536);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t3541 =
              t3537;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t3541) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3539 =
                  this.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t3538 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t3540 =
                  t3538.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t3541 = ((int) t3539) ==
                ((int) t3540);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t3542 =
              t3541;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t3542;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public Tile
                                                                                                            Tile$$this$Tile(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return Tile.this;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public void
                                                                                                            __fieldInitializers_Tile(
                                                                                                            ){
            
        }
    
}

