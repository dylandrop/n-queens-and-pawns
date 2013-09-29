
@x10.runtime.impl.java.X10Generated public class Main extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<Main> $RTT = x10.rtt.NamedType.<Main> make(
    "Main", Main.class
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Main $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
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
            public static x10.serialization.X10JavaSerializable $_deserialize_body(Main.Input $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            
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

                                                                                                             
//#line 23 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input this6339 =
                                                                                                               this;
                                                                                                             
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
final int t6177 =
                      this.
                        size;
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6179 =
                      (((x10.core.Int.$box(t6177))) + ("-Queens with "));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6178 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6180 =
                      ((x10.util.ArrayList<Tile>)t6178).size$O();
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6181 =
                      ((t6179) + ((x10.core.Long.$box(t6180))));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6182 =
                      ((t6181) + (" pawns"));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6182;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                                     typeName(
                                                                                                                     ){try {return x10.rtt.Types.typeName(this);}
                catch (java.lang.Throwable exc$11211) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$11211);
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
final int t6183 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6185 =
                      ((8191) * (((int)(t6183))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6184 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6186 =
                      x10.rtt.Types.hashCode(t6184);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6187 =
                      ((t6185) + (((int)(t6186))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t6187;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6188 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6190 =
                      ((8191) * (((int)(t6188))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6189 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6191 =
                      x10.rtt.Types.hashCode(((java.lang.Object)(t6189)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6192 =
                      ((t6190) + (((int)(t6191))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t6192;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6193 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6195 =
                      ((8191) * (((int)(t6193))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6194 =
                      this.
                        solutions;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6196 =
                      x10.rtt.Types.hashCode(t6194);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6197 =
                      ((t6195) + (((int)(t6196))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t6197;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6198 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6198;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     equals(
                                                                                                                     java.lang.Object other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t6199 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6200 =
                      Main.Input.$RTT.isInstance(t6199);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6201 =
                      !(t6200);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6201) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t6202 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6203 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t6202));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6204 =
                      this.equals$O(((Main.Input)(t6203)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6204;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     equals$O(
                                                                                                                     Main.Input other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6206 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6205 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6207 =
                      t6205.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t6211 =
                      ((int) t6206) ==
                    ((int) t6207);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6211) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6209 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6208 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6210 =
                          ((x10.util.ArrayList)(t6208.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6211 = x10.rtt.Equality.equalsequals((t6209),(t6210));
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t6215 =
                      t6211;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6215) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6213 =
                          this.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6212 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6214 =
                          t6212.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6215 = ((int) t6213) ==
                        ((int) t6214);
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6216 =
                      t6215;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6216;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     _struct_equals$O(
                                                                                                                     java.lang.Object other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t6217 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6218 =
                      Main.Input.$RTT.isInstance(t6217);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6219 =
                      !(t6218);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6219) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t6220 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6221 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t6220));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6222 =
                      this._struct_equals$O(((Main.Input)(t6221)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6222;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     _struct_equals$O(
                                                                                                                     Main.Input other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6224 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6223 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6225 =
                      t6223.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t6229 =
                      ((int) t6224) ==
                    ((int) t6225);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6229) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6227 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6226 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6228 =
                          ((x10.util.ArrayList)(t6226.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6229 = x10.rtt.Equality.equalsequals((t6227),(t6228));
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t6233 =
                      t6229;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6233) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6231 =
                          this.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6230 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6232 =
                          t6230.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6233 = ((int) t6231) ==
                        ((int) t6232);
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6234 =
                      t6233;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6234;
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
final x10.io.File alloc3960 =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null)));
                
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
alloc3960.x10$io$File$$init$S(((java.lang.String)(filename)));
                
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
F = alloc3960;
            }}catch (final x10.io.FileNotFoundException id$0) {
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6236 =
                  ((x10.io.Printer)(x10.io.Console.get$ERR()));
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6235 =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6237 =
                  ((t6235) + (" is not a valid file"));
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6236.println(((java.lang.Object)(t6237)));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6238 =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6239 =
                  ((t6238) + (" is not a valid file"));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.IllegalArgumentException t6240 =
                  ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t6239)));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
throw t6240;
            }
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t6357 =
              F;
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.ReaderIterator t6358 =
              t6357.lines();
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.lang.Iterator line6359 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.io.ReaderIterator<java.lang.String>)t6358).iterator());
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6360 =
                  ((x10.lang.Iterator<java.lang.String>)line6359).hasNext$O();
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t6360)) {
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                }
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
L6361: {
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String line6362 =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line6359).next$G()));
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6363 =
                  (line6362).length();
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6364 =
                  ((int) t6363) ==
                ((int) 0);
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6364) {
                    
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break L6361;
                }
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final char t6365 =
                  (line6362).charAt(((int)(0)));
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6366 =
                  ((char) t6365) ==
                ((char) '/');
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6366) {
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6367 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6367.println(((java.lang.Object)(line6362)));
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break L6361;
                }
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail v6368 =
                  x10.lang.StringHelper.split(";", line6362);
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6369 =
                  ((java.lang.String[])v6368.value)[(int)1L];
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6370 =
                  (t6369).trim();
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int size6371 =
                  java.lang.Integer.parseInt(t6370);
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6372 =
                  ((java.lang.String[])v6368.value)[(int)2L];
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6373 =
                  (t6372).trim();
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int solutions6374 =
                  java.lang.Integer.parseInt(t6373);
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList pawns6375 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT)));
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
pawns6375.x10$util$ArrayList$$init$S();
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6355 =
                  ((x10.core.Rail<java.lang.String>)v6368).
                    size;
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3999max6356 =
                  ((t6355) - (((long)(1L))));
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long i6352 =
                  3L;{
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String[] v6368$value6407 =
                      ((java.lang.String[])v6368.value);
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6353 =
                          i6352;
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6354 =
                          ((t6353) <= (((long)(i3999max6356))));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t6354)) {
                            
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                        }
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i6349 =
                          i6352;
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6346 =
                          ((java.lang.String)v6368$value6407[(int)i6349]);
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail coords6347 =
                          x10.lang.StringHelper.split(",", t6346);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Tile point6348 =
                          new Tile((java.lang.System[]) null);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6340 =
                          ((java.lang.String[])coords6347.value)[(int)0L];
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6341 =
                          (t6340).trim();
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6342 =
                          java.lang.Integer.parseInt(t6341);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6343 =
                          ((java.lang.String[])coords6347.value)[(int)1L];
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6344 =
                          (t6343).trim();
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6345 =
                          java.lang.Integer.parseInt(t6344);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
