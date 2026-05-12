package command2.clase;

public class MasaOcupata implements Command{

    private Masa masa;
    private int nrPersoane;

    public MasaOcupata(Masa masa, int nrPersoane) {
        this.masa = masa;
        this.nrPersoane = nrPersoane;
    }


    @Override
    public void seteazaStareMasa() {
        System.out.println("Masa: " + masa.getNrMasa() + " este ocupata de " + nrPersoane + " persoane");
    }
}
