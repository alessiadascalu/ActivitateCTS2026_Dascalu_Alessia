package ProxyFarmacie.clase;

public class Farmacie implements Interfata{


    @Override
    public void achizitioneaza(Medicament medicament) {
        System.out.println("Medicamentul " + medicament.getNumeMedicament() + " a fost vandut.");
    }
}
