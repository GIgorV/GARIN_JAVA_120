import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char text[] = scanner.nextLine().toCharArray();
        //System.out.println(Arrays.toString(text));
        // 9-15 меняем вручную заглавные буквы на строчные (потратил целый день,=+ не срабатывало, давало Space (32)):
        for (int i = 0; i < text.length; i++) {
            int codeOfAscii = text[i];
            //System.out.println(codeOfAscii);
            if (codeOfAscii < 97 && codeOfAscii != 32) {
                codeOfAscii = codeOfAscii + 32;
                text[i] = (char) codeOfAscii;
            }
        }

        int a[] = new int[26]; // это массив для подсчета повторений (букв англ. алфавита)

        for (int i = 0; i < text.length; i++) {
            if ((int) text[i] != 32 && (int) text[i] != 44) { //не хочет почему-то игнорировать запятые, ошибку выдает
                int reiteration = (int) text[i] - 97; // индекс текущего символа - 97 = индекс массива повторений,
                // где reiteration является ссылкой на букву.
                a[reiteration]++;
            }
        }
        int max = a[0]; //25-30 ищем максимальное количество повторений
        for (int i = 1; i < 26; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] == max) {
                char c = (char) (i + 97);
                System.out.println(c + "=" + a[i]);
            }
        }
    }
}
//
////        for (int i = 0; i < text.length; i++) { //здесь мы выводим введенный текст
////            System.out.print(text[i]+" ");
////        }
////        System.out.println(); //это для смены строки
////
////        for (int i = 97; i < 123; i++) { //выводим анг. строчный алфавит
////            System.out.print((char)i+"  ");
////        }
////
////        System.out.println();
////
////        for (int i = 0; i < 26; i++) { //ниже количство повторений
////            System.out.print(a[i]+"  ");
////        }
////    }

// здесь мы вводим индекс и программа указывает нам соответствующий символ:
//public class Program {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int codeOfAscii = scanner.nextInt();
//        char text = (char) codeOfAscii;
//        System.out.println(text);
//    }
//}

//System.out.println("Введите строку: ");
//        String str = scanner.nextLine();
//        char text[] = str.toCharArray();