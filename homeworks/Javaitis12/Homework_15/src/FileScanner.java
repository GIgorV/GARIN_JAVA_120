
import java.io.*;


public class FileScanner {

    private InputStream inputStream;

    public FileScanner(String fileName) {
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int nextInt() {
        int result = 0;
        while (true) { //бесконечный цикл с выходом внутри
            try {
                int readBytesCount = inputStream.read();
                if (readBytesCount == -1) {
                    break; // данные закончились
                }
                if (readBytesCount >= 48 && readBytesCount <= 57) {
                    result = result * 10 + (readBytesCount - 48);
                }
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return result;
    }


    public String nextLine() {
        String str = "";
        try {
            int currentByte = inputStream.read();
            while (currentByte != -1) {
                if (currentByte == 92) {
                    currentByte = inputStream.read();
                    if (currentByte == 110) {
                        return str;
                    }
                } else {
                    str = str + (char) currentByte;
                    currentByte = inputStream.read();
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        return str;
    }
}

//    public int nextInt() {     как не надо делать
//        try {
//            int currentByte = inputStream.read();
//            if (currentByte >= 48 && currentByte <= 57) {
//                return currentByte;
//            } else if (currentByte == -1) {
//                return -1;
//            } else {
//                return nextInt();
//            }
//        } catch (IOException e) {
//            throw new IllegalArgumentException(e);
//        }
//    }
