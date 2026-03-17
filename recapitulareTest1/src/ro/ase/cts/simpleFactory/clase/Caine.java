package ro.ase.cts.simpleFactory.clase;

public class Caine implements TipAnimal {
    private String nume;
    private int varsta;

    public Caine(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void afisareAnimal(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cainele pe nume ").append(this.nume).append(" are ").append(this.varsta).append("anisori");
        System.out.println(sb.toString());
    }
}

