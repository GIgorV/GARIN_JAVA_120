

// процедура

public class Procedures {

	public static void printNumbersInRange(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String args[]) {
		printNumbersInRange(4, 10);
	}

}