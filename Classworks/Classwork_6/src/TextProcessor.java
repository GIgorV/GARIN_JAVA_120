public class TextProcessor {
    private String text;

    //public TextProcessor (){ }

    public void process(String text) {
        char t[] = text.toCharArray();
        for (int i = 0; i < t.length; i++) {
            int codeOfAscii = t[i];
            if (codeOfAscii > 64 && codeOfAscii < 91 || codeOfAscii > 96 && codeOfAscii < 123) {
                System.out.println("Yes");
            }
        }
    }
}
