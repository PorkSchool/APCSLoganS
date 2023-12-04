import java.util.Scanner;
public class PetsTester
{
    public static void main (String [] args)
    {

        Scanner inp = new Scanner(System.in);
        // Ask the user for the name of the pet

        System.out.println("What is the name of the pet");
        String name = inp.nextLine();

        //Ask the user for the breed of the pet
        System.out.println("What is the breed of the pet");
        String breed = inp.nextLine();
        
        //• Ask the user for the pet’s age
        System.out.println("What is the age of the pet");
        int age = (int)inp.nextLine();

        inp.close();

       //• The program should create a Pets object based on the information collected from the
       //user,
       

       //• Using the appropriate methods of the Pets object, the program should print the name,
       //breed and age of the pet to the console (screen).


       //• After the information is finished, the program should ask the user if they would like to
       //enter another pet.


       //o If the answer is “yes”, the program should run again.


       //o If the answer is “no”, the program should exit and tell the user goodbye.

    }
}