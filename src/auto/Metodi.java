package auto;

public class Metodi {
    private static String[] prezzo=new String[100];
    private static String[] marca=new String[100];
    private static String[] modello=new String[100];

    public static void aggiuntaAuto(String marcaNuova, String modelloNuovo, String prezzoNuovo){
        for (int i = 0; i < marca.length; i++){
            if (marca[i]!=null){
                marca[i]=marcaNuova;
                modello[i]=modelloNuovo;
                prezzo[i]=prezzoNuovo;
                break;
            }
        }
    }
    public static String stampaAuto(){
        String out = "";
        for (int i = 0; i < marca.length; i++){
            if (marca[i]==null){
                break;
            }
            out+= marca[i] + " - " + modello[i] + " - " + prezzo[i] +"\n";
        }
        return out;
    }
}
