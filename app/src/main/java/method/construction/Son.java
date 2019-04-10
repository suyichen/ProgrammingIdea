package method.construction;


/**
 * @author suyichen
 */
public class Son extends Dad{

    private String name;
    private int age;

    public Son(){
        this.name = "Tom";
        this.age = 30;
        System.out.println("This is Son");
    }

    public Son(String name,int age){
         this.name = name;
         this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

