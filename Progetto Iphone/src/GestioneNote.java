import java.util.List;
import java.util.Scanner;

public class GestioneNote {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            NotaManager notaManager = new NotaManager("note_scolastiche.txt");

            // Carica le note esistenti dal file
            List<Nota> note = notaManager.caricaNote();

            System.out.println("benvenuto/a nell'app di gestione note scolastiche");

            while (true) {
                System.out.println("\n  menu ");
                System.out.println("1. aggiungi una nota");
                System.out.println("2. visualizza tutte le note");
                System.out.println("3. cerca note per materia");
                System.out.println("4. esci");
                System.out.print("scegli un numero : ");
                int scelta = scanner.nextInt();
                scanner.nextLine(); // Pulisce

                switch (scelta) {
                    case 1:
                        System.out.print("inserisci la materia: ");
                        String materia = scanner.nextLine();
                        System.out.print("inserisci il voto(1-6): ");
                        double voto = scanner.nextDouble();
                        scanner.nextLine(); // Pulisce
                        System.out.print("inserisci una descrizione della verifica: ");
                        String descrizione = scanner.nextLine();

                        Nota nuovaNota = new Nota(materia, voto, descrizione);
                        note.add(nuovaNota);
                        notaManager.salvaNota(nuovaNota);

                        System.out.println("nota aggiunta al registro");
                        break;
                    case 2:
                        System.out.println("\n    tutte le note    ");
                        for (Nota nota : note) {
                            System.out.println(nota);
                        }
                        break;
                    case 3:
                        System.out.print("inserisci la materia da cercare: ");
                        String materiaCercata = scanner.nextLine();
                        System.out.println("\n note di: " + materiaCercata);
                        for (Nota nota : note) {
                            if (nota.getMateria().equalsIgnoreCase(materiaCercata)) {
                                System.out.println(nota);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("uscita in corso...");
                        return;
                    default:
                        System.out.println("errore: scelta non valida");
                }
            }
        }
    }


