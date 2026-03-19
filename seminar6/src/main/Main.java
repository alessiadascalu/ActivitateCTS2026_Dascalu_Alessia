package main;

import clase.Ciorba;
import clase.FelDeMancare;
import clase.Supa;
import clase.SupaCrema;
import fabrici.*;

public class Main {
    public static void main(String[] args) {

        FelDeMancareFabrica fabrica = new SupaFabrica();
        FelDeMancare supaCrema = fabrica.getFelDeMancare(TipSupa.SUPA_CREMA, 500,"Supa de Morcovi");
        FelDeMancare ciorba = fabrica.getFelDeMancare(TipSupa.CIORBA, 350, "Radauteana");
        supaCrema.afiseaza();

        FelDeMancareFabrica fabrica2 = new DesertFabrica();
        FelDeMancare papanasi = fabrica2.getFelDeMancare(TipDesert.PAPANASI, 600, "Papanasi cu zmeura", 310);
        FelDeMancare clatite = fabrica2.getFelDeMancare(TipDesert.CLATITE, 290, "Clatite cu banane", 120);
        papanasi.afiseaza();

    }
}