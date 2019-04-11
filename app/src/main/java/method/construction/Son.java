package method.construction;


/**
 * @author suyichen
 */
public class Son {
    private String name;
    private int age;
    private int height;


    public Son() {
        this.name = "Tom";
        this.age = 30;
        System.out.println("This is Son");
    }

    public Son(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Son(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Son(int hegiht) {
        this("Tom", 18, hegiht);
    }

    public Son(int age, int height) {
        this("Nick", age, height);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}

