package PROXYcovid.proxy;

import PROXYcovid.clase.ISpital;
import PROXYcovid.clase.Vizitator;


public class ProxyCuVerificare implements ISpital {

    private ISpital Spital;

    public ProxyCuVerificare(ISpital Spital) {
        this.Spital = Spital;
    }


    @Override
    public void accesVizitator(Vizitator vizitator) {

        if(vizitator.isAreScrisoare()&& vizitator.isAreEchipament())
                Spital.accesVizitator(vizitator);
        else
            System.out.println("e prea naspa inautru");

    }
}
