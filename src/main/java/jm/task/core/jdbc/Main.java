package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Том", "Петров", (byte) 48);
        userService.saveUser("Боб", "Сидоров", (byte) 25);
        userService.saveUser("Абдурахман", "Хотаббов", (byte) 78);
        userService.saveUser("Бейонсе", "Кузнецова", (byte) 35);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
