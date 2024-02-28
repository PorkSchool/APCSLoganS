public class test {
    public static void main(String[] args) {

        String[][] names = { { "Abby", "Bobby", "Charles", "David" }, { "Eric", "Faith", "Gina", "Hope" },
                { "Ines", "Juan", "Karl", "Lily" } };

        // What would be printed out by the following code:

        for (int b = 1; b < names[0].length - 1; b++) {
            for (int a = 1; a < names.length; a++) {
                System.out.print(names[a][b] + " ");
            }
        }
    }
}
