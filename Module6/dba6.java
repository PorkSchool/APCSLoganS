public class dba6 {
    public static void main(String[] args) {
        WordTester test = new WordTester(new String[]{"I", "am", "logan"}, 2, "i");

        // Testing the isWithin method
        boolean isWithinResult = test.isWithin();
        System.out.println("Is 'am' within the array? " + isWithinResult);

        // Testing the sameNumber method
        boolean sameNumberResult = test.sameNumber();
        System.out.println("Does the array have the same number of words as specified? " + sameNumberResult);
    }
}
