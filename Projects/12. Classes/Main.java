public class Main {

//    public static void go(Human human, int km) {
//        human.passedDistance += km;
//    }

    public static void main(String[] args) {
        // �������� ��������� ���������� (���������)
        // ~ Human *marsel;
	    Human marsel;
	    Human enemy;
	    // ��������� ������ � �������� �������
        // ���� Human
	    marsel = new Human();
	    marsel.name = "�������";
	    marsel.age = 25;
	    marsel.height = 1.85;
	    marsel.passedDistance = 5;

//	    go(marsel, 30);
		marsel.go(30);

		enemy = new Human();
		enemy.age = 23;

		marsel.hit(enemy);

		System.out.println(marsel.age);
		System.out.println(enemy.age);
        System.out.println(marsel.passedDistance);
    }
}