package Facade.clase;

public class VerificareServetele {

    private boolean meseServetele[] = new boolean[25];

    public VerificareServetele() {
        this.meseServetele[1] = true;
        this.meseServetele[5] = true;
        this.meseServetele[10] = true;
        this.meseServetele[15] = true;
    }

    public int puneServetele(int i) {

        if(meseServetele[i] == true)
            return  i;
        else
        return -1;
    }


}
