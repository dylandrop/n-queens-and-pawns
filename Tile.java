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
final Tile this6278 =
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
        catch (java.lang.Throwable exc$9768) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$9768);
        }
        }
        
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                            toString(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6217 =
              "struct Tile: x=";
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6218 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6219 =
              ((t6217) + ((x10.core.Int.$box(t6218))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6220 =
              ((t6219) + (" y="));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6221 =
              this.
                y;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6222 =
              ((t6220) + ((x10.core.Int.$box(t6221))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6223 =
              ((t6222) + (" tileType="));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6224 =
              this.
                tileType;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t6225 =
              ((t6223) + ((x10.core.Int.$box(t6224))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6225;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public int
                                                                                                            hashCode(
                                                                                                            ){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
int result =
              1;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6226 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6228 =
              ((8191) * (((int)(t6226))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6227 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6229 =
              x10.rtt.Types.hashCode(t6227);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6230 =
              ((t6228) + (((int)(t6229))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t6230;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6231 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6233 =
              ((8191) * (((int)(t6231))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6232 =
              this.
                y;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6234 =
              x10.rtt.Types.hashCode(t6232);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6235 =
              ((t6233) + (((int)(t6234))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t6235;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6236 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6238 =
              ((8191) * (((int)(t6236))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6237 =
              this.
                tileType;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6239 =
              x10.rtt.Types.hashCode(t6237);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6240 =
              ((t6238) + (((int)(t6239))));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
result = t6240;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6241 =
              result;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6241;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            equals(
                                                                                                            java.lang.Object other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t6242 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6243 =
              Tile.$RTT.isInstance(t6242);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6244 =
              !(t6243);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6244) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t6245 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6246 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t6245));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6247 =
              this.equals$O(((Tile)(t6246)));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6247;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            equals$O(
                                                                                                            Tile other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6249 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6248 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6250 =
              t6248.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t6254 =
              ((int) t6249) ==
            ((int) t6250);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6254) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6252 =
                  this.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6251 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6253 =
                  t6251.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t6254 = ((int) t6252) ==
                ((int) t6253);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t6258 =
              t6254;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6258) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6256 =
                  this.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6255 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6257 =
                  t6255.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t6258 = ((int) t6256) ==
                ((int) t6257);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6259 =
              t6258;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6259;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            _struct_equals$O(
                                                                                                            java.lang.Object other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t6260 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6261 =
              Tile.$RTT.isInstance(t6260);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6262 =
              !(t6261);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6262) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t6263 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6264 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t6263));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6265 =
              this._struct_equals$O(((Tile)(t6264)));
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6265;
        }
        
        
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                            _struct_equals$O(
                                                                                                            Tile other){
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6267 =
              this.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6266 =
              other;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6268 =
              t6266.
                x;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t6272 =
              ((int) t6267) ==
            ((int) t6268);
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6272) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6270 =
                  this.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6269 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6271 =
                  t6269.
                    y;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t6272 = ((int) t6270) ==
                ((int) t6271);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
boolean t6276 =
              t6272;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
if (t6276) {
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6274 =
                  this.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t6273 =
                  other;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final int t6275 =
                  t6273.
                    tileType;
                
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
t6276 = ((int) t6274) ==
                ((int) t6275);
            }
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t6277 =
              t6276;
            
//#line 2 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Tile.x10"
return t6277;
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

