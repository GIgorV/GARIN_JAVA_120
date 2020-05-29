import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long before;
        long after;
        String newPath = "C:\\text.txt";
        FileData newFile = new FileData(newPath);
        String[] words = newFile.OpenAndRead(); //получили массив слов из файла

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество файлов");
        int quantityFile = scanner.nextInt();

        before = System.currentTimeMillis();
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.createFiles(quantityFile, words);
        after = System.currentTimeMillis();
        System.out.println("Затрачено одним потоком:" + (after - before));

        TextsGenerator threads[] = new TextsGenerator[quantityFile];
        before = System.currentTimeMillis();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TextsGenerator(words);
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();  // запускаем все потоки
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join(); // запрещает main_у завершать выполнение, пока другие потоки не завершаться
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
        after = System.currentTimeMillis();
        System.out.println("Затрачено: " + quantityFile + " потоками " + (after - before));
    }
}


//
//        for (int i = 0; i < mixWords.length; i++) {
//            if (mixWords[i] != null) {
//                System.out.println(mixWords[i]);
//            }

//        Scanner in = new Scanner(new File(newPath));
//        while (in.hasNext()) {
//            string += in.nextLine() + "\r\n";
//        }
//        words = string.split("\\s"); //получили массив слов из файла

//        System.out.println("Введите количество слов");
//        int countWords = scanner.nextInt();

//        Reader reader = new FileReader("text.txt");
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String line = bufferedReader.readLine();
//        while (line != null) {
////            line.split("\\s");
//            System.out.println(line);
//            line = bufferedReader.readLine();
//        }
//        reader.close();
//    }
//}