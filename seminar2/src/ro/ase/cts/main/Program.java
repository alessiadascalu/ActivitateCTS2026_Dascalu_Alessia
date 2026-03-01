package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.ReaderAplicanti;

public class Program {

    public static void main(String[] args) {
        List<Elev> listaAngajati;
        try {
            ReaderAplicanti readerAplicanti = new AngajatiReader();
            listaAngajati = readerAplicanti.readAplicanti("angajati.txt");
            for(Aplicant aplicant:listaAngajati)
                System.out.println(aplicant.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
