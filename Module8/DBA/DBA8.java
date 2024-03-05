import java.util.ArrayList;
import java.util.Random;
/*
 * Logan Santamarina
 * 3/4/24
 * A program that foils 2 arrays of values and then searchs for odd numbers
 */
public class DBA8 {

    public static int ranNum = 0;
    public static void main(String[] args) {
        int[] row = {3, 6, 9, 12};
        int[] col = {3, 6, 9};

        int[][] result = calcMagicMath(row, col);
        ArrayPrint(result, row, col);

        // Odd Number Code
        ArrayList<Integer> odds = oddNumbers(result);
        System.out.println("\nOdd numbers:");
        System.out.println("__________________");
        

        for (int num : odds) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[][] calcMagicMath(int[] rowH, int[] colH) {
        int numRows = rowH.length;
        int numCols = colH.length + 1; // One extra column for the random number
        int[][] matrix = new int[numRows][numCols];

        Random random = new Random();
        // Generate random number between 3 and 30 (inclusive)
        ranNum = random.nextInt(28) + 3;

        // Populate the 2D array column by column
        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                if (j == numCols - 1) {
                    // Fill the last column with the random number
                    matrix[i][j] = rowH[i] * ranNum;
                } else {
                    // Fill other columns with the product of row and column headers
                    matrix[i][j] = rowH[i] * colH[j];
                }
            }
        }

        return matrix;
    }

    public static ArrayList<Integer> oddNumbers(int[][] inp) {
        ArrayList<Integer> oddNums = new ArrayList<>();
        for (int i = inp.length - 1; i >= 0; i--) {
            for (int j = 0; j < inp[i].length; j++) {
                if (inp[i][j] % 2 != 0) {
                    oddNums.add(inp[i][j]);
                }
            }
        }
        return oddNums;
    }

    public static void ArrayPrint(int[][] array, int[] row, int[] col) {
        //col headers
        System.out.print("\t");
        for (int header : col) {
            System.out.print("(" + header + ")\t");
        }
        System.out.println("("+ranNum+")");
        // rows headers
        for (int i = 0; i < array.length; i++) {
            System.out.print("(" + row[i] + ")\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
