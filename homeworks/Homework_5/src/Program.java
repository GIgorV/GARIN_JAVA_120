// Ввести массив с консоли (также ввести его размер).
// Посчитать количество локальных максимумом и минимумов.


import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int a[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            a[i] = scanner.nextInt();
        }
        int localMax = 0;
        int localMin = 0;

        for (int i = 0; i < arraySize - 2; i++) {
            int j = i + 1;
            if (a[j] > a[i] && a[j] > a[i + 2]) {
                localMax++;
            }
            if (a[j] < a[i] && a[j] < a[i + 2]) {
                localMin++;
            }
        }
        System.out.println("LocalMax = " + localMax);
        System.out.println("LocalMin = " + localMin);
    }
}
