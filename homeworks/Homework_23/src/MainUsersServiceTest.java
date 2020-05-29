import dto.SignUpForm;
import models.User;
import repositories.IdGenerator;
import repositories.UsersRepository;
import services.UsersService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainUsersServiceTest {
    public static void main(String[] args) {
        IdGenerator idGenerator = new IdGenerator("users_id.txt");
        UsersRepository usersRepository = new UsersRepository("users.txt", idGenerator);
//        UsersService service = new UsersService(usersRepository);
//        SignUpForm form = new SignUpForm("marsel", "qwerty007");
//        User user = service.signUp(form);
//        System.out.println(user);

        List<User> users = usersRepository.findAll();
//        System.out.println(Arrays.toString(users)); //заменил на цикл for each:
        for (User list : users) {
            if (list != null) System.out.println(list);
        }

        Optional<User> user = usersRepository.findById((long) 4);
        if (user.isPresent()){
            System.out.println(user);
        }else {
            System.out.println("Не нашли пользователя");
        }

//        System.out.println(usersRepository.findOneById(3)); //было до Optional
    }
}
