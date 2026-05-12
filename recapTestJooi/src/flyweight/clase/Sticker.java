package flyweight.clase;

public class Sticker implements IMasina{

    private String model;
    private int anFabricatie;
    private String dimensiune;


    public Sticker(String model, int anFabricatie, String dimensiune) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.dimensiune = dimensiune;
    }


    @Override
    public void creareSticker(String culoareCostum) {
        System.out.println("Sticker " + culoareCostum + "are aplicat pe " + model + " ( "
                + anFabricatie + " ) cu dimensiunile " + dimensiune);    }
}

