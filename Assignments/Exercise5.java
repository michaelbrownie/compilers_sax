/**
 * Exercise 5: Instance methods and fields
 * @author Paul de Groot
 */
public class Exercise5 {
	private int valueOne;
	private int valueTwo;
	
	public static void main(String[] args) {
		Exercise5 e = new Exercise5();
		e.setValueOne(42);
		System.out.println(e.getSumOfValues());
	}

	public Exercise5() {
		valueTwo = 99;
	}

	public void setValueOne( int a ) {
		valueOne = a;
	}

	public int getSumOfValues() {
		return valueOne + valueTwo;
	}
}