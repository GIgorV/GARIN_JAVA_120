// функция
// возвращает максимальное значение из массивов а и b.

public class Program {

// public static - magic
// int - тип возвращаемого значения -> значение какого типа мы хотим вернуть?
// max - название функции
// int array[] - формальный параметр

public static int max(int array[]) {
	int result = array[0];
	for (int i = 1; i < array.length; i++) {
		if (result < array[i]) {
			result = array[i];
		}
	}
	// return - оператор возврата значения из функции

	return result;
}

public static void main(String[] args) {
	int a[] = {3, 2, -1, 30, 20};
	int b[] = {1, 4, 5, -1};

	// a -> аргумент
	// b -> аргумент
	// вместо max(a) и max(b) после выполнения функций
	// будет находится их результат

	int maxValueOfA = max(a);
	int maxValueOfB = max(b);
	System.out.println(maxValueOfA);
	System.out.println(maxValueOfB);
}
}

