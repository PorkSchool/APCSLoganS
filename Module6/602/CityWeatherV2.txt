/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV2 {

    private int maxIndex = 12;
    // private instance variables - three arrays
    private String [] months = new String[maxIndex];

    private double[] temperature = new double[maxIndex];

    private double[] precipitation = new double[maxIndex];

    // constructor with parameters

    public CityWeatherV2(String[] _months,double[] _temps, double[] _precips){
        months = _months;
        temperature = _temps;
        precipitation = _precips;
    }

    // setters and getters for each private instance variable

    //Getters
    public String[] GetMonths(){
        return months;
    }
    public double[] GetTemp(){
        return temperature;
    }
    public double[] GetPrecips(){
        return precipitation;
    }

    //Setters
    public void SetMonths(String[] _m){
        months = _m;
    }
    public void SetTemps(double[] _t){
        temperature = _t;
    }
    public void SetPrecips(double[] _p){
        precipitation = _p;
    }
    // method to calculate the average of temperature
    public double GetAverageTemp(){

        double total = 0.0;
        double count = 0;
        for(double num : temperature){
            total += num;
            count++;
        }
        return Math.round(total/count * 100.0) / 100.0;
    }

    // method to calculate total precipitation array
    public double GetTotalPrecip(){
        
        double total = 0.0;
        for(double num : precipitation) {
            total +=num;
        }
        return Math.round(total * 100.0) / 100.0;
    }
 
    public double F_TO_C(double f){
        return Math.round(((f - 32) * 5.0 / 9.0) * 100.0) / 100.0;
    }
        
    public double I_TO_C(double i){
        return Math.round((i * 2.54) * 100.0) / 100.0;
    }
    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
