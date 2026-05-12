package composite.clase;

import java.util.List;

public class Meniu implements Structura{

    private String denumire;
    private List<Structura> subSectiuni;

    public Meniu(String denumire) {
        this.denumire = denumire;
        this.subSectiuni = subSectiuni;
    }

    @Override
    public void afiseazaDetalii(String text) {
        System.out.println(text + "Denumire " + denumire);
        for(Structura structura: subSectiuni)
        {
            structura.afiseazaDetalii(text + " ");
        }

    }

    public void adaugaStructura(Structura structura)
    {
        subSectiuni.add(structura);
    }

    public void stergeStructura(Structura structura)
    {
        subSectiuni.remove(structura);
    }

    public void getStructura(int pozitie)
    {
        subSectiuni.get(pozitie);
    }
}
