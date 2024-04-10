
/*
 * Logan Santamarina
 * 3/25/24
 * THis program outputs a fibonachi number based on an input using recursion
 */
import java.util.Scanner;

public class Fibonachi2 {
    // public static boolean loop = true;

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // while (loop) {
        // System.out.println("Please provide an integer for which you would like to
        // find the Fibonacci number:");
        // int num = Integer.parseInt(in.nextLine());
        // int fibNum = fib(num);
        // System.out.println("Your Fibonacci Number Is: " + fibNum);

        // System.out.println("Would you like to continue (Y/N)?");
        // String response = in.nextLine();
        // if (response.toLowerCase().charAt(0) != 'y') {
        // loop = false;
        // System.out.println("Program exited.");
        // }
        // }
        // in.close();

       System.out.println( recur("mouse", 3));
    }

    // public static void recur(String str)
    // {
    // int len = str.length();
    // if(len > 1)
    // {
    // String temp = str.substring(0, len - 2);
    // System.out.println(temp);
    // recur(temp);
    // }
    // }
    public static String recur(String str, int n) {
        if (n >= str.length()) {
            return str;
        }

        return str + recur(str.substring(n), n);
    }

    public static int fib(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }
}