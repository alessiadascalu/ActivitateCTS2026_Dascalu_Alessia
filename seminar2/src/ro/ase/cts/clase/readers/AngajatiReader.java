package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends ReaderAplicanti {

    @Override
    public List<Elev> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat a = new Angajat();
            super.citesteAplicant(input,a);

            int salariu = input2.nextInt();
            a.setSalariu(salariu);
            String ocupatie = input2.next();
            a.setOcupatie(ocupatie);
            angajati.add(a);
        }
        input2.close();
        return angajati;
    }
}

