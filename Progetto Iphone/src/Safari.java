import java.util.*;

public class Safari {
    public static void main(String[] args) {
        // elenco dei siti
        Map<String, List<String>> siti = new HashMap<>();// https://stackoverflow.com/questions/54962297/method-put-in-java-map-of-type-string-liststring

        // aggiunta di siti e articoli
        siti.put("RSI", Arrays.asList( //CERCARE!!!!!!
                "La Svizzera Brilla ai Campionati Europei Indoor",
                "Rapina in Banca a Lugano, Presi i Colpevoli",
                "Un’App Svizzera Rivoluziona i Trasporti Pubblici"
        ));

        siti.put("National Geographic", Arrays.asList(
                "I Segreti di Ötzi, l’Uomo del Ghiaccioa",
                "La Riscoperta della Biodiversità nelle Foreste Svizzere",
                "Il Villaggio che Salvò un Branco di Elefanti"
        ));

        siti.put("CrimeReads", Arrays.asList(
                "Il Caso Irrisolto del Serial Killer di Long Island: Nuove Prove, Vecchi Misteri",
                "Donne Criminali: Le Storie Più Affascinanti di Lady Killer nella Storia",
                "Quando il Crimine si Misura in Byte: L’Evoluzione degli Hacker Criminali"
        ));

        siti.put("TechCrunch", Arrays.asList(
                "Droni al Servizio dell’Agricoltura: La Nuova Frontiera del Cibo Sostenibile",
                "AI e Giustizia: Come l’Intelligenza Artificiale Sta Cambiando le Indagini Criminali",
                "La Corsa al Metaverso: Startup Che Cambiano il Futuro del Lavoro e del Gioco"
        ));


        // Scanner per input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Mostra i siti disponibili
        System.out.println("benventuto/a in safari! ");
        System.out.println("ecco i siti disponibili per oggi:");
        for (String sito : siti.keySet()) {
            System.out.println("- " + sito);
        }

        System.out.println("\nscrivi qua sotto il nome del sito per vedere gli articoli (oppure 'esci' per terminare):");

        while (true) {
            System.out.print("\n-> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("esci")) {
                System.out.println("grazie di aver navigato su internet, ciao!");
                break;
            }

            // controlla se il sito esiste
            if (siti.containsKey(input)) {
                System.out.println("articoli di " + input + ":");
                List<String> articoli = siti.get(input);

                // Mostra gli articoli numerati
                for (int i = 0; i < articoli.size(); i++) {
                    System.out.println((i + 1) + ". " + articoli.get(i));
                }

                System.out.println("\nscegli un articolo digitando il numero (oppure indietro per tornare alla pagina di prima):");

                while (true) {
                    System.out.print("\n> ");
                    String scelta = scanner.nextLine();

                    if (scelta.equalsIgnoreCase("indietro")) {
                        System.out.print("vuoi scegliere un'altro sito? digitalo");
                        break;

                    }

                    try {
                        int numerosito = Integer.parseInt(scelta);

                        // Verifica che il numero sia valido
                        if (numerosito >= 1 && numerosito <= articoli.size()) {
                            String articoloscelto = articoli.get(numerosito - 1);
                            // Mostra il contenuto simulato dell'articolo
                            System.out.println("\nhai scelto l'articolo: " + articoloscelto);
                            System.out.println("Buona lettura!!");
                            break;  // Esce dal ciclo per scegliere un articolo

                        } else {
                            System.out.println("numero non valido, riprova");
                        }
                    } catch(NumberFormatException e){
                        System.out.println("per favore inserisci un numero valido");
                    }
                }
            } else{
                System.out.println("sito non trovato! riprova");
            }
        }

        scanner.close();
    }
}
