/*
 * Logan Santamarina
 * 3/13/24
 * A program that outputs all pime numbers in a specified range
 */
public class PrimeRunner {

    public static void main(String[] args) {

        // Create an instance of PrimeCalculator
        PrimeCalculator calc = new PrimeCalculator();

        // Use the SetLimits method to set the lower and upper limits
        calc.SetLimits();

        // Output number of prime numbers
        System.out.println("Prime Numbers List\n");
        for (int i = calc.getLowerLimit(); i <= calc.getUpperLimit(); i++) {
            if (calc.IsPrime(i)) {
                calc.IncreaseCount();
                // Used to organize output
                if (calc.getPrimeCount() % 10 == 0) {
                    System.out.println();
                }
                System.out.printf("%6d,", i);
            }
        }
        System.out.println("\nThe Number of Prime Numbers is " + calc.getPrimeCount());
    }
}
