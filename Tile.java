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
        catch (java.lang.Throwable exc$5860) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5860);
        }
        }
        
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                            toString(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t4277 =
              "struct Tile: x=";
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4278 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t4279 =
              ((t4277) + ((x10.core.Int.$box(t4278))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t4280 =
              ((t4279) + (" y="));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4281 =
              this.
                y;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t4282 =
              ((t4280) + ((x10.core.Int.$box(t4281))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t4283 =
              ((t4282) + (" tileType="));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4284 =
              this.
                tileType;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t4285 =
              ((t4283) + ((x10.core.Int.$box(t4284))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t4285;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public int
                                                                                                            hashCode(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
int result =
              1;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4286 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4288 =
              ((8191) * (((int)(t4286))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4287 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4289 =
              x10.rtt.Types.hashCode(t4287);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4290 =
              ((t4288) + (((int)(t4289))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t4290;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4291 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4293 =
              ((8191) * (((int)(t4291))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4292 =
              this.
                y;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4294 =
              x10.rtt.Types.hashCode(t4292);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4295 =
              ((t4293) + (((int)(t4294))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t4295;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4296 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4298 =
              ((8191) * (((int)(t4296))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4297 =
              this.
                tileType;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4299 =
              x10.rtt.Types.hashCode(t4297);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4300 =
              ((t4298) + (((int)(t4299))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t4300;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4301 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t4301;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            equals(
                                                                                                            java.lang.Object other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t4302 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t4303 =
              Tile.$RTT.isInstance(t4302);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t4304 =
              !(t4303);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t4304) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t4305 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t4306 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t4305));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t4307 =
              this.equals$O(((Tile)(t4306)));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t4307;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            equals$O(
                                                                                                            Tile other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4309 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t4308 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4310 =
              t4308.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t4314 =
              ((int) t4309) ==
            ((int) t4310);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t4314) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4312 =
                  this.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t4311 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4313 =
                  t4311.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t4314 = ((int) t4312) ==
                ((int) t4313);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t4318 =
              t4314;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t4318) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4316 =
                  this.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t4315 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4317 =
                  t4315.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t4318 = ((int) t4316) ==
                ((int) t4317);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t4319 =
              t4318;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t4319;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            _struct_equals$O(
                                                                                                            java.lang.Object other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t4320 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t4321 =
              Tile.$RTT.isInstance(t4320);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t4322 =
              !(t4321);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t4322) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t4323 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t4324 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t4323));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t4325 =
              this._struct_equals$O(((Tile)(t4324)));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t4325;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            _struct_equals$O(
                                                                                                            Tile other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4327 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t4326 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4328 =
              t4326.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t4332 =
              ((int) t4327) ==
            ((int) t4328);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t4332) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4330 =
                  this.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t4329 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4331 =
                  t4329.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t4332 = ((int) t4330) ==
                ((int) t4331);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t4336 =
              t4332;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t4336) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4334 =
                  this.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t4333 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t4335 =
                  t4333.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t4336 = ((int) t4334) ==
                ((int) t4335);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t4337 =
              t4336;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t4337;
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

