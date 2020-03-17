package lists;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList(5);
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

//        list.indexOf(0);
//        list.print();
        //get
//        System.out.println("Введите индекс элемента массива, который хотите посмотреть: ");
        //      q=scanner.nextInt();
        //    System.out.println(list.get(q));

        //removeByIndex
        //  System.out.println("Введите индекс элемента массива, который хотите удалить: ");
        //q=scanner.nextInt();
//        list.removeByIndex(q);

        //removeByValue
        //list.removeByIndex(0);

        //indexOf
//        System.out.println("Введите элемент, индекс которого хотите уточнить: ");
//        q=scanner.nextInt();
//        System.out.println(list.indexOf(q));


    }
}