point6348.Tile$$init$S(t6342,
                                                                                                                                                  t6345,
                                                                                                                                                  ((int)(3)));
                        
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
((x10.util.ArrayList<Tile>)pawns6375).add__0x10$util$ArrayList$$T$O(((Tile)(point6348)));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6350 =
                          i6352;
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6351 =
                          ((t6350) + (((long)(1L))));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
i6352 = t6351;
                    }
                }
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input input6376 =
                  new Main.Input((java.lang.System[]) null);
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
input6376.Main$Input$$init$S(((int)(size6371)),
                                                                                                                                                                                            ((x10.util.ArrayList<Tile>)(pawns6375)),
                                                                                                                                                                                            ((int)(solutions6374)), (Main.Input.__1$1Tile$2) null);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6377 =
                  ((long)(((int)(0))));
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6378 =
                  ((java.lang.String[])v6368.value)[(int)t6377];
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6379 =
                  java.lang.Integer.parseInt(t6378);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6380 =
                  ((int) t6379) ==
                ((int) 0);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6380) {
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6381 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6382 =
                      input6376.toString();
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6383 =
                      (("Test case: ") + (t6382));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6384 =
                      ((t6383) + ("....."));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6381.print(((java.lang.String)(t6384)));
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
Main.run_one_test$O(((Main.Input)(input6376)));
                } else {
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6385 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6386 =
                      input6376.toString();
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6387 =
                      (("Benchmark case: ") + (t6386));
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6385.println(((java.lang.Object)(t6387)));
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final double time6388 =
                      Main.take_median$O(((Main.Input)(input6376)));
                }}
            }
        }
        
        
//#line 91 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static void
                                                                                                             comboTester(
                                                                                                             final Main.Input input){
            
//#line 92 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
Solver solver =
              new Solver((java.lang.System[]) null);
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6389 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6389.solutions = 0;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6390 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6390.arr = null;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6391 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6391.arr2 = null;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Solver t6281 =
              solver;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6282 =
              input.
                size;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6283 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long numberOfCombinations =
              t6281.solve__1$1Tile$2$O((int)(t6282),
                                       ((x10.util.ArrayList)(t6283)));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6284 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6285 =
              (("The number of generated combinations is ") + ((x10.core.Long.$box(numberOfCombinations))));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6284.println(((java.lang.Object)(t6285)));
        }
        
        
