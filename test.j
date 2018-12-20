.class public test
.super java/lang/Object

.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 3

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Hello dit is een test"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic java/lang/System/out Ljava/io/PrintStream;
	bipush 10
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method
