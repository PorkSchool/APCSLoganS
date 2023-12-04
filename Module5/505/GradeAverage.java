/*
 * Logan Santamarina
 * 11-30-23
 * A class that calculates the average and diffrence for 2 of a students grades
 */
class GradeAverage{
    static void StartStatements(){
        System.out.println("\n                Grades\n");
        System.out.print("Grade 1");
        System.out.print("  Grade 2");
        System.out.print("  Diffrence");
        System.out.print("  Average");
        System.out.println("\n====================================");
    }
    public static void main(String[] args){
        StartStatements();
        double grade1 = 80.0;
        double grade2 = 90.1;
        Student2 student1 = new Student2(grade1,grade2);

        System.out.print(grade1);
        System.out.print("     "+grade2);
        System.out.print("     "+student1.GetDiffrence());
        System.out.print("        "+student1.CalculateGradeAverage()+"\n");
    }
}