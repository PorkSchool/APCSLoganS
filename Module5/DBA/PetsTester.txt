
/*
 * Logan Santamarin
 * 12/4/23
 * This is a program that reads off a pets name age and breed depending on what you import for it
 * this is for the module 5 dba written portion
 */
import java.util.Scanner;

public class PetsTester {
    public static void main(String[] args) {
        // default value for keepGoing
        char keepGoing = 'y';
        Scanner inp = new Scanner(System.in);

        // this keeps the program running if y
        while (keepGoing == 'y' || keepGoing == 'Y') {

            // Ask the user for the name of the pet
            System.out.println("What is the name of the pet");
            String name = inp.nextLine();

            // Ask the user for the breed of the pet
            System.out.println("What is the breed of the pet");
            String breed = inp.nextLine();

            // • Ask the user for the pet’s age
            System.out.println("What is the age of the pet (please provide a number value)");
            int age = Integer.parseInt(inp.nextLine());

            // • The program should create a Pets object based on the information collected from the user
            Pets pet1 = new Pets(name, breed, age);

            // • Using the appropriate methods of the Pets object, the program should print the name,breed and age of the pet to the console (screen).
            pet1.Output();

            // • After the information is finished, the program should ask the user if they
            // would like to
            // enter another pet.
            // o If the answer is “yes”, the program should run again.

            System.out.println("Would you like to continue?");
            keepGoing = inp.nextLine().charAt(0);

            // o If the answer is “no”, the program should exit and tell the user goodbye.
            if (keepGoing == 'n' || keepGoing == 'N') {
                System.out.println("Goodbye User I hope you have enjoyed this program!");
            }

        }

        inp.close();
    }
}