
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
    
        
//#line 23 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
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
            
                
//#line 25 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
public int size;
                
//#line 26 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
public x10.util.ArrayList<Tile> pawns;
                
//#line 27 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
public int solutions;
                
                
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
// creation method for java code (1-phase java constructor)
                public Input(final int size,
                             final x10.util.ArrayList<Tile> pawns,
                             final int solutions, __1$1Tile$2 $dummy){this((java.lang.System[]) null);
                                                                          Main$Input$$init$S(size,pawns,solutions, (Main.Input.__1$1Tile$2) null);}
                
                // constructor for non-virtual call
                final public Main.Input Main$Input$$init$S(final int size,
                                                           final x10.util.ArrayList<Tile> pawns,
                                                           final int solutions, __1$1Tile$2 $dummy) { {
                                                                                                             
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
;
                                                                                                             
//#line 29 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"

                                                                                                             
//#line 23 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
this.__fieldInitializers_Main_Input();
                                                                                                             
//#line 31 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
this.size = size;
                                                                                                             
//#line 32 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
this.pawns = ((x10.util.ArrayList)(pawns));
                                                                                                             
//#line 33 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
this.solutions = solutions;
                                                                                                         }
                                                                                                         return this;
                                                                                                         }
                
                
                
//#line 36 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                         toString(
                                                                                                         ){
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4216 =
                      this.
                        size;
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4218 =
                      (((x10.core.Int.$box(t4216))) + ("-Queens with "));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4217 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4219 =
                      ((x10.util.ArrayList<Tile>)t4217).size$O();
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4220 =
                      ((t4218) + ((x10.core.Long.$box(t4219))));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4221 =
                      ((t4220) + (" pawns"));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4221;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                         typeName(
                                                                                                         ){try {return x10.rtt.Types.typeName(this);}
                catch (java.lang.Throwable exc$5183) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5183);
                }
                }
                
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public int
                                                                                                         hashCode(
                                                                                                         ){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
int result =
                      1;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4222 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4224 =
                      ((8191) * (((int)(t4222))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4223 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4225 =
                      x10.rtt.Types.hashCode(t4223);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4226 =
                      ((t4224) + (((int)(t4225))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4226;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4227 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4229 =
                      ((8191) * (((int)(t4227))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4228 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4230 =
                      x10.rtt.Types.hashCode(((java.lang.Object)(t4228)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4231 =
                      ((t4229) + (((int)(t4230))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4231;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4232 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4234 =
                      ((8191) * (((int)(t4232))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4233 =
                      this.
                        solutions;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4235 =
                      x10.rtt.Types.hashCode(t4233);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4236 =
                      ((t4234) + (((int)(t4235))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4236;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4237 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4237;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         equals(
                                                                                                         java.lang.Object other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4238 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4239 =
                      Main.Input.$RTT.isInstance(t4238);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4240 =
                      !(t4239);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4240) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4241 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4242 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t4241));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4243 =
                      this.equals$O(((Main.Input)(t4242)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4243;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         equals$O(
                                                                                                         Main.Input other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4245 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4244 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4246 =
                      t4244.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4250 =
                      ((int) t4245) ==
                    ((int) t4246);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4250) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4248 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4247 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4249 =
                          ((x10.util.ArrayList)(t4247.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4250 = x10.rtt.Equality.equalsequals((t4248),(t4249));
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4254 =
                      t4250;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4254) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4252 =
                          this.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4251 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4253 =
                          t4251.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4254 = ((int) t4252) ==
                        ((int) t4253);
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4255 =
                      t4254;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4255;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         _struct_equals$O(
                                                                                                         java.lang.Object other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4256 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4257 =
                      Main.Input.$RTT.isInstance(t4256);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4258 =
                      !(t4257);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4258) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4259 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4260 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t4259));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4261 =
                      this._struct_equals$O(((Main.Input)(t4260)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4261;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         _struct_equals$O(
                                                                                                         Main.Input other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4263 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4262 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4264 =
                      t4262.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4268 =
                      ((int) t4263) ==
                    ((int) t4264);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4268) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4266 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4265 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4267 =
                          ((x10.util.ArrayList)(t4265.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4268 = x10.rtt.Equality.equalsequals((t4266),(t4267));
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4272 =
                      t4268;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4272) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4270 =
                          this.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4269 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4271 =
                          t4269.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4272 = ((int) t4270) ==
                        ((int) t4271);
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4273 =
                      t4272;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4273;
                }
                
                
//#line 23 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public Main.Input
                                                                                                         Main$Input$$this$Main$Input(
                                                                                                         ){
                    
//#line 23 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return Main.Input.this;
                }
                
                
//#line 23 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public void
                                                                                                         __fieldInitializers_Main_Input(
                                                                                                         ){
                    
                }
            // synthetic type for parameter mangling
            public static final class __1$1Tile$2 {}
            
        }
        
        
//#line 44 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public static java.lang.String INPUT_FILE = ((java.lang.String)("configurations"));
        
//#line 45 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public static int CONF_PAWN_OFFSET = 3;
        
        
//#line 47 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
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
            
//#line 50 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
x10.io.File F =
               null;
            
//#line 51 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
try {{
                
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4274 =
                  ((long)(((int)(0))));
                
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String filename =
                  ((java.lang.String[])args.value)[(int)t4274];
                
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t4275 =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(filename)))));
                
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
F = t4275;
            }}catch (final x10.io.FileNotFoundException id$3) {
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4278 =
                  ((x10.io.Printer)(x10.io.Console.get$ERR()));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4276 =
                  ((long)(((int)(0))));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4277 =
                  ((java.lang.String[])args.value)[(int)t4276];
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4279 =
                  ((t4277) + (" is not a valid file"));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4278.println(((java.lang.Object)(t4279)));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4280 =
                  ((long)(((int)(0))));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4281 =
                  ((java.lang.String[])args.value)[(int)t4280];
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4282 =
                  ((t4281) + (" is not a valid file"));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.IllegalArgumentException t4283 =
                  ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t4282)));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
throw t4283;
            }
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t4348 =
              F;
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.ReaderIterator t4349 =
              t4348.lines();
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.lang.Iterator line4350 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.io.ReaderIterator<java.lang.String>)t4349).iterator());
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                        true;
                                                                                                        ) {
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4351 =
                  ((x10.lang.Iterator<java.lang.String>)line4350).hasNext$O();
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4351)) {
                    
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break;
                }
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
L4352: {
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String line4353 =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line4350).next$G()));
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4354 =
                  (line4353).length();
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4355 =
                  ((int) t4354) ==
                ((int) 0);
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4355) {
                    
//#line 62 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break L4352;
                }
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final char t4356 =
                  (line4353).charAt(((int)(0)));
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4357 =
                  ((char) t4356) ==
                ((char) '/');
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4357) {
                    
//#line 65 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4358 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 65 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4358.println(((java.lang.Object)(line4353)));
                    
//#line 66 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break L4352;
                }
