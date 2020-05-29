package repositories;

import models.User;
import models.UserRole;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersRepository {
    private String fileName;
    private IdGenerator idGenerator;

    public UsersRepository(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    public void save(User user) {
        try {
            user.setId(idGenerator.generate());
            OutputStream outputStream = new FileOutputStream(fileName, true);
            String userLine = user.toString() + "\n";
            outputStream.write(userLine.getBytes());
            outputStream.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public List<User> findAll() {
        List<User> users = null; // Создаем массив для результата, сюда положим пользователей
        try {
            users = new ArrayList<>();
            Reader reader = new FileReader(fileName); // открываем файл для чтения
            BufferedReader bufferedReader // открываем буфер для чтения из файла и передаем
                    = new BufferedReader(reader); // туда файл
            String currentUserLine = bufferedReader.readLine(); // считываем из файла первую строку
            int currentIndex = 0;             // начинаем с нуля
            while (currentUserLine != null) { // пока файл не кончился
                String userData[] = currentUserLine.split("\\|"); // разбиваем исходную строку на элементы по разделителю |
                String idString = userData[0]; // из массива вытаскиваем
                String firstName = userData[1];
                String lastName = userData[2];
                String ageAsString = userData[3];
                String phone = userData[4];
                String email = userData[5];
                String login = userData[6];
                String password = userData[7];
                UserRole role = UserRole.valueOf(userData[8]);

                User user = User.builder()
                        .login(login)
                        .password(password)
                        .build(); // пока так

                if (!firstName.equals("null")) { //1:07:40
                    user.setFirstName(firstName); //если не null - кладем значение
                }

                if (!lastName.equals("null")) {
                    user.setLastName(lastName);
                }

                if (!phone.equals("null")) {
                    user.setFirstName(phone);
                }

                if (!email.equals("null")) {
                    user.setLastName(email);
                }

                if (!ageAsString.equals("null")) { //т.к. в age число, сложнее:
                    user.setAge(Integer.parseInt(ageAsString));
                }

                user.setId(Long.parseLong(idString));
                user.setRole(role);

//                users[currentIndex] = user;
                users.add(user);
                currentIndex++;
                currentUserLine = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
        return users;
    }

    public Optional<User> findById(Long id) {
        try {
            Reader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String currentUserLine = bufferedReader.readLine();
            int currentIndex = 0;
            while (currentUserLine != null) {
                String userData[] = currentUserLine.split("\\|");
                String idString = userData[0];
                String firstName = userData[1];
                String lastName = userData[2];
                String ageAsString = userData[3];
                String phone = userData[4];
                String email = userData[5];
                String login = userData[6];
                String password = userData[7];
                UserRole role = UserRole.valueOf(userData[8]);

                User user = User.builder()
                        .login(login)
                        .password(password)
                        .build(); // пока так

                if (!firstName.equals("null")) { //1:07:40
                    user.setFirstName(firstName); //если не null - кладем значение
                }

                if (!lastName.equals("null")) {
                    user.setLastName(lastName);
                }

                if (!phone.equals("null")) {
                    user.setFirstName(phone);
                }

                if (!email.equals("null")) {
                    user.setLastName(email);
                }

                if (!ageAsString.equals("null")) {
                    user.setAge(Integer.parseInt(ageAsString));
                }

                user.setId(Long.parseLong(idString));
                user.setRole(role);
                if (Long.parseLong(idString) == id) {
                    return Optional.ofNullable(user);
                } else {
                    currentIndex++;
                    currentUserLine = bufferedReader.readLine();
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Запрошенный id не найден");
    }
}
