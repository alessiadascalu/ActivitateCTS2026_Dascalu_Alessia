package Flyweight.main;

import Flyweight.Clase.ClientAbstract;
import Flyweight.Clase.RegistruClienti;
import Flyweight.Clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistruClienti registruClienti=new RegistruClienti();
        ClientAbstract clientAbstract=registruClienti.getClient("Ana", "0720758907", "ana@gmail.com");
        ClientAbstract clientAbstract1=registruClienti.getClient("Ioana", "077898907", "ioana@gmail.com");
        Rezervare rezervare=new Rezervare(1,"20:30",4);
        Rezervare rezervare1=new Rezervare(2,"19:30",2);
        clientAbstract1.printeazaRezervare(rezervare);
        clientAbstract.printeazaRezervare(rezervare1);
        registruClienti.getClient("Andrei", "077898907", "andrei@gmail.com").printeazaRezervare(rezervare1);
        registruClienti.getClient("Andrei", "077898907", "andrei@gmail.com").plateste(rezervare1,40);
        Rezervare rezervare2=new Rezervare(17, "20:00", 4);
        registruClienti.getClient("Andrei", "077898907", "andrei@gmail.com").printeazaRezervare(rezervare2);
        registruClienti.getClient("Andrei", "077898907", "andrei@gmail.com").plateste(rezervare2,40);
    }
}