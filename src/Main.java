//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String stringaPariDispari = "gatto";
        if (stringaPariDispari.length() % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int annoBisestile = 1997;
        System.out.println(verificaAnnoBisestile(annoBisestile));


        }
        public static boolean verificaAnnoBisestile(int annoBisestile) {
        if (annoBisestile % 4 == 0) {
            return true;
        }  if (annoBisestile % 100 == 0 ) {
            annoBisestile %= 400;
            return true;
        } else {
            return false;
            }
        }
    }
