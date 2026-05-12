package composite.main;

import composite.clase.Meniu;
import composite.clase.Sectiune;
import composite.clase.Structura;

public class Main {

    public static void main(String[] args) {
        Structura meniuStarter=new Meniu("starter");
        Structura meniuBauturi=new Meniu("bauturi");

        Structura sectiune1=new Sectiune("Bruschete");
        Structura sectiune2=new Sectiune(" Aperitiv");

        Structura sectiune3=new Sectiune("Cafea, Apa, Suc") ;

        ((Meniu)meniuStarter).adaugaStructura(sectiune1);
        ((Meniu)meniuStarter).adaugaStructura(sectiune2);

        ((Meniu)meniuBauturi).adaugaStructura(sectiune3);


        meniuStarter.afiseazaDetalii(" ");

        meniuBauturi.afiseazaDetalii(" ");
    }
}
