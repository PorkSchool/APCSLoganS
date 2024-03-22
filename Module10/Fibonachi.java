import java.util.Scanner;

/**
 * fibonachi
 */
public class Fibonachi {
    public static boolean loop = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (loop) {
            System.out.println("Please proivde an integer you would like to make a fibonachi number");
            int num = Integer.parseInt(in.nextLine());
            int fibNum = Fib(num);

            System.out.println("Would you like to continue Y/N");
            String response = in.nextLine();
            if (response.toLowerCase().charAt(0) != 'y') {
                loop = false;
                System.out.println("program exited");
            }
        }

    }

    public static int Fib(int num) {
        return num;
    }
}