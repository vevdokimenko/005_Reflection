package homework;

/*
* Задание 3
* Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.
* Под средством рефлексии получите всю информацию о полях, методах, конструкторах, а также модификаторах доступа
* */

import java.lang.reflect.Member;

public class Task3 {
    public static void main(String[] args) {
        Class<?> classTask = Task3.class;

        printMembers(classTask.getDeclaredConstructors(), "Constructor");
        printMembers(classTask.getDeclaredFields(), "Field");
        printMembers(classTask.getDeclaredMethods(), "Method");
    }

    private static void printMembers(Member[] members, String caption) {
        for (Member member : members) {
            System.out.println(caption + ": " + member.toString());
        }
    }

    private int a;
    private int b;
    private int c;

    public Task3() {
    }

    public Task3(int a) {
        this.a = a;
    }

    public Task3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Task3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void method() {}
}
