// Домашнне задание 3, дает сумму, далее произведение цифр числа, не хватает условия, чтобы не повторялось четность числа
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int iterations = 0;
        while (number != -1) {
            if ((iterations % 2) == 0) {
                int digitsSum = 0;
                int currentDigit = 0;
                while (number != 0) {
                    currentDigit = number % 10;
                    digitsSum = currentDigit + digitsSum;
                    number = number / 10;
                }
                System.out.println(digitsSum);
            } else {
                int digitsMultiplication = 1;
                int currentDigit = 0;
                while (number != 0) {
                    currentDigit = number % 10;
                    digitsMultiplication = currentDigit * digitsMultiplication;
                    number = number / 10;
                }
                System.out.println(digitsMultiplication);
            }
            iterations++;
            number = scanner.nextInt();
        }
    }
}

