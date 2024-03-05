/*
 * Logan Santamarina
 * 3/5/24
 * This program practices polymorphism using a cirlce class and subclasses of the circle class to display the center
 */
import java.util.ArrayList;

public class RoundTest {
    public static void main(String[] args) {
        ArrayList<Circle2> rounds = new ArrayList<>();
        rounds.add(new Circle2(5, 5, 10));
        rounds.add(new Oval2(3, 4, 8, 6));
        rounds.add(new Cylinder2(2, 3, 5, 10));
        rounds.add(new OvalCylinder2(4, 6, 12, 8, 10));

        for (Circle2 c : rounds) {
            GetCenter(c);
        }

    }

    public static void GetCenter(Circle2 c) {
        System.out.println("This " + c.getName() +" "+ c.getCenter());
    }
}
