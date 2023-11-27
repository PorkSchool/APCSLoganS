/*
 * Logan Santamarina
 * 11/27/23
 * A program that displays the mass gravity diameter and name of a planet in columns and rows
 */
public class PlanetGravity {

    public static void CreateRow(String name, double diameter, double mass){
        double gravConst = 6.67;
        double gravity = (gravConst * mass)/ Math.pow(diameter, 2);
        double finalGrav = Math.round(gravity * 100)/100;

        System.out.print("\n"+name);
        System.out.print("   "+diameter);
        System.out.print("        "+mass);
        System.out.print("   "+finalGrav);
    }
    static void StartStatements(){
        System.out.println("            Planetary Data\n");
        System.out.print("Planet");
        System.out.print("  Diameter (km)");
        System.out.print("  Mass (kg)");
        System.out.print("  g (m/s^2)");
    }
    public static void main(String[] args){

        String earthName = "Earth";
        double earthDiameter = 12756.3;
        String earthMass = "5.972e24";

        String venusName = "Venus";
        double venusDiameter = 12103.6;
        String venusMass = "4.869e24";


        StartStatements();
        CreateRow(earthName, earthDiameter, Double.valueOf(earthMass));
        CreateRow(venusName, venusDiameter, Double.valueOf(venusMass));
    }
}
