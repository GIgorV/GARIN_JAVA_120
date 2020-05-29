public class MainLinkedList {
    public static void main(String[] args) {
        List<String> s = new LinkedList<>();
        s.add("Hello");
        s.add("Igor");
        s.add("how");
        s.add("are");
        s.add("you");
        Iterator<String> iterator1 = s.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
        System.out.println(s.get(4));
    }
}
