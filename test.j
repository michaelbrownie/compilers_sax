.class public test
.super java/lang/Object

.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 3
	.limit locals 1

	bipush 0
	istore 0
	while_1:
	iload 0
	bipush 5
	if_icmpeq while_1_end
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 0
	invokevirtual java/io/PrintStream/println(I)V
	iinc 0 1
	goto while_1
	while_1_end:
	return
.end method
