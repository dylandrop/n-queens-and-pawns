
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
final int t3880 =
                      this.
                        size;
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3882 =
                      (((x10.core.Int.$box(t3880))) + ("-Queens with "));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3881 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t3883 =
                      ((x10.util.ArrayList<Tile>)t3881).size$O();
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3884 =
                      ((t3882) + ((x10.core.Long.$box(t3883))));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3885 =
                      ((t3884) + (" pawns"));
                    
//#line 39 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3885;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public java.lang.String
                                                                                                                     typeName(
                                                                                                                     ){try {return x10.rtt.Types.typeName(this);}
                catch (java.lang.Throwable exc$5856) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$5856);
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
final int t3886 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3888 =
                      ((8191) * (((int)(t3886))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3887 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3889 =
                      x10.rtt.Types.hashCode(t3887);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3890 =
                      ((t3888) + (((int)(t3889))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t3890;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3891 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3893 =
                      ((8191) * (((int)(t3891))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3892 =
                      ((x10.util.ArrayList)(this.
                                              pawns));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3894 =
                      x10.rtt.Types.hashCode(((java.lang.Object)(t3892)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3895 =
                      ((t3893) + (((int)(t3894))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t3895;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3896 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3898 =
                      ((8191) * (((int)(t3896))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3897 =
                      this.
                        solutions;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3899 =
                      x10.rtt.Types.hashCode(t3897);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3900 =
                      ((t3898) + (((int)(t3899))));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
result = t3900;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3901 =
                      result;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3901;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     equals(
                                                                                                                     java.lang.Object other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t3902 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3903 =
                      Main.Input.$RTT.isInstance(t3902);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3904 =
                      !(t3903);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3904) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t3905 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3906 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t3905));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3907 =
                      this.equals$O(((Main.Input)(t3906)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3907;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     equals$O(
                                                                                                                     Main.Input other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3909 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3908 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3910 =
                      t3908.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t3914 =
                      ((int) t3909) ==
                    ((int) t3910);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3914) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3912 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3911 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3913 =
                          ((x10.util.ArrayList)(t3911.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3914 = x10.rtt.Equality.equalsequals((t3912),(t3913));
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t3918 =
                      t3914;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3918) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3916 =
                          this.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3915 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3917 =
                          t3915.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3918 = ((int) t3916) ==
                        ((int) t3917);
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3919 =
                      t3918;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3919;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     _struct_equals$O(
                                                                                                                     java.lang.Object other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t3920 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3921 =
                      Main.Input.$RTT.isInstance(t3920);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3922 =
                      !(t3921);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3922) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return false;
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.Object t3923 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3924 =
                      ((Main.Input)x10.rtt.Types.asStruct(Main.Input.$RTT,t3923));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3925 =
                      this._struct_equals$O(((Main.Input)(t3924)));
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3925;
                }
                
                
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final public boolean
                                                                                                                     _struct_equals$O(
                                                                                                                     Main.Input other){
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3927 =
                      this.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3926 =
                      other;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3928 =
                      t3926.
                        size;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t3932 =
                      ((int) t3927) ==
                    ((int) t3928);
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3932) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3930 =
                          ((x10.util.ArrayList)(this.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3929 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3931 =
                          ((x10.util.ArrayList)(t3929.
                                                  pawns));
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3932 = x10.rtt.Equality.equalsequals((t3930),(t3931));
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
boolean t3936 =
                      t3932;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3936) {
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3934 =
                          this.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input t3933 =
                          other;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3935 =
                          t3933.
                            solutions;
                        
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3936 = ((int) t3934) ==
                        ((int) t3935);
                    }
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3937 =
                      t3936;
                    
//#line 24 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t3937;
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
final x10.io.File t3938 =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(filename)))));
                
//#line 53 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
F = t3938;
            }}catch (final x10.io.FileNotFoundException id$0) {
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t3940 =
                  ((x10.io.Printer)(x10.io.Console.get$ERR()));
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3939 =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3941 =
                  ((t3939) + (" is not a valid file"));
                
//#line 56 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3940.println(((java.lang.Object)(t3941)));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3942 =
                  ((java.lang.String[])args.value)[(int)0L];
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3943 =
                  ((t3942) + (" is not a valid file"));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.IllegalArgumentException t3944 =
                  ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t3943)));
                
//#line 57 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
throw t3944;
            }
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.File t4052 =
              F;
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.ReaderIterator t4053 =
              t4052.lines();
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.lang.Iterator line4054 =
              ((x10.lang.Iterator<java.lang.String>)
                ((x10.io.ReaderIterator<java.lang.String>)t4053).iterator());
            
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4055 =
                  ((x10.lang.Iterator<java.lang.String>)line4054).hasNext$O();
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4055)) {
                    
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                }
                
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
L4056: {
//#line 59 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String line4057 =
                  ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line4054).next$G()));
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t4058 =
                  (line4057).length();
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4059 =
                  ((int) t4058) ==
                ((int) 0);
