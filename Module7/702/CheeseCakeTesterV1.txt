/**
 * @purpose
 *
 * @author (Logan Santamarina)
 * @version (2/6/24)
 * @purpose Display the ingridients neccesary to make cheese cake servings
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // add CheeseCake to the ArrayList
        cake.add(new CheeseCakeV1("Blueberry", 8));
        cake.add(new CheeseCakeV1("Strawberry", 11));
        cake.add(new CheeseCakeV1("Blackberry", 15));
        cake.add(new CheeseCakeV1("Vanilla", 23));
        cake.add(new CheeseCakeV1("Bannana", 1));
        cake.add(new CheeseCakeV1("Pecan", 9));
        cake.add(new CheeseCakeV1("Cheese", 17));

        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
        }
        
        //printing the format of the table
        System.out.println(" |----------------------------------------------------------------------------------------|");
        System.out.println(" |       Cheese Cake Data           |               Ingredient Calculations               |");
        System.out.println(" |----------------------------------------------------------------------------------------|");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |      Sugar    |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|---------------|-----------|");
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            // print each CheeseCake's data
            System.out.printf(" | %5d | %8d | %13s | %9d oz | %8d | %8.2f cups | %4d tsps | %n", index, 
                                                cake.get(index).getquantity(), 
                                                cake.get(index).getFlavor(),
                                                cake.get(index).getCreamCheese(),
                                                cake.get(index).getServings(), 
                                                cake.get(index).getSugar(), 
                                                cake.get(index).getVanilla());
        }
        System.out.println(" |----------------------------------------------------------------------------------------|");

    }
}