package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Roman","Longer",(byte) 25);
        userService.saveUser("Ivan","Phedorov",(byte) 30);
        userService.saveUser("Viktor","Philippov",(byte) 55);
        userService.saveUser("Dmitriy", "Belousov",(byte) 14);

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}
