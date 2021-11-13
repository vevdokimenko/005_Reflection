package practice;

public class Cat {
    private String name = "Tom";
    private int age = 3;

    public Cat() {
    }

    private Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayMeow() {
        System.out.printf("Cat %s %d years old says MEOW\n", name, age);
    }
}
