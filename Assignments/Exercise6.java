/**
 * Exercise 6: User input.
 * @author Paul de Groot
 */
public class Exercise6 {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.print("Hello, ");
		System.out.println(name);
	}
}
