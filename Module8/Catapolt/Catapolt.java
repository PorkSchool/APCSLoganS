public class Catapolt {
    public static void main(String[] args) {
        Launcher launch = new Launcher();

        // FOR DEBUG PURPOSES
        // System.out.println(launch.calcDistance(25, 30));

        // 4. Store the distance values in a two-dimensional array.
        // The units used for the distance is up to you. Be sure to label your table
        // accordingly.

        int speed = 20;
        int angle = 25;
        double[][] values = new double[7][6];

        System.out.printf("%10s %10s %10s %10s %10s %10s %10s","MPH", "25 deg",
        "30 deg", "35 deg", "40 deg", "45 deg", "50 deg", "55 deg");
        for (int row = 0; row < values.length; row++) {
            System.out.print(speed); // Print the speed for each row
            for (int col = 0; col < values[row].length; col++) {
                angle += 5; // Increment angle
                values[row][col] = launch.calcDistance(speed, angle); // Calculate and assign distance
                System.out.printf(" |%10.2f| ", values[row][col]); // Print distance with formatting
            }
            System.out.println("\n-----------------------------------------------------------------------");
            speed += 5; // Increment speed for the next row
        }

    }
}
