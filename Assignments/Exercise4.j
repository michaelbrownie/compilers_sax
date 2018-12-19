.class public Exercise4
.super java/lang/Object

;
; standard initializer (calls java.lang.Object's initializer)
;
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

;
; main() methode
;
.method public static main([Ljava/lang/String;)V
	.limit stack 2 													; Determine the size of your stack
	.limit locals 1

	invokestatic Exercise4/doWhile()V
	invokestatic Exercise4/doFor()V

    return															; End the method
.end method

.method public static doWhile()V
	; Set the stack and local limits
	.limit stack 2
	.limit locals 2

	; ======================
	; Add your code here
	; ======================

.end method

.method public static doFor()V
	; Set the stack and local limits
	.limit stack 2
	.limit locals 3

	; ======================
	; Add your code here
	; ======================

.end method
