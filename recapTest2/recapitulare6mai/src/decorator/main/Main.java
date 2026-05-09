package decorator.main;

import decorator.clase.NotaDePlata;
import decorator.clase.NotaDePlataAbstract;
import decorator.decorator.NotaDePlata1Mai;
import decorator.decorator.NotaDePlataDecorator;
import decorator.decorator.NotaDePlataNoulAn;

public class Main {
    public static void Main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(25.50, "1/05/2026");
        notaDePlata.printeaza();

        System.out.println("\n----------------------\n");

        NotaDePlataDecorator notaDePlata2 = null;
        int input = 2;

        if (input == 1) {
            notaDePlata2 = new NotaDePlataNoulAn(notaDePlata);
        } else if (input == 2) {
            notaDePlata2 = new NotaDePlata1Mai(notaDePlata);
        }
        notaDePlata2.printeaza();
        notaDePlata2.printeazaFelicitare();
    }
}