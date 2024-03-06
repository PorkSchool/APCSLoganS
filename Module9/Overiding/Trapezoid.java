
/**
 * This class defined the Trapezoid object
 *
 * @author Logan Santamarina
 * @version 03/04/24
 */
public class Trapezoid extends Rectangle4{
    private int bottomLength;
    public Trapezoid(int l, int w, int s){
        super(l, w);
        bottomLength = s;
    }
    public String toString()
    {
        return "Trapezoid- " + getLength() + " X " + getWidth() + " X " + bottomLength;
    }
}
