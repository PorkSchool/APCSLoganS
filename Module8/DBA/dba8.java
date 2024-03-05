import java.util.Random;

public class dba8 {
    public static void main(String[] args) {
        int[] col = { 3, 6, 9 };

        int[] row = { 2, 3, 6, 7 };

        int[][] result = calcMagicMath(row, col);

        for(int l=0;l<col.length;l++){
            System.out.print(col[l]+"  ");
        }
        System.out.println();
        for (int[] i : result) {
            System.out.print(row[0] +" |");
            for (int j : i) {
               System.out.printf("%6d", j);
            }
            System.out.println();
        }
    }

    /**
     * precondition: rowH and colH each contain at least two values > 0
     */

    // foiling
    public static int[][] calcMagicMath(int[] rowH, int[] colH) {

        int[][] out = new int[rowH.length][colH.length + 1]; // adds space for random number

        Random random = new Random();
        int randomNumber = random.nextInt(28) + 3;

        for (int j = 0; j < colH.length; j++) {
            for (int i = 0; i < rowH.length; i++) {
                if (j == colH.length - 1) {
                    out[i][j] = rowH[i] * randomNumber;
                } else {
                    out[i][j] = rowH[i] * colH[j];
                }
            }
        }

        return out;

    }
}
