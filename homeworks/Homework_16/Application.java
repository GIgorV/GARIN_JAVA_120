
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        IdGenerator idGenerator = new IdGenerator("users_id.txt");
        UsersRepository usersRepository = new UsersRepository("users.txt", idGenerator);
        UsersService usersService = new UsersService(usersRepository);
        Menu menu = new Menu(usersService);
        while (true) {
            menu.showMainMenu();
        }
    }
}