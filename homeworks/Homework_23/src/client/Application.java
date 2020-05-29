package client;

import gui.Menu;
import repositories.IdGenerator;
import repositories.UsersRepository;
import services.UsersService;

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
