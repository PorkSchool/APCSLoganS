/*
 * Logan Santamarina
 * 4/8/24
 * The class containing the UScoincolelction script
 */
public class USCoinCollection extends CoinCollection {
    public USCoinCollection(int[] years, double[] values) {
        super(years, values, UsDefault(years.length));
    }

    private static  String[] UsDefault(int len){
        String[] country = new String[len];
        for (String c : country) {
            c = "US";
        }
        return country;
    }
}