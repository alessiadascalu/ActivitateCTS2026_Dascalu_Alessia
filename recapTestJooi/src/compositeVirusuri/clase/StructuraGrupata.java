package compositeVirusuri.clase;

import java.util.ArrayList;
import java.util.List;

public class StructuraGrupata implements Structura{

    private String nume;
    private List<Structura> subStructuri;

    public StructuraGrupata(String nume) {
        this.nume = nume;
        this.subStructuri = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii(String mesaj) {
        System.out.println("Tara: " + nume);
        for(Structura structura: subStructuri)
            structura.afiseazaDetalii(mesaj);
    }

    public void adaugaStructura(Structura structura)
    {
        subStructuri.add(structura);
    }

    public void stergeStructura(Structura structura)
    {
        subStructuri.remove(structura);
    }

    public void getStructura(int pozitie)
    {
        subStructuri.get(pozitie);
    }
}
