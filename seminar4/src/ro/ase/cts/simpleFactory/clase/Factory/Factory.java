package ro.ase.cts.simpleFactory.clase.Factory;

import ro.ase.cts.simpleFactory.clase.mijlocDeTransport.*;

public class Factory {


    public MijlocDeTransport getMijlocTransport(TipTransport tip, String marca, Integer nrLinie)
    {
        switch(tip)
        {
            case TipTransport.AUTOBUz -> { return new Autobuz(nrLinie, marca);}
            case TipTransport.TRAMVAI -> {return new Tramvai(nrLinie, marca);}
            case TipTransport.TROLEIBUZ -> {return new Troleibuz(nrLinie, marca);}

            default -> {return null;}
        }

    }
}
