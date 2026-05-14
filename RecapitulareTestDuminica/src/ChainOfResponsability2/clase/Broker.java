package ChainOfResponsability2.clase;

public class Broker extends Handler {


    @Override
    public void trimiteAlerta(Alerta alerta, String mesaj) {
        if(alerta.getGradDeDificultate() <= 3)
            System.out.println("Alerta rezolvata de brokeras " + alerta.getGradDeDificultate() + mesaj );
        else if(succesor!=null)
            succesor.trimiteAlerta(alerta,mesaj);
    }
}
