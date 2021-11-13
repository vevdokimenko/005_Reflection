package extra;

import java.lang.reflect.Field;

public class Cat extends Animal {
    public Cat() {
        Class<?> superClass = this.getClass().getSuperclass();
//        System.out.println(superClass.toString());

        try {
            Field[] catFields = superClass.getDeclaredFields();
//            for (Field field : catFields) {
//                System.out.println(field.toString());
//            }

            Field catName = catFields[0];
            Field catAge = catFields[1];
            Field catIsAquatic = catFields[2];
            catName.setAccessible(true);
            catAge.setAccessible(true);
            catIsAquatic.setAccessible(true);
            catName.set(this, "Tom cat");
            catAge.set(this, (byte) 5);
            catIsAquatic.set(this, false);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
