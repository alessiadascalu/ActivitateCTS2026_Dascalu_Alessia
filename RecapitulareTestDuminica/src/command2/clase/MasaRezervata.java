package command2.clase;

public class MasaRezervata implements Command{

    private Masa masa;
    private int nrPersoane;

    public MasaRezervata(Masa masa, int nrPersoane) {
        this.masa = masa;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void seteazaStareMasa() {
        System.out.println("Masa " + masa.getNrMasa() + " a fost rezervata pentru " + nrPersoane + " persoane");
    }
}
