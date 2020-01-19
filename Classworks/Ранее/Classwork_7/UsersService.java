

public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User signUp(SignUpForm form) {
        User user = User.builder()
                .model(form.getModel())
                .nameDriver(form.getNameDriver())
                .build();
        usersRepository.save(user);
        return user;
    }
}