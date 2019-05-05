// Ввести массив с консоли (также ввести его размер).
// Посчитать количество локальных максимумом и минимумов.

import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	System.out.print("Введите размер массива: ");
	Scanner scanner = new Scanner(System.in);
	int arraySize = scanner.nextInt();
	int a[] = new int[arraySize];
	for (int i=0; i < arraySize; i++) {
		a[i] = scanner.nextInt();
	}
	int LocalMax = 0;
	int LocalMin = 0;

	for (int i = 0; i < arraySize-2; i++) {
		int j = i+1;
			if (a[j] > a[i] && a[j] > a[i+2]) {
				LocalMax ++;
				}
			if (a[j] < a[i] && a[j] < a[i+2]) {
				LocalMin ++;
				}
		}
	System.out.println("LocalMax = " + LocalMax);
	System.out.println("LocalMin = " + LocalMin);
	}
}

// for (int j = i+1; j < arraySize-1; j++) 
//		System.out.println("a[" + i + "] = " + array[i]);