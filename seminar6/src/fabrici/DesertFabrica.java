package fabrici;

import clase.*;

public class DesertFabrica implements FelDeMancareFabrica {

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch (tip)
        {
            case TipDesert.CLATITE:
                return new Clatite(gramaj, denumire, calorii);

            case TipDesert.PAPANASI:
                return new Papanasi(gramaj, denumire, calorii);

            default:
                return null;
        }
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip, gramaj, denumire, 500);
    }

}
