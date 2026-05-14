package CompositeFarmacie.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{

    private List<Structura> subStructuri = new ArrayList<>();
    private String numeSectiune;

    public Departament(String numeSectiune) {
        this.subStructuri = new ArrayList<>();
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void afiseaza(String text) {

        System.out.println(text + "Sectiune: " + numeSectiune);
        for(Structura structura : subStructuri)
            structura.afiseaza(text);
    }

    public void adaugaStructura(Structura structura)
    {
        subStructuri.add(structura);
    }
    public void stergeStructura(Structura structura)
    {
        subStructuri.remove(structura);
    }

    public void getStructura(int id)
    {
        subStructuri.get(id);
    }

}
