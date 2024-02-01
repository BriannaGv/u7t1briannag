import java.util.ArrayList;
public class Catrunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Ben");
        Cat cat2 = new Cat("Andy");
        Cat cat3 = new Cat("David");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Olivia");
        Cat replacedcat = cats.set(2,cat4);
        cat4.setName(cat4.getName()+ " meow");
        System.out.println(cats);
        System.out.println(replacedcat);
  
    }
}