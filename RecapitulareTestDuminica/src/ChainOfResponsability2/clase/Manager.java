package ChainOfResponsability2.clase;

public class Manager extends Handler{


    @Override
    public void trimiteAlerta(Alerta alerta, String mesaj) {

        if(alerta.getGradDeDificultate() > 3 && alerta.getGradDeDificultate() <= 7)
            System.out.println("Alerta rezolata de manager " + alerta.getGradDeDificultate() + mesaj);

        else if(succesor!=null)
            succesor.trimiteAlerta(alerta,mesaj);
    }
}
