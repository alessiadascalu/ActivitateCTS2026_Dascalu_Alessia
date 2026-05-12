package Strategy.clase;

import java.util.List;

public class TehnicaRecenzii implements IProdus{


    @Override
    public void selecteazaTehnica(List<String> produse) {
        System.out.println("Sunt afisate doar produsele care au recenzii");
    }
}
