package Strategy.clase;

import java.util.List;

public class Produs {

    private List<String> produse;
    private IProdus iProdus;

    public void setiProdus(IProdus iProdus) {
        this.iProdus = iProdus;
    }

    public void afisare()
    {
        iProdus.selecteazaTehnica(produse);
    }
}
