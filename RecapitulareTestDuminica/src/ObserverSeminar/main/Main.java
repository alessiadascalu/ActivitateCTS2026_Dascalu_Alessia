package ObserverSeminar.main;


import ObserverSeminar.clase.ISpital;
import ObserverSeminar.clase.Pacient;
import ObserverSeminar.clase.PacientAbonat;
import ObserverSeminar.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1=new PacientAbonat("Andreea",22);
        Pacient pacient2=new PacientAbonat("Daniela",22);
        Pacient pacient3=new PacientAbonat("Denis",12);

        ISpital spital=new Spital("Militar");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);


        ((Spital)spital).notificaEpidemie();
        System.out.println("\n-------------\n");
        spital.dezaboneazaPacient(pacient2);
        ((Spital)spital).notificaVirus();


    }
}