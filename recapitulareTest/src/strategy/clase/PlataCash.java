package strategy.clase;

public class PlataCash implements ModalitatePlata{
    public PlataCash() {
    }

    @Override
    public void plateste(String numePacient, double suma) {
        System.out.println("clientul " + numePacient + " a platit " + suma + " lei");
    }

}
