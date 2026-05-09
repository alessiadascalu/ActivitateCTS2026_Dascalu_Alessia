package decorator.decorator;


import decorator.clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{


    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de Anul Nou!");
    }
}