package auto;

import java.util.Scanner;
import auto.Metodi;

public class Main {
    public static void main(String[] args) {
        boolean ripeti = true;
        Scanner in=new Scanner(System.in);
        while(ripeti){
            System.out.println("menu:\n" +
                    "1 - aggiungi un auto\n" +
                    "2 - visualizza tutte le auto\n" +
                    "3 - ricerca di un auto tramite marca e modello\n" +
                    "4 - cancellazione di un auto\n" +
                    "5 - modifica dati di un auto\n" +
                    "6 - visualizza le auto in ordine crescente\n" +
                    "7 - visualizza tutti i modelli diesel\n" +
                    "lascia il campo vuoto per terminare il programma");
            switch(in.nextInt()){
                case 1:
                    System.out.println("inserisci in ordine : marca (INVIO) modello (INVIO) prezzo (INVIO)");
                    Metodi.aggiuntaAuto(in.next(),in.next(),in.next());
                    break;
                case 2:
                    System.out.println(Metodi.stampaAuto());
                    break;
                default:
                    ripeti=false;
            }
        }
    }
}