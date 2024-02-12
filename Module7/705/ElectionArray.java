/**
 * ElectionArray
 */
public class ElectionArray {
    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[]{
            new Candidate("Jimmy Bob", 10),
            new Candidate("Alice Smith", 8),
            new Candidate("John Doe", 12),
            new Candidate("Emily Johnson", 6),
            new Candidate("Michael Brown", 9)
        };
        
        PrintCandidates(candidates);
        CreateTable(candidates);
    }

    public static void PrintCandidates(Candidate[] array) {
        System.out.println("Raw Data");

        for (Candidate candidate : array) {
            System.out.println(candidate.toString());
        }
        System.out.println("=================================================\n");

    }

    public static int TotalVotes(Candidate[] array) {
        int total = 0;
        for (Candidate candidate : array) {
            total += candidate.getVotes();
        }

        return total;
    }

    public static void CreateTable(Candidate[] array){
        
        System.out.println("Election Data");
        System.out.printf("| %20s | %6s | %4s |%n", "Candidate Name", "Votes", "%");

        for (Candidate candidate : array) {
            double percentage = (double)candidate.getVotes() / TotalVotes(array) * 100;
            System.out.printf("| %20s | %6d | %4.2f |%n", candidate.getName(), candidate.getVotes(), percentage);
        }

        System.out.println("The Total Votes of This Election were " + TotalVotes(array));

    }
}