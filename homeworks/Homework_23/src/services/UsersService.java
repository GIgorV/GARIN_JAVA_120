package services;

import dto.SignUpForm;
import models.User;
import models.UserRole;
import repositories.UsersRepository;

import java.util.Random;

public class UsersService { //методы для регистрации
    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User signUp(SignUpForm form) {
//        User.Builder myBuilder = new User.Builder();
        User user = User.builder()
                .password(form.getPassword())
                .login(form.getLogin())
                .role(UserRole.USER)
                .build();
        usersRepository.save(user);
        return user;
    }
}
