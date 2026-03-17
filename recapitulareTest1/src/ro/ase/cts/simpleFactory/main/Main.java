package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.clase.Specie;
import ro.ase.cts.simpleFactory.clase.TipAnimal;
import ro.ase.cts.simpleFactory.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory animal = new Factory();
        TipAnimal caine = animal.getTipAnimal(Specie.CAINE, "Rex", 2);
        caine.afisareAnimal();

        TipAnimal pisica = animal.getTipAnimal(Specie.PISICA, "Miki", 10);
        pisica.afisareAnimal();

        TipAnimal peste = animal.getTipAnimal(Specie.PESTE, "Calcaiu", 5);
        peste.afisareAnimal();
    }
}
