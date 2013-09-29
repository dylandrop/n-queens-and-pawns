
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
final Main.Input this6146 =
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
final int t5988 =
                      this.
                        size;
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t5990 =
                      (((x10.core.Int.$box(t5988))) + ("-Queens with "));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t5989 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t5991 =
                      ((x10.util.ArrayList<Tile>)t5989).size$O();
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t5992 =
                      ((t5990) + ((x10.core.Long.$box(t5991))));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t5993 =
                      ((t5992) + (" pawns"));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t5993;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                                     typeName(
                                                                                                                     ){try {return x10.rtt.Types.typeName(this);}
                catch (java.lang.Throwable exc$9767) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$9767);
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
final int t5994 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t5996 =
                      ((8191) * (((int)(t5994))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t5995 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t5997 =
                      x10.rtt.Types.hashCode(t5995);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t5998 =
                      ((t5996) + (((int)(t5997))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t5998;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t5999 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6001 =
                      ((8191) * (((int)(t5999))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6000 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6002 =
                      x10.rtt.Types.hashCode(((java.lang.Object)(t6000)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6003 =
                      ((t6001) + (((int)(t6002))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t6003;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6004 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6006 =
                      ((8191) * (((int)(t6004))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6005 =
                      this.
                        solutions;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6007 =
                      x10.rtt.Types.hashCode(t6005);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6008 =
                      ((t6006) + (((int)(t6007))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t6008;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6009 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6009;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     equals(
                                                                                                                     java.lang.Object other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t6010 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6011 =
                      Main.Input.$RTT.isInstance(t6010);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6012 =
                      !(t6011);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6012) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t6013 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6014 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t6013));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6015 =
                      this.equals$O(((Main.Input)(t6014)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6015;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     equals$O(
                                                                                                                     Main.Input other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6017 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6016 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6018 =
                      t6016.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t6022 =
                      ((int) t6017) ==
                    ((int) t6018);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6022) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6020 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6019 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6021 =
                          ((x10.util.ArrayList)(t6019.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6022 = x10.rtt.Equality.equalsequals((t6020),(t6021));
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t6026 =
                      t6022;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6026) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6024 =
                          this.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6023 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6025 =
                          t6023.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6026 = ((int) t6024) ==
                        ((int) t6025);
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6027 =
                      t6026;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6027;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     _struct_equals$O(
                                                                                                                     java.lang.Object other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t6028 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6029 =
                      Main.Input.$RTT.isInstance(t6028);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6030 =
                      !(t6029);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6030) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t6031 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6032 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t6031));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6033 =
                      this._struct_equals$O(((Main.Input)(t6032)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6033;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     _struct_equals$O(
                                                                                                                     Main.Input other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6035 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6034 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6036 =
                      t6034.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t6040 =
                      ((int) t6035) ==
                    ((int) t6036);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6040) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6038 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6037 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6039 =
                          ((x10.util.ArrayList)(t6037.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6040 = x10.rtt.Equality.equalsequals((t6038),(t6039));
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t6044 =
                      t6040;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6044) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6042 =
                          this.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t6041 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6043 =
                          t6041.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6044 = ((int) t6042) ==
                        ((int) t6043);
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6045 =
                      t6044;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6045;
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
final x10.io.File alloc3809 =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null)));
                
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
alloc3809.x10$io$File$$init$S(((java.lang.String)(filename)));
                
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
F = alloc3809;
            }}catch (final x10.io.FileNotFoundException id$0) {
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6047 =
                  ((x10.io.Printer)(x10.io.Console.get$ERR()));
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6046 =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6048 =
                  ((t6046) + (" is not a valid file"));
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6047.println(((java.lang.Object)(t6048)));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6049 =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6050 =
                  ((t6049) + (" is not a valid file"));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.IllegalArgumentException t6051 =
                  ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t6050)));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
throw t6051;
            }
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t6164 =
              F;
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.ReaderIterator t6165 =
              t6164.lines();
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.lang.Iterator line6166 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.io.ReaderIterator<java.lang.String>)t6165).iterator());
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6167 =
                  ((x10.lang.Iterator<java.lang.String>)line6166).hasNext$O();
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t6167)) {
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                }
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
L6168: {
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String line6169 =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line6166).next$G()));
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6170 =
                  (line6169).length();
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6171 =
                  ((int) t6170) ==
                ((int) 0);
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6171) {
                    
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break L6168;
                }
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final char t6172 =
                  (line6169).charAt(((int)(0)));
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6173 =
                  ((char) t6172) ==
                ((char) '/');
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6173) {
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6174 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6174.println(((java.lang.Object)(line6169)));
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break L6168;
                }
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail v6175 =
                  x10.lang.StringHelper.split(";", line6169);
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6176 =
                  ((java.lang.String[])v6175.value)[(int)1L];
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6177 =
                  (t6176).trim();
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int size6178 =
                  java.lang.Integer.parseInt(t6177);
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6179 =
                  ((java.lang.String[])v6175.value)[(int)2L];
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6180 =
                  (t6179).trim();
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int solutions6181 =
                  java.lang.Integer.parseInt(t6180);
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList pawns6182 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT)));
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
pawns6182.x10$util$ArrayList$$init$S();
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6162 =
                  ((x10.core.Rail<java.lang.String>)v6175).
                    size;
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3848max6163 =
                  ((t6162) - (((long)(1L))));
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long i6159 =
                  3L;{
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String[] v6175$value6212 =
                      ((java.lang.String[])v6175.value);
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6160 =
                          i6159;
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6161 =
                          ((t6160) <= (((long)(i3848max6163))));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t6161)) {
                            
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                        }
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i6156 =
                          i6159;
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6153 =
                          ((java.lang.String)v6175$value6212[(int)i6156]);
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail coords6154 =
                          x10.lang.StringHelper.split(",", t6153);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Tile point6155 =
                          new Tile((java.lang.System[]) null);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6147 =
                          ((java.lang.String[])coords6154.value)[(int)0L];
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6148 =
                          (t6147).trim();
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6149 =
                          java.lang.Integer.parseInt(t6148);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6150 =
                          ((java.lang.String[])coords6154.value)[(int)1L];
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6151 =
                          (t6150).trim();
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6152 =
                          java.lang.Integer.parseInt(t6151);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
