package Facade.clase;

public class VerificareMasaLibera {

    private boolean meseLibere[] = new boolean[25];

    public VerificareMasaLibera() {

        this.meseLibere[1] = true;
        this.meseLibere[5] = true;
        this.meseLibere[10] = true;
        this.meseLibere[15] = true;
    }

    public int suntMeseLibere()
    {

        for (int i = 0; i < meseLibere.length; i++) {
            if (meseLibere[i] == true) {
                return i;
            }
        }
        return -1;
    }

    public void ocupaMasa(int i)
    {
        this.meseLibere[i] = false;
    }





}
