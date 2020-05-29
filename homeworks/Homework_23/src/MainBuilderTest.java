import models.User;
import models.UserRole;

public class MainBuilderTest {
    public static void main(String[] args) {
        User user = User.builder() // создали объект типа Builder
                .age(25)
                .email("sidikov.marsel@gmail.com")
                .firstName("Марсель")
                .role(UserRole.MODERATOR)
                .build(); // создали объект User на основе объекта Builder

        if(user.isModerator()){ //работает после создания метода в классе user
            System.out.println("Модератор");
        }
        //вместо:
        //        if (user.getRole().equals(UserRole.MODERATOR)) {
        //            System.out.println("Модератор");
        //        }
    }
}
