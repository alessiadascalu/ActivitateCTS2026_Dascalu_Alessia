package ProxyFarmacie.main;

import ProxyFarmacie.clase.Farmacie;
import ProxyFarmacie.clase.Interfata;
import ProxyFarmacie.clase.Medicament;
import ProxyFarmacie.proxyy.ClientCuReteta;

public class Main {

    public static void main(String[] args) {

        Medicament m1 = new Medicament("Nurofen", 50);

        Interfata farmaciaCatena = new Farmacie();

        Interfata proxyFaraReteta = new ClientCuReteta(farmaciaCatena,false);
        proxyFaraReteta.achizitioneaza(m1);

        Interfata proxyCuReteta = new ClientCuReteta(farmaciaCatena, true);
        proxyCuReteta.achizitioneaza(m1);

    }
}
