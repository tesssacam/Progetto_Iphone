import java.util.*;

public class Whatsapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Una lista per memorizzare i messaggi
        List<Messaggio> chat = new ArrayList<>();

        System.out.println("benvenuto/a su WHATSAPP!");

        while (true) {
            System.out.println("1. invia un messaggio");
            System.out.println("2. visualizza la chat");
            System.out.println("3. esci");
            System.out.print("scegli un'opzione(numero): ");

            int scelta1 = scanner.nextInt();
            scanner.nextLine();

            switch (scelta1) {
                case 1: // Invia un messaggio
                    System.out.println("hai scelto di inviare un messaggio");

                    System.out.print("inserisci il tuo nome: ");
                    String mittente = scanner.nextLine();
                    System.out.print("inserisci il nome della persona a cui vuoi messaggiare: ");
                    String destinatario = scanner.nextLine();
                    System.out.print("scrivi il messaggio: ");
                    String contenuto = scanner.nextLine();

                    // Aggiungi il messaggio alla chat
                    chat.add(new Messaggio(mittente, destinatario, contenuto));
                    System.out.println("messaggio inviato");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");


                    break;

                case 2: // Visualizzare la chat
                    if (chat.isEmpty()) {
                        System.out.println("");
                        System.out.println("la chat è vuota.");
                        System.out.println("");
                        System.out.println("");

                    } else {
                        System.out.println("\nchat: ");

                        for (Messaggio messaggio : chat) {
                            System.out.println(messaggio);
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");


                        }
                    }
                    break;

                case 3: // Esci
                    System.out.println("grazie per aver usato whatsapp");
                    return;

                default:
                    System.out.println("l'opzione non è valida o non esiste, riprova");
            }
        }
    }
}


