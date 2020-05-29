import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numbersCount = scanner.nextInt();
        int threadsCount = scanner.nextInt();
        int[] numbers = new int[numbersCount];
        int numbersSum;

        for (int i = 0; i < numbersCount; i++) {
            numbers[i] = random.nextInt(1000);
        }

        SumThread threads[] = new SumThread[threadsCount];
        int numbersCountForOneThread = numbersCount / threadsCount;
        int start = 0;
        int finish = numbersCountForOneThread;
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new SumThread(numbers, start, finish);
            start = finish;
            finish += numbersCountForOneThread;
        }
        threads[threadsCount - 1].setFinish(numbersCount);
//int i=0;

        for (int i=0; i<threads.length; i++){
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join(); // запрещает main_у завершать выполнение, пока другие потоки не завершаться
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }


        int sumByThreads = 0;
        for (int i=0; i<threads.length; i++){
            numbersSum = threads[i].getResult();
            sumByThreads+=numbersSum;
        }
        System.out.println(sumByThreads);
    }
}
