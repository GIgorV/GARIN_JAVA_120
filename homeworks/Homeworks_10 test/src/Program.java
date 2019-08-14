import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        System.out.println("Введите искомый символ: ");
        Scanner sca = new Scanner(System.in);
        char c = sca.next().charAt(0);

        int countChar = countChar(str, c);
        System.out.println("Искомый символ появился " + countChar + " раз");
    }
}