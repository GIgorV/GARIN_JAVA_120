public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<>();
        LinkedList<String> s = new LinkedList<>();
        i.add(0);
        i.add(1);
        i.add(2);
        i.add(3);
        s.add("My");
        s.add("name");
        s.add("is");
        s.add("Igor");
        s.add("Maya");
        i.remove(2);
        i.add(4);
        System.out.println(s.contains("Maya"));

//        s.remove("Igor");

        System.out.print(i.get(0)+" "+s.get(0)+" ");
        System.out.print(i.get(1)+" "+s.get(1)+" ");
        System.out.print(i.get(2)+" "+s.get(2)+" ");
        System.out.print(i.get(3)+" "+s.get(4));
    }


}
