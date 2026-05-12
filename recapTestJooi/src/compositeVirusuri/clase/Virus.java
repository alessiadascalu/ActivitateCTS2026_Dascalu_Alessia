package compositeVirusuri.clase;

public class Virus implements Structura{

    private String nume;

    public Virus(String nume) {
        this.nume = nume;
    }


    @Override
    public void afiseazaDetalii(String mesaj) {
        System.out.println(mesaj + nume);
    }
}
