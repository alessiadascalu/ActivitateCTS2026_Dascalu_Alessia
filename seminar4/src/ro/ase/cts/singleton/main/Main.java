package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.Logger;

public class Main {
    public static void main(String[] args) {
       Logger instance = Logger.getInstanta("Interfata", "afisare");
       instance.afiseazaLog("Fisierul JSON nu e afisat corect!");
       instance.afiseazaLog("eroare");
       Logger instance2 = Logger.getInstanta("Backend", "baza de date");
       instance2.afiseazaLog("eroare");
       instance2.setCategorie("baza de date");
       instance2.setSender("Backend");
       instance2.afiseazaLog("eroare la inserare");

    }
}