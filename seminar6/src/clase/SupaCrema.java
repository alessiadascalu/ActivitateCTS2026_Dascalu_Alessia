package clase;

public class SupaCrema extends Supa {


    public SupaCrema(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("Supa crema" + denumire + " are " + gramaj);
    }
}
