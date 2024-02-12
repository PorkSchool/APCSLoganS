import java.util.ArrayList;

public class ElectionList {
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Jimmy Bob", 10));
        candidates.add(new Candidate("Alice Smith", 8));
        candidates.add(new Candidate("John Doe", 12));
        candidates.add(new Candidate("Emily Johnson", 6));
        candidates.add(new Candidate("Michael Brown", 9));
        
        PrintCandidates(candidates);
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

    public static void CreateTable(ArrayList<Candidate> list){
        
        System.out.println("Election Data");
        System.out.printf("| %20s | %6s | %4s |%n", "Candidate Name", "Votes", "%");

        for (Candidate candidate : list) {
            double percentage = (double)candidate.getVotes()/TotalVotes(list) * 100;
            System.out.printf("| %20s | %6d | %4.2f |%n", candidate.getName(), candidate.getVotes(), percentage);
        }

        System.out.println("The Total Votes of This Election were "+TotalVotes(list));

    }
}
