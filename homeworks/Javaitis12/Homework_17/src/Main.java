public class Main {

    public static void main(String[] args) {
        Map<String, Integer> agesMap = new MapBucketImpl<>();
        agesMap.put("Марсель", 26);
        agesMap.put("Айдар", 25);
        agesMap.put("Альберт", 13);
        agesMap.put("Александр", 22);
        agesMap.put("Олег", 28);
        agesMap.put("Шамиль", 28);
        agesMap.put("Виктор", 23);
        agesMap.put("Алия", 19);
        agesMap.put("Марсель", 27);

        System.out.println(agesMap.get("Марсель"));
        System.out.println(agesMap.get("Айдар"));
        System.out.println(agesMap.get("Альберт"));
        System.out.println(agesMap.get("Александр"));
        System.out.println(agesMap.get("Олег"));
        System.out.println(agesMap.get("Шамиль"));
        System.out.println(agesMap.get("Виктор"));
        System.out.println(agesMap.get("Алия"));

        int i = 0;
    }
}
