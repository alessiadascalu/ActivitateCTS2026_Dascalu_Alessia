package Flyweight.Clase;

public class Client implements ClientAbstract{
    private String nume;
    private String numarTelefon;
    private String email;

    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul cu numele "+ nume+" are numarul de telefon:" + numarTelefon+ " mail "+ email  );
        System.out.println(rezervare.toString());
    }

    @Override
    public void plateste(Rezervare rezervare, double taxaPerPersoana) {
        System.out.println("Clientul cu numele "+ nume+ " trebuie sa plateasca "+ rezervare.getNumarPersoana()*taxaPerPersoana + " RON");

    }
}
