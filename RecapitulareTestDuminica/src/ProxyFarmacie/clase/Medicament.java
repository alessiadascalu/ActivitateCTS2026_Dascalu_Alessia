package ProxyFarmacie.clase;

public class Medicament {

    private String numeMedicament;
    private int pret;

    public Medicament(String numeMedicament, int pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public int getPret() {
        return pret;
    }
}
