import java.util.ArrayList;

public class MusicPlayer {
    public static void main(String[] args) {

        Music3[] musicArray = new Music3[10];
        musicArray[0] = new Music3("Bohemian Rhapsody", 1975, "Queen");
        musicArray[1] = new Music3("Billie Jean", 1983, "Michael Jackson");
        musicArray[2] = new Music3("Hotel California", 1976, "Eagles");
        musicArray[3] = new Music3("Imagine", 1971, "John Lennon");
        musicArray[4] = new Music3("Hey Jude", 1968, "The Beatles");
        musicArray[5] = new Music3("Thriller", 1982, "Michael Jackson");
        musicArray[6] = new Music3("Stairway to Heaven", 1971, "Led Zeppelin");
        musicArray[7] = new Music3("Smells Like Teen Spirit", 1991, "Nirvana");
        musicArray[8] = new Music3("Wonderwall", 1995, "Oasis");
        musicArray[9] = new Music3("Imagine", 1975, "John Lennon");

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

    public static void PrintTable(Music3[] list, String change) {
        System.out.println("\n\n" + change + "\n");

        System.out.printf("|%-30S | %4S | %20S|%n%n", "Name", "Year", "Artist");

        for (Music3 music : list) {
            System.out.printf("|%-30s | %4d | %20s|%n", music.getTitle(), music.getYear(), music.getArtist());
        }

    }

    // a method that searches the array for a particular song title
    public static void SearchTitle(Music3[] r, String toFind) {
        int found = -1;
        ArrayList<Music3> out = new ArrayList<>();

        for (int i = 0; i < r.length; i++) {
            if (r[i].getTitle().compareTo(toFind) == 0) {
                found = i;
                out.add(r[i]);
                // break; //Uncomment to only select first found
            }
        }

        if (found != -1) { // we have found the person
            if (out.size() > 1) {
                System.out.printf("The Song %s was found %d Times%n%n", toFind, out.size());
            } else {
                System.out.println("We found " + toFind + " in the roster: \n");
            }
        } else
            System.out.println(toFind + " is not found in the roster\n");
    }

    // a method that searches the array for year released (the output should list
    // all songs found from that year)
    public static void SearchYear(Music3[] r, int toFind) {
        int found = -1;
        ArrayList<Music3> out = new ArrayList<>();

        for (int i = 0; i < r.length; i++) {
            if (r[i].getYear() == toFind) {
                found = i;
                out.add(r[i]);
            }
        }

        if (found != -1) { // we have found the person
            if (out.size() > 1) {
                System.out.printf("Songs from the year %d were found %d Times%n%n", toFind, out.size());
            } else {
                System.out.println("We found a song from the year " + toFind + " in the roster: \n");
            }
        } else
            System.out.println("Songs from the year " + toFind + " were not found in the roster\n");
    }

    // a method that searches the array for the name of the artist
    // (the output should list all songs performed by that artist)
    public static void SearchArtistName(Music3[] r, String toFind) {
        int found = -1;
        ArrayList<Music3> out = new ArrayList<>();

        for (int i = 0; i < r.length; i++) {
            if (r[i].getArtist().compareTo(toFind) == 0) {
                found = i;
                out.add(r[i]);
                // break; //Uncomment to only select first found
            }
        }

        if (found != -1) { // we have found the person
            if (out.size() > 1) {
                System.out.printf("The Artist %s was found %d Times%n%n", toFind, out.size());
            } else {
                System.out.println("We found " + toFind + " in the roster: \n");
            }
        } else
            System.out.println(toFind + " is not found in the roster\n");
    }
}
