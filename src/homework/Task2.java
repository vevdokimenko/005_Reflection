package homework;

/*
* Задание 2
* Напишите программу, которая будет выводить всю информацию о классе,
* пользователь сам выбирает, какой именно класс интересует.
* */

import java.lang.reflect.Member;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder menu = new StringBuilder();
        menu.append("Make your choice:\n");
        menu.append("1. String\n");
        menu.append("2. Integer\n");
        menu.append("3. Arrays\n");
        menu.append("4. ArrayList\n");
        menu.append("5. Cat\n");
        menu.append("6. Other class...");

        loop: while (true) {
            System.out.println(menu);
            String choice = new Scanner(System.in).nextLine();
            switch (choice) {
                case "1" -> printClassInfo("java.lang.String");
                case "2" -> printClassInfo("java.lang.Integer");
                case "3" -> printClassInfo("java.util.Arrays");
                case "4" -> printClassInfo("java.util.ArrayList");
                case "5" -> printClassInfo("extra.Cat");
                case "6" -> {
                    System.out.println("Enter class name with path:");
                    printClassInfo(new Scanner(System.in).nextLine());
                }
                default -> {
                    break loop;
                }
            }
        }
    }

    private static void printClassInfo(String name) {
        try {
            Class<?> cls = Class.forName(name);
            printMembers(cls.getDeclaredConstructors());
            printMembers(cls.getDeclaredFields());
            printMembers(cls.getDeclaredMethods());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void printMembers(Member[] members) {
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }
}
