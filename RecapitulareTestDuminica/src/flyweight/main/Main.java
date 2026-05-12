package flyweight.main;

import flyweight.clase.Internare;
import flyweight.clase.Pacient;
import flyweight.clase.RegistruPacienti;

public class Main {
    public static void main(String[] args) {
        RegistruPacienti registruPacienti = new RegistruPacienti();
        Pacient pacient = new Pacient("Iona", "Sos Oltenitei", "0755232717");
        Internare internare = new Internare(1, 1, 1);

        pacient.afiseazaInternare(internare);
        registruPacienti.getPacient("Iona", "Sos Oltenitei", "0755232717").afiseazaInternare(internare);




    }
}