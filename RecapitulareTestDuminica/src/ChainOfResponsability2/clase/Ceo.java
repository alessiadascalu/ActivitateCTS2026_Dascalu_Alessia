package ChainOfResponsability2.clase;

public class Ceo extends Handler{
    @Override
    public void trimiteAlerta(Alerta alerta, String mesaj) {

        if(alerta.getGradDeDificultate() > 8)
            System.out.println("Alerta rezolvata de ceo " + alerta.getGradDeDificultate() + mesaj);

        else
            if(succesor!=null)
                succesor.trimiteAlerta(alerta, mesaj);

    }
}