//#line 61 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4059) {
                    
//#line 62 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break L4056;
                }
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final char t4060 =
                  (line4057).charAt(((int)(0)));
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4061 =
                  ((char) t4060) ==
                ((char) '/');
//#line 64 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4061) {
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4062 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 65 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t4062.println(((java.lang.Object)(line4057)));
                    
//#line 66 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break L4056;
                }
//#line 69 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail v4063 =
                  x10.lang.StringHelper.split(";", line4057);
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4064 =
                  ((java.lang.String[])v4063.value)[(int)1L];
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4065 =
                  (t4064).trim();
//#line 71 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int size4066 =
                  java.lang.Integer.parseInt(t4065);
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4067 =
                  ((java.lang.String[])v4063.value)[(int)2L];
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4068 =
                  (t4067).trim();
//#line 72 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int solutions4069 =
                  java.lang.Integer.parseInt(t4068);
//#line 73 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList pawns4070 =
                  ((x10.util.ArrayList)(new x10.util.ArrayList<Tile>((java.lang.System[]) null, Tile.$RTT).x10$util$ArrayList$$init$S()));
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3847min4049 =
                  Main.CONF_PAWN_OFFSET;
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4050 =
                  ((x10.core.Rail<java.lang.String>)v4063).
                    size;
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3847max4051 =
                  ((t4050) - (((long)(1L))));
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long i4046 =
                  i3847min4049;{
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String[] v4063$value4098 =
                      ((java.lang.String[])v4063.value);
                    
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4047 =
                          i4046;
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4048 =
                          ((t4047) <= (((long)(i3847max4051))));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4048)) {
                            
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                        }
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i4043 =
                          i4046;
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4034 =
                          ((java.lang.String)v4063$value4098[(int)i4043]);
                        
//#line 75 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail coords4035 =
                          x10.lang.StringHelper.split(",", t4034);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4036 =
                          ((java.lang.String[])coords4035.value)[(int)0L];
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4037 =
                          (t4036).trim();
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t4038 =
                          java.lang.Integer.parseInt(t4037);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4039 =
                          ((java.lang.String[])coords4035.value)[(int)1L];
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4040 =
                          (t4039).trim();
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t4041 =
                          java.lang.Integer.parseInt(t4040);
                        
//#line 76 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Tile point4042 =
                          new Tile((java.lang.System[]) null).Tile$$init$S(t4038,
                                                                           t4041,
                                                                           ((int)(3)));
                        
//#line 77 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
((x10.util.ArrayList<Tile>)pawns4070).add__0x10$util$ArrayList$$T$O(((Tile)(point4042)));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4044 =
                          i4046;
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4045 =
                          ((t4044) + (((long)(1L))));
                        
//#line 74 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
i4046 = t4045;
                    }
                }
//#line 79 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Main.Input input4071 =
                  new Main.Input((java.lang.System[]) null).Main$Input$$init$S(((int)(size4066)),
                                                                               ((x10.util.ArrayList<Tile>)(pawns4070)),
                                                                               ((int)(solutions4069)), (Main.Input.__1$1Tile$2) null);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4072 =
                  ((long)(((int)(0))));
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4073 =
                  ((java.lang.String[])v4063.value)[(int)t4072];
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t4074 =
                  java.lang.Integer.parseInt(t4073);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4075 =
                  ((int) t4074) ==
                ((int) 0);
//#line 80 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4075) {
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4076 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4077 =
                      input4071.toString();
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4078 =
                      (("Test case: ") + (t4077));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4079 =
                      ((t4078) + ("....."));
                    
//#line 81 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t4076.print(((java.lang.String)(t4079)));
                    
//#line 82 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
Main.run_one_test$O(((Main.Input)(input4071)));
                } else {
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4080 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4081 =
                      input4071.toString();
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4082 =
                      (("Benchmark case: ") + (t4081));
                    
//#line 85 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t4080.println(((java.lang.Object)(t4082)));
                    
//#line 86 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final double time4083 =
                      Main.take_median$O(((Main.Input)(input4071)));
                }}
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
final Solver t3982 =
              solver;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3983 =
              input.
                size;
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3984 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 93 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long numberOfCombinations =
              t3982.solve__1$1Tile$2$O((int)(t3983),
                                       ((x10.util.ArrayList)(t3984)));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t3985 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3986 =
              (("The number of generated combinations is ") + ((x10.core.Long.$box(numberOfCombinations))));
            
//#line 94 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3985.println(((java.lang.Object)(t3986)));
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
              new Solver((java.lang.System[]) null).Solver$$init$S();
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final Solver t3987 =
              solver;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3988 =
              input.
                size;
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.util.ArrayList t3989 =
              ((x10.util.ArrayList)(input.
                                      pawns));
            
//#line 106 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long solutions =
              t3987.solve__1$1Tile$2$O((int)(t3988),
                                       ((x10.util.ArrayList)(t3989)));
            
