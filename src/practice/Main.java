package practice;

/*
* Создайте класс Cat с двумя полями: name и age и обязательным методом sayMeow()
- выведите информацию о модификаторах класса, полях, методах, константах, конструкторах и суперклассах
- получите и установите значение полей объекта по имени
- вызовите метод объекта sayMeow() по имени
* */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sayMeow();

        Class<Cat> classCat = Cat.class;

        Field[] catFields = classCat.getDeclaredFields();
        for (Field field : catFields) {
            System.out.println(
                    "Field name: " + field.getName() +
                            " | type: " + field.getType()
            );
        }

        Constructor<?>[] catConstructors = classCat.getDeclaredConstructors();
        for (Constructor<?> constructor : catConstructors) {
            System.out.println("Constructor: " + constructor.toString());
        }

        Method[] catMethods = classCat.getDeclaredMethods();
        for (Method method : catMethods) {
            System.out.println("Method: " + method.toString());
        }

        System.out.println("=============================");

        try {
            Field catName = classCat.getDeclaredField("name");
            catName.setAccessible(true);
            catName.set(cat, "Vaska");

            Field catAge = classCat.getDeclaredField("age");
            catAge.setAccessible(true);
            catAge.set(cat, 2);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        cat.sayMeow();
    }
}
