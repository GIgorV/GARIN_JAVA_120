 public class WorkWithChars {
    public static void main(String[] args) {
        char c = '7';
        int x = '7' - '0';
        System.out.println(x);
   }
 }
// в ответе 7
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class WorkWithChars {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        char text[] = scanner.nextLine().toCharArray();
//
//        for (int i = 0; i < text.length; i++) {
//            if (text[i] >= '0' && text[i] <= '9') {
//                System.out.println(text[i] + " - цифра");
//            } else if (text[i] >= 'A' && text[i] <= 'Z' ||
//                    text[i] >= 'a' && text[i] <= 'z') {
//                System.out.println(text[i] + " - буква");
//            }
//        }
//    }
//}