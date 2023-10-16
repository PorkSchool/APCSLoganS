import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class checker {
    public static void main(String[] args) throws IOException{
        String token = "";


        //The file being analyzed
        File filea = new File("familyMembers.txt");
        
        //file scanner
        Scanner inFile = new Scanner(filea);

        //counters
        int bb = 0;
        int gg = 0;
        int gb = 0;
        int totalFams = 0;

        while (inFile.hasNext()) {
            totalFams++;
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
        double percentBB = Math.round(((bb / (double) total) * 100)*100)/100;
        double percentGB = Math.round(((gb / (double) total) * 100)*100)/100;
        double percentGG = Math.round(((gg / (double) total) * 100)*100)/100;

        System.out.println("The composition of families with 2 children:\n\n");
        System.out.println("The total number of families was: "+ totalFams+"\n");
        System.out.println("The number of Boy-Girl families is " + gb + " The percentage is " + percentGB+"%");
        System.out.println("The number of Boy-Boy families is " + bb + " The percentage is " + percentBB+"%");
        System.out.println("The number of Girl-Girl families is " + gg + " The percentage is " + percentGG+"%");
        inFile.close();
    }
}
