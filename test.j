.class public test
.super java/lang/Object

; standard initializer (calls java.lang.Object's initializer)
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

; main() method
.method public static main([Ljava/lang/String;)V
	.limit stack 2

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Hello dit is een test"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	return
.end method
