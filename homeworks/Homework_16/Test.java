
public class Test {
    public static void main(String[] args) {
        IdGenerator idGenerator = new IdGenerator("users_id.txt");
        UsersRepository usersRepository = new UsersRepository("users.txt", idGenerator);
        UsersService service = new UsersService(usersRepository);
        SignUpForm form = new SignUpForm("Igor", "Skoda");
        User user = service.signUp(form);
        System.out.println(user);
    }
}