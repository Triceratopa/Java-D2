package Esercizio3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner stringa = new Scanner(System.in);
        boolean continua = true;
                while (continua){
        System.out.println("Inserisci una parola: " );
        String parola = stringa.nextLine();
                if (parola.equals(":q")){
                    continua = false;
                }else {
                    String risultato="";
                    for (int i = 0; i < parola.length(); i++) {
                        risultato = risultato + parola.charAt(i);
                        if (i != parola.length() - 1) {
                            risultato += (",");
                        }
                        System.out.println(risultato);
                    }


                }

                }
    }
}
