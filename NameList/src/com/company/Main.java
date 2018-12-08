package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        System.out.println("1 - Добавить пользователя");
        System.out.println("2 - Удалить пользователя по номеру");
        System.out.println("3 - Удалить пользователя по имени");
        System.out.println("4 - Показать список");
        System.out.println("5 - Завершить приложение");

        Scanner sc = new Scanner(System.in);
        boolean w = true;
        while (w) {
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Введите имя пользователя: ");
                String userName = sc.next();
                user.addUser(userName);
            } else if (choice == 2) {
                System.out.print("Введите номер пользователя: ");
                int delUserInd = sc.nextInt();
                user.delUserByNum(delUserInd);
            } else if (choice == 3) {
                System.out.print("Введите имя пользователя: ");
                String delUserNam = sc.next();
                user.delUserByName(delUserNam);
            } else if (choice == 4) {
                user.showUsers();
            } else if (choice == 5) {
                w = false;
                System.out.println("Работа приложения завершена.");
            } else System.out.println("Неправильный ввод");
        }
    }
}

class User {

    private List<String> users = new LinkedList<>();

    void addUser(String userName) {
        users.add(userName);
        System.out.println("Пользователь " + userName + " добавлен.");
    }

    void delUserByNum(int delUserInd) {
        users.remove(delUserInd - 1);
        System.out.println("Пользователь с номером " + delUserInd + " удален.");
    }

    void delUserByName(String delUserName) {
        users.remove(delUserName);
        System.out.println("Пользователь с именем " + delUserName + " удален.");
    }

    void showUsers() {
        for (String i : users) System.out.println(users.indexOf(i) + 1 + " - " + i);
    }
}