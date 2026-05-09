package ro.ase.cts.facade.main;

import ro.ase.cts.facade.SpitalulMunicipalFacade;
import ro.ase.cts.facade.clase.Medic;
import ro.ase.cts.facade.clase.Pacient;
import ro.ase.cts.facade.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Olive", 7);
        Pacient pacient2 = new Pacient("Alessia", 2);
        Pacient pacient3 = new Pacient("Bursucu", 8);
        Pacient pacient4 = new Pacient("Teo", 9);

        Medic medic = new Medic("Justin");
        Salon salon = new Salon();

        if(pacient1.getGravitate() >= 3)
        {
            if(medic.areBilerDeTrimitere(pacient1)){
                int nrPat = salon.suntPaturiLibere();
                if(salon.suntPaturiLibere()!= -1)
                {
                    System.out.println("Pacientul " + pacient1.getNume() + " trebuie sa se interneze in patul " + nrPat);
                    salon.ocupaPat(nrPat);
                }
            }
        }

        SpitalulMunicipalFacade facade = new SpitalulMunicipalFacade(new Medic("Justin"), new Salon());
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient3);
        facade.interneazaPacient(pacient4);


    }
}
