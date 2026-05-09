package decorator.clase;

public class RezultatPrintat implements RezultatMedic{

    private String stare;
    private String nume;

    public RezultatPrintat(String stare, String nume) {
        this.stare = stare;
        this.nume = nume;
    }


    @Override
    public void rezultat() {
        System.out.println("Pacientul " + this.nume + " e in starea " + this.stare);

    }
}
