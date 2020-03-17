package linked;

public class MainForLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(9);
        list.addToBegin(2);
        list.remove(7);
//        System.out.println(list.contains(4)); //+
        list.removeByIndex(3);


//        System.out.println(list.get(3));   //+

        System.out.println("Список узлов выглядит следующим образом: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        LinkedListIterator iterator = new LinkedListIterator(list);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