//#line 69 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail v4359 =
                  x10.lang.StringHelper.split(";", line4353);
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4360 =
                  ((long)(((int)(1))));
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4361 =
                  ((java.lang.String[])v4359.value)[(int)t4360];
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4362 =
                  (t4361).trim();
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int size4363 =
                  java.lang.Integer.parseInt(t4362);
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4364 =
                  ((long)(((int)(2))));
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4365 =
                  ((java.lang.String[])v4359.value)[(int)t4364];
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4366 =
                  (t4365).trim();
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int solutions4367 =
                  java.lang.Integer.parseInt(t4366);
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList pawns4368 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4343 =
                  Main.CONF_PAWN_OFFSET;
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4199min4344 =
                  ((long)(((int)(t4343))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4345 =
                  ((x10.core.Rail<java.lang.String>)v4359).
                    size;
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4346 =
                  ((long)(((int)(1))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4199max4347 =
                  ((t4345) - (((long)(t4346))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
long i4340 =
                  i4199min4344;{
                    
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String[] v4359$value4370 =
                      ((java.lang.String[])v4359.value);
                    
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                true;
                                                                                                                ) {
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4341 =
                          i4340;
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4342 =
                          ((t4341) <= (((long)(i4199max4347))));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4342)) {
                            
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break;
                        }
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4337 =
                          i4340;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4326 =
                          ((java.lang.String)v4359$value4370[(int)i4337]);
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail coords4327 =
                          x10.lang.StringHelper.split(",", t4326);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4328 =
                          ((long)(((int)(0))));
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4329 =
                          ((java.lang.String[])coords4327.value)[(int)t4328];
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4330 =
                          (t4329).trim();
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4331 =
                          java.lang.Integer.parseInt(t4330);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4332 =
                          ((long)(((int)(1))));
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4333 =
                          ((java.lang.String[])coords4327.value)[(int)t4332];
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4334 =
                          (t4333).trim();
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4335 =
                          java.lang.Integer.parseInt(t4334);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Tile point4336 =
                          new Tile((java.lang.System[]) null).Tile$$init$S(t4331,
                                                                           t4335,
                                                                           ((int)(3)));
                        
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
((x10.util.ArrayList<Tile>)pawns4368).add__0x10$util$ArrayList$$T$O(((Tile)(point4336)));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4338 =
                          i4340;
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4339 =
                          ((t4338) + (((long)(1L))));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
i4340 = t4339;
                    }
                }
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input input4369 =
                  new Main.Input((java.lang.System[]) null).Main$Input$$init$S(((int)(size4363)),
                                                                               ((x10.util.ArrayList<Tile>)(pawns4368)),
                                                                               ((int)(solutions4367)), (Main.Input.__1$1Tile$2) null);
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
Main.comboTester(((Main.Input)(input4369)));}
            }
        }
        
        
