package ChainOfResponsability2.clase;

public abstract class Handler {

    protected Handler succesor;



    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public abstract void trimiteAlerta(Alerta alerta, String mesaj);

}
