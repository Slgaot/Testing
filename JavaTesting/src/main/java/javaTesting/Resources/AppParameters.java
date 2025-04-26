package javaTesting.Resources;

public class AppParameters {

    //afegir-hi objectes connexio de base de Dades

    public static final String DOMAIN = "127.0.0.1";

    public static final String PORT = "80";

    //public static final Object BD_CON= new ClasseConnexioBBDD;

    //public static Object MESSAGES_TRANSLATION ;

    //Implementar SINGLETON PATTERN
    private static AppParameters instance = new AppParameters();

    private AppParameters(){

    }

    private void initApp(){
        // codi necesari per la inicialitzacio de l'app
    }

    public void resetApp(){
        //codi per reconfigurar l'app
    }

    public static AppParameters getInstance(){
        /*if(instance == null){
            instance = new AppParameters();
        }*/
        return instance;
    }
    public static String deployedURL() {
            return "https://" + DOMAIN + ":" + PORT;
    }
}
