package ro.ase.cts.facade;

import ro.ase.cts.facade.clase.Medic;
import ro.ase.cts.facade.clase.Pacient;
import ro.ase.cts.facade.clase.Salon;


public class SpitalulMunicipalFacade {

    private Medic medic;
    private Salon salon;

    public SpitalulMunicipalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){

        if(pacient.getGravitate() >= 3)
        {
            if(medic.areBilerDeTrimitere(pacient)){
                int nrPat = salon.suntPaturiLibere();
                if(salon.suntPaturiLibere()!= -1)
                {
                    System.out.println("Pacientul " + pacient.getNume() + " trebuie sa se interneze in patul " + nrPat);
                    salon.ocupaPat(nrPat);
                }
                else
                {
                    System.out.println("nu sunt paturi libere");
                }
            }
            else
            {
                System.out.println("Pacientul" + pacient.getNume() + " are nevoie de bilet de trimitere");
            }
        }
        else
        {
            System.out.println("Pacientul nu este atat de grav bolnav");
        }



    }

}
