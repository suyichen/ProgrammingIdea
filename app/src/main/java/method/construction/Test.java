package method.construction;

/**
 * @author suyichen
 */
public class Test {
    public static void main(String[] args){
        new Son();
        Son son1 = new Son();
        System.out.println("Son1 :name is " + son1.getName());
        System.out.println("Son1 :age is " + son1.getAge());

        System.out.println("****************************");

        Son son2 = new Son("Toy",13);
        System.out.println("Son2 :name is " + son2.getName());
        System.out.println("Son2 :age is " + son2.getAge());
    }
}
