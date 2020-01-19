import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        char array[] = str.toCharArray();
        char check[] = new char[array.length];
        int index[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            index[i] = 1;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[0] == array[i]) {
                check[0] = array[0];
                index[0]++;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] != check[i - 1]) {                       // если символ i не равен предыдущему работаем дальше
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        check[i] = array[i];
                        index[i]++;
                    }
                }
            } else {
                check[i] = array[i];
            }
        }
        for (int i = 0; i < check.length; i++) {
            System.out.println("Символ " + array[i] + " повторился " + index[i] + " раз");
        }
        Arrays.sort(check);
        for (int i = 1; i < check.length; i++) {
            System.out.print(check[i]);
        }
    }
}


//System.out.println(array[3]);
//
//                index[i]++;

//        for (int i = 0; i <check.length; i++){
//            System.out.println("Символ " + check[i] + " повторился " + index[i] + " раз");
//        }
//    }
//}
//
//    }
//}
//    public static int countChar(String str, char c) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == c)
//                count++;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        String str = scanner.nextLine();
//        str = str.toLowerCase();
//        char array[] = str.toCharArray();
//        for (int i = 0; i < array.length; i++){
//            char c = array[i];
//            int countChar = countChar(str, c);
//            int quantity[] = new int[array.length];
//            quantity[i] = countChar;
//            System.out.println("Cимвол " + array[i] + " появился " + countChar + " раз");
//
//        }

//        str = str.toLowerCase();


//        char array[] = text.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//        System.out.print(array[i]);
                    //
//        Scanner scanner = new Scanner(System.in);
//        char array[] = scanner.nextLine().toCharArray();

//        char c = '8';
//        int x = '7' - '0';
//        System.out.println(x);
//        // 7
//        System.out.println(x + c);
//        // 63
//        System.out.println(c);
//        // 8

//
//        for (int i = 0; i < text.length; i++) {
//        if (text[i] >= '0' && text[i] <= '9') {
//        System.out.println(text[i] + " - цифра");
//        } else if (text[i] >= 'A' && text[i] <= 'Z' ||
//        text[i] >= 'a' && text[i] <= 'z') {
//        System.out.println(text[i] + " - буква");
//        }
//        String str = "Последний символ в этой строке - д";
//        int last = str.length()-1;//длина строки - 1, так как отсчет начинается с 0
//        char ch = str.charAt(last);
//        System.out.println(ch);
//        }
//        Scanner scanner = new Scanner(System.in);
//        char text[] = scanner.nextLine().toCharArray();
//        System.out.println(Arrays.toString(text));
//
//            System.out.print("Возвращаемое значение: ");
//            System.out.println(Str.toLowerCase());