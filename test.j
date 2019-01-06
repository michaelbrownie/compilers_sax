.class public test
.super java/lang/Object

.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 5
	.limit locals 3

	bipush 1
	istore 0
	bipush 3
	istore 1
	if_1:
	iconst_1
if_1_if_end
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test3"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	goto if_1_if_end
	if_1_if_end:
	return
.end method
