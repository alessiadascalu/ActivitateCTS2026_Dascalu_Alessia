package strategy.clase;

public class PlataCard implements ModalitatePlata {

    public PlataCard() {
    }

    @Override
    public void plateste(String numePacient, double suma) {
        System.out.println("clientul " + numePacient + " a platit " + suma + " lei");
    }
}
