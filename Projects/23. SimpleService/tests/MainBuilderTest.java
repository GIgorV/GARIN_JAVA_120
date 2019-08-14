package ru.itis.tests;

import ru.itis.models.User;
import ru.itis.models.UserRole;

public class MainBuilderTest {

    public static void main(String[] args) {
        User user = User.builder() // ������� ������ ���� Builder
                .age(25) // �������� � ���� ������ � ���� age 25
                .email("sidikov.marsel@gmail.com") // �������� � ���� ������ email
                .firstName("�������") // �������� � ���� ������ firstName
                .role(UserRole.MODERATOR)
                .build(); // ������� ������ User �� ������ ������� Builder

//        if (user.getRole().equals(UserRole.MODERATOR)) {
//            System.out.println("���������");
//        }

        if (user.isModerator()) {
            System.out.println("���������");
        }
    }
}