package strategy.clase;

public class Pacient {

    private String numePacient;
    private ModalitatePlata modalitatePlata;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
        this.modalitatePlata = new PlataCard();
    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platesteTranzactie(double suma)
    {
        modalitatePlata.plateste(numePacient,suma);
    }


}
