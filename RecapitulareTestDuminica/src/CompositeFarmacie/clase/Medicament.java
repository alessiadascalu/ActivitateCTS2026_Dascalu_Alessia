package CompositeFarmacie.clase;

public class Medicament implements Structura{

    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public void afiseaza(String text) {
        System.out.println(text + " medicament: " + numeMedicament);
    }
}
