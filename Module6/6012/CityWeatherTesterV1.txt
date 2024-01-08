/**
 * Annual Weather client class
 * 
 * @author Logan Santamarina
 * @version 1/8/23
 * @purpose To lsit the annual weather information in Orlando Florida
 */
import java.util.Scanner;
public class CityWeatherTesterV1
{
    
    // method to print results (formatting output will be done in 6.02)
    
        //Output: display table of weather data including average and total
        //System.out.println();
        //System.out.println("           Weather Data");
        //System.out.println("      Location: " + city +", " + state);
        //System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        //System.out.println();
        //System.out.println("***************************************************");
        //for( int index = 0; index < temperature.length; index++)
        //{
  		// use printf to format
        //}
        //System.out.println("Average: " + "    Total: ");
        
        
    public static void PrintRow(String month, double temp, double precip){
        System.out.println("");
        System.out.print(month+"\t");
        System.out.print(temp+"\t\t");
        System.out.print(precip+"\t");
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
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        
        //instantiate CityWeatherV1 object 
        CityWeatherV1 weather = new CityWeatherV1(month,temperature,precipitation);
        //print average temperature and total precipitation
        

        //input to decide F/C and in/cm - to be completed in 6.02
        
        //conditions & method call to convert temp, if needed - to be completed in 6.02
        
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        
        //method call to calculate the average temperature
        
        //method call to calculate the total precipitation
        
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
        
        System.out.println("Weather Data");
        System.out.println("===================================");
        System.out.println(city + " "+ state);
        System.out.print("Months\t");
        System.out.print("Temperature ("+tempLabel+")\t");
        System.out.print("Precipitation ("+precipLabel+")\t");

        for(int i=0; i < 12; i++){
            PrintRow(month[i], temperature[i], precipitation[i]);
        }
        System.out.println("\n===================================");

        PrintRow("Average Temperature and Total Precipitation: ",weather.GetAverageTemp() , weather.GetTotalPrecip());
    }//end main
}//end class

