package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruMasini {

    private Map<String,IMasina> masini = new HashMap<>();

    public RegistruMasini() {
        this.masini = new HashMap<>();
    }

    public IMasina getMasina(String model, int anFabricatie, String dimensiune)
    {

        String cheie = model + "_" + anFabricatie;
        IMasina iMasina = masini.get(cheie);

        if(!masini.containsKey(cheie))
        {
            iMasina = new Sticker(model, anFabricatie, dimensiune);
            masini.put(model, iMasina);
        }
        return iMasina;
    }
}
