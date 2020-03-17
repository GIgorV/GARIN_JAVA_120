package nodes;

public class Main {
    public static void main(String[] args) {
        Node a = new Node(3); // у объекта Node есть два поля: это значение и ссылка на следующий объект
        Node b = new Node(7);
        Node c = new Node(8);
        Node d = new Node(9);

        a.setNext(b); //цепочка
        b.setNext(c); // где каждый объект имеет ссылку на следующий объект
        c.setNext(d);


        Node current = a; // current еще одна объектная переменная, которая указывает на тот же объект,
                                    //на который указывает переменная а

        while (current!=null){
            System.out.println(current.getValue());
            current=current.getNext();
        }
    }
}
