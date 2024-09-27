package auto;

public class Metodi {
    private static int[] prezzo=new int[100];
    private static String[] marca=new String[100];
    private static String[] modello=new String[100];

    public static void aggiuntaAuto(String marcaNuova, String modelloNuovo, int prezzoNuovo){
        for (int i = 0; i < marca.length; i++){
            if (marca[i]==null){
                marca[i]=marcaNuova;
                modello[i]=modelloNuovo;
                prezzo[i]=prezzoNuovo;
                break;
            }
        }
    }
    public static String stampaAuto(){
        String out = "";
        for (int i = 0; i < marca.length && marca[i]!=null; i++){
            out+= marca[i] + " - " + modello[i] + " - " + prezzo[i] +"\n";
        }
        return out;
    }
    public static String trovaAuto(String findMarca, String findModello){
        String out = "";
        for (int i = 0; i< marca.length && marca[i]!=null; i++){
            if (findMarca.equalsIgnoreCase(marca[i]) && findModello.equalsIgnoreCase(modello[i])){
                out+= marca[i] + " - " + modello[i] + " - " + prezzo[i] +"\n";
            }
        }
        return out;
    }
    public static void cancellaAuto(String deleteMarca, String deleteModello){
        for (int i = 0; i< marca.length && marca[i]!=null; i++){
            if (deleteMarca.equalsIgnoreCase(marca[i]) && deleteModello.equalsIgnoreCase(modello[i])){
                for (int j=i; j<marca.length-1 && marca[i]!=null; j++){
                    marca[j]=marca[j+1];
                    modello[j]=modello[j+1];
                    prezzo[j]=prezzo[j+1];

                }
            }
        }
    }
    public static void editAuto(String findMarca, String findModello, String editMarca, String editModello, int editPrezzo){
        for (int i = 0; i< marca.length && marca[i]!=null; i++){
            if (findMarca.equalsIgnoreCase(marca[i]) && findModello.equalsIgnoreCase(modello[i])){
                marca[i]=editMarca;
                modello[i]=editModello;
                prezzo[i]=editPrezzo;
            }
        }
    }
    public static String stampaSortPrezzo(){
        for (int i = 0; i < marca.length - 1 && marca[i]!=null; i++) {
            int minimo = i;
            for (int j = i + 1; j < marca.length; j++) {
                if (prezzo[j] < prezzo[minimo] && prezzo[j]!=0)
                    minimo = j;
            }
            int temp = prezzo[minimo];
            prezzo[minimo] = prezzo[i];
            prezzo[i] = temp;
            String temp1 = marca[minimo];
            marca[minimo] = marca[i];
            marca[i] = temp1;
            String temp2 = modello[minimo];
            modello[minimo] = modello[i];
            modello[i] = temp2;
        }
        return stampaAuto();
    }
    public static String filterDiesel(){
        String out = "";
        for (int i = 0; i < marca.length && marca[i]!=null; i++){
            if (isDiesel(modello[i])){
                out+= marca[i] + " - " + modello[i] + " - " + prezzo[i] +"\n";
            }
        }
        return out;
    }

    private static boolean isDiesel(String modello){
        boolean diesel = false;
        for (int i = 0; i< modello.length(); i++){
            if (modello.charAt(i)=='d'||modello.charAt(i)=='D'){
                if (modello.charAt(i+1)=='i'||modello.charAt(i+1)=='I'){
                    if (modello.charAt(i+2)=='e'||modello.charAt(i+2)=='E'){
                        if (modello.charAt(i+3)=='s'||modello.charAt(i+3)=='S'){
                            if (modello.charAt(i+4)=='e'||modello.charAt(i+4)=='E'){
                                if (modello.charAt(i+5)=='l'||modello.charAt(i+5)=='L'){
                                    diesel = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            
        }
        return diesel;
    }
}