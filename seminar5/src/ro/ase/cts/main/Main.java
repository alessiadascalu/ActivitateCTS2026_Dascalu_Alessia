package ro.ase.cts.main;

import ro.ase.cts.clase.Internare;
import ro.ase.cts.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {

        Internare internare1 = new Internare(true, true, true, false, "Mihai Popescu");
        Internare internare2 = new Internare(false, false, false, false, "Irina Iancu");
        System.out.println(internare1.toString());
        System.out.println(internare2.toString());
        InternareBuilder builder = new InternareBuilder("-");
        builder.setMicDeJun(true);
        Internare internare3=builder.build();
        System.out.println(internare3.toString());
        Internare internare4=builder.setNume("Alessia").setPapuci(true).build();
        System.out.println(internare4.toString());

    }
}