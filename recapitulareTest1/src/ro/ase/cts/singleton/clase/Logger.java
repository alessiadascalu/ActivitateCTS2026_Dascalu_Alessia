package ro.ase.cts.singleton.clase;

public class Logger {

    protected int cod;
    protected String sender;
    protected String categorie;
    private static  Logger instantaSingleton = null;

    public Logger( String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;

    }

    public void afisareLogger(String text)
    {
        System.out.println("Log-ul cu codul " + cod + " a fost trimis de "
                + sender + " din categoria " + categorie + " a efectuat " + text );
        this.cod++;
    }

    public static synchronized Logger getInstance(String sender, String categorie)
    {
        if(instantaSingleton == null)
            instantaSingleton = new Logger(sender, categorie);
        return instantaSingleton;
    }
}
