/*
 * Logan Santamarina
 * 4/8/24
 * The class containing the Coin script
 */
public class Coin {
    private int mintYear; // year coin was made
    private double faceValue; // value of coin at time it was made
    private String country; // origin country

    public Coin(int year, double value, String ctry) {
        mintYear = year;
        faceValue = value;
        country = ctry;
    }

    public int getYear() {
        return mintYear;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public String getCountry() {
        return country;
    }
}