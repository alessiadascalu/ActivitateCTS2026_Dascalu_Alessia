package ro.ase.cts.facade.clase;

public class Salon {

    private boolean paturiLibere[] = new boolean[50];


    public Salon() {
        this.paturiLibere[1] = true;
        this.paturiLibere[3] = true;
        this.paturiLibere[6] = true;
        this.paturiLibere[10] = true;
        this.paturiLibere[15] = true;
        this.paturiLibere[25] = true;
    }

    public int suntPaturiLibere(){

        for(int i=0;i<=paturiLibere.length;i++){
            if(paturiLibere[i]==true) {
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiLibere[i] = false;
    }

//    public static void getInstance(){
//        if(instanta ==null)
//        {
//            instanta = new Salon();
//        }
//        return instanta;
//    }
}
