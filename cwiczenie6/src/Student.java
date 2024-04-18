import java.util.Date;
import java.util.ArrayList;
public class Student {

    private String imie;
    private String nazwisko;
    private String emial;
    private String adres;
    private String indexNumber;
    private Date dataurodzin;
    private String status;
    private int aktualnySemestr;
    private StudyProgramme programstudiow;
    private ArrayList<Grade> grades;

    private static int NextIndexNumber =1;
    private StudyProgramme studyProgramme;


    public Student(String imie, String nazwisko, String email, String adres, String indexNumber, Date dataurodzin) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.emial = email;
        this.adres = adres;
        this.indexNumber = indexNumber;
        this.dataurodzin = dataurodzin;
        this.status = "kandydat";
        this.aktualnySemestr = 1;
        this.grades = new ArrayList<>();

    }

    private int getNextIndexNumber() {
        return NextIndexNumber++;
    }


    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public void addGrade(int ocena, String nazwakursu) {
        Grade grade = new Grade(ocena, nazwakursu);
        grades.add(grade);
    }

    public void promoteToKolejnySemestr(){
        if (aktualnySemestr <studyProgramme.getNumerSemestru()) {
            aktualnySemestr++;

            System.out.println(imie + " " + nazwisko + " uczęszcza na kolejny semestr" + aktualnySemestr);
        } else {
            status = "absolwent";
            System.out.println( imie + " " + nazwisko + "ukończył/a naukę");
        }
    }

    public String toString() {
        return  "Student: " + imie + " " + nazwisko + "\n" + "email: " + emial + "\n" + "adres: " + adres + "\n" + "numer indexu: " + indexNumber + "\n" + "status: " + status + "\n" + "Aktualny semestr: " + aktualnySemestr + "\n" + "Program studiów: " + programstudiow.getNazwaprogramu();
    }

    public String getStatus() {
        return status;
    }
}

