package command2.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command command) { comenzi.add(command);}
    public void ExecutaComanda(Command command) {
        if(comenzi.size() > 0)
        {
            comenzi.get(0).seteazaStareMasa();
            comenzi.remove(0);
        }
    }
}
