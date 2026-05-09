package decorator.decorator;

import decorator.clase.RezultatMedic;

public abstract class RezultatMedicDecorator implements RezultatMedic {

    private RezultatMedic rezultatMedic;

    public RezultatMedicDecorator(RezultatMedic rezultatMedic) {
        this.rezultatMedic = rezultatMedic;
    }


    @Override
    public void rezultat() {
        rezultatMedic.rezultat();
    }
}
