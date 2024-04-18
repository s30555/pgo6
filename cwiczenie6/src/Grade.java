public class Grade {
    private int ocena;
    private String nazwakursu;

    public Grade (int ocena, String nazwakursu) {
        this.ocena = ocena;
        this.nazwakursu = nazwakursu;
    }

    public int getOcena () {
        return  ocena;
    }

    public String getNazwakursu() {
        return nazwakursu;
    }

}

