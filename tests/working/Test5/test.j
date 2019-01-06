.class public test
.super java/lang/Object

.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 3
	.limit locals 9

	bipush 4
	istore 0
	while_1:
	iload 0
	bipush 10
	if_icmpge while_1_end
	if_1:
	iload 0
	bipush 4
	if_icmple elsestate_0
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test is groter dan 5"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	bipush 10
	istore 1
	if_2:
	iload 1
	bipush 5
	if_icmple if_2_if_end
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test2 is groter dan 5"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	bipush 15
	istore 2
	if_3:
	iload 2
	bipush 5
	if_icmple if_3_if_end
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test3 is groter dan 5"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	goto if_3_if_end
	if_3_if_end:
	goto if_2_if_end
	if_2_if_end:
	goto if_1_if_end
	elsestate_0:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Test is kleiner dan 5"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	if_1_if_end:
	iinc 0 1
	goto while_1
	while_1_end:
	return
.end method
