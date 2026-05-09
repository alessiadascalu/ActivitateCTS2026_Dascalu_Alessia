package ro.ase.cts.Observer.clase;

public class PacientAbonat implements  Pacient{

   private String nume;
   private int varsta;

    public PacientAbonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }


    @Override
    public void receptioneazaNotificare(String mesaj) {

    }
}
