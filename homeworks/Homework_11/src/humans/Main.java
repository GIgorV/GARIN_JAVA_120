package humans;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h = 3; // количество людей
        Human humans[] = new Human[h];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < h; i++) {
            humans[i] = new Human();
            System.out.println("Введите имя, возраст человека № " + (i + 1));
            System.out.println("имя:");
            humans[i].name = scanner.next();
            System.out.print("возраст:");
            humans[i].age = scanner.nextInt();
        }

        // создаем специальный массив возрастов
        int age[] = new int[100];

        for (int i = 0; i < humans.length; i++) {
            age[humans[i].age]++;
        }

        // ищем наиболее часто-встречаемый возраст в массиве возрастов
        int ageMaxCount = 0;
        int maxAge = 0;
        for (int i = 1; i < age.length; i++) {
            if (age[i] > ageMaxCount) {
                ageMaxCount = age[i];
                maxAge = i;
            }
        }
        System.out.println("наиболее часто-встречаемый возраст: " + maxAge);
        // System.out.println(humans[0].name + " " + humans[0].age);
    }
}
