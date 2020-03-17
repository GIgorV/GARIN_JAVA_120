import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

/*
Передать программе список URL-ов и папку, куда нужно сохранить файлы, расположенные по этим URL-ам.
Файлы должны скачиваться последовательно. Не просить пользователя вводить новый файл, пока старый не докачался.
*/

public class Program { //не реализовал возможность ввода множества изображений с условием (см. дз.)
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите url изображения:"); // https://oren.sledcom.ru/upload/site30/klass/risunki/002.jpg
        String url = scanner.nextLine();
        url = url.replace(" ", ""); //Марсель добавил, чтобы удалить пробел из ссылки, программа останавливалась, я просто не знал, что нужно нажать пробел и ввод )

        System.out.println("Укажите папку:");
        String folder = scanner.nextLine();
        byte bytes[] = new byte[1024 * 1024 * 5]; // 5 242 880 bytes
        InputStream inputStream = new URL(url).openStream();
        int c = inputStream.read();
        int i = 0;
        while (c != -1) {
            bytes[i] = (byte) c;
            i++;
            c = inputStream.read();
        }
        System.out.println(i);
        OutputStream outputStream = new FileOutputStream(folder + "/" + i + ".jpg");
        outputStream.write(bytes, 0, i);
        outputStream.close();
        inputStream.close();
    }
}

//    int count=0;
//        for (int i=0; i<bytes.length;i++){
//        count++;
//        }
//        System.out.println(count);