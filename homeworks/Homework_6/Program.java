// Считать массив с консоли, поменять минимальный и максимальный элементы местами.

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
	int max = a[0];
	int maxIndex = 0;
	for (int i = 0; i < arraySize; i++) {
		if (a[i] > max) {
			max = a[i];
			maxIndex = i;
		}
	}
	int min = a[0];
	int minIndex = 0;
	for (int i = 0; i < arraySize; i++) {
		if (a[i] < min) {
			min = a[i];
			minIndex = i;
		}
	}

	a[minIndex] = max;
	a[maxIndex] = min;
	
	for (int i=0; i < arraySize; i++) {
		System.out.print(a[i] + " ");
		}
	}
}