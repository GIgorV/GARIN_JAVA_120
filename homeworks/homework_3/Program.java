import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int currentNumber = scanner.nextInt();
	int check1 = currentNumber % 2;
	int digitSum = 0;
	int currentDigit = 0;
	while (currentNumber != 0) {
		currentDigit = currentNumber % 10;
		digitSum = digitSum + currentDigit;
		currentNumber = currentNumber / 10;
		}	
	System.out.println(digitSum);
	
	currentDigit = 0;
	int multiplication = 1;
	currentNumber = scanner.nextInt();
	int check2 = currentNumber % 2;
	if (check1 == check2) {
		System.out.println("Please repeat");
		} else {
			while (currentNumber != 0) {
		currentDigit = currentNumber % 10;
		multiplication = multiplication * currentDigit;
		currentNumber = currentNumber / 10;
			}	
			System.out.println(multiplication);
		}
	currentNumber = scanner.nextInt();
	}
}