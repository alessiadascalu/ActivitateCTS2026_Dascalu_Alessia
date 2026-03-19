package fabrici;

import clase.Ciorba;
import clase.FelDeMancare;
import clase.SupaCrema;

public class SupaFabrica implements  FelDeMancareFabrica{

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        return null;
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {

        switch (tip){
            case TipSupa.SUPA_CREMA:
                return new SupaCrema(gramaj, denumire);

            case TipSupa.CIORBA:
                return new Ciorba(gramaj, denumire);

            default:
                return null;
        }
    }
}
