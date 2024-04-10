/*
 * Logan Santamarina
 * 4/8/24
 * The class containing the Coincollection script
 */
import java.util.ArrayList;

public class CoinCollection {
    private ArrayList<Coin> coins; // collection of coins

    public CoinCollection(int[] years, double[] values, String[] countries) {
        coins = new ArrayList<>();
        for (int i = 0; i < years.length; i++) {
            coins.add(new Coin(years[i], values[i], countries[i]));
        }
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }
    

    public boolean isRare(int year) {
        for (Coin coin : coins) {
            if (coin.getYear() < year) {
                return true;
            }
        }
        return false;
    }
}