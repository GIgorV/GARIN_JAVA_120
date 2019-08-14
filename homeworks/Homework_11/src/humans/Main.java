package humans;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h = 3;
        Human humans[] = new Human[h];
        for (int i=0; i<h; i++) {
            Scanner scanner = new Scanner(System.in);
            Human human = new Human();

            human.name = scanner.nextLine();
            human.age = scanner.nextInt();
        }

        for (int i=0; i<h; i++) {
            System.out.println(humans[i].name);
            System.out.println(humans[i].age);
        }
    }
}
