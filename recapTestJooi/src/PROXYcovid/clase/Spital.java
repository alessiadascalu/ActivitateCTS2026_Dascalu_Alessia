package PROXYcovid.clase;

public class Spital implements  ISpital{

    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }


    @Override
    public void accesVizitator(Vizitator vizitator) {
        System.out.println("Spitalul " + nume  + " Vizitatorul :  "
                + vizitator.getNume() + " poate sa l viziteze pe prietenul lui");
    }
}
