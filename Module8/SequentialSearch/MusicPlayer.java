public class MusicPlayer {
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
    }

    public static void PrintTable(Music[] list, String change){
        System.out.println("\n\n" +change+ "\n" );
        
        System.out.printf("|%-30S | %4S | %20S|%n%n", "Name", "Year", "Artist");

        for (Music music : list) {
            System.out.printf("|%-30s | %4d | %20s|%n", music.getTitle(), music.getYear(), music.getArtist());
        }

    }

    // a method that searches the array for a particular song title
    public static void SearchTitle(Music[] array, String toFind){

    }
    
    // a method that searches the array for year released (the output should list all songs found from that year)
    public static void SearchYear(Music[] array, int toFind){

    }
    
    // a method that searches the array for the name of the artist 
    // (the output should list all songs performed by that artist)
    public static void SearchArtistName(Music[] array, String toFind){

    }
}
