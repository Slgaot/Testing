package javaTesting.Resources;

public class AppParameters {

    //afegir-hi objectes connexio de base de Dades

    public static final String DOMAIN = "127.0.0.1";

    public static final String PORT = "80";

    public static String deployedURL() {
            return "https://" + DOMAIN + ":" + PORT;
    }
}
