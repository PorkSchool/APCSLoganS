
/* Randomly generate passwords.
*
* @author APCS Team
* @version FLVS 2021
* 
*/
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode {
   public static void main(String[] args) throws IOException {
      String userChoice = "Y";
      int pwLength = 0;
      int randNum = 0;
      String password = "";

      // initialize scanner and print writer
      Scanner in = new Scanner(System.in);

      System.out.println("**********************************************************");
      System.out.println(
            "Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

      // Print Writer Stuff
      PrintWriter outFile = new PrintWriter(new File("PasswordOutput.txt"));
      outFile.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

      // Ask for password length
      System.out.println("Please Provide a length for your password (Minimum 6): ");
      pwLength = Integer.parseInt(in.next());
      
      // validate password length
      if(pwLength < 6){
         while(pwLength < 6){
            System.out.println("Please Provide a number greater then 6: ");
            pwLength = Integer.parseInt(in.next());
         }
      }
      
      // generate a random character in the correct character set

      // concatenate the character to the password

      // write the password to the file

      // when the user is done, close the text file so that it can be re-opened and
      // read
      // outFile.close();

      // Read passwords back from text file and display to the screen

   }// end main
}
