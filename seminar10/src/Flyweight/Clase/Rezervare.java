package Flyweight.Clase;

public class Rezervare {
    private int numarMasa;
    private String oraRezervare;
    private int numarPersoana;

    public Rezervare(int numarMasa, String oraRezervare, int numarPersoana) {
        this.numarMasa = numarMasa;
        this.oraRezervare = oraRezervare;
        this.numarPersoana = numarPersoana;
    }

    public int getNumarPersoana() {
        return numarPersoana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append(", numarPersoana=").append(numarPersoana);
        sb.append('}');
        return sb.toString();
    }
}
