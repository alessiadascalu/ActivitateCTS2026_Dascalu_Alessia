package ro.ase.cts.clase;

public class InternareBuilder implements  InternareBuilderAbstract{

    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(false, false, false, false, nume);

    }

    public InternareBuilder setPat(boolean arePat){
        internare.patRabatabil = arePat;
        return this;
    }

    public InternareBuilder setMicDeJun(boolean areMicDeJun) {
        internare.micDeJun = areMicDeJun;
        return this;
    }

    public InternareBuilder setPapuci(boolean arePapuci) {
        internare.papuci = arePapuci;
        return this;
    }

    public InternareBuilder setHalat(boolean areHalat) {
        internare.halat = areHalat;
        return this;
    }

    public InternareBuilder setNume(String nume) {
        internare.numePacienti = nume;
        return this;
    }

    @Override
    public Internare build() {
        return null;
    }
}
