package decorator.main;

import decorator.clase.RezultatMedic;
import decorator.clase.RezultatPrintat;
import decorator.decorator.RezultatOnline;

public class Main {
    public static void main(String[] args) {

        RezultatMedic rezultatMedic=new RezultatPrintat("Stabil", "Ion");
        rezultatMedic.rezultat();
        RezultatMedic rezultatMedic1=new RezultatOnline(rezultatMedic);
        rezultatMedic1.rezultat();

    }
}