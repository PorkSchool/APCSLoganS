
public class StudentInformation {
    private String name;
    private int[] quizes = new int[5];

    public StudentInformation() {

    }

    public StudentInformation(String _name, int[] _quizes) {
        name = _name;
        quizes[0] = _quizes[0];
        quizes[1] = _quizes[1];
        quizes[2] = _quizes[2];
        quizes[3] = _quizes[3];
        quizes[4] = _quizes[4];
    }

    // a method that takes in a quiz number as input and then returns the
    // appropriate quiz value
    public int GetQuiz(int i) {
        return quizes[i];
    }

    // a method to get the name of a student
    public String GetName() {
        return name;
    }

    // a method that sets a quiz score based on inputing a quiz number and new quiz
    // score
    public void SetQuiz(int i, int value) {
        quizes[i] = value;
    }

    // a method to set the name of a student
    public void SetName(String value) {
        name = value;
    }

    // a toString() method that prints the name of the student along with the quiz
    // scores
    public void printPhrase() {
        System.out.printf("%s %f %f %f %f %f", name, quizes[0], quizes[1], quizes[2], quizes[3], quizes[4]);
    }
}
