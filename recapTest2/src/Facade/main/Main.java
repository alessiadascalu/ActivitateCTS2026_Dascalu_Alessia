package Facade.main;

import Facade.clase.VerificareMasaDebarasata;
import Facade.clase.VerificareMasaLibera;
import Facade.clase.VerificareServetele;
import Facade.facade.RestaurantFacade;

public class Main {
    public static void main(String[] args) {

        VerificareMasaLibera verificareMasaLibera = new VerificareMasaLibera();
        VerificareServetele verificareServetele = new VerificareServetele();
        VerificareMasaDebarasata verificareMasaDebarasata = new VerificareMasaDebarasata();

        RestaurantFacade restaurantFacade = new RestaurantFacade(verificareMasaDebarasata,verificareMasaLibera,verificareServetele);

    }
}