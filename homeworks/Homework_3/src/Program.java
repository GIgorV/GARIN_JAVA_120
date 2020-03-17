/* Организовать ввод чисел по следующему правилу:
Пользоваель вводит число
Программа выводит сумму цифр этого числа
Пользовать вводит другое число
Програма выводит произведение цифр этого числа
В каждом случае, если выведенное программой значение четное, то не давать пользователю ввести нечетное число. (Требовать ввести заново) */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int repeatTest; // тест на повторяемость четного числа
        int repeatTestNew;
        int repeatIretation;
        int iterations = 0; //создаем очередность: сначала сложение, потом произведение и т.д.
        while (number != -1) {
            if (number % 2 == 0) {
                repeatTest = 0;
                repeatIretation = 1;
            } else {
                repeatTest = 1;
                repeatIretation = 0;
            }
            if ((iterations % 2) == 0) {
                int digitsSum = 0;
                int currentDigit;
                while (number != 0) {
                    currentDigit = number % 10;
                    digitsSum = currentDigit + digitsSum;
                    number = number / 10;
                }
                System.out.println(digitsSum);
            } else {
                int digitsMultiplication = 1;
                int currentDigit;
                while (number != 0) {
                    currentDigit = number % 10;
                    digitsMultiplication = currentDigit * digitsMultiplication;
                    number = number / 10;
                }
                System.out.println(digitsMultiplication);
            }
            iterations++;
            //System.out.println(repeatTest + " тест");
            number = scanner.nextInt();
            repeatTestNew = number % 2;
            while (repeatTest == repeatTestNew && repeatIretation == 1) {
                System.out.println("Введите нечетное число");
                number = scanner.nextInt();
                repeatTestNew = number % 2;
            }
        }
    }
}




