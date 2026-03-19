package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.Logger;

public class Main {
    public static void main(String[] args) {

        Logger instance = Logger.getInstance("android", "dam");
        instance.afisareLogger("a mers bine");

        Logger instance2 = Logger.getInstance("fb", "dai");
        instance2.afisareLogger("super");
    }
}