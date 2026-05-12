package Strategy.clase;

import java.util.List;

public class PretOrdineCrescatoare implements IProdus {


    @Override
    public void selecteazaTehnica(List<String> produse) {
        System.out.println("Produsele sunt afisate in ordine crescatoare");

    }
}