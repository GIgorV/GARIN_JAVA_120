package FileCreatorThread;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class TextsGenerator{

    private static String[] mixWords;

    private static String[] getWords () {
        return mixWords;
    }

    static void generateFile(String fileName) {
        try {
            fileName = Main.dictionaryName + fileName + ".txt";
            FileWriter fileWriter = new FileWriter(fileName, false);
            String[] str = TextsGenerator.getWords();
            for (int i = 0; i < str.length; i++) {
                fileWriter.write(str[i] + "\r\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }

    static void mixWords(String[] words) {
        int temp;
        Random random = new Random();
        mixWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                temp = random.nextInt(words.length);
                mixWords[temp] = words[i];
            }
        }
    }

//    private String nameGenerator() {
//        String newString = "text" + countFile + ".txt";
//        countFile++;
//        fileNameToWriter = newString;
//        return fileNameToWriter;
//    }

}


/* Этот конструктор в круглых скобках имеет два значения: путь к файлу и значение добавления текста
(то есть, мы укажем, будем ли мы добавлять текст к файлу, либо перезаписывать весь файл) в логической переменной.
Если вы хотите добавить запись в текстовый файл, вы можете использовать этот конструктор для создания нового объекта.
    public Write (String path, boolean value) {
        path_to_file = path;
        append = value;
*/