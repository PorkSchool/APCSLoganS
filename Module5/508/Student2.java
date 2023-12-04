public class Student2 {

    private double grade1;
    private double grade2;
    private String name;
    
    public Student2(){

    }

    public Student2(double _grade1, double _grade2){
        grade1 = _grade1;
        grade2 = _grade2;
    }
    public Student2(double _grade1, double _grade2, String _name){
        grade1 = _grade1;
        grade2 = _grade2;
        name = _name;
    }
    public Student2(String _name){
        name = _name;
    }

    public void SetName(String _inp){
        name = _inp;
    }
//============================================
    public void SetGrade1(double grade){
        grade1 = grade; 
    }

    public void SetGrade1(int grade){
        grade1 = (double)grade;
    }

    public void SetGrade2(double grade){
        grade2 = grade; 
    }

    public void SetGrade2(int grade){
        grade2 = (double)grade;
    }

    public double GetGrade1(){
        return grade1;
    }
    public double GetGrade2(){
        return grade2;
    }
//============================================
    public String GetName(){
        return name;
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
