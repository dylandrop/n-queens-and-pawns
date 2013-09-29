
@x10.runtime.impl.java.X10Generated public class Main extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Main> $RTT = x10.rtt.NamedType.<Main> make(
    "Main", Main.class
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Main $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Main.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        Main $_obj = new Main((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public Main(final java.lang.System[] $dummy) { 
    }
    
        
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
@x10.runtime.impl.java.X10Generated public static class Input extends x10.core.Struct implements x10.serialization.X10JavaSerializable
                                                                                                           {
            private static final long serialVersionUID = 1L;
            public static final x10.rtt.RuntimeType<Input> $RTT = x10.rtt.NamedStructType.<Input> make(
            "Main.Input", Input.class, new x10.rtt.Type[] {x10.rtt.Types.STRUCT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            public x10.rtt.Type<?> $getParam(int i) {return null;}
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Main.Input $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Input.class + " calling"); } 
                $_obj.size = $deserializer.readInt();
                $_obj.pawns = $deserializer.readRef();
                $_obj.solutions = $deserializer.readInt();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
                Main.Input $_obj = new Main.Input((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.size);
                if (pawns instanceof x10.serialization.X10JavaSerializable) {
                $serializer.write((x10.serialization.X10JavaSerializable) this.pawns);
                } else {
                $serializer.write(this.pawns);
                }
                $serializer.write(this.solutions);
                
            }
            
            // zero value constructor
            public Input(final java.lang.System $dummy) { this.size = 0; this.pawns = null; this.solutions = 0; }
            // constructor just for allocation
            public Input(final java.lang.System[] $dummy) { 
            }
            
                
//#line 25 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public int size;
                
//#line 26 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public x10.util.ArrayList<Tile> pawns;
                
//#line 27 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public int solutions;
                
                
//#line 29 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
// creation method for java code (1-phase java constructor)
                public Input(final int size,
                             final x10.util.ArrayList<Tile> pawns,
                             final int solutions, __1$1Tile$2 $dummy){this((java.lang.System[]) null);
                                                                          Main$Input$$init$S(size,pawns,solutions, (Main.Input.__1$1Tile$2) null);}
                
                // constructor for non-virtual call
                final public Main.Input Main$Input$$init$S(final int size,
                                                           final x10.util.ArrayList<Tile> pawns,
                                                           final int solutions, __1$1Tile$2 $dummy) { {
                                                                                                             
//#line 29 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
;
                                                                                                             
//#line 29 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"

                                                                                                             
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
this.__fieldInitializers_Main_Input();
                                                                                                             
//#line 31 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
this.size = size;
                                                                                                             
//#line 32 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
this.pawns = ((x10.util.ArrayList)(pawns));
                                                                                                             
//#line 33 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
this.solutions = solutions;
                                                                                                         }
                                                                                                         return this;
                                                                                                         }
                
                
                
//#line 36 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                                     toString(
                                                                                                                     ){
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3165 =
                      this.
                        size;
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3167 =
                      (((x10.core.Int.$box(t3165))) + ("-Queens with "));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3166 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t3168 =
                      ((x10.util.ArrayList<Tile>)t3166).size$O();
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3169 =
                      ((t3167) + ((x10.core.Long.$box(t3168))));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3170 =
                      ((t3169) + (" pawns"));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3170;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                                     typeName(
                                                                                                                     ){try {return x10.rtt.Types.typeName(this);}
                catch (java.lang.Throwable exc$5048) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5048);
                }
                }
                
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public int
                                                                                                                     hashCode(
                                                                                                                     ){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
int result =
                      1;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3171 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3173 =
                      ((8191) * (((int)(t3171))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3172 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3174 =
                      x10.rtt.Types.hashCode(t3172);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3175 =
                      ((t3173) + (((int)(t3174))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t3175;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3176 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3178 =
                      ((8191) * (((int)(t3176))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3177 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3179 =
                      x10.rtt.Types.hashCode(((java.lang.Object)(t3177)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3180 =
                      ((t3178) + (((int)(t3179))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t3180;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3181 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3183 =
                      ((8191) * (((int)(t3181))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3182 =
                      this.
                        solutions;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3184 =
                      x10.rtt.Types.hashCode(t3182);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3185 =
                      ((t3183) + (((int)(t3184))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t3185;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3186 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3186;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     equals(
                                                                                                                     java.lang.Object other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t3187 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3188 =
                      Main.Input.$RTT.isInstance(t3187);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3189 =
                      !(t3188);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3189) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t3190 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3191 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t3190));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3192 =
                      this.equals$O(((Main.Input)(t3191)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3192;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     equals$O(
                                                                                                                     Main.Input other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3194 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3193 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3195 =
                      t3193.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t3199 =
                      ((int) t3194) ==
                    ((int) t3195);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3199) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3197 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3196 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3198 =
                          ((x10.util.ArrayList)(t3196.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3199 = x10.rtt.Equality.equalsequals((t3197),(t3198));
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t3203 =
                      t3199;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3203) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3201 =
                          this.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3200 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3202 =
                          t3200.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3203 = ((int) t3201) ==
                        ((int) t3202);
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3204 =
                      t3203;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3204;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     _struct_equals$O(
                                                                                                                     java.lang.Object other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t3205 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3206 =
                      Main.Input.$RTT.isInstance(t3205);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3207 =
                      !(t3206);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3207) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t3208 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3209 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t3208));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3210 =
                      this._struct_equals$O(((Main.Input)(t3209)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3210;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     _struct_equals$O(
                                                                                                                     Main.Input other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3212 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3211 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3213 =
                      t3211.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t3217 =
                      ((int) t3212) ==
                    ((int) t3213);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3217) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3215 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3214 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3216 =
                          ((x10.util.ArrayList)(t3214.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3217 = x10.rtt.Equality.equalsequals((t3215),(t3216));
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t3221 =
                      t3217;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3221) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3219 =
                          this.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3218 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3220 =
                          t3218.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3221 = ((int) t3219) ==
                        ((int) t3220);
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3222 =
                      t3221;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3222;
                }
                
                
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public Main.Input
                                                                                                                     Main$Input$$this$Main$Input(
                                                                                                                     ){
                    
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return Main.Input.this;
                }
                
                
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public void
                                                                                                                     __fieldInitializers_Main_Input(
                                                                                                                     ){
                    
                }
            // synthetic type for parameter mangling
            public static final class __1$1Tile$2 {}
            
        }
        
        
//#line 44 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public static java.lang.String INPUT_FILE = ((java.lang.String)("configurations"));
        
//#line 45 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public static long CONF_PAWN_OFFSET = 3L;
        
        
//#line 47 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args)  {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args)  {
        // call the original app-main method
        Main.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.core.Rail<java.lang.String> args)  {
            
//#line 50 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
x10.io.File F =
               null;
            
//#line 51 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
try {{
                
//#line 52 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String filename =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t3223 =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(filename)))));
                
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
F = t3223;
            }}catch (final x10.io.FileNotFoundException id$0) {
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t3225 =
                  ((x10.io.Printer)(x10.io.Console.get$ERR()));
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3224 =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3226 =
                  ((t3224) + (" is not a valid file"));
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3225.println(((java.lang.Object)(t3226)));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3227 =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3228 =
                  ((t3227) + (" is not a valid file"));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.IllegalArgumentException t3229 =
                  ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t3228)));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
throw t3229;
            }
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t3284 =
              F;
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.ReaderIterator t3285 =
              t3284.lines();
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.lang.Iterator line3286 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.io.ReaderIterator<java.lang.String>)t3285).iterator());
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3287 =
                  ((x10.lang.Iterator<java.lang.String>)line3286).hasNext$O();
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t3287)) {
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                }
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
L3288: {
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String line3289 =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line3286).next$G()));
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3290 =
                  (line3289).length();
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3291 =
                  ((int) t3290) ==
                ((int) 0);
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3291) {
                    
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break L3288;
                }
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final char t3292 =
                  (line3289).charAt(((int)(0)));
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3293 =
                  ((char) t3292) ==
                ((char) '/');
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3293) {
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t3294 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3294.println(((java.lang.Object)(line3289)));
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break L3288;
                }
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail v3295 =
                  x10.lang.StringHelper.split(";", line3289);
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3296 =
                  ((java.lang.String[])v3295.value)[(int)1L];
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3297 =
                  (t3296).trim();
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int size3298 =
                  java.lang.Integer.parseInt(t3297);
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3299 =
                  ((java.lang.String[])v3295.value)[(int)2L];
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3300 =
                  (t3299).trim();
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int solutions3301 =
                  java.lang.Integer.parseInt(t3300);
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList pawns3302 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3148min3281 =
                  Main.CONF_PAWN_OFFSET;
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t3282 =
                  ((x10.core.Rail<java.lang.String>)v3295).
                    size;
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3148max3283 =
                  ((t3282) - (((long)(1L))));
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long i3278 =
                  i3148min3281;{
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String[] v3295$value3304 =
                      ((java.lang.String[])v3295.value);
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t3279 =
                          i3278;
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3280 =
                          ((t3279) <= (((long)(i3148max3283))));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t3280)) {
                            
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                        }
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3275 =
                          i3278;
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3266 =
                          ((java.lang.String)v3295$value3304[(int)i3275]);
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail coords3267 =
                          x10.lang.StringHelper.split(",", t3266);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3268 =
                          ((java.lang.String[])coords3267.value)[(int)0L];
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3269 =
                          (t3268).trim();
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3270 =
                          java.lang.Integer.parseInt(t3269);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3271 =
                          ((java.lang.String[])coords3267.value)[(int)1L];
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3272 =
                          (t3271).trim();
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3273 =
                          java.lang.Integer.parseInt(t3272);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Tile point3274 =
                          new Tile((java.lang.System[]) null).Tile$$init$S(t3270,
                                                                           t3273,
                                                                           ((int)(3)));
                        
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
((x10.util.ArrayList<Tile>)pawns3302).add__0x10$util$ArrayList$$T$O(((Tile)(point3274)));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t3276 =
                          i3278;
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t3277 =
                          ((t3276) + (((long)(1L))));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
i3278 = t3277;
                    }
                }
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input input3303 =
                  new Main.Input((java.lang.System[]) null).Main$Input$$init$S(((int)(size3298)),
                                                                               ((x10.util.ArrayList<Tile>)(pawns3302)),
                                                                               ((int)(solutions3301)), (Main.Input.__1$1Tile$2) null);
//#line 83 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
Main.comboTester(((Main.Input)(input3303)));}
            }
        }
        
        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static void
                                                                                                             comboTester(
                                                                                                             final Main.Input input){
            
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
Solver solver =
              new Solver((java.lang.System[]) null).Solver$$init$S();
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Solver t3256 =
              solver;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3257 =
              input.
                size;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3258 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long numberOfCombinations =
              t3256.solve__1$1Tile$2$O((int)(t3257),
                                       ((x10.util.ArrayList)(t3258)));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t3259 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3260 =
              (("The number of generated combinations is ") + ((x10.core.Long.$box(numberOfCombinations))));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3259.println(((java.lang.Object)(t3260)));
        }
        
        
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static long
                                                                                                              median$O(
                                                                                                              final long v1,
                                                                                                              final long v2,
                                                                                                              final long v3){
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3265 =
              ((v1) > (((long)(v2))));
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3265) {
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3262 =
                  ((v3) > (((long)(v1))));
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3262) {
                    
//#line 157 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                } else {
                    
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3261 =
                      ((v3) > (((long)(v2))));
                    
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3261) {
                        
//#line 159 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 161 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                    }
                }
            } else {
                
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3264 =
                  ((v3) > (((long)(v2))));
                
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3264) {
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                } else {
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3263 =
                      ((v3) > (((long)(v1))));
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3263) {
                        
//#line 168 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 170 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                    }
                }
            }
        }
        
        
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public Main
                                                                                                             Main$$this$Main(
                                                                                                             ){
            
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return Main.this;
        }
        
        
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
// creation method for java code (1-phase java constructor)
        public Main(){this((java.lang.System[]) null);
                          Main$$init$S();}
        
        // constructor for non-virtual call
        final public Main Main$$init$S() { {
                                                  
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
;
                                                  
//#line 18 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"

                                                  
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
this.__fieldInitializers_Main();
                                              }
                                              return this;
                                              }
        
        
        
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public void
                                                                                                             __fieldInitializers_Main(
                                                                                                             ){
            
        }
    
}

