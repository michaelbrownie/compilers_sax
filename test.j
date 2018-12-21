.class public test
.super java/lang/Object

.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 13
	.limit locals 3

	bipush 5
	istore 0
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 0
	invokevirtual java/io/PrintStream/println(I)V
	ldc "Seeeh bier"
	astore 1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	iconst_1
	istore 2
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 2
	invokevirtual java/io/PrintStream/println(Z)V
	return
.end method
