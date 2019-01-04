.class public test
.super java/lang/Object

.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 3
	.limit locals 5

	bipush 3
	istore 0
	if_1:
	iload 0
	bipush 1
	if_icmpne elsestate_0
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test is 1"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	goto if_1_if_end
	elsestate_0:
	iload 0
	bipush 2
	if_icmpne elsestate_1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test is 2"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	goto if_1_if_end
	elsestate_1:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test is anders dan 1 of 2"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	if_1_if_end:
	return
.end method
