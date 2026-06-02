After using javap for inspecting bytecode i got the following output in the terminal

BytecodeDemo
Compiled from "BytecodeDemo.java"
public class BytecodeDemo {
public BytecodeDemo();
Code:
0: aload_0
1: invokespecial #1 // Method java/lang/Object."<init>":()V
4: return

public int add(int, int);
Code:
0: iload_1
1: iload_2
2: iadd
3: ireturn

public static void main(java.lang.String[]);
Code:
0: new #7 // class BytecodeDemo
3: dup
4: invokespecial #9 // Method "<init>":()V
7: astore_1
8: aload_1
9: bipush 10
11: bipush 20
13: invokevirtual #10 // Method add:(II)I
16: istore_2
17: getstatic #14 // Field java/lang/System.out:Ljava/io/PrintStream;
20: iload_2
21: invokedynamic #20, 0 // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
26: invokevirtual #24 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
29: return
}
