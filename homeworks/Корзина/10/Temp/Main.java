import java.util.Arrays;
import java.util.Scanner;

// тест на метод charAt

public class Main {
    public static void main(String[] args) {
    String str = "Последний символ в этой строке - о";
	int last = str.length()-1;//длина строки - 1, так как отсчет начинается с 0
	char ch = str.charAt(last);
	System.out.println(ch);
	}
}	