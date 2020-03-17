package linked;

import linked.LinkedList;
import nodes.Node;

public class LinkedListIterator {
    private Node current;
    public LinkedListIterator(LinkedList list){
        current=list.first;
    }

    public boolean hasNext(){
        return current !=null;
    }

    public int next(){
        int value=current.getValue();
        current=current.getNext();
        return value;
    }
}
