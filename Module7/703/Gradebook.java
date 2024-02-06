import java.util.ArrayList;
public class Gradebook {
    public static void main(String[] args){
        ArrayList<StudentInformation> book = new ArrayList<StudentInformation>(); 
        book.add(new StudentInformation("Fred",new int[]{98,87,34,76,54}));
        book.add(new StudentInformation("Fred",new int[]{98,87,34,76,54}));
        book.add(new StudentInformation("Fred",new int[]{98,87,34,76,54}));
        book.add(new StudentInformation("Fred",new int[]{98,87,34,76,54}));
        book.add(new StudentInformation("Fred",new int[]{98,87,34,76,54}));


    }
    
// traverse through the data structure and print each element in a neat table format.
public void PrintTableRow(StudentInformation si){
    System.out.printf("%s %f %f %f %f %f", si.GetName(), si.GetQuiz(0), si.GetQuiz(1), si.GetQuiz(2), si.GetQuiz(3), si.GetQuiz(4));
}

// replace a student's name with a new one.
public void SwitchNames(StudentInformation si, String newName){
    si.SetName(newName);
}

// replace a student's quiz grade with a new one. It should replace only one quiz grade, as indicated by the quiz number, when it is called. It will have the data structure, quiz number, and new quiz score as input.
public void SwitchGrade(StudentInformation si, int newGrade, int index){
    si.SetQuiz(index, newGrade);
}

// replace a student with another one. It will have the data structure, name to replace, new student name, and quiz scores as input.

// insert a new student before another student in the data structure. It will have the data structure, name to find, new student name, and quiz scores as input.

// delete a student by finding the student name. It will take the data structure and name to find as input.

}
