import java.util.Scanner;

/*
 * The Prime Calculator Function
 */
public class PrimeCalculator {
    private int lowerLimit;
    private int upperLimit;
    private int primeCount;

    public PrimeCalculator() {
        // Constructor to initialize variables
        this.lowerLimit = 0;
        this.upperLimit = 0;
        this.primeCount = 0;
    }

    public void SetLimits() {
        // Method to set the lower and upper limits for finding prime numbers
        Scanner in = new Scanner(System.in);

        System.out.println("What is the Lower Limit: ");
        this.lowerLimit = Integer.parseInt(in.nextLine());

        System.out.println("What is the Upper Limit: ");
        this.upperLimit = Integer.parseInt(in.nextLine());

        while (this.upperLimit <= this.lowerLimit) {
            System.out.println("Please provide a number greater than the lower limit: ");
            this.upperLimit = Integer.parseInt(in.nextLine());
        }

        in.close();
    }

    public void IncreaseCount() {
        // Method to increase the count of prime numbers found
        this.primeCount++;
    }

    public boolean IsPrime(int num) {
        // Method to check if a number is prime
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        // Override toString method to provide string representation of the object
        return String.format("The upper limit is %d and the lower limit is %d", this.upperLimit, this.lowerLimit);
    }

    // Getters and setters for private variables (if needed)
    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getPrimeCount() {
        return primeCount;
    }

    public void setPrimeCount(int primeCount) {
        this.primeCount = primeCount;
    }
}