//#line 107 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long end =
              java.lang.System.currentTimeMillis();
            
//#line 108 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long time_in_millis =
              ((end) - (((long)(start))));
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3990 =
              input.
                solutions;
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t3991 =
              ((long)(((int)(t3990))));
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t3998 =
              ((long) solutions) !=
            ((long) t3991);
            
//#line 110 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t3998) {
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t3995 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3992 =
                  (("Incorrect answer given:") + ((x10.core.Long.$box(solutions))));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3993 =
                  ((t3992) + (". Correct Answer: "));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final int t3994 =
                  input.
                    solutions;
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t3996 =
                  ((t3993) + ((x10.core.Int.$box(t3994))));
                
//#line 112 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3995.println(((java.lang.Object)(t3996)));
            } else {
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t3997 =
                  ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
//#line 114 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t3997.println(((java.lang.Object)("Correct Answer")));
            }
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t3999 =
              time_in_millis;
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4000 =
              ((long) t3999) ==
            ((long) 0L);
            
//#line 119 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4000) {
                
//#line 120 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
time_in_millis = 1L;
            }
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4001 =
              time_in_millis;
            
//#line 122 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t4001;
        }
        
        
//#line 128 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static double
                                                                                                              take_median$O(
                                                                                                              final Main.Input input){
            
//#line 130 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.core.Rail times =
              ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(3L)))));
            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3865min4095 =
              0L;
            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4096 =
              ((x10.core.Rail<x10.core.Long>)times).
                size;
            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long i3865max4097 =
              ((t4096) - (((long)(1L))));
            
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
long i4092 =
              i3865min4095;
            {
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long[] times$value4099 =
                  ((long[])times.value);
                
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4093 =
                      i4092;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4094 =
                      ((t4093) <= (((long)(i3865max4097))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (!(t4094)) {
                        
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
break;
                    }
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long index4089 =
                      i4092;
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4084 =
                      ((x10.io.Printer)(x10.io.Console.get$OUT()));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4085 =
                      ((index4089) + (((long)(1L))));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4086 =
                      (("Subtest #") + ((x10.core.Long.$box(t4085))));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4087 =
                      ((t4086) + (": "));
                    
//#line 134 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t4084.print(((java.lang.String)(t4087)));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4088 =
                      Main.run_one_test$O(((Main.Input)(input)));
                    
//#line 135 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
times$value4099[(int)index4089]=t4088;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4090 =
                      i4092;
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4091 =
                      ((t4090) + (((long)(1L))));
                    
//#line 132 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
i4092 = t4091;
                }
            }
            
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4013 =
              ((long[])times.value)[(int)0L];
            
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4014 =
              ((long[])times.value)[(int)1L];
            
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4015 =
              ((long[])times.value)[(int)2L];
            
//#line 138 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long med =
              Main.median$O((long)(t4013),
                            (long)(t4014),
                            (long)(t4015));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final x10.io.Printer t4026 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4016 =
              ((long[])times.value)[(int)0L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4017 =
              (("    Times (in milliseconds): [") + ((x10.core.Long.$box(t4016))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4018 =
              ((t4017) + (", "));
            
//#line 141 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4019 =
              ((long[])times.value)[(int)1L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4020 =
              ((t4018) + ((x10.core.Long.$box(t4019))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4021 =
              ((t4020) + (", "));
            
//#line 142 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final long t4022 =
              ((long[])times.value)[(int)2L];
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4023 =
              ((t4021) + ((x10.core.Long.$box(t4022))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4024 =
              ((t4023) + ("] ... median: "));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4025 =
              ((t4024) + ((x10.core.Long.$box(med))));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final java.lang.String t4027 =
              ((t4025) + ("\n"));
            
//#line 140 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
t4026.println(((java.lang.Object)(t4027)));
            
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final double t4028 =
              ((double)(long)(((long)(med))));
            
//#line 145 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return t4028;
        }
        
        
//#line 152 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
public static long
                                                                                                              median$O(
                                                                                                              final long v1,
                                                                                                              final long v2,
                                                                                                              final long v3){
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4033 =
              ((v1) > (((long)(v2))));
            
//#line 154 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4033) {
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4030 =
                  ((v3) > (((long)(v1))));
                
//#line 156 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4030) {
                    
//#line 157 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v1;
                } else {
                    
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4029 =
                      ((v3) > (((long)(v2))));
                    
//#line 158 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4029) {
                        
//#line 159 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v3;
                    } else {
                        
//#line 161 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                    }
                }
            } else {
                
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4032 =
                  ((v3) > (((long)(v2))));
                
//#line 165 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4032) {
                    
//#line 166 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
return v2;
                } else {
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
final boolean t4031 =
                      ((v3) > (((long)(v1))));
                    
//#line 167 "/Applications/x10dt/x10dt.app/Contents/MacOS/workspace/NQueensWithPawns/src/Main.x10"
if (t4031) {
                        
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

