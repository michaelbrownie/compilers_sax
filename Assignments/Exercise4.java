/**
 * Exercise 4: Loops (for, while)
 * @author Paul de Groot
 */
public class Exercise4 {
	
	public static void main(String[] args) {
		doWhile();
		doFor();
	}
	
	private static void doWhile() {
		int i = 0;
		
		while (i < 4) {
			System.out.println("Hello!");
			i++;
		}
	}
	
	private static void doFor() {
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}