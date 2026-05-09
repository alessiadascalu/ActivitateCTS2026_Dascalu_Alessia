package ro.ase.cts.facade.clase;

public class Medic {

    private String nume;

    public boolean areBilerDeTrimitere(Pacient pacient){
        if(pacient.getGravitate()>= 6)
            return true;
        else
            return false;
    }

    public Medic(String nume) {
        this.nume = nume;
    }
}
