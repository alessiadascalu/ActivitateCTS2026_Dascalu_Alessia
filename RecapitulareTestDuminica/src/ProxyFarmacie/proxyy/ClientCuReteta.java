package ProxyFarmacie.proxyy;

import ProxyFarmacie.clase.Interfata;
import ProxyFarmacie.clase.Medicament;

public class ClientCuReteta implements Interfata {

    private Interfata interfata;
    private boolean areReteta;

    public ClientCuReteta(Interfata interfata, boolean areReteta) {
        this.interfata = interfata;
        this.areReteta = areReteta;
    }

    @Override
    public void achizitioneaza(Medicament medicament) {

        if(areReteta)
            interfata.achizitioneaza(medicament);
        else
            System.out.println("Nu se poate cumpara " + medicament.getNumeMedicament() + " fara reteta");

    }
}
