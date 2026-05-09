package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends ReaderAplicanti{
    @Override
    public List<Student> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Student> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student s = new Student();

            super.citesteAplicant(input,s);

            int an_studii = input.nextInt();
            s.setAn_studii(an_studii);
            String facultate = (input.next()).toString();
            s.setFacultate(facultate);

            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
