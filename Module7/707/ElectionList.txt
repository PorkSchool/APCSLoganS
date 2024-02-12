/**
 * Purpose:  This class Uses the candidates class to output and manipulate the votes displayed using an arraylist.
 *
 * @author < Logan Santamarina >
 * @version < 2/12/24 >
 */

import java.util.ArrayList;

public class ElectionList {
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Jimmy Bob", 1000));
        candidates.add(new Candidate("Alice Smith", 800));
        candidates.add(new Candidate("John Doe", 1200));
        candidates.add(new Candidate("Emily Johnson", 50));
        candidates.add(new Candidate("Michael Brown", 700));

        //og
        System.out.println("\n\nOriginal Votes\n");
        CreateTable(candidates);

        // change a candidate's name
        replaceName(candidates, "John Doe", "Benjamin Doe");
        System.out.println("\n\nChanged John Doe into Benjamin Doe\n");
        CreateTable(candidates);

        // change a candidate's vote count
        replaceVotes(candidates, 50, 550);
        System.out.println("\n\nChanged 50 Votes to 550 Votes\n");
        CreateTable(candidates);

        // change a candidate by replacing the name and number of votes
        replace(candidates, "Emily Johnson", "Emmet Johnson", 890);
        System.out.println("\n\nChanged Emily Johnson into Emmet Johnson\n");
        CreateTable(candidates);

    }

    public static void PrintCandidates(ArrayList<Candidate> list) {
        System.out.println("Raw Data");

        for (Candidate candidate : list) {
            System.out.println(candidate.toString());
        }
        System.out.println("=================================================\n");

    }

    public static int TotalVotes(ArrayList<Candidate> list) {
        int total = 0;
        for (Candidate candidate : list) {
            total += candidate.getVotes();
        }

        return total;
    }

    // A method called that traverses through the array and creates a table with
    // columns for the candidate name, followed by votes
    // received, and then percentage of total votes. After printing the table, print
    // a statement showing the total number of votes for the
    // election.

    public static void CreateTable(ArrayList<Candidate> list) {

        System.out.println("Election Data");
        System.out.printf("| %20s | %6s | %4s |%n", "Candidate Name", "Votes", "%");

        for (Candidate candidate : list) {
            double percentage = (double) candidate.getVotes() / TotalVotes(list) * 100;
            System.out.printf("| %20s | %6d | %4.2f |%n", candidate.getName(), candidate.getVotes(), percentage);
        }

        System.out.println("The Total Votes of This Election were " + TotalVotes(list));

    }

    // a method that will find a particular candidate by name and change the name
    // for that candidate. Its arguments should include the array, a name to find,
    // and the replacement name.

    public static void replaceName(ArrayList<Candidate> list, String in, String rep){
        for(Candidate c : list){
            if(c.getName().equals(in)){
                c.setName(rep);
            }
        }
    }


    // a method that will find a particular candidate by name and change the number
    // of votes for that candidate. Its arguments should include the array, a name
    // to find, and the replacement votes.

    public static void replaceVotes(ArrayList<Candidate> list, int in, int rep){
        for(Candidate c : list){
            if(c.getVotes() == in){
                c.setVotes(rep);
            }
        }
    }

    // a method that will find a particular candidate by name and replace both the
    // name and number of votes for that candidate. Its arguments should include the
    // array, a name to find, the replacement name, and the replacement votes.
    public static void replace(ArrayList<Candidate> list, String in, String repName, int repVotes){
        for(Candidate c : list){
            if(c.getName().equals(in)){
                c.setVotes(repVotes);
                c.setName(repName);
            }
        }
    }
}
