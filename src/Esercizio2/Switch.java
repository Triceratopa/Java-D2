package Esercizio2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int numero = scanner.nextInt();

        switch(numero) {
            case 0:
                System.out.println("Zero");
                break;
                case 1:
                    System.out.println("One");
                    break;
                    case 2:
                        System.out.println("Two");
                        break;
                        case 3:
                            System.out.println("Three");
                            break;
            default:
                System.out.println("Numero sbagliato");


        }
    }
}
