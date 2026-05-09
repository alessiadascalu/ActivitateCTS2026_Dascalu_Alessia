package Strategy.main;

import Strategy.Clase.Client;
import Strategy.Clase.PlataCash;

public class main {
    public static void main(String[] args) {
        Client client=new Client("Maria");
        client.platesteTranzactie(40);
        client.setModalitatePlata(new PlataCash());
        client.platesteTranzactie(150);
    }
}
