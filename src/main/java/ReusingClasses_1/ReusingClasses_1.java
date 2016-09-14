package ReusingClasses_1;

/**
 * Created by evanhitchings on 9/14/16.
 */
public class ReusingClasses_1 {
    public static void main(String[] args) {
        RotatableList<String> cats = new RotatableList<String>();
        cats.add("Luna");
        cats.add("Bear");
        cats.add("Aria");
        cats.add("Stink");
        System.out.println(cats);
        cats.rotateList(-2);
        System.out.println(cats);
        cats.rotateList(2);
        System.out.println(cats);
    }
}
