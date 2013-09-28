
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
final int t4237 =
                      this.
                        size;
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4239 =
                      (((x10.core.Int.$box(t4237))) + ("-Queens with "));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4238 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4240 =
                      ((x10.util.ArrayList<Tile>)t4238).size$O();
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4241 =
                      ((t4239) + ((x10.core.Long.$box(t4240))));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4242 =
                      ((t4241) + (" pawns"));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4242;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                         typeName(
                                                                                                         ){try {return x10.rtt.Types.typeName(this);}
                catch (java.lang.Throwable exc$5275) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5275);
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
final int t4243 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4245 =
                      ((8191) * (((int)(t4243))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4244 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4246 =
                      x10.rtt.Types.hashCode(t4244);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4247 =
                      ((t4245) + (((int)(t4246))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4247;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4248 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4250 =
                      ((8191) * (((int)(t4248))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4249 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4251 =
                      x10.rtt.Types.hashCode(((java.lang.Object)(t4249)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4252 =
                      ((t4250) + (((int)(t4251))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4252;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4253 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4255 =
                      ((8191) * (((int)(t4253))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4254 =
                      this.
                        solutions;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4256 =
                      x10.rtt.Types.hashCode(t4254);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4257 =
                      ((t4255) + (((int)(t4256))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4257;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4258 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4258;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         equals(
                                                                                                         java.lang.Object other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4259 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4260 =
                      Main.Input.$RTT.isInstance(t4259);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4261 =
                      !(t4260);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4261) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4262 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4263 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t4262));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4264 =
                      this.equals$O(((Main.Input)(t4263)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4264;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         equals$O(
                                                                                                         Main.Input other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4266 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4265 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4267 =
                      t4265.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4271 =
                      ((int) t4266) ==
                    ((int) t4267);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4271) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4269 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4268 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4270 =
                          ((x10.util.ArrayList)(t4268.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4271 = x10.rtt.Equality.equalsequals((t4269),(t4270));
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4275 =
                      t4271;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4275) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4273 =
                          this.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4272 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4274 =
                          t4272.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4275 = ((int) t4273) ==
                        ((int) t4274);
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4276 =
                      t4275;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4276;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         _struct_equals$O(
                                                                                                         java.lang.Object other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4277 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4278 =
                      Main.Input.$RTT.isInstance(t4277);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4279 =
                      !(t4278);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4279) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4280 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4281 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t4280));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4282 =
                      this._struct_equals$O(((Main.Input)(t4281)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4282;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         _struct_equals$O(
                                                                                                         Main.Input other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4284 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4283 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4285 =
                      t4283.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4289 =
                      ((int) t4284) ==
                    ((int) t4285);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4289) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4287 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4286 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4288 =
                          ((x10.util.ArrayList)(t4286.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4289 = x10.rtt.Equality.equalsequals((t4287),(t4288));
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4293 =
                      t4289;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4293) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4291 =
                          this.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4290 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4292 =
                          t4290.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4293 = ((int) t4291) ==
                        ((int) t4292);
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4294 =
                      t4293;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4294;
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
final long t4295 =
                  ((long)(((int)(0))));
                
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String filename =
                  ((java.lang.String[])args.value)[(int)t4295];
                
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t4296 =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(filename)))));
                
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
F = t4296;
            }}catch (final x10.io.FileNotFoundException id$3) {
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4299 =
                  ((x10.io.Printer)(x10.io.Console.get$ERR()));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4297 =
                  ((long)(((int)(0))));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4298 =
                  ((java.lang.String[])args.value)[(int)t4297];
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4300 =
                  ((t4298) + (" is not a valid file"));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4299.println(((java.lang.Object)(t4300)));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4301 =
                  ((long)(((int)(0))));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4302 =
                  ((java.lang.String[])args.value)[(int)t4301];
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4303 =
                  ((t4302) + (" is not a valid file"));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.IllegalArgumentException t4304 =
                  ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t4303)));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
throw t4304;
            }
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t4369 =
              F;
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.ReaderIterator t4370 =
              t4369.lines();
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.lang.Iterator line4371 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.io.ReaderIterator<java.lang.String>)t4370).iterator());
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                        true;
                                                                                                        ) {
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4372 =
                  ((x10.lang.Iterator<java.lang.String>)line4371).hasNext$O();
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4372)) {
                    
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break;
                }
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
L4373: {
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String line4374 =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line4371).next$G()));
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4375 =
                  (line4374).length();
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4376 =
                  ((int) t4375) ==
                ((int) 0);
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4376) {
                    
//#line 62 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break L4373;
                }
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final char t4377 =
                  (line4374).charAt(((int)(0)));
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4378 =
                  ((char) t4377) ==
                ((char) '/');
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4378) {
                    
//#line 65 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4379 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 65 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4379.println(((java.lang.Object)(line4374)));
                    
//#line 66 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break L4373;
                }
//#line 69 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail v4380 =
                  x10.lang.StringHelper.split(";", line4374);
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4381 =
                  ((long)(((int)(1))));
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4382 =
                  ((java.lang.String[])v4380.value)[(int)t4381];
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4383 =
                  (t4382).trim();
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int size4384 =
                  java.lang.Integer.parseInt(t4383);
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4385 =
                  ((long)(((int)(2))));
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4386 =
                  ((java.lang.String[])v4380.value)[(int)t4385];
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4387 =
                  (t4386).trim();
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int solutions4388 =
                  java.lang.Integer.parseInt(t4387);
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList pawns4389 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4364 =
                  Main.CONF_PAWN_OFFSET;
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4220min4365 =
                  ((long)(((int)(t4364))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4366 =
                  ((x10.core.Rail<java.lang.String>)v4380).
                    size;
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4367 =
                  ((long)(((int)(1))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4220max4368 =
                  ((t4366) - (((long)(t4367))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
long i4361 =
                  i4220min4365;{
                    
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String[] v4380$value4391 =
                      ((java.lang.String[])v4380.value);
                    
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                true;
                                                                                                                ) {
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4362 =
                          i4361;
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4363 =
                          ((t4362) <= (((long)(i4220max4368))));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4363)) {
                            
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break;
                        }
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4358 =
                          i4361;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4347 =
                          ((java.lang.String)v4380$value4391[(int)i4358]);
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail coords4348 =
                          x10.lang.StringHelper.split(",", t4347);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4349 =
                          ((long)(((int)(0))));
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4350 =
                          ((java.lang.String[])coords4348.value)[(int)t4349];
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4351 =
                          (t4350).trim();
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4352 =
                          java.lang.Integer.parseInt(t4351);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4353 =
                          ((long)(((int)(1))));
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4354 =
                          ((java.lang.String[])coords4348.value)[(int)t4353];
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4355 =
                          (t4354).trim();
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4356 =
                          java.lang.Integer.parseInt(t4355);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Tile point4357 =
                          new Tile((java.lang.System[]) null).Tile$$init$S(t4352,
                                                                           t4356,
                                                                           ((int)(3)));
                        
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
((x10.util.ArrayList<Tile>)pawns4389).add__0x10$util$ArrayList$$T$O(((Tile)(point4357)));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4359 =
                          i4361;
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4360 =
                          ((t4359) + (((long)(1L))));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
i4361 = t4360;
                    }
                }
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input input4390 =
                  new Main.Input((java.lang.System[]) null).Main$Input$$init$S(((int)(size4384)),
                                                                               ((x10.util.ArrayList<Tile>)(pawns4389)),
                                                                               ((int)(solutions4388)), (Main.Input.__1$1Tile$2) null);
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
Main.comboTester(((Main.Input)(input4390)));}
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
final Solver t4337 =
              solver;
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4338 =
              input.
                size;
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4339 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long numberOfCombinations =
              t4337.solve__1$1Tile$2$O((int)(t4338),
                                       ((x10.util.ArrayList)(t4339)));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4340 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4341 =
              (("The number of generated combinations is ") + ((x10.core.Long.$box(numberOfCombinations))));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4340.println(((java.lang.Object)(t4341)));
        }
        
        
//#line 152 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
public static long
                                                                                                  median$O(
                                                                                                  final long v1,
                                                                                                  final long v2,
                                                                                                  final long v3){
            
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4346 =
              ((v1) > (((long)(v2))));
            
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4346) {
                
//#line 156 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4343 =
                  ((v3) > (((long)(v1))));
                
//#line 156 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4343) {
                    
//#line 157 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                } else {
                    
//#line 158 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4342 =
                      ((v3) > (((long)(v2))));
                    
//#line 158 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4342) {
                        
//#line 159 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 161 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                    }
                }
            } else {
                
//#line 165 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4345 =
                  ((v3) > (((long)(v2))));
                
//#line 165 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4345) {
                    
//#line 166 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                } else {
                    
//#line 167 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4344 =
                      ((v3) > (((long)(v1))));
                    
//#line 167 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4344) {
                        
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

