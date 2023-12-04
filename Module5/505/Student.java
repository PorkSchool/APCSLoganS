public class Student {

    private double grade1;
    private double grade2;

    public Student(){

    }

    public Student(double _grade1, double _grade2){
        grade1 = _grade1;
        grade2 = _grade2;
        
    }
    public double GetDiffrence(){
        if(grade1 > grade2){
            return (double)(Math.round((grade1 - grade2) * 10))/10;
        }else{
            return (double)(Math.round((grade2 - grade1) * 100))/100;
        }
    }

    public double CalculateGradeAverage(){
        return (double)Math.round(((grade1 + grade2)/2)* 10)/10;
    }
}
