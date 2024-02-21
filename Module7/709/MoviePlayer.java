
public class MoviePlayer {
    public static void main(String[] args) {

        // Declare an array of at least 10 Movie objects. For each, you will need the
        // movie title, year, and studio. Of course, be sure to use school-appropriate
        // movie titles.

        Movie[] movies = new Movie[] {
                new Movie("Toy Story", 1995, "Pixar Animation Studios"),
                new Movie("The Lion King", 1994, "Walt Disney Pictures"),
                new Movie("Finding Nemo", 2003, "Pixar Animation Studios"),
                new Movie("Shrek", 2001, "DreamWorks Animation"),
                new Movie("Monsters, Inc.", 2001, "Pixar Animation Studios"),
                new Movie("Frozen", 2013, "Walt Disney Pictures"),
                new Movie("The Incredibles", 2004, "Pixar Animation Studios"),
                new Movie("Aladdin", 1992, "Walt Disney Pictures"),
                new Movie("Moana", 2016, "Walt Disney Pictures"),
                new Movie("Despicable Me", 2010, "Universal Pictures")
        };

        // Test your sorting methods by calling each and displaying the results.

        // Start by showing the array without sorting.

        // Then demonstrate sorting by title in both ascending and descending order.
        // Do the same for year and studio. Be sure to
        // clearly label your output so someone looking at it knows which sort was
        // applied each time.

    }

    // Design a static method that traverses through the array and prints each
    // element.
    public static void PrintTable(Movie[] list, String change){
        System.out.println(change);
        for (Movie movie : list) {
            System.out.printf("%n%20s | %4d | %20s%n%n", movie.getTitle(), movie.getYear(), movie.getStudio());
        }

    }
    // Create the following static methods in the tester class. Utilize the
    // insertion sort algorithm.
    // Each method will take two arguments: the array and an int parameter.
    // Sort appropriately depending on the value of the second parameter: 1 sort
    // ascending, or 2 sort descending.

    // a method that sorts the array by the movie title

    // a method that sorts the array by year released

    // a method that sorts the array by the name of the studio that produces it




    
}
