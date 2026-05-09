package Facade.clase;

public class VerificareMasaDebarasata {

    public boolean masaDebarata[] = new boolean[25];

    public VerificareMasaDebarasata() {
        this.masaDebarata[1] =  true;
        this.masaDebarata[5] =  true;
        this.masaDebarata[10] =  true;
        this.masaDebarata[15] =  true;
    }

    public int suntMeseDebarasate(int i)
    {
            if (masaDebarata[i] = true)
                return i;
        else
        return -1;
    }





}
