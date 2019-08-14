

public class Program {

    public static void main(String[] args) {
        char c = 'M';
        int codeOfC = c;
        codeOfC++;
        String a;
        a = "Moris";
        // если символ с троке есть - даст 0, нет -1:
        // int I = a.indexOf(c);
        // дает длину строки:
        int I = a.length();
        char b = a.charAt(3);
        char another = (char)codeOfC;
        System.out.println(codeOfC);
        System.out.println(another);
        System.out.println(I);
        System.out.println(b);
    }
}