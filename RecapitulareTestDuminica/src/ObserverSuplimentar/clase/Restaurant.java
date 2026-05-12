package ObserverSuplimentar.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{

    private String nume;
    private List<Client> clienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String text) {
        for(Client client: clienti)
            client.receptioneazaNotificare(text);
    }

    @Override
    public void aboneazaClient(Client client) {
        clienti.add(client);
    }

    @Override
    public void dezaboneazaClient(Client client) {

        clienti.remove(client);
    }

    public void trimitereOfertaPret()
    {
        trimiteMesaj("avem o oferta la pui");
    }

    public void introducereMeniu()
    {
        trimiteMesaj("avem meniu nou");
    }
}
