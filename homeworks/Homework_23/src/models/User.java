package models;

import exceptions.EmptyCredentialsException;

public class User { //это сущность нашей предметной области
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String phone;
    private String email;
    private String login;
    private String password;
    private UserRole role;

    private User(Builder builder) { //получил поля, скопировал в свой объект
        this.id = builder.id;
        this.age = builder.age;
        this.password = builder.password;
        this.email = builder.email;
        this.login = builder.login;
        this.phone = builder.phone;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.role = builder.role;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public boolean isModerator() {
        return this.role.equals(UserRole.MODERATOR);
    }

    public static class Builder { // статический вложенный класс
        private Long id; // поля, аналогичные полям обрамляющего класса User
        private String firstName;
        private String lastName;
        private Integer age;
        private String phone;
        private String email;
        private String login;
        private String password;
        private UserRole role;

        public Builder id(Long id) { //метод (не статический, значит он будет вызываться из объекта) похож на setters, но с возвратным механизмом
            this.id = id; //если вызвать объект типа Builder с аргументом id, метод в объект его положит
            return this; //  и вернет ссылку на самого себя (в качестве результата сам объект из которого был вызван данный метод)
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder role(UserRole role) {
            this.role = role;
            return this;
        }

        public User build() { // метод, который вызывает конструктор обрамляющего класса и в качестве аргумента передает объект самого себя
            if (isEmptyCredentials()){
                throw new EmptyCredentialsException("Пустой пароль или логин");
            }
                return new User(this);
        }

        private boolean isEmptyCredentials() {
            return this.login == null || this.login.equals("") ||
                    this.password == null || this.password.equals("");
        }
    }
    // вишенка на торте
    public static Builder builder() { //метод, который создает объект типа builder
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String toString() {
        return id + "|"
                + firstName + "|"
                + lastName + "|"
                + age + "|"
                + email + "|"
                + phone + "|"
                + login + "|"
                + password + "|"
                + role.toString();
    }
}
