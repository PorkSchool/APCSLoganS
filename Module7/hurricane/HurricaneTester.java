
/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *Logan Santamarina
 *Analyzes a text file and outputs hurricane data
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HurricaneTester {

    public static void main(String[] args) throws IOException {
        // read data from text file & put in an array
        File fileName = new File("hurricane.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;

        // count number of lines in text file
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();

        // initialize arrays based on lines counted in text file
        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];

        // read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while (inFile.hasNext()) {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = knotsToMph(inFile.nextDouble());
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        Scanner in = new Scanner(System.in);
        System.out.println("What Is the latest year you wish to see");
        int yearMax = Integer.parseInt(in.next());
        System.out.println("What Is the earliest year you wish to see");
        int yearMin = Integer.parseInt(in.next());
        while (yearMin >= yearMax) {
            System.out.println("Your minimum year cannot be greater then or equal to the maximum");
            yearMin = Integer.parseInt(in.next());
        }
        in.close();

        // convert the windspeed, determine categories, calculate sums
        int[] cats = new int[numValues];
        // counts the number of each category
        int[] catCounts = new int[] { 0, 0, 0, 0, 0 };
        for (int i = 0; i < numValues; i++) {
            if (!(years[i] <= yearMax && years[i] >= yearMin))
                continue;

            if (windSpeeds[i] >= 74.0 && windSpeeds[i] <= 95.0) {
                cats[i] = 1; // Category 1 Hurricane
                catCounts[0] += 1;
            }

            else if (windSpeeds[i] >= 96.0 && windSpeeds[i] <= 110.0) {
                cats[i] = 2; // Category 2 Hurricane
                catCounts[1] += 1;
            }

            else if (windSpeeds[i] >= 111.0 && windSpeeds[i] <= 129.0) {
                cats[i] = 3; // Category 3 Hurricane
                catCounts[2] += 1;
            }

            else if (windSpeeds[i] >= 130.0 && windSpeeds[i] <= 156.0) {
                cats[i] = 4; // Category 4 Hurricane
                catCounts[3] += 1;
            }

            else if (windSpeeds[i] >= 157.0) {
                cats[i] = 5; // Category 5 Hurricane
                catCounts[4] += 1;
            }

            else {
                cats[i] = 0; // Default case
            }
        }

        double maxWind = Integer.MIN_VALUE;
        double minWind = Integer.MAX_VALUE;
        double sumWind = 0; // Sum of wind speeds

        int maxCat = Integer.MIN_VALUE;
        int minCat = Integer.MAX_VALUE;
        int sumCat = 0; // Sum of hurricane categories

        int maxPres = Integer.MIN_VALUE;
        int minPres = Integer.MAX_VALUE;
        int sumPres = 0; // Sum of pressures

        // Checks for min, max, and average
        for (int i = 0; i < numValues; i++) {
            if (!(years[i] <= yearMax && years[i] >= yearMin))
                continue;

            // Wind
            if (windSpeeds[i] > maxWind) {
                maxWind = windSpeeds[i];
            }
            if (windSpeeds[i] < minWind) {
                minWind = windSpeeds[i];
            }
            sumWind += windSpeeds[i];

            // Hurricane Category
            if (cats[i] > maxCat) {
                maxCat = cats[i];
            }
            if (cats[i] < minCat) {
                minCat = cats[i];
            }
            sumCat += cats[i];

            // Pressure
            if (pressures[i] > maxPres) {
                maxPres = pressures[i];
            }
            if (pressures[i] < minPres) {
                minPres = pressures[i];
            }
            sumPres += pressures[i];
        }

        // Calculate averages
        double avgWind = sumWind / (double) numValues;
        double avgCat = sumCat / (double) numValues;
        double avgPres = sumPres / (double) numValues;

        // create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> canes = new ArrayList<Hurricane>();
        for (int i = 0; i < numValues; i++) {
            canes.add(new Hurricane(years[i], names[i], months[i], cats[i], pressures[i], windSpeeds[i]));
        }

        System.out.printf(
                "%25sHurricanes %4d-%4d%n","", yearMax,yearMin);
        // user prompted for range of years
        System.out.printf(
                "%4s | %-10s | %-3s | %1s | %4s | %4s %n=======================================================================%n",
                "Year", "Name", "Month", "Category", "Pressure (mb)", "Windspeeds (mph)");

        // print the data
        for (Hurricane h : canes) {
            if (h.getYear() >= yearMin && h.getYear() <= yearMax) {
                PrintRow(h);
            }
        }
        System.out.println("=======================================================================");
        System.out.printf("%19s Average %8.2f %16.2f %11.2f %n", " ", avgCat, avgPres, avgWind);
        System.out.printf("%19s Maximum %8d %16d %11.2f %n", " ", maxCat, maxPres, maxWind);
        System.out.printf("%19s Minimum %8d %16d %11.2f %n", " ", minCat, minPres, minWind);

        System.out.println("Category Counts");
        for (int i = 0; i < catCounts.length; i++) {
            System.out.printf("%d %d %n", i + 1, catCounts[i]);
        }
    }

    public static void PrintRow(Hurricane h) {
        System.out.printf("%4d | %-10s | %-5s | %8d | %13d | %10.2f%n", h.getYear(), h.getName(), h.getMonth(),
                h.getCat(), h.getPressure(), h.getWindspeed());
    }

    public static double knotsToMph(double knots) {
        // 1 knot is equal to 1.15078 miles per hour
        return knots * 1.15078;
    }
}