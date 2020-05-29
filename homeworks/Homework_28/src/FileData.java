import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileData {
    private String pathToFile;

    public FileData(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String[] OpenAndRead() {
        List<String> text = new ArrayList<>();
        try {
            String str = null;
            BufferedReader br = new BufferedReader(new FileReader(pathToFile));
            while ((str = br.readLine()) != null) {
                text.addAll(Arrays.asList(str.split(" "))); //добавляем новые элементы
            }
            br.close();
        } catch (IOException e) {
            throw new IllegalArgumentException("IO error!" + e);
        }
        return text.toArray(new String[text.size()]); //если нужно - можно получить массив слов
    }
}