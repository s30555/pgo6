import java.sql.SQLOutput;
import java.util.ArrayList;

public class Students {

    private static ArrayList<Student>
            students = new ArrayList<>();

    public static void addStudent(Student student) {
        students.add(student);

    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            if (! student.getStatus().equals("absolwent")){
                student.promoteToKolejnySemestr();
            }
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

