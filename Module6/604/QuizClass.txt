//The class used to create students and grades
public class QuizClass {
    private String name;
    private int[] grades = new int[2];


    public QuizClass(String _name, int[] _grades){
        name = _name;
        grades = _grades;
    }

    public String GetName(){
        return name;
    }

    public int[] getGrades(){
        return grades;
    }

    public void SetGrades(int index, int val){
        grades[index] = val;
    }

    public double GetDiffrence(){
        return grades[grades.length-1] - grades[0];
    }

    public double GetAverage(){
        double temp = 0;
        for (double d : grades) {
            temp+=d;
        }
        return temp/grades.length;
    }
}
