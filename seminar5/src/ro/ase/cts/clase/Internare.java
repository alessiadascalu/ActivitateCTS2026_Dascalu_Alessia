package ro.ase.cts.clase;

public class Internare {

    protected boolean patRabatabil;
    protected boolean micDeJun;
    protected boolean papuci;
    protected boolean halat;
    protected String numePacienti;

    public Internare(boolean patRabatabil, boolean micDeJun, boolean papuci, boolean halat, String numePacienti) {
        this.patRabatabil = patRabatabil;
        this.micDeJun = micDeJun;
        this.papuci = papuci;
        this.halat = halat;
        this.numePacienti = numePacienti;
    }

    protected void setpatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDeJun(boolean micDeJun) {
        this.micDeJun = micDeJun;
    }

    protected void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    protected void setHalat(boolean halat) {
        this.halat = halat;
    }

    protected void setNumePacienti(String numePacienti) {
        this.numePacienti = numePacienti;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "patRabatabil=" + patRabatabil +
                ", micDeJun=" + micDeJun +
                ", papuci=" + papuci +
                ", halat=" + halat +
                ", numePacienti='" + numePacienti + '\'' +
                '}';
    }
}
