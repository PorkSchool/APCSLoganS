/*
 * Logan Santamarina
 * 1-16-23
 * A simple program that calculates students grades and outputs the average and diffrence in an aligned table
 */
public class QuizResults {
    public static void main(String[] args){


        QuizClass fred = new QuizClass("Fred", new int[] {92, 88});
        QuizClass niko = new QuizClass("Niko", new int[] {78, 85});
        QuizClass bob = new QuizClass("Bob", new int[] {93, 80});
        QuizClass tom = new QuizClass("Tom", new int[] {92, 95});

        QuizClass[] studentArray = {fred,niko,bob,tom};


        System.err.printf("%35s %n","Quiz Results");
        System.out.printf("%-15s %-10s %-10s %-12s %-10s %n", "Name","Grade1", "Grade2","Diffrence", "Average");
        System.err.println("==========================================================");
        for (QuizClass student : studentArray) {


                System.out.printf("%-15s %-10s %-10s %-12.2f %-10.2f %n",
                
                                             student.GetName(),
                                             student.getGrades()[0], 
                                             student.getGrades()[1], 
                                             student.GetDiffrence(), 
                                             student.GetAverage());
        }
    }
}