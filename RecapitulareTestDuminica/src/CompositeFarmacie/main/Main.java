package CompositeFarmacie.main;

import CompositeFarmacie.clase.Departament;
import CompositeFarmacie.clase.Medicament;

public class Main {
    public static void main(String[] args) {

        Departament farmacie = new Departament("Depozit farmacie");

        Departament raceala = new Departament("Raceala");
        Departament durere = new Departament("Durere");

        Departament copii = new Departament("Copii");
        copii.adaugaStructura(new Medicament("Nurofen baby"));
        copii.adaugaStructura(new Medicament("Panadol"));

        raceala.adaugaStructura(copii);
        durere.adaugaStructura(new Medicament("Paracetamol"));

        farmacie.adaugaStructura(raceala);
        farmacie.adaugaStructura(durere);

        farmacie.afiseaza("");
    }
}
