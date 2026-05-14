package ChainOfResponsability2.main;

import ChainOfResponsability2.clase.*;

public class Main {

    public static void main(String[] args) {

        Alerta alerta = new Alerta(2);

        Broker broker = new Broker();
        Manager manager = new Manager();
        Ceo ceo = new Ceo();

        broker.setSuccesor(manager);
        manager.setSuccesor(ceo);

        broker.trimiteAlerta(alerta, "Ajutor");



    }
}
