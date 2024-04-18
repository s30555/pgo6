public class StudyProgramme {

    private String nazwaprogramu;
    private String opis;
    private int numerSemestru;
    private int ITN;

    public StudyProgramme(String nazwaprogramu, String opis, int numerSemsetru, int ITN) {
        this.nazwaprogramu = nazwaprogramu;
        this.numerSemestru = numerSemsetru;
        this.opis = opis;
        this.ITN = ITN;
    }

    public String getNazwaprogramu() {
        return nazwaprogramu;
    }

    public int getITN() {
        return ITN;
    }

    public int getNumerSemestru() {
        return numerSemestru;
    }
}

