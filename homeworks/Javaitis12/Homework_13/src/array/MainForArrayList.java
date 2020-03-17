package array;

import java.util.Scanner;

public class MainForArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);
        Scanner scanner = new Scanner(System.in);
        int q = 0;
        while (q != -1) {
            System.out.println("Введите элемент, который хотите добавить: ");
            q = scanner.nextInt();
            list.addToBegin(q);
        }

//        list.get(3);
//        list.removeByIndex(1);
        list.removeByValue(6);
    }
}
