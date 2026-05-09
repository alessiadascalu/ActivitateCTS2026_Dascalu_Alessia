package Facade.facade;

import Facade.clase.VerificareMasaDebarasata;
import Facade.clase.VerificareMasaLibera;
import Facade.clase.VerificareServetele;

public class RestaurantFacade {

    private VerificareMasaDebarasata verificareMasaDebarasata;
    private VerificareMasaLibera verificareMasaLibera;
    private VerificareServetele verificareServetele;

    public RestaurantFacade(VerificareMasaDebarasata verificareMasaDebarasata, VerificareMasaLibera verificareMasaLibera, VerificareServetele verificareServetele) {
        this.verificareMasaDebarasata = verificareMasaDebarasata;
        this.verificareMasaLibera = verificareMasaLibera;
        this.verificareServetele = verificareServetele;
    }

    public void RezervareMasa()
    {
        if(verificareMasaLibera.suntMeseLibere() != -1) {

            int masaLibera = verificareMasaLibera.suntMeseLibere();
            if (verificareMasaDebarasata.suntMeseDebarasate(masaLibera) != -1) {
                if (verificareServetele.puneServetele(masaLibera) != -1) {
                    System.out.println("Avem masa pregatita la masa nr : " + masaLibera);
                } else System.out.println("Masa inca nu e gata complet");
            } else
                System.out.println("Masa nu a fost debarasata");
        }
        else
            System.out.println("Nu avem nicio masa libera");
    }
}


