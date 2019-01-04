.class public test
.super java/lang/Object

.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 21
	.limit locals 3

	bipush 5
	istore 0
	ldc "stringtest"
	astore 1
	iconst_1
	istore 2
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 0
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 2
	invokevirtual java/io/PrintStream/println(Z)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test string"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic java/lang/System/out Ljava/io/PrintStream;
	bipush 4
	bipush 4
	iadd
	bipush 5
	bipush 5
	imul
	imul
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method
