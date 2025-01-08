package Esercizio4;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero1 = numero.nextInt();
        for (int i = numero1; i >= 0; i--) {
            System.out.println(i);

        }
        numero.close();
    }
}
