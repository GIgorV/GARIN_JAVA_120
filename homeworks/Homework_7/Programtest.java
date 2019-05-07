// тест на простое число без функции

import java.util.Scanner;
class Program {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        boolean a = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                a = true;
                break;
            }
        }
        if (a) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}