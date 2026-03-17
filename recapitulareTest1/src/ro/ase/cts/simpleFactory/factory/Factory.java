package ro.ase.cts.simpleFactory.factory;

import ro.ase.cts.simpleFactory.clase.*;

public class Factory {
    public TipAnimal getTipAnimal(Specie tip, String nume, int varsta)
    {
        switch (tip) {
            case Specie.PESTE -> {
                return new Peste(nume, varsta);
            }
            case Specie.PISICA -> {
                return new Pisica(nume, varsta);
            }
            case Specie.CAINE -> {
                return new Caine(nume, varsta);
            }

            default -> {return null;}

        }

    }
}
