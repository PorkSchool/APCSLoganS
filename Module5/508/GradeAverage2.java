/*
 * Logan Santamarina
 * 12/1/23
 * A class that calculates the average and diffrence for 2 of a students grades usin goverloaded object methods and constructors
 */
class GradeAverage2{
    static void StartStatements(){
        System.out.println("\n                Grades\n");
        System.out.print("Name");
        System.out.print("        Grade 1");
        System.out.print("  Grade 2");
        System.out.print("  Diffrence");
        System.out.print("  Average");
        System.out.println("\n================================================");
    }

    static void PrintRow(Student2 student){
        System.out.print(student.GetName());
        System.out.print("      "+student.GetGrade1());
        System.out.print("     "+student.GetGrade2());
        System.out.print("     "+student.GetDiffrence());
        System.out.print("        "+student.CalculateGradeAverage()+"\n");
    }

    public static void main(String[] args){
        StartStatements();

        double rob_grade1 = 90.8;
        double rob_grade2 = 65.3;
        Student2 robert = new Student2(rob_grade1,rob_grade2, "Robert");
        
        Student2 kenney = new Student2("Kenney");
        kenney.SetGrade1(89.3);
        kenney.SetGrade2(76);

        double cha_grade1 = 90.8;
        double cha_grade2 = 65.3;
        Student2 charle = new Student2(cha_grade1,cha_grade2);
        charle.SetName("Charle");

        PrintRow(robert);
        PrintRow(kenney);
        PrintRow(charle);
    }
}