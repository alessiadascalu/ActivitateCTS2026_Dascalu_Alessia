package ro.ase.cts.clase;

public class InternareBuilderAlternativ implements InternareBuilderAbstractAlt{

    private boolean patRabatabil;
    private boolean micDeJun;
    private boolean papuci;
    private  boolean halat;

    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDeJun = false;
        this.papuci = false;
        this.halat = false;
    }

    public InternareBuilderAlternativ setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDeJun(boolean micDeJun) {
        this.micDeJun = micDeJun;
        return this;
    }

    public InternareBuilderAlternativ setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public InternareBuilderAlternativ setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

    @Override
    public Internare build(String nume)
    {
        Internare internare = new Internare(this.patRabatabil, this.micDeJun, this.papuci, this.halat, nume);
        return internare;
    }
}
