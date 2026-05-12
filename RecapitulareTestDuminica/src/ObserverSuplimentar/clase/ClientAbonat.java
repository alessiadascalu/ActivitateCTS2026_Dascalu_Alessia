package ObserverSuplimentar.clase;

public class ClientAbonat implements Client {


    private String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Clientul " + nume + "a primit mesajul " + mesaj);

    }
}
