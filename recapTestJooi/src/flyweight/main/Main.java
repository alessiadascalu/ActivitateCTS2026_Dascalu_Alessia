package flyweight.main;

import flyweight.clase.IMasina;
import flyweight.clase.RegistruMasini;

public class Main {

    public static void main(String[] args) {

        RegistruMasini registruMasini = new RegistruMasini();

        IMasina m1 = registruMasini.getMasina("audi",2000, "200x333");
        m1.creareSticker(" mov");
        IMasina m2 = registruMasini.getMasina("audi",2000, "200x333");
        m2.creareSticker(" mov");


        IMasina r1 = registruMasini.getMasina("audi",2000, "200x353");
        r1.creareSticker(" roz");

        if (m1 == m2) {
            System.out.println("s1 și s2 sunt ACELAȘI obiect în memorie. Optimizare reușită!");
        } else {
            System.out.println("s1 și s2 sunt obiecte diferite. Ceva nu e bine.");
        }

    }
}
