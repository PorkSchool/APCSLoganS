import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class checker {
    public static void main(String[] args) throws IOException{
        String token = "";
        File filea = new File("test1.txt"); // Corrected file path
        Scanner inFile = new Scanner(filea);

        int bb = 0;
        int gg = 0;
        int gb = 0;

        while (inFile.hasNext()) {
            token = inFile.next();
            if (token.equals("GB") || token.equals("BG")) { // Use .equals() for string comparison
                gb++;
            } else if (token.equals("BB")) {
                bb++;
            } else if (token.equals("GG")) {
                gg++;
            }
        }

        int total = bb + gb + gg;
        double percentBB = (bb / (double) total) * 100; // Ensure double division
        double percentGB = (gb / (double) total) * 100;
        double percentGG = (gg / (double) total) * 100;

        System.out.println("The number of Boy-Girl families is " + gb + " The percentage is " + percentGB);
        System.out.println("The number of Boy-Boy families is " + bb + " The percentage is " + percentBB);
        System.out.println("The number of Girl-Girl families is " + gg + " The percentage is " + percentGG);

        inFile.close();
    }
}
