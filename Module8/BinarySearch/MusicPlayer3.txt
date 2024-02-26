/*
 * Logan Santamarina
 * 2/22/24
 * A program that searches for music using binary search
 */

public class MusicPlayer2 {
    public static void main(String[] args) {

        Music2[] musicArray = new Music2[10];
        musicArray[0] = new Music2("Bohemian Rhapsody", 1975, "Queen");
        musicArray[1] = new Music2("Billie Jean", 1983, "Michael Jackson");
        musicArray[2] = new Music2("Hotel California", 1976, "Eagles");
        musicArray[3] = new Music2("Imagine", 1971, "John Lennon");
        musicArray[4] = new Music2("Hey Jude", 1968, "The Beatles");
        musicArray[5] = new Music2("Thriller", 1982, "Michael Jackson");
        musicArray[6] = new Music2("Stairway to Heaven", 1971, "Led Zeppelin");
        musicArray[7] = new Music2("Smells Like Teen Spirit", 1991, "Nirvana");
        musicArray[8] = new Music2("Wonderwall", 1995, "Oasis");
        musicArray[9] = new Music2("Imagine", 1975, "John Lennon");

        PrintTable(musicArray, "Original");
        System.out.println("\n\n");

        SortStringTitle(musicArray);
        SearchTitle(musicArray, "Imagine");
        SearchTitle(musicArray, "Wonderwall");
        SearchTitle(musicArray, "A random song");
        System.out.println("\n\n");

        SortInt(musicArray);
        SearchYear(musicArray, 1971);
        SearchYear(musicArray, 1982);
        SearchYear(musicArray, 2000);
        System.out.println("\n\n");

        SortStringArtist(musicArray);
        SearchArtistName(musicArray, "Led Zeppelin");
        SearchArtistName(musicArray, "Kanye West");

    }

    public static void PrintTable(Music2[] list, String change) {
        System.out.println("\n\n" + change + "\n");

        System.out.printf("|%-30S | %4S | %20S|%n%n", "Name", "Year", "Artist");

        for (Music2 music : list) {
            System.out.printf("|%-30s | %4d | %20s|%n", music.getTitle(), music.getYear(), music.getArtist());
        }

    }

    // a method that searches the array for a particular song title
    public static void SearchTitle(Music2[] r, String toFind) {
        // Initial values show the entire array
        int high = r.length - 1; // Adjusted to the last index
        int low = 0; // Changed to start from the first index
        int probe;

        // Goes until we settle on one value
        while (high >= low) { // Adjusted to handle the case when high and low overlap
            // Splits the segment we are checking in half
            probe = (high + low) / 2;

            if (r[probe].getTitle().compareTo(toFind) > 0)
                high = probe - 1; // Adjusted to exclude the current probe index
            else if (r[probe].getTitle().compareTo(toFind) < 0)
                low = probe + 1; // Adjusted to exclude the current probe index
            else {
                // Found the target
                LPtitle(r, probe, toFind);
                return; // Return after finding the target
            }
        }

        // If we reach here, the element was not found
        System.out.println("NOT found: " + toFind);

    }

    // a method that searches the array for year released (the output should list
    // all songs found from that year)
    public static void SearchYear(Music2[] r, int toFind) {
        // Initial values show the entire array
        int high = r.length - 1; // Adjusted to the last index
        int low = 0; // Changed to start from the first index
        int probe;

        // Goes until we settle on one value
        while (high >= low) { // Adjusted to handle the case when high and low overlap
            // Splits the segment we are checking in half
            probe = (high + low) / 2;

            if (r[probe].getYear() > toFind)
                high = probe - 1; // Adjusted to exclude the current probe index
            else if (r[probe].getYear() < toFind)
                low = probe + 1; // Adjusted to exclude the current probe index
            else {
                // Found the target
                LPyear(r, probe, toFind);
                return; // Return after finding the target
            }
        }

        // If we reach here, the element was not found
        System.out.println("Not found: " + toFind);

    }

    // a method that searches the array for the name of the artist
    // (the output should list all songs performed by that artist)
    public static void SearchArtistName(Music2[] r, String toFind) {
        // Initial values show the entire array
        int high = r.length - 1; // Adjusted to the last index
        int low = 0; // Changed to start from the first index
        int probe;

        // Goes until we settle on one value
        while (high >= low) { // Adjusted to handle the case when high and low overlap
            // Splits the segment we are checking in half
            probe = (high + low) / 2;

            if (r[probe].getArtist().compareTo(toFind) > 0)
                high = probe - 1; // Adjusted to exclude the current probe index
            else if (r[probe].getArtist().compareTo(toFind) < 0)
                low = probe + 1; // Adjusted to exclude the current probe index
            else {
                // Found the target
                LPartist(r, low, toFind);
                return; // Return after finding the target
            }
        }

        // If we reach here, the element was not found
        System.out.println("NOT found: " + toFind);

    }

    // methods to assist with printing all matches after a binary search has found a
    // match. Model your code after the linearPrint method sample
    public static void LPtitle(Music2[] r, int low, String toFind) {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while ((i >= 0) && (r[i].getTitle().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while ((i < r.length) && (r[i].getTitle().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        // now print out the matches
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void LPartist(Music2[] r, int low, String toFind) {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while ((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while ((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        // now print out the matches
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void LPyear(Music2[] r, int low, int toFind) {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while ((i >= 0) && (r[i].getYear() == toFind)) {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while ((i < r.length) && (r[i].getYear() == toFind)) {
            end = i;
            i++;
        }
        // now print out the matches
        for (i = start; i <= end; i++)
            System.out.println("Found: " + r[i]);
    }

    
    public static void SortStringArtist(Music2[] array) {

        int posMax;
        Music2 temp;
        for (int i = array.length - 1; i >= 0; i--) {
            posMax = 0;
            for (int k = 0; k <= i; k++) {
                if (array[k].getArtist().compareTo(array[posMax].getArtist()) > 0) {
                    posMax = k;
                }
            }

            temp = array[i];
            array[i] = array[posMax];
            array[posMax] = temp;
        }
    }

    public static void SortStringTitle(Music2[] array) {
        int posMax;
        Music2 temp;
        for (int i = array.length - 1; i >= 0; i--) {
            posMax = 0;
            for (int k = 0; k <= i; k++) {
                if (array[k].getTitle().compareTo(array[posMax].getTitle()) > 0) {
                    posMax = k;
                }
            }

            temp = array[i];
            array[i] = array[posMax];
            array[posMax] = temp;
        }
    }

    // a method that sorts the array by year released
    public static void SortInt(Music2[] array) {

        int posMax;
        Music2 temp;
        for (int i = array.length - 1; i >= 0; i--) {
            posMax = 0;
            for (int k = 0; k <= i; k++) {
                if (array[k].getYear() > array[posMax].getYear()) {
                    posMax = k;
                }
            }

            temp = array[i];
            array[i] = array[posMax];
            array[posMax] = temp;
        }

    }
}
