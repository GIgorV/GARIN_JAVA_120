// Написать функции int sum(int array[]).

// Написать функцию int[] getVectorOfFrequency(int array[]), предполагая, что массив array состоит из числе от 1 до 1000 вернуть вектор частот. Если число 55 в массиве array встречается 35 раз, то результат функции - массив частот, в индексе 55 имеет значение - 35. (см. Гистограмма)

// Написать функцию double average(int array[]) - возвращает среднее арифметическое массива.

    import java.util.Scanner;
    class Program {

        public static int sum(int array[]) {
            int result = 0;
            for (int i=0; i < array.length; i++) {
                result = result + array[i];
            }
            return result;
        }

        public static double average(int array[]) {
            int sum = 0;
            for (int i=0; i < array.length; i++) {
                sum = sum + array[i];
            }
            double average = sum/array.length;
            return average;
        }

        public static void main(String[] args) {
            System.out.print("Введите размер массива: ");
            Scanner scanner = new Scanner(System.in);
            int arraySize = scanner.nextInt();
            System.out.print("Введите значения для массива: ");
            int a[] = new int[arraySize];
            for (int i=0; i < arraySize; i++) {
                a[i] = scanner.nextInt();
            }

            int sum = sum(a);
            System.out.print("Сумма чисел составит: " + sum);

            System.out.println(" ");
            double average = average(a);
            System.out.println("Cреднее арифметическое массива составит: " + average);
        }
    }
