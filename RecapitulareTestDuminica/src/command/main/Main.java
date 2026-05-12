package command.main;


import command.clase.Autobuz;
import command.clase.Command;
import command.clase.Operator;
import command.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Autobuz autobuz=new Autobuz("DB87AAA");

        Command comanda1=new Plecare(autobuz,102);

        operator.adaugaComanda(comanda1);
        operator.executaComanda();
        operator.adaugaComanda(new Plecare(autobuz,200));
        operator.executaComanda();
        operator.executaComanda();

    }
}
