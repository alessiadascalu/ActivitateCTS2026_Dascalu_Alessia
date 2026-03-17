package ro.ase.cts.simpleFactory.clase;

public class Pisica implements TipAnimal {

    private String nume;
    private int varsta;

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void afisareAnimal()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Miau-Miau ").append(this.nume).append(" a implinit ").append(this.varsta).append("zile");
        System.out.println(sb.toString());
    }
}