point6155.Tile$$init$S(t6149,
                                                                                                                                                  t6152,
                                                                                                                                                  ((int)(3)));
                        
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
((x10.util.ArrayList<Tile>)pawns6182).add__0x10$util$ArrayList$$T$O(((Tile)(point6155)));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6157 =
                          i6159;
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6158 =
                          ((t6157) + (((long)(1L))));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
i6159 = t6158;
                    }
                }
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input input6183 =
                  new Main.Input((java.lang.System[]) null);
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
input6183.Main$Input$$init$S(((int)(size6178)),
                                                                                                                                                                                            ((x10.util.ArrayList<Tile>)(pawns6182)),
                                                                                                                                                                                            ((int)(solutions6181)), (Main.Input.__1$1Tile$2) null);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6184 =
                  ((long)(((int)(0))));
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6185 =
                  ((java.lang.String[])v6175.value)[(int)t6184];
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6186 =
                  java.lang.Integer.parseInt(t6185);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6187 =
                  ((int) t6186) ==
                ((int) 0);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6187) {
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6188 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6189 =
                      input6183.toString();
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6190 =
                      (("Test case: ") + (t6189));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6191 =
                      ((t6190) + ("....."));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6188.print(((java.lang.String)(t6191)));
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
Main.run_one_test$O(((Main.Input)(input6183)));
                } else {
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6192 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6193 =
                      input6183.toString();
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6194 =
                      (("Benchmark case: ") + (t6193));
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6192.println(((java.lang.Object)(t6194)));
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final double time6195 =
                      Main.take_median$O(((Main.Input)(input6183)));
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
final Solver t6196 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6196.solutions = 0;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6197 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6197.arr = null;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Solver t6091 =
              solver;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6092 =
              input.
                size;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6093 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long numberOfCombinations =
              t6091.solve__1$1Tile$2$O((int)(t6092),
                                       ((x10.util.ArrayList)(t6093)));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6094 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6095 =
              (("The number of generated combinations is ") + ((x10.core.Long.$box(numberOfCombinations))));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6094.println(((java.lang.Object)(t6095)));
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
final Solver t6198 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6198.solutions = 0;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
final Solver t6199 =
              solver;
            
//#line 14 .. "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Solver.x10"
t6199.arr = null;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Solver t6098 =
              solver;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6099 =
              input.
                size;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t6100 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long solutions =
              t6098.solve__1$1Tile$2$O((int)(t6099),
                                       ((x10.util.ArrayList)(t6100)));
            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long end =
              java.lang.System.currentTimeMillis();
            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long time_in_millis =
              ((end) - (((long)(start))));
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6101 =
              input.
                solutions;
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6102 =
              ((long)(((int)(t6101))));
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6109 =
              ((long) solutions) !=
            ((long) t6102);
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6109) {
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6106 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6103 =
                  (("Incorrect answer given:") + ((x10.core.Long.$box(solutions))));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6104 =
                  ((t6103) + (". Correct Answer: "));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t6105 =
                  input.
                    solutions;
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6107 =
                  ((t6104) + ((x10.core.Int.$box(t6105))));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6106.println(((java.lang.Object)(t6107)));
            } else {
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6108 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6108.println(((java.lang.Object)("Correct Answer")));
            }
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6110 =
              time_in_millis;
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6111 =
              ((long) t6110) ==
            ((long) 0L);
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6111) {
                
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
time_in_millis = 1L;
            }
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6112 =
              time_in_millis;
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6112;
        }
        
        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static double
                                                                                                              take_median$O(
                                                                                                              final Main.Input input){
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail times =
              ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(3L)))));
            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3866max6211 =
              ((3L) - (((long)(1L))));
            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long i6208 =
              0L;
            {
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long[] times$value6213 =
                  ((long[])times.value);
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6209 =
                      i6208;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6210 =
                      ((t6209) <= (((long)(i3866max6211))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t6210)) {
                        
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                    }
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long index6205 =
                      i6208;
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6200 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6201 =
                      ((index6205) + (((long)(1L))));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6202 =
                      (("Subtest #") + ((x10.core.Long.$box(t6201))));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6203 =
                      ((t6202) + (": "));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6200.print(((java.lang.String)(t6203)));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6204 =
                      Main.run_one_test$O(((Main.Input)(input)));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
times$value6213[(int)index6205]=t6204;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6206 =
                      i6208;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6207 =
                      ((t6206) + (((long)(1L))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
i6208 = t6207;
                }
            }
            
//#line 152 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long v5965 =
              ((long[])times.value)[(int)0L];
            
//#line 152 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long v5966 =
              ((long[])times.value)[(int)1L];
            
//#line 152 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long v5967 =
              ((long[])times.value)[(int)2L];
            
//#line 152 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long ret5968 =
               0;
            
//#line 153 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
__ret5969: {
//#line 154 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6127 =
              ((v5965) > (((long)(v5966))));
//#line 154 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6127) {
                
//#line 156 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6124 =
                  ((v5967) > (((long)(v5965))));
                
//#line 156 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6124) {
                    
//#line 157 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret5968 = v5965;
                    
//#line 157 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret5969;
                } else {
                    
//#line 158 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6123 =
                      ((v5967) > (((long)(v5966))));
                    
//#line 158 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6123) {
                        
//#line 159 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret5968 = v5967;
                        
//#line 159 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret5969;
                    } else {
                        
//#line 161 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret5968 = v5966;
                        
//#line 161 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret5969;
                    }
                }
            } else {
                
//#line 165 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6126 =
                  ((v5967) > (((long)(v5966))));
                
//#line 165 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6126) {
                    
//#line 166 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret5968 = v5966;
                    
//#line 166 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret5969;
                } else {
                    
//#line 167 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6125 =
                      ((v5967) > (((long)(v5965))));
                    
//#line 167 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6125) {
                        
//#line 168 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret5968 = v5967;
                        
//#line 168 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret5969;
                    } else {
                        
//#line 170 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
ret5968 = v5965;
                        
//#line 170 . "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break __ret5969;
                    }
                }
            }}
            
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long med =
              ret5968;
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t6138 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6128 =
              ((long[])times.value)[(int)0L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6129 =
              (("    Times (in milliseconds): [") + ((x10.core.Long.$box(t6128))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6130 =
              ((t6129) + (", "));
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6131 =
              ((long[])times.value)[(int)1L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6132 =
              ((t6130) + ((x10.core.Long.$box(t6131))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6133 =
              ((t6132) + (", "));
            
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t6134 =
              ((long[])times.value)[(int)2L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6135 =
              ((t6133) + ((x10.core.Long.$box(t6134))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6136 =
              ((t6135) + ("] ... median: "));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6137 =
              ((t6136) + ((x10.core.Long.$box(med))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t6139 =
              ((t6137) + ("\n"));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t6138.println(((java.lang.Object)(t6139)));
            
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final double t6140 =
              ((double)(long)(((long)(med))));
            
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t6140;
        }
        
        
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static long
                                                                                                              median$O(
                                                                                                              final long v1,
                                                                                                              final long v2,
                                                                                                              final long v3){
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6145 =
              ((v1) > (((long)(v2))));
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6145) {
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6142 =
                  ((v3) > (((long)(v1))));
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6142) {
                    
//#line 157 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                } else {
                    
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6141 =
                      ((v3) > (((long)(v2))));
                    
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6141) {
                        
//#line 159 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 161 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                    }
                }
            } else {
                
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6144 =
                  ((v3) > (((long)(v2))));
                
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6144) {
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                } else {
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t6143 =
                      ((v3) > (((long)(v1))));
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t6143) {
                        
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
final Main this5985 =
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