//#line 91 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
public static void
                                                                                                 comboTester(
                                                                                                 final Main.Input input){
            
//#line 92 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
Solver solver =
              new Solver((java.lang.System[]) null).Solver$$init$S();
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Solver t4316 =
              solver;
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4317 =
              input.
                size;
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4318 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long numberOfCombinations =
              t4316.solve__1$1Tile$2$O((int)(t4317),
                                       ((x10.util.ArrayList)(t4318)));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4319 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4320 =
              (("The number of generated combinations is ") + ((x10.core.Long.$box(numberOfCombinations))));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4319.println(((java.lang.Object)(t4320)));
        }
        
        
//#line 152 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
public static long
                                                                                                  median$O(
                                                                                                  final long v1,
                                                                                                  final long v2,
                                                                                                  final long v3){
            
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4325 =
              ((v1) > (((long)(v2))));
            
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4325) {
                
//#line 156 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4322 =
                  ((v3) > (((long)(v1))));
                
//#line 156 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4322) {
                    
//#line 157 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                } else {
                    
//#line 158 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4321 =
                      ((v3) > (((long)(v2))));
                    
//#line 158 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4321) {
                        
//#line 159 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 161 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                    }
                }
            } else {
                
//#line 165 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4324 =
                  ((v3) > (((long)(v2))));
                
//#line 165 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4324) {
                    
//#line 166 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                } else {
                    
//#line 167 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4323 =
                      ((v3) > (((long)(v1))));
                    
//#line 167 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4323) {
                        
//#line 168 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 170 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                    }
                }
            }
        }
        
        
//#line 17 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public Main
                                                                                                 Main$$this$Main(
                                                                                                 ){
            
//#line 17 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return Main.this;
        }
        
        
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
// creation method for java code (1-phase java constructor)
        public Main(){this((java.lang.System[]) null);
                          Main$$init$S();}
        
        // constructor for non-virtual call
        final public Main Main$$init$S() { {
                                                  
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
;
                                                  
//#line 18 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"

                                                  
//#line 17 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
this.__fieldInitializers_Main();
                                              }
                                              return this;
                                              }
        
        
        
//#line 17 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public void
                                                                                                 __fieldInitializers_Main(
                                                                                                 ){
            
        }
    
}

