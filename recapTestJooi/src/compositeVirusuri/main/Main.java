package compositeVirusuri.main;

import compositeVirusuri.clase.Structura;
import compositeVirusuri.clase.StructuraGrupata;
import compositeVirusuri.clase.Virus;

public class Main {

    public static void main(String[] args) {

        Structura virus=new Virus("coronaVirus");
        Structura virus1=new Virus("hentavirus");
        Structura structura=new StructuraGrupata("Romania");
        ((StructuraGrupata)structura).adaugaStructura(virus1);
        ((StructuraGrupata)structura).adaugaStructura(virus);
        structura.afiseazaDetalii(" ");


    }
}
