import java.util.ArrayList;

public class MusicPlayer2 {
    public static void main(String[] args) {

        Music[] musicArray = new Music[10];
        musicArray[0] = new Music("Bohemian Rhapsody", 1975, "Queen");
        musicArray[1] = new Music("Billie Jean", 1983, "Michael Jackson");
        musicArray[2] = new Music("Hotel California", 1976, "Eagles");
        musicArray[3] = new Music("Imagine", 1971, "John Lennon");
        musicArray[4] = new Music("Hey Jude", 1968, "The Beatles");
        musicArray[5] = new Music("Thriller", 1982, "Michael Jackson");
        musicArray[6] = new Music("Stairway to Heaven", 1971, "Led Zeppelin");
        musicArray[7] = new Music("Smells Like Teen Spirit", 1991, "Nirvana");
        musicArray[8] = new Music("Wonderwall", 1995, "Oasis");
        musicArray[9] = new Music("Imagine", 1975, "John Lennon");

        PrintTable(musicArray, "Original");
        System.out.println("\n\n");

        SearchTitle(musicArray, "Imagine");
        SearchTitle(musicArray, "Wonderwall");
        SearchTitle(musicArray, "A random song");
        System.out.println("\n\n");

        SearchYear(musicArray, 1971);
        SearchYear(musicArray, 1982);
        SearchYear(musicArray, 2000);
        System.out.println("\n\n");

        SearchArtistName(musicArray, "Michael Jackson");
        SearchArtistName(musicArray, "Led Zeppelin");
        SearchArtistName(musicArray, "Kanye West");

    }

    public static void PrintTable(Music[] list, String change) {
        System.out.println("\n\n" + change + "\n");

        System.out.printf("|%-30S | %4S | %20S|%n%n", "Name", "Year", "Artist");

        for (Music music : list) {
            System.out.printf("|%-30s | %4d | %20s|%n", music.getTitle(), music.getYear(), music.getArtist());
        }

    }

    // a method that searches the array for a particular song title
    public static void SearchTitle(Music[] r, String toFind) {
       
    }

    // a method that searches the array for year released (the output should list
    // all songs found from that year)
    public static void SearchYear(Music[] r, int toFind) {
       
    }

    // a method that searches the array for the name of the artist
    // (the output should list all songs performed by that artist)
    public static void SearchArtistName(Music[] r, String toFind) {
        
    }

    // methods to assist with printing all matches after a binary search has found a
    // match. Model your code after the linearPrint method sample
    public static void LPtitle(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getTitle().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getTitle().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }
    public static void LPartist(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }
    public static void LPyear(Music[] r, int low, int toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getYear() == toFind))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getYear() == toFind)
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void SortStringArtist(Music[] array) {

        int posMax;
        Music temp;
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

    public static void SortStringTitle(Music[] array, int dir) {
        int posMax;
        Music temp;
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
    public static void SortInt(Music[] array, int dir) {

        int posMax;
        Music temp;
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
