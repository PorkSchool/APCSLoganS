/**
 * Purpose:  This class Uses the candidates class to output and manipulate the votes displayed using an array.
 *
 * @author < Logan Santamarina >
 * @version < 2/12/24 >
 */
public class ElectionArray2 {
    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[]{
            new Candidate("Jimmy Bob", 1000),
            new Candidate("Alice Smith", 800),
            new Candidate("John Doe", 1200),
            new Candidate("Emily Johnson", 50),
            new Candidate("Michael Brown", 700)
        };

        // Original votes
        System.out.println("\n\nOriginal Votes\n");
        CreateTable(candidates);

        // Change a candidate's name
        replaceName(candidates, "John Doe", "Benjamin Doe");
        System.out.println("\n\nChanged John Doe into Benjamin Doe\n");
        CreateTable(candidates);

        // Change a candidate's vote count
        replaceVotes(candidates, 50, 550);
        System.out.println("\n\nChanged 50 Votes to 550 Votes\n");
        CreateTable(candidates);

        // Change a candidate by replacing the name and number of votes
        replace(candidates, "Emily Johnson", "Emmet Johnson", 890);
        System.out.println("\n\nChanged Emily Johnson into Emmet Johnson\n");
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

    public static void CreateTable(Candidate[] array) {

        System.out.println("Election Data");
        System.out.printf("| %20s | %6s | %4s |%n", "Candidate Name", "Votes", "%");

        for (Candidate candidate : array) {
            double percentage = (double) candidate.getVotes() / TotalVotes(array) * 100;
            System.out.printf("| %20s | %6d | %4.2f |%n", candidate.getName(), candidate.getVotes(), percentage);
        }

        System.out.println("The Total Votes of This Election were " + TotalVotes(array));

    }

    public static void replaceName(Candidate[] array, String in, String rep) {
        for (Candidate c : array) {
            if (c.getName().equals(in)) {
                c.setName(rep);
            }
        }
    }

    public static void replaceVotes(Candidate[] array, int in, int rep) {
        for (Candidate c : array) {
            if (c.getVotes() == in) {
                c.setVotes(rep);
            }
        }
    }

    public static void replace(Candidate[] array, String in, String repName, int repVotes) {
        for (Candidate c : array) {
            if (c.getName().equals(in)) {
                c.setVotes(repVotes);
                c.setName(repName);
            }
        }
    }
}