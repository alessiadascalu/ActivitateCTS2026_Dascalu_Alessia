package ObserverSuplimentar.main;

import ObserverSuplimentar.clase.ClientAbonat;
import ObserverSuplimentar.clase.Client;
import ObserverSuplimentar.clase.IRestaurant;
import ObserverSuplimentar.clase.Restaurant;

public class Main {

    public static void main(String[] args) {
        Client client = new ClientAbonat("Alessia");
        Client client1 = new ClientAbonat("Bianca");
        Client client2 = new ClientAbonat("Vaca");


        IRestaurant restaurant = new Restaurant("Guava");
        restaurant.aboneazaClient(client);
        restaurant.aboneazaClient(client2);

        ((Restaurant)restaurant).introducereMeniu();
        restaurant.dezaboneazaClient(client2);
        ((Restaurant)restaurant).trimitereOfertaPret();




    }
}
