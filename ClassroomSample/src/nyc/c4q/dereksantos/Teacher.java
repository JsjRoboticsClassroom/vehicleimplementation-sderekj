package nyc.c4q.dereksantos;

/**
 * Created by SACC on 8/28/16.
 */
public class Teacher {
    private int id;
    private int age;
    private String name;

    /**
     * Default age is 20
     */
    public Teacher() {
        this.id = 2454;
        this.age = 20;
        this.name = "UNKNOWN";
    }

    public Teacher(int id, int age) {
        this.id = id;
        this.age = age;
        this.name = "UNKNOWN";
    }

    public Teacher(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            // do things to prevent age from being set to these invalid numbers
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
