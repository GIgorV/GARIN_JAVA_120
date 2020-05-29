public class MainArrayList {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        List<String> ss = new SetArrayListImpl<>();
//        s.add("Марсель");
//        s.add("Игорь");
//        s.add("Майя");
        ss.add("Марсель");
        ss.add("Игорь");
        ss.add("Майя");

        for (int i=0; i<s.size(); i++){
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
        System.out.println(ss.contains("Игорь"));
        System.out.println(s.get(2));

    }
}
