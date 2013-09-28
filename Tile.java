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
        catch (java.lang.Throwable exc$5175) {
        throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5175);
        }
        }
        
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public java.lang.String
                                                                                                toString(
                                                                                                ){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5109 =
              "struct Tile: x=";
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5110 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5111 =
              ((t5109) + ((x10.core.Int.$box(t5110))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5112 =
              ((t5111) + (" y="));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5113 =
              this.
                y;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5114 =
              ((t5112) + ((x10.core.Int.$box(t5113))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5115 =
              ((t5114) + (" tileType="));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5116 =
              this.
                tileType;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.String t5117 =
              ((t5115) + ((x10.core.Int.$box(t5116))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5117;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public int
                                                                                                hashCode(
                                                                                                ){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
int result =
              1;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5118 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5120 =
              ((8191) * (((int)(t5118))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5119 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5121 =
              x10.rtt.Types.hashCode(t5119);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5122 =
              ((t5120) + (((int)(t5121))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5122;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5123 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5125 =
              ((8191) * (((int)(t5123))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5124 =
              this.
                y;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5126 =
              x10.rtt.Types.hashCode(t5124);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5127 =
              ((t5125) + (((int)(t5126))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5127;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5128 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5130 =
              ((8191) * (((int)(t5128))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5129 =
              this.
                tileType;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5131 =
              x10.rtt.Types.hashCode(t5129);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5132 =
              ((t5130) + (((int)(t5131))));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
result = t5132;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5133 =
              result;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5133;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                equals(
                                                                                                java.lang.Object other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5134 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5135 =
              Tile.$RTT.isInstance(t5134);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5136 =
              !(t5135);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5136) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5137 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5138 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t5137));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5139 =
              this.equals$O(((Tile)(t5138)));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5139;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                equals$O(
                                                                                                Tile other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5141 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5140 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5142 =
              t5140.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5146 =
              ((int) t5141) ==
            ((int) t5142);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5146) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5144 =
                  this.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5143 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5145 =
                  t5143.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5146 = ((int) t5144) ==
                ((int) t5145);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5150 =
              t5146;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5150) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5148 =
                  this.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5147 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5149 =
                  t5147.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5150 = ((int) t5148) ==
                ((int) t5149);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5151 =
              t5150;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5151;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                _struct_equals$O(
                                                                                                java.lang.Object other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5152 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5153 =
              Tile.$RTT.isInstance(t5152);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5154 =
              !(t5153);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5154) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return false;
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final java.lang.Object t5155 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5156 =
              ((Tile)x10.rtt.Types.asStruct(Tile.$RTT,t5155));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5157 =
              this._struct_equals$O(((Tile)(t5156)));
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5157;
        }
        
        
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final public boolean
                                                                                                _struct_equals$O(
                                                                                                Tile other){
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5159 =
              this.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5158 =
              other;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5160 =
              t5158.
                x;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5164 =
              ((int) t5159) ==
            ((int) t5160);
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5164) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5162 =
                  this.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5161 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5163 =
                  t5161.
                    y;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5164 = ((int) t5162) ==
                ((int) t5163);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
boolean t5168 =
              t5164;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
if (t5168) {
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5166 =
                  this.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final Tile t5165 =
                  other;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final int t5167 =
                  t5165.
                    tileType;
                
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
t5168 = ((int) t5166) ==
                ((int) t5167);
            }
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
final boolean t5169 =
              t5168;
            
//#line 2 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Tile.x10"
return t5169;
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

