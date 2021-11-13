package extra;

public class Animal {
    private String name = "Carp";
    private byte age = 2;
    private boolean isAquatic = true;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAquatic=" + isAquatic +
                '}';
    }
}
