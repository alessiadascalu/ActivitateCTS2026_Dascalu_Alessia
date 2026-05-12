package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruPacienti {

    private Map<String, PacientAbstract> pacienti = new HashMap<>();

    public RegistruPacienti() {
        this.pacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String nume, String adresa, String nrTelefon)
    {
        PacientAbstract pacientAbstract = pacienti.get(nrTelefon);
        if(!pacienti.containsKey(nrTelefon))
        {
            pacientAbstract = new Pacient(nume,adresa,nrTelefon);
            pacienti.put(nrTelefon,pacientAbstract);
        }
        return pacientAbstract;
    }
}
