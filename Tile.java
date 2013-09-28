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
    
        
//#line 3 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
public int x;
        
//#line 4 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
public int y;
        
//#line 5 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
public int tileType;
        
        
//#line 6 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
// creation method for java code (1-phase java constructor)
        public Tile(final int x,
                    final int y,
                    final int tileType){this((java.lang.System[]) null);
                                            Tile$$init$S(x,y,tileType);}
        
        // constructor for non-virtual call
        final public Tile Tile$$init$S(final int x,
                                       final int y,
                                       final int tileType) { {
                                                                    
//#line 6 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
;
                                                                    
//#line 6 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"

                                                                    
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
this.__fieldInitializers_Tile();
                                                                    
//#line 7 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
this.x = x;
                                                                    
//#line 7 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
this.y = y;
                                                                    
//#line 7 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
this.tileType = tileType;
                                                                }
                                                                return this;
                                                                }
        
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                typeName(
                                                                                                ){try {return x10.rtt.Types.typeName(this);}
        catch (java.lang.Throwable exc$5276) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5276);
        }
        }
        
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                toString(
                                                                                                ){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5210 =
              "struct Tile: x=";
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5211 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5212 =
              ((t5210) + ((x10.core.Int.$box(t5211))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5213 =
              ((t5212) + (" y="));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5214 =
              this.
                y;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5215 =
              ((t5213) + ((x10.core.Int.$box(t5214))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5216 =
              ((t5215) + (" tileType="));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5217 =
              this.
                tileType;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5218 =
              ((t5216) + ((x10.core.Int.$box(t5217))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5218;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public int
                                                                                                hashCode(
                                                                                                ){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
int result =
              1;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5219 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5221 =
              ((8191) * (((int)(t5219))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5220 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5222 =
              x10.rtt.Types.hashCode(t5220);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5223 =
              ((t5221) + (((int)(t5222))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5223;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5224 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5226 =
              ((8191) * (((int)(t5224))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5225 =
              this.
                y;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5227 =
              x10.rtt.Types.hashCode(t5225);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5228 =
              ((t5226) + (((int)(t5227))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5228;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5229 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5231 =
              ((8191) * (((int)(t5229))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5230 =
              this.
                tileType;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5232 =
              x10.rtt.Types.hashCode(t5230);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5233 =
              ((t5231) + (((int)(t5232))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5233;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5234 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5234;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                equals(
                                                                                                java.lang.Object other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5235 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5236 =
              Tile.$RTT.isInstance(t5235);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5237 =
              !(t5236);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5237) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5238 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5239 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t5238));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5240 =
              this.equals$O(((Tile)(t5239)));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5240;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                equals$O(
                                                                                                Tile other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5242 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5241 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5243 =
              t5241.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5247 =
              ((int) t5242) ==
            ((int) t5243);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5247) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5245 =
                  this.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5244 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5246 =
                  t5244.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5247 = ((int) t5245) ==
                ((int) t5246);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5251 =
              t5247;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5251) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5249 =
                  this.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5248 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5250 =
                  t5248.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5251 = ((int) t5249) ==
                ((int) t5250);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5252 =
              t5251;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5252;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                _struct_equals$O(
                                                                                                java.lang.Object other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5253 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5254 =
              Tile.$RTT.isInstance(t5253);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5255 =
              !(t5254);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5255) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5256 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5257 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t5256));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5258 =
              this._struct_equals$O(((Tile)(t5257)));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5258;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                _struct_equals$O(
                                                                                                Tile other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5260 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5259 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5261 =
              t5259.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5265 =
              ((int) t5260) ==
            ((int) t5261);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5265) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5263 =
                  this.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5262 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5264 =
                  t5262.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5265 = ((int) t5263) ==
                ((int) t5264);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5269 =
              t5265;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5269) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5267 =
                  this.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5266 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5268 =
                  t5266.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5269 = ((int) t5267) ==
                ((int) t5268);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5270 =
              t5269;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5270;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public Tile
                                                                                                Tile$$this$Tile(
                                                                                                ){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return Tile.this;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public void
                                                                                                __fieldInitializers_Tile(
                                                                                                ){
            
        }
    
}

