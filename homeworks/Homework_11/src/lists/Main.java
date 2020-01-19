package lists;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntegerArrayList list=new IntegerArrayList();
        Scanner scanner = new Scanner(System.in);
        int q = 0;
        while (q != -1){
            System.out.println("Введите элемент, который хотите добавить: ");
            q = scanner.nextInt();
            list.add(q);
        }
        System.out.println();
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
        System.out.println("Введите элемент, индекс которого хотите уточнить: ");
        q=scanner.nextInt();
        System.out.println(list.indexOf(q));

        list.print();

    }
}