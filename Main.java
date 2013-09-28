
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
final int t4210 =
                      this.
                        size;
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4212 =
                      (((x10.core.Int.$box(t4210))) + ("-Queens with "));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4211 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4213 =
                      ((x10.util.ArrayList<Tile>)t4211).size$O();
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4214 =
                      ((t4212) + ((x10.core.Long.$box(t4213))));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4215 =
                      ((t4214) + (" pawns"));
                    
//#line 39 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4215;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                         typeName(
                                                                                                         ){try {return x10.rtt.Types.typeName(this);}
                catch (java.lang.Throwable exc$5174) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5174);
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
final int t4216 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4218 =
                      ((8191) * (((int)(t4216))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4217 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4219 =
                      x10.rtt.Types.hashCode(t4217);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4220 =
                      ((t4218) + (((int)(t4219))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4220;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4221 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4223 =
                      ((8191) * (((int)(t4221))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4222 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4224 =
                      x10.rtt.Types.hashCode(((java.lang.Object)(t4222)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4225 =
                      ((t4223) + (((int)(t4224))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4225;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4226 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4228 =
                      ((8191) * (((int)(t4226))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4227 =
                      this.
                        solutions;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4229 =
                      x10.rtt.Types.hashCode(t4227);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4230 =
                      ((t4228) + (((int)(t4229))));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
result = t4230;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4231 =
                      result;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4231;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         equals(
                                                                                                         java.lang.Object other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4232 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4233 =
                      Main.Input.$RTT.isInstance(t4232);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4234 =
                      !(t4233);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4234) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4235 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4236 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t4235));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4237 =
                      this.equals$O(((Main.Input)(t4236)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4237;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         equals$O(
                                                                                                         Main.Input other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4239 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4238 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4240 =
                      t4238.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4244 =
                      ((int) t4239) ==
                    ((int) t4240);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4244) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4242 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4241 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4243 =
                          ((x10.util.ArrayList)(t4241.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4244 = x10.rtt.Equality.equalsequals((t4242),(t4243));
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4248 =
                      t4244;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4248) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4246 =
                          this.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4245 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4247 =
                          t4245.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4248 = ((int) t4246) ==
                        ((int) t4247);
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4249 =
                      t4248;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4249;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         _struct_equals$O(
                                                                                                         java.lang.Object other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4250 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4251 =
                      Main.Input.$RTT.isInstance(t4250);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4252 =
                      !(t4251);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4252) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t4253 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4254 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t4253));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4255 =
                      this._struct_equals$O(((Main.Input)(t4254)));
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4255;
                }
                
                
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                         _struct_equals$O(
                                                                                                         Main.Input other){
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4257 =
                      this.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4256 =
                      other;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4258 =
                      t4256.
                        size;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4262 =
                      ((int) t4257) ==
                    ((int) t4258);
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4262) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4260 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4259 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4261 =
                          ((x10.util.ArrayList)(t4259.
                                                  pawns));
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4262 = x10.rtt.Equality.equalsequals((t4260),(t4261));
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
boolean t4266 =
                      t4262;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4266) {
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4264 =
                          this.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t4263 =
                          other;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4265 =
                          t4263.
                            solutions;
                        
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4266 = ((int) t4264) ==
                        ((int) t4265);
                    }
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4267 =
                      t4266;
                    
//#line 24 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return t4267;
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
final long t4268 =
                  ((long)(((int)(0))));
                
//#line 52 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String filename =
                  ((java.lang.String[])args.value)[(int)t4268];
                
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t4269 =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(filename)))));
                
//#line 53 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
F = t4269;
            }}catch (final x10.io.FileNotFoundException id$3) {
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4272 =
                  ((x10.io.Printer)(x10.io.Console.get$ERR()));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4270 =
                  ((long)(((int)(0))));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4271 =
                  ((java.lang.String[])args.value)[(int)t4270];
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4273 =
                  ((t4271) + (" is not a valid file"));
                
//#line 56 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4272.println(((java.lang.Object)(t4273)));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4274 =
                  ((long)(((int)(0))));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4275 =
                  ((java.lang.String[])args.value)[(int)t4274];
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4276 =
                  ((t4275) + (" is not a valid file"));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.IllegalArgumentException t4277 =
                  ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t4276)));
                
//#line 57 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
throw t4277;
            }
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t4342 =
              F;
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.ReaderIterator t4343 =
              t4342.lines();
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.lang.Iterator line4344 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.io.ReaderIterator<java.lang.String>)t4343).iterator());
            
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                        true;
                                                                                                        ) {
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4345 =
                  ((x10.lang.Iterator<java.lang.String>)line4344).hasNext$O();
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4345)) {
                    
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break;
                }
                
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
L4346: {
//#line 59 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String line4347 =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line4344).next$G()));
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4348 =
                  (line4347).length();
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4349 =
                  ((int) t4348) ==
                ((int) 0);
//#line 61 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4349) {
                    
//#line 62 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break L4346;
                }
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final char t4350 =
                  (line4347).charAt(((int)(0)));
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4351 =
                  ((char) t4350) ==
                ((char) '/');
//#line 64 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4351) {
                    
//#line 65 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4352 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 65 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4352.println(((java.lang.Object)(line4347)));
                    
//#line 66 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break L4346;
                }
//#line 69 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail v4353 =
                  x10.lang.StringHelper.split(";", line4347);
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4354 =
                  ((long)(((int)(1))));
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4355 =
                  ((java.lang.String[])v4353.value)[(int)t4354];
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4356 =
                  (t4355).trim();
//#line 71 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int size4357 =
                  java.lang.Integer.parseInt(t4356);
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4358 =
                  ((long)(((int)(2))));
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4359 =
                  ((java.lang.String[])v4353.value)[(int)t4358];
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4360 =
                  (t4359).trim();
//#line 72 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int solutions4361 =
                  java.lang.Integer.parseInt(t4360);
//#line 73 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList pawns4362 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4337 =
                  Main.CONF_PAWN_OFFSET;
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4193min4338 =
                  ((long)(((int)(t4337))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4339 =
                  ((x10.core.Rail<java.lang.String>)v4353).
                    size;
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4340 =
                  ((long)(((int)(1))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4193max4341 =
                  ((t4339) - (((long)(t4340))));
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
long i4334 =
                  i4193min4338;{
                    
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String[] v4353$value4364 =
                      ((java.lang.String[])v4353.value);
                    
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                true;
                                                                                                                ) {
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4335 =
                          i4334;
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4336 =
                          ((t4335) <= (((long)(i4193max4341))));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4336)) {
                            
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
break;
                        }
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long i4331 =
                          i4334;
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4320 =
                          ((java.lang.String)v4353$value4364[(int)i4331]);
                        
//#line 75 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail coords4321 =
                          x10.lang.StringHelper.split(",", t4320);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4322 =
                          ((long)(((int)(0))));
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4323 =
                          ((java.lang.String[])coords4321.value)[(int)t4322];
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4324 =
                          (t4323).trim();
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4325 =
                          java.lang.Integer.parseInt(t4324);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4326 =
                          ((long)(((int)(1))));
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4327 =
                          ((java.lang.String[])coords4321.value)[(int)t4326];
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4328 =
                          (t4327).trim();
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4329 =
                          java.lang.Integer.parseInt(t4328);
                        
//#line 76 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Tile point4330 =
                          new Tile((java.lang.System[]) null).Tile$$init$S(t4325,
                                                                           t4329,
                                                                           ((int)(3)));
                        
//#line 77 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
((x10.util.ArrayList<Tile>)pawns4362).add__0x10$util$ArrayList$$T$O(((Tile)(point4330)));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4332 =
                          i4334;
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long t4333 =
                          ((t4332) + (((long)(1L))));
                        
//#line 74 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
i4334 = t4333;
                    }
                }
//#line 79 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input input4363 =
                  new Main.Input((java.lang.System[]) null).Main$Input$$init$S(((int)(size4357)),
                                                                               ((x10.util.ArrayList<Tile>)(pawns4362)),
                                                                               ((int)(solutions4361)), (Main.Input.__1$1Tile$2) null);
//#line 83 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
Main.comboTester(((Main.Input)(input4363)));}
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
final Solver t4310 =
              solver;
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final int t4311 =
              input.
                size;
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t4312 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 93 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final long numberOfCombinations =
              t4310.solve__1$1Tile$2$O((int)(t4311),
                                       ((x10.util.ArrayList)(t4312)));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4313 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4314 =
              (("The number of generated combinations is ") + ((x10.core.Long.$box(numberOfCombinations))));
            
//#line 94 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
t4313.println(((java.lang.Object)(t4314)));
        }
        
        
//#line 152 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
public static long
                                                                                                  median$O(
                                                                                                  final long v1,
                                                                                                  final long v2,
                                                                                                  final long v3){
            
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4319 =
              ((v1) > (((long)(v2))));
            
//#line 154 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4319) {
                
//#line 156 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4316 =
                  ((v3) > (((long)(v1))));
                
//#line 156 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4316) {
                    
//#line 157 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                } else {
                    
//#line 158 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4315 =
                      ((v3) > (((long)(v2))));
                    
//#line 158 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4315) {
                        
//#line 159 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 161 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                    }
                }
            } else {
                
//#line 165 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4318 =
                  ((v3) > (((long)(v2))));
                
//#line 165 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4318) {
                    
//#line 166 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                } else {
                    
//#line 167 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4317 =
                      ((v3) > (((long)(v1))));
                    
//#line 167 "/Users/dylandrop/Downloads/x10dt/workspace/NQueensWithPawns/src/Main.x10"
if (t4317) {
                        
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

