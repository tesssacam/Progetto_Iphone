import java.util.Scanner;

public class Tabella {
    private static Scanner scanner;

    public static void main(String[] args) {
        // Dati della tabella
        String[][] tabella = {
                {" spotify", " safari"},
                {" whatsapp", " kindle"},
                {" reaction", " scuola"}
        };

        System.out.println("Benvenuto/a nel tuo telefono");

        try {
            Thread.sleep(2000); //2000 millisecondi = 2 secondi
        } catch (InterruptedException e) {
            // In caso di errore (improbabile), mostra un messaggio
            System.out.println("Errore durante l'attesa");
        }

        System.out.println("in accensione...");


        // Mettere il delay di 1.5 secondi
        try {
            Thread.sleep(1500); // 1500 millisecondi = 1.5 secondi
        } catch (InterruptedException e) {
            // In caso di errore (improbabile), mostra un messaggio
            System.out.println("Errore durante l'attesa");
        }

        // Stampa la tabella
        for (String[] strings : tabella) {
            System.out.println("+-----------+-----------+");
            System.out.printf("| %-9s | %-9s |%n", strings[0], strings[1]);
        }

        // Riga finale con un cerchio al centro
        System.out.println("+-----------------------+");
        System.out.printf("|           0           |%n");
        System.out.println("+-----------------------+");

        while (true) {
            System.out.println("digita il numero dell'app che vuoi usare");
            System.out.println("opzioni:");
            System.out.println("1. spotify");
            System.out.println("2. safari");
            System.out.println("3. whatsapp");
            System.out.println("4. kindle");
            System.out.println("5. reaction");
            System.out.println("6. scuola");
            System.out.println("");
            System.out.println("app numero:  ");


            int scelta1 = scanner.nextInt();
            scanner.nextLine();


            switch (scelta1) {
                case 1: // safari
                    System.out.println("hai scelto di aprire spotify");


                    break;

                case 2: // safari
                    System.out.println("hai scelto di aprire safari");

                    break;

                case 3: //whatsapp
                    System.out.println("hai scelto di aprire whatsapp");

                    break;

                case 4: // spotify
                    System.out.println("hai scelto di aprire kindle");


                    break;

                case 5: // safari
                    System.out.println("hai scelto di aprire reaction");

                    break;

                case 6: //whatsapp
                    System.out.println("hai scelto di aprire scuola");

                    break;
            }
        }
    }
}
