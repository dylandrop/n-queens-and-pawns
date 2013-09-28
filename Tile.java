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
        catch (java.lang.Throwable exc$5184) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5184);
        }
        }
        
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                toString(
                                                                                                ){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5118 =
              "struct Tile: x=";
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5119 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5120 =
              ((t5118) + ((x10.core.Int.$box(t5119))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5121 =
              ((t5120) + (" y="));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5122 =
              this.
                y;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5123 =
              ((t5121) + ((x10.core.Int.$box(t5122))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5124 =
              ((t5123) + (" tileType="));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5125 =
              this.
                tileType;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5126 =
              ((t5124) + ((x10.core.Int.$box(t5125))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5126;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public int
                                                                                                hashCode(
                                                                                                ){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
int result =
              1;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5127 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5129 =
              ((8191) * (((int)(t5127))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5128 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5130 =
              x10.rtt.Types.hashCode(t5128);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5131 =
              ((t5129) + (((int)(t5130))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5131;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5132 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5134 =
              ((8191) * (((int)(t5132))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5133 =
              this.
                y;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5135 =
              x10.rtt.Types.hashCode(t5133);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5136 =
              ((t5134) + (((int)(t5135))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5136;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5137 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5139 =
              ((8191) * (((int)(t5137))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5138 =
              this.
                tileType;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5140 =
              x10.rtt.Types.hashCode(t5138);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5141 =
              ((t5139) + (((int)(t5140))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5141;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5142 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5142;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                equals(
                                                                                                java.lang.Object other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5143 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5144 =
              Tile.$RTT.isInstance(t5143);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5145 =
              !(t5144);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5145) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5146 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5147 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t5146));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5148 =
              this.equals$O(((Tile)(t5147)));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5148;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                equals$O(
                                                                                                Tile other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5150 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5149 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5151 =
              t5149.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5155 =
              ((int) t5150) ==
            ((int) t5151);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5155) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5153 =
                  this.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5152 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5154 =
                  t5152.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5155 = ((int) t5153) ==
                ((int) t5154);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5159 =
              t5155;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5159) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5157 =
                  this.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5156 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5158 =
                  t5156.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5159 = ((int) t5157) ==
                ((int) t5158);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5160 =
              t5159;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5160;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                _struct_equals$O(
                                                                                                java.lang.Object other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5161 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5162 =
              Tile.$RTT.isInstance(t5161);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5163 =
              !(t5162);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5163) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5164 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5165 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t5164));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5166 =
              this._struct_equals$O(((Tile)(t5165)));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5166;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                _struct_equals$O(
                                                                                                Tile other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5168 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5167 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5169 =
              t5167.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5173 =
              ((int) t5168) ==
            ((int) t5169);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5173) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5171 =
                  this.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5170 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5172 =
                  t5170.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5173 = ((int) t5171) ==
                ((int) t5172);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5177 =
              t5173;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5177) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5175 =
                  this.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5174 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5176 =
                  t5174.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5177 = ((int) t5175) ==
                ((int) t5176);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5178 =
              t5177;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5178;
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

