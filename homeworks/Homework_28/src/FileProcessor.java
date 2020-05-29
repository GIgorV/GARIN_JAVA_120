import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileProcessor {
    private String[] mixWords;
    private String fileNameToWriter;
    private int countFile = 0;
    private Random random = new Random();

    public void createFiles(int quantityFile, String[] words) {
        try {
            while (countFile < quantityFile) {
                mixWords = mix(words);
                fileNameToWriter = nameGenerator();
                FileWriter fileWriter = new FileWriter("F:\\" + fileNameToWriter);
                for (int i = 0; i < mixWords.length; i++) {
                    fileWriter.write(mixWords[i] + "\r\n");
                }
                fileWriter.close();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }

    private String[] mix(String[] words) {
        int temp;
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                temp = random.nextInt(words.length);
                result[temp] = words[i];
            }
        }
        return result;
    }

    private String nameGenerator() {
        String newString = "file" + countFile + ".txt";
        countFile++;
        fileNameToWriter = newString;
        return fileNameToWriter;
    }
}