//#line 102 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static long
                                                                                                              run_one_test$O(
                                                                                                              final Main.Input input){
            
//#line 104 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long start =
              java.lang.System.currentTimeMillis();
            
//#line 105 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
Solver solver =
              new Solver((java.lang.System[]) null);
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6392 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6392.solutions = 0;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6393 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6393.arr = null;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6394 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6394.arr2 = null;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Solver t6289 =
              solver;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6290 =
              input.
                size;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6291 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long solutions =
              t6289.solve__1$1Tile$2$O((int)(t6290),
                                       ((x10.util.ArrayList)(t6291)));
            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long end =
              java.lang.System.currentTimeMillis();
            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long time_in_millis =
              ((end) - (((long)(start))));
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6292 =
              input.
                solutions;
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6293 =
              ((long)(((int)(t6292))));
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6302 =
              ((long) solutions) !=
            ((long) t6293);
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6302) {
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6297 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6294 =
                  (("Incorrect answer given:") + ((x10.core.Long.$box(solutions))));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6295 =
                  ((t6294) + (". Correct Answer: "));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6296 =
                  input.
                    solutions;
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6298 =
                  ((t6295) + ((x10.core.Int.$box(t6296))));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6297.println(((java.lang.Object)(t6298)));
            } else {
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6300 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6299 =
                  time_in_millis;
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6301 =
                  (("Correct Answer and it took ") + ((x10.core.Long.$box(t6299))));
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6300.println(((java.lang.Object)(t6301)));
            }
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6303 =
              time_in_millis;
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6304 =
              ((long) t6303) ==
            ((long) 0L);
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6304) {
                
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
time_in_millis = 1L;
            }
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6305 =
              time_in_millis;
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6305;
        }
        
        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static double
                                                                                                              take_median$O(
                                                                                                              final Main.Input input){
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail times =
              ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(3L)))));
            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i4017max6406 =
              ((3L) - (((long)(1L))));
            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long i6403 =
              0L;
            {
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long[] times$value6408 =
                  ((long[])times.value);
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6404 =
                      i6403;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6405 =
                      ((t6404) <= (((long)(i4017max6406))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t6405)) {
                        
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                    }
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long index6400 =
                      i6403;
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6395 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6396 =
                      ((index6400) + (((long)(1L))));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6397 =
                      (("Subtest #") + ((x10.core.Long.$box(t6396))));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6398 =
                      ((t6397) + (": "));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6395.print(((java.lang.String)(t6398)));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6399 =
                      Main.run_one_test$O(((Main.Input)(input)));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
times$value6408[(int)index6400]=t6399;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6401 =
                      i6403;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6402 =
                      ((t6401) + (((long)(1L))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
i6403 = t6402;
                }
            }
            
//#line 152 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long v6154 =
              ((long[])times.value)[(int)0L];
            
//#line 152 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long v6155 =
              ((long[])times.value)[(int)1L];
            
//#line 152 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long v6156 =
              ((long[])times.value)[(int)2L];
            
//#line 152 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long ret6157 =
               0;
            
//#line 153 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
__ret6158: {
//#line 154 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6320 =
              ((v6154) > (((long)(v6155))));
//#line 154 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6320) {
                
//#line 156 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6317 =
                  ((v6156) > (((long)(v6154))));
                
//#line 156 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6317) {
                    
//#line 157 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret6157 = v6154;
                    
//#line 157 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret6158;
                } else {
                    
//#line 158 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6316 =
                      ((v6156) > (((long)(v6155))));
                    
//#line 158 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6316) {
                        
//#line 159 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret6157 = v6156;
                        
//#line 159 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret6158;
                    } else {
                        
//#line 161 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret6157 = v6155;
                        
//#line 161 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret6158;
                    }
                }
            } else {
                
//#line 165 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6319 =
                  ((v6156) > (((long)(v6155))));
                
//#line 165 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6319) {
                    
//#line 166 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret6157 = v6155;
                    
//#line 166 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret6158;
                } else {
                    
//#line 167 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6318 =
                      ((v6156) > (((long)(v6154))));
                    
//#line 167 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6318) {
                        
//#line 168 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret6157 = v6156;
                        
//#line 168 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret6158;
                    } else {
                        
//#line 170 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret6157 = v6154;
                        
//#line 170 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret6158;
                    }
                }
            }}
            
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long med =
              ret6157;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6331 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6321 =
              ((long[])times.value)[(int)0L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6322 =
              (("    Times (in milliseconds): [") + ((x10.core.Long.$box(t6321))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6323 =
              ((t6322) + (", "));
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6324 =
              ((long[])times.value)[(int)1L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6325 =
              ((t6323) + ((x10.core.Long.$box(t6324))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6326 =
              ((t6325) + (", "));
            
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6327 =
              ((long[])times.value)[(int)2L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6328 =
              ((t6326) + ((x10.core.Long.$box(t6327))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6329 =
              ((t6328) + ("] ... median: "));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6330 =
              ((t6329) + ((x10.core.Long.$box(med))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6332 =
              ((t6330) + ("\n"));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6331.println(((java.lang.Object)(t6332)));
            
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final double t6333 =
              ((double)(long)(((long)(med))));
            
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6333;
        }
        
        
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static long
                                                                                                              median$O(
                                                                                                              final long v1,
                                                                                                              final long v2,
                                                                                                              final long v3){
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6338 =
              ((v1) > (((long)(v2))));
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6338) {
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6335 =
                  ((v3) > (((long)(v1))));
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6335) {
                    
//#line 157 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                } else {
                    
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6334 =
                      ((v3) > (((long)(v2))));
                    
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6334) {
                        
//#line 159 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 161 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                    }
                }
            } else {
                
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6337 =
                  ((v3) > (((long)(v2))));
                
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6337) {
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                } else {
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6336 =
                      ((v3) > (((long)(v1))));
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6336) {
                        
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

                                                  
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main this6174 =
                                                    this;
                                              }
                                              return this;
                                              }
        
        
        
//#line 17 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public void
                                                                                                             __fieldInitializers_Main(
                                                                                                             ){
            
        }
    
}

