/*
 * Logan Santamarina
 * 2/28/24
 * A program that displays the trajectory of a watermelon being launched at diffrent angles and mph displayed in meters
 */
public class Catapolt {
    public static void main(String[] args) {
        Launcher watermelon = new Launcher();

        int speed = 20;
        int angle = 25;
        double[][] values = new double[7][6];

        System.out.printf("\t\t\t\tProjectile Launcer Watermelon%n%s %10s %15s %15s %15s %15s %15s%n","MPH", "25 deg",
        "30 deg", "35 deg", "40 deg", "45 deg", "50 deg", "55 deg");
        System.out.println("-------------------------------------------------------------------------------------------------");

        for (int row = 0; row < values.length; row++) {
            System.out.print(speed); // Print the speed for each row
            for (int col = 0; col < values[row].length; col++) {
                angle += 5; // Increment angle
                values[row][col] = watermelon.calcDistance(speed, angle); // Calculate and assign distance
                System.out.printf(" |%10.2fm| ", values[row][col]); // Print distance with formatting
            }
            speed += 5;
            angle = 20;
            System.out.println();
        }

    }
}
