import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        textProcessor.process(text);
    }
}
ring