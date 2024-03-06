/**
 * This class defined the Quadrilateral object
 *
 * @author Logan Santamarina
 * @version 03/04/24
 */
public class Quadrilateral extends Box4{

    private int side4;
    public Quadrilateral(int l, int w, int h, int o){
        super(l,w,h);
        side4 = o;
    }
    public String toString()
    {
        return "Quadrilateral- " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + side4;
    }
}