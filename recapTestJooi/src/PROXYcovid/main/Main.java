package PROXYcovid.main;

import PROXYcovid.clase.ISpital;
import PROXYcovid.clase.Spital;
import PROXYcovid.clase.Vizitator;
import PROXYcovid.proxy.ProxyCuVerificare;

public class Main {
    public static void main(String[] args) {

        ISpital iSpital = new Spital("Nebuni");
        Vizitator vizitator = new Vizitator("Bianca", true, true);

        ProxyCuVerificare proxyCuVerificare = new ProxyCuVerificare(iSpital);
        proxyCuVerificare.accesVizitator(vizitator);


        }
}