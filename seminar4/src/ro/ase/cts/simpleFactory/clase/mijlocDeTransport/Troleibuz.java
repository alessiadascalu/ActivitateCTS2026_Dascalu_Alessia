package ro.ase.cts.simpleFactory.clase.mijlocDeTransport;

public class Troleibuz implements MijlocDeTransport{
    private Integer nrLinie;
    private String marca;

    public Troleibuz(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afisareTipTransport()
    {
        StringBuilder sb= new StringBuilder();
        sb.append("Troleibuz de pe linia").append(this.nrLinie)
                .append(" este produs de ").append(this.marca);
        System.out.println(sb.toString());
    }
}
