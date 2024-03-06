
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Logan Santamarina
 * @version 03/04/24
 */
import java.util.*;

public class ShapesTester4 {
    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(5, 20);
        Rectangle4 two = new Box4(4, 10, 5);
        Rectangle4 three = new Box4(8, 8, 8);
        Rectangle4 four = new Cube(8, 8, 8);
        Rectangle4 five = new Quadrilateral(10, 5, 7, 9);
        Rectangle4 six = new Trapezoid(10, 5, 7);


        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add( five );
        shapes.add( six );

        for(Rectangle4 rect: shapes)
        {
        	System.out.println(rect);
        	showEffectBoth(rect);
            System.out.println();
        }

    System.out.println("Comparisons");
    
    System.out.println(checkSame(four, three) ? four.toString() + " is the same as " + three.toString() :
    four.toString() + " is not the same as " + three.toString());

    System.out.println(checkSame(two, three) ? two.toString() + " is the same as " + three.toString() :
    two.toString() + " is not the same as " + three.toString());

    }

    public static boolean checkSame(Rectangle4 four, Rectangle4 three) {

        return four.getLength() == three.getLength() && four.getWidth() == three.getWidth()
                && four.getLength() == three.getLength();
    }

    public static void showEffectBoth(Rectangle4 r) {
        System.out.println(r);
    }

}
