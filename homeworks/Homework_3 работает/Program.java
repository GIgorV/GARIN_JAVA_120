import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int currentNumber = scanner.nextInt();
	int iterations = 0;
	while (currentNumber != -1) {
		int check1 = currentNumber % 2;
		if ((iterations % 2) == 0) {
			int digitSum = 0;
			int currentDigit = 0;
				while (currentNumber != 0) {
					currentDigit = currentNumber % 10; 
					digitSum = digitSum + currentDigit;
					currentNumber = currentNumber / 10;
					}	
			System.out.println(digitSum); //посчитал сумму цифр
		} else {
			int currentDigit = 0;
			int multiplication = 1;
				while (currentNumber != 0) {
					currentDigit = currentNumber % 10;
					multiplication = multiplication * currentDigit;
					currentNumber = currentNumber / 10;
						}	
			System.out.println(multiplication);
			}
		iterations++;
		currentNumber = scanner.nextInt();
		int check2 = currentNumber % 2;
		while (check1 == check2) {
			System.out.println("Please repeat");
			currentNumber = scanner.nextInt();
			check2 = currentNumber % 2;		
			}
		}
	}
}