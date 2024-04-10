/*
 * Logan Santamarina
 * 4/8/24
 * Tester Class
 */
public class CoinCollectionTester {
    public static void main(String[] args) {
        // Test CoinCollection
        int[] years = { 1930, 1925, 1925 };
        double[] values = { 1.00, 0.25, 0.05 };
        String[] countries = { "Mexico", "US", "Britain" };

        CoinCollection myCoins = new CoinCollection(years, values, countries);

        System.out.println("Coins in myCoins collection:");
        displayCoinCollection(myCoins);

        int rareYear = 1930;
        System.out.println("Is the coin from the year " + rareYear + " rare? " + myCoins.isRare(rareYear));
        
        int[] usYears = { 1925, 1920, 1908 };
        double[] usValues = { 0.25, 0.50, 1.00 };

        USCoinCollection usCoins = new USCoinCollection(usYears, usValues);

        System.out.println("\nCoins in The US Coin collection:");
        for (Coin coin : usCoins.getCoins()) {
            System.out.println(coin.getYear() + " " + "US" + " " + coin.getFaceValue());
        }
        System.out.println("Is the US Coin rare for the year " + rareYear + "? " + usCoins.isRare(rareYear));
    }

    private static void displayCoinCollection(CoinCollection coinCollection) {
        for (Coin coin : coinCollection.getCoins()) {
            System.out.println(coin.getYear() + " " + coin.getCountry() + " " + coin.getFaceValue());
        }
    }
}