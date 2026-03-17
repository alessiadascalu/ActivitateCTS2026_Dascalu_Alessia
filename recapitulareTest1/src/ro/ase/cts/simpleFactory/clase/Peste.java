package ro.ase.cts.simpleFactory.clase;

public class Peste implements TipAnimal{

    private String nume;
    private int varsta;

    public Peste(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void afisareAnimal(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pe pestisor il cheama").append(this.nume).append(" si are ").append(this.varsta).append(" zile");
        System.out.println(sb.toString());
    }
}
