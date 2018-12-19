/**
 * Exercise 3: Calling static methods, returning values and if-statements
 * @author Evert Duipmans
 */
public class Exercise3 {

	public static void main(String[] args) {
		boolean b = isEven(12);

		if (b) {
			System.out.println("Value is even!");
		} else {
			System.out.println("Value is odd!");
		}
	}

	public static boolean isEven(int input) {
		return input % 2 == 0;
	}
}
