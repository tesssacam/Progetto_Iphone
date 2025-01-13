import java.util.*;

public class GiocoReazione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Messaggio iniziale
        System.out.println("benvenuto/a nel REACTION GAME!");
        System.out.println("scopo: testa la tua velocità di reazione");
        System.out.println("quando appare il messaggio devi premere il tasto ENTER il più velocemente possibile");

        while (true) {
            // chiede se l'utente vuoel cominciare a giocare
            System.out.println("vuoi cominciare il gioco?(vai/no)");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("vai")) {
                break;
            }
            System.out.println("okay, sarà per la prossima volta");
            scanner.close();
        }

        // Loop del gioco
        while (true) {
            System.out.println("\npreparati...");
            // Tempo casuale tra 2 e 5 secondi
            int ritardo = random.nextInt(4000) + 2000; // tra 2000ms e 4000ms ovvero 2 e 4 secondi  -> https://stackoverflow.com/questions/10317041/exception-handling-in-case-of-thread-sleep-and-wait-method-in-case-of-threads
            try {
                Thread.sleep(ritardo);  // Attendi un tempo casuale
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Avviso che l'utente deve premere il tasto
            System.out.println("PREMILO ORA!");

            // Registra il tempo di reazione -> https://www.tutorialspoint.com/java/lang/system_currenttimemillis.htm
            long inizio = System.currentTimeMillis();
            scanner.nextLine();  // Aspetta che l'utente prema ENTER

            long tempo_reazione = System.currentTimeMillis() - inizio;

            // Mostra il tempo di reazione
            System.out.println("tempo di reazione: " + tempo_reazione + " millisecondi");

            // Assegna il punteggio in base al tempo di reazione
            int punti = 0;

            if (tempo_reazione <= 0) {
                punti = 0;
                System.out.println("ERRORE!!");
                System.out.println("hai cliccato il pulsante prima di vedere il messaggio, non barare dai");

            } else if (tempo_reazione <= 500) {
                punti = 9;
            } else if (tempo_reazione <= 1000) {
                punti = 9;
            } else if (tempo_reazione <= 1500) {
                punti = 8;
            } else {
                System.out.println("meglio che ci riprovi...");
                continue;  // Riprendi il gioco senza assegnare punteggio
            }

            // Mostra il punteggio
            System.out.println("hai fatto: " + punti + " punti!");

            // Chiedi se l'utente vuole giocare di nuovo
            System.out.println("vuoi giocare di nuovo? (si/no)");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("no")) {
                break;  // Esce dal loop, terminando il gioco
            }
        }

        System.out.println("grazie per aver giocato");
        scanner.close();
    }
}