import java.util.Scanner;

class Program {

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = isPrime(scanner.nextInt());
        if (isPrime) {
            System.out.println("число составное ");
        } else {
            System.out.println("число простое ");
        }
    }
}