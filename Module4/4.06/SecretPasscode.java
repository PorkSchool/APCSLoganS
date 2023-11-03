
/* Randomly generate passwords.
*
* @Logan Santamarina
* @10/24/23
* This program will create a secret passcode and output it to a text file
*/
import java.io.IOException;

import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode {
   
   public static void main(String[] args) throws IOException {
      String password = "";
      File theMainFile = new File("PasswordOutput.txt");

      //error correction
      if (!theMainFile.exists()) {
         System.out.println("MAIN FILE DOES NOT EXIST");
         theMainFile.createNewFile();
      }

      Scanner readFile = new Scanner(theMainFile);

      // initialize scanner and print writer
      Scanner in = new Scanner(System.in);

      System.out.println("**********************************************************");
      System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

      // // Print Writer Stuff
      PrintWriter outFile = new PrintWriter(theMainFile);

      // Ask for password length
      int pwLength = 0;
      System.out.println("Please Provide a length for your password (Minimum 6): ");
      pwLength = Integer.parseInt(in.next());
      while (pwLength < 6) {
         System.out.println("Please Provide a number greater then 6: ");
         pwLength = Integer.parseInt(in.next());
      }

      password = MakePassword(pwLength,password);
      outFile.println(password);

      // generate a random character in the correct character set
      
      String choice = "";
      System.out.println("Would you like to create another password? (Y or N)");
      choice = in.next();
      choice = choice.substring(0, 1);
      while(choice.equalsIgnoreCase("Y")){
         
         System.out.println("Please Provide a length for your password (Minimum 6): ");
         pwLength = Integer.parseInt(in.next());
         while (pwLength < 6) {
            System.out.println("Please Provide a number greater then 6: ");
            pwLength = Integer.parseInt(in.next());
         }
         

         password = MakePassword(pwLength,password);
         outFile.println(password);

         System.out.println("Would you like to create another password? (Y or N)");
         choice = in.next();
         choice = choice.substring(0, 1);
      }
      outFile.close();
   
      System.out.println("Here is a list of your passwords:");
      

      int i = 0;
      while(readFile.hasNext()){
         i++;
         System.out.println(i+": " +readFile.next());
      }


     
      readFile.close();
      in.close();
   }

   public static String MakePassword(int len, String password){
      String pas = "";

      for (int i = 0; i < len; i++) {

         //Numbers  48-57
         //lowercase 97-122
         //upper case  65-90
         int ranNumber = (int) (Math.random() * (126 - 33 + 1) + 33);
         if(!(ranNumber>=48 && ranNumber<=57) || !(ranNumber>=97 && ranNumber<=122) || !(ranNumber>=65 && ranNumber<=90)){
            ranNumber = (int)(Math.random() * (126 - 33 + 1) + 33);
         }
         char ranChar = (char) (ranNumber);        
         pas += ranChar;
      }
      System.out.println("Your Password has been created and written to a text file");
      return pas;
   }
}
