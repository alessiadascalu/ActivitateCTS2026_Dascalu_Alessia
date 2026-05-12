package flyweight.clase;

public class Pacient implements PacientAbstract{

    private String nume;
    private String adresa;
    private String nrTelefon;

    public Pacient(String nume, String adresa, String nrTelefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
    }



    @Override
    public void afiseazaInternare(Internare internare) {
        System.out.println("Pacientul " + nume + " cu adresa la " + adresa + " si cu nr de telefon " + nrTelefon + " a fost internat" + internare.toString());

    }
}
