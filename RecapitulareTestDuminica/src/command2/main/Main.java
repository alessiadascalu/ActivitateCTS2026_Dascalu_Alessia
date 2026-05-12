package command2.main;

import command2.clase.Command;
import command2.clase.Masa;
import command2.clase.MasaOcupata;
import command2.clase.Operator;

public class Main {

    public static void main(String[] args) {

        Operator operator = new Operator();
        Masa masa = new Masa(5);
        Command command = new MasaOcupata(masa, 2);

        Masa masa1 = new Masa(3);
        Command command1 = new MasaOcupata(masa, 4);
        operator.adaugaComanda(command);
        operator.adaugaComanda(command1);
        operator.ExecutaComanda(command);
        operator.ExecutaComanda(command1);

    }
}
