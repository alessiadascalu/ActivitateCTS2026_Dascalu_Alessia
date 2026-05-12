package flyweight.clase;

public class Internare {

    private int nrSaloc;
    private int nrPat;
    private int nrZileSpitalizare;

    public Internare(int nrSaloc, int nrPat, int nrZileSpitalizare) {
        this.nrSaloc = nrSaloc;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("nrSaloc=").append(nrSaloc);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZileSpitalizare=").append(nrZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
