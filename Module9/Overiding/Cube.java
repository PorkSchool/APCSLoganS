
/**
 * This class defined the Quadrilateral object
 *
 * @author Logan Santamarina
 * @version 03/04/24
 */
public class Cube extends Box4{
    public Cube(int l, int w, int h){
        super(l,w,h);
    }
    public String toString()
    {
        return "Cube- " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
}
