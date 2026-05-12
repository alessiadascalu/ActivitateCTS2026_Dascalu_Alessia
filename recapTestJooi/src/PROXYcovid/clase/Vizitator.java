package PROXYcovid.clase;

public class Vizitator {

    private String nume;
    private boolean areEchipament;
    private boolean areScrisoare;

    public Vizitator(String nume, boolean areEchipament, boolean areScrisoare) {
        this.nume = nume;
        this.areEchipament = areEchipament;
        this.areScrisoare = areScrisoare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreEchipament() {
        return areEchipament;
    }

    public boolean isAreScrisoare() {
        return areScrisoare;
    }
}
