import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class TextsGenerator extends Thread{
    private static int countFile;
    private String[] words;
    private String fileNameToWriter;

    public TextsGenerator(String[] words) {
        this.words = words;
    }

    @Override
    public void run() {
        try {
            fileNameToWriter = nameGenerator();
            String[] mixWords = mixWords(words);
            FileWriter fileWriter = new FileWriter("F:\\" + fileNameToWriter, false);
            for (int i = 0; i < mixWords.length; i++) {
                fileWriter.write(mixWords[i] + "\r\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private String[] mixWords(String[] words) {
        int temp;
        Random random = new Random();
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                temp = random.nextInt(words.length);
                result[temp] = words[i];
            }
        }return result;
    }

    private synchronized String nameGenerator() {
        String newString = "text" + countFile + ".txt";
        countFile++;
        fileNameToWriter = newString;
        return fileNameToWriter;
    }
}


/* Этот конструктор в круглых скобках имеет два значения: путь к файлу и значение добавления текста
(то есть, мы укажем, будем ли мы добавлять текст к файлу, либо перезаписывать весь файл) в логической переменной.
Если вы хотите добавить запись в текстовый файл, вы можете использовать этот конструктор для создания нового объекта.
    public Write (String path, boolean value) {
        path_to_file = path;
        append = value;
*/