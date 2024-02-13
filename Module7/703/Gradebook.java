/*
 * Logan Santamarina
 * 2/7/24
 * A Project that manipulates an arraylist and outputs student grades
 */

import java.util.ArrayList;

public class Gradebook {
    public static void main(String[] args) {

        ArrayList<StudentInformation> book = new ArrayList<StudentInformation>();

        // I labled the initial values abcde in order to easily see how my arraylist was
        // being manipulated
        book.add(new StudentInformation("a", new int[] { 98, 87, 34, 76, 54 }));
        book.add(new StudentInformation("b", new int[] { 76, 34, 98, 99, 90 }));
        book.add(new StudentInformation("c", new int[] { 92, 83, 78, 88, 76 }));
        book.add(new StudentInformation("d", new int[] { 95, 96, 98, 99, 97 }));
        book.add(new StudentInformation("e", new int[] { 11, 23, 34, 45, 56 }));

        System.out.println("Original Results");

        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "Name", "Q1 ", "Q2 ", "Q3 ", "Q4 ",
                "Q5 ");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "======", "====", "====", "====",
                "====", "====");

        for (int i = 0; i < book.size(); i++) {
            PrintTableRow(book.get(i));
        }

        SwitchNames(book.get(0), "Logan");

        System.out.println("\n\nSwitched index 0 name to Logan\n");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "Name", "Q1 ", "Q2 ", "Q3 ", "Q4 ",
                "Q5 ");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "======", "====", "====", "====",
                "====", "====");
        for (int i = 0; i < book.size(); i++) {
            PrintTableRow(book.get(i));
        }

        SwitchGrade(book.get(1), 5, 2);
        System.out.println("\n\nSwitched grades from row 3 index 2 to 5.\n");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "Name", "Q1 ", "Q2 ", "Q3 ", "Q4 ",
                "Q5 ");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "======", "====", "====", "====",
                "====", "====");
        for (int i = 0; i < book.size(); i++) {
            PrintTableRow(book.get(i));
        }

        SwitchStudents(book.get(2), "Frank", new int[] { 67, 54, 23, 11, 89 });
        System.out.println("\n\nSwitched index 2 with a new student frank.\n");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "Name", "Q1 ", "Q2 ", "Q3 ", "Q4 ",
                "Q5 ");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "======", "====", "====", "====",
                "====", "====");
        for (int i = 0; i < book.size(); i++) {
            PrintTableRow(book.get(i));
        }

        InsertStudentBefore(2, new StudentInformation("Ben", new int[] { 90, 80, 60, 70, 50 }), book);
        System.out.println("\n\nInserted ben before index 2.\n");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "Name", "Q1 ", "Q2 ", "Q3 ", "Q4 ",
                "Q5 ");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "======", "====", "====", "====",
                "====", "====");
        for (int i = 0; i < book.size(); i++) {
            PrintTableRow(book.get(i));
        }

        DeleteByName("Logan", book);
        System.out.println("\n\nDeleted Logan\n");

        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "Name", "Q1 ", "Q2 ", "Q3 ", "Q4 ",
                "Q5 ");
        System.out.printf("| %-6s | | %4s | | %4s | | %4s | | %4s | | %4s |%n", "======", "====", "====", "====",
                "====", "====");
        for (int i = 0; i < book.size(); i++) {
            PrintTableRow(book.get(i));
        }

    }

    // traverse through the data structure and print each element in a neat table
    // format.
    public static void PrintTableRow(StudentInformation si) {
        System.out.printf("| %-6s | | %4d | | %4d | | %4d | | %4d | | %4d |%n", si.GetName(),
                si.GetQuiz(0),
                si.GetQuiz(1),
                si.GetQuiz(2),
                si.GetQuiz(3),
                si.GetQuiz(4));
    }

    // replace a student's name with a new one.
    public static void SwitchNames(StudentInformation si, String newName) {
        si.SetName(newName);
    }

    // replace a student's quiz grade with a new one. It should replace only one
    // quiz grade, as indicated by the quiz number, when it is called. It will have
    // the data structure, quiz number, and new quiz score as input.
    public static void SwitchGrade(StudentInformation si, int newGrade, int index) {
        si.SetQuiz(index, newGrade);
    }

    // replace a student with another one. It will have the data structure, name to
    // replace, new student name, and quiz scores as input.
    public static void SwitchStudents(StudentInformation si, String name, int[] quizs) {
        si.SetName(name);
        si.SetQuiz(quizs);
    }

    // insert a new student before another student in the data structure. It will
    // have the data structure, name to find, new student name, and quiz scores as
    // input.
    public static void InsertStudentBefore(int index, StudentInformation si, ArrayList<StudentInformation> _book) {
        _book.add(index, si);
    }

    // delete a student by finding the student name. It will take the data structure
    // and name to find as input.
    public static void DeleteByName(String name, ArrayList<StudentInformation> _book) {
        for (int i = 0; i < _book.size(); i++) {
            if (_book.get(i).GetName().equals(name)) {
                _book.remove(_book.get(i));
            }
        }
    }
}