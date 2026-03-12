package ro.ase.cts.simpleFactory.clase.main;

import ro.ase.cts.simpleFactory.clase.Factory.Factory;
import ro.ase.cts.simpleFactory.clase.mijlocDeTransport.Autobuz;
import ro.ase.cts.simpleFactory.clase.mijlocDeTransport.MijlocDeTransport;
import ro.ase.cts.simpleFactory.clase.mijlocDeTransport.TipTransport;

public class Main {
    public static void main(String[] args)
    {
        Factory fabricaDeTransport = new Factory();
        MijlocDeTransport autobuz = fabricaDeTransport.getMijlocTransport(TipTransport.AUTOBUz, "MAN", 102);

        autobuz.afisareTipTransport();
        MijlocDeTransport tramvai = fabricaDeTransport.getMijlocTransport(TipTransport.TRAMVAI, "Imporio", 42);
        tramvai.afisareTipTransport();
    }
}
