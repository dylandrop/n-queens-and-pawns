@x10.runtime.impl.java.X10Generated public class Tile extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Tile> $RTT = x10.rtt.NamedStructType.<Tile> make(
    "Tile", Tile.class, new x10.rtt.Type[] {x10.rtt.Types.STRUCT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Tile $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
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

                                                                    
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile this6473 =
                                                                      this;
                                                                    
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
        catch (java.lang.Throwable exc$11212) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$11212);
        }
        }
        
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                            toString(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6412 =
              "struct Tile: x=";
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6413 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6414 =
              ((t6412) + ((x10.core.Int.$box(t6413))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6415 =
              ((t6414) + (" y="));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6416 =
              this.
                y;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6417 =
              ((t6415) + ((x10.core.Int.$box(t6416))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6418 =
              ((t6417) + (" tileType="));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6419 =
              this.
                tileType;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6420 =
              ((t6418) + ((x10.core.Int.$box(t6419))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6420;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public int
                                                                                                            hashCode(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
int result =
              1;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6421 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6423 =
              ((8191) * (((int)(t6421))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6422 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6424 =
              x10.rtt.Types.hashCode(t6422);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6425 =
              ((t6423) + (((int)(t6424))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t6425;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6426 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6428 =
              ((8191) * (((int)(t6426))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6427 =
              this.
                y;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6429 =
              x10.rtt.Types.hashCode(t6427);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6430 =
              ((t6428) + (((int)(t6429))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t6430;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6431 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6433 =
              ((8191) * (((int)(t6431))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6432 =
              this.
                tileType;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6434 =
              x10.rtt.Types.hashCode(t6432);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6435 =
              ((t6433) + (((int)(t6434))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t6435;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6436 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6436;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            equals(
                                                                                                            java.lang.Object other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t6437 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6438 =
              Tile.$RTT.isInstance(t6437);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6439 =
              !(t6438);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6439) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t6440 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6441 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t6440));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6442 =
              this.equals$O(((Tile)(t6441)));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6442;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            equals$O(
                                                                                                            Tile other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6444 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6443 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6445 =
              t6443.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t6449 =
              ((int) t6444) ==
            ((int) t6445);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6449) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6447 =
                  this.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6446 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6448 =
                  t6446.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t6449 = ((int) t6447) ==
                ((int) t6448);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t6453 =
              t6449;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6453) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6451 =
                  this.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6450 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6452 =
                  t6450.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t6453 = ((int) t6451) ==
                ((int) t6452);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6454 =
              t6453;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6454;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            _struct_equals$O(
                                                                                                            java.lang.Object other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t6455 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6456 =
              Tile.$RTT.isInstance(t6455);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6457 =
              !(t6456);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6457) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t6458 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6459 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t6458));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6460 =
              this._struct_equals$O(((Tile)(t6459)));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6460;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            _struct_equals$O(
                                                                                                            Tile other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6462 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6461 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6463 =
              t6461.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t6467 =
              ((int) t6462) ==
            ((int) t6463);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6467) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6465 =
                  this.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6464 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6466 =
                  t6464.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t6467 = ((int) t6465) ==
                ((int) t6466);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t6471 =
              t6467;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6471) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6469 =
                  this.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6468 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6470 =
                  t6468.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t6471 = ((int) t6469) ==
                ((int) t6470);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6472 =
              t6471;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6472;
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

