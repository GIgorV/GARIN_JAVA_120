import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	System.out.print("Введите размер массива: ");
	Scanner scanner = new Scanner(System.in);
	int arraySize = scanner.nextInt();
	int array[] = new int[arraySize];

	for (int i = 0; i < arraySize; i++) {
		array[i] = scanner.nextInt();
		} 
	int max = 0;
	int min = 0;
	if (array[0] < array[1]) {
		min = array[0];
		} else { 
		max = array[0];
		}
	System.out.println("min = " + min);
	System.out.println("max = " + max);
	}
}

//	for (i = 0; i < arraySize; i++) {
//		if (array[i+1] < array[i], array[i+1] > array[i+2]) {
//
//		}
//		}
	
//	i = 0;
//	while (i < 5) {
//		System.out.println("a[" + i + "] = " + array[i]);
//		i++;
//	}
//	}
//}