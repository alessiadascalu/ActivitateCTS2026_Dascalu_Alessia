package decorator.decorator;

import decorator.clase.RezultatMedic;

public class RezultatOnline extends RezultatMedicDecorator{
    public RezultatOnline(RezultatMedic rezultatMedic) {
        super(rezultatMedic);
    }

    @Override
    public void rezultat() {
        super.rezultat();
        System.out.println("Rezultatul online a fost publicat!"  );
    }


}
