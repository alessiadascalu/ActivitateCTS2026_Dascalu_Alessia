package strategy.main;

import strategy.clase.ModalitatePlata;
import strategy.clase.Pacient;
import strategy.clase.PlataCard;

public class Main {

    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ioana");
        ModalitatePlata modalitatePlata = new PlataCard();

        pacient.setModalitatePlata(modalitatePlata);
        pacient.platesteTranzactie(200);


    }
}
