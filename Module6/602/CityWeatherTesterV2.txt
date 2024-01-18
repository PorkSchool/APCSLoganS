/**
 * Annual Weather client class
 * 
 * @author Logan Santamarina
 * @version 1/8/23
 * @purpose To lsit the annual weather information in Orlando Florida
 */
import java.util.Scanner;

public class CityWeatherTesterV2
{              
    public static void PrintRow(String month, double temp, double precip){
        System.out.printf("%-10s%15.1f%20.1f%n", month, temp, precip);
    }
    
    public static void main (String [ ] args)
    {
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Orlando";  //choose a city from the table provided
        String state = "Florida";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb","Mar", "Apr", "May", "Jun", "Jul" ,"Aug" ,"Sep", "Oct", "Nov", "Dec"};     //complete initialization of months array
        double [] temperature ={0.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};     //complete initialization of temperatures array
        double [] precipitation ={0.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};     //complete initialization of precipitation array
        
        //instantiate CityWeatherV1 object 
        CityWeatherV2 weather = new CityWeatherV2(month,temperature,precipitation);
        //print average temperature and total precipitation
        

        //input to decide F/C and in/cm - to be completed in 6.02
        System.out.println("Choose temperature scale (Fahrenheit or Celsius): ");
        char tempScale = in.nextLine().toLowerCase().charAt(0);
        
        while(tempScale != 'f' && tempScale != 'c'){
            System.out.print("Provide Fahrenheit or Celcius please: ");
            tempScale = in.nextLine().toLowerCase().charAt(0);
        }


        System.out.println("Choose precipitation scale (Inches or Centimeters): ");
        char precipScale = in.nextLine().toLowerCase().charAt(0);
        
        while(precipScale != 'i' && precipScale != 'c'){
            System.out.print("Provide Inches or Centimeters please: ");
            precipScale = in.nextLine().toLowerCase().charAt(0);
        }

        in.close();

        System.out.printf("%c%n", precipScale);

        System.out.printf("%-25s%n","Weather Data");
        System.out.printf("%-8s%-10s%n", city, state);

        System.out.println("======================================================");
        System.out.printf("%-15s%-20s%-25s%n**************************************************\n", "Months", "Temperature(" + tempScale + ")", "Precipitation(" + (precipScale == 'i' ? "in." : "cm.") + ")");

        for(int i=0; i < 12; i++){
            PrintRow(month[i], tempScale == 'f'? temperature[i] : weather.F_TO_C(temperature[i]), 
                               precipScale == 'i'? precipitation[i] : weather.I_TO_C(precipitation[i]));
        }

        System.out.println("======================================================");
        System.out.printf("%-6s%-4s%.1f%n%-6s%-4s%.1f%n", "Average Temperature:", " ", weather.GetAverageTemp(), "Total Precipitation:", " ", weather.GetTotalPrecip());

    }//end main
}//end class

