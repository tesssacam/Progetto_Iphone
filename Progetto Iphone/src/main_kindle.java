import java.util.Scanner;

public class main_kindle {
        public static void main(String[] args) {

            Libreria libreria = new Libreria("");
            Scanner scanner = new Scanner(System.in);

            libreria.aggiungiLibro(new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1954));
            libreria.aggiungiLibro(new Libro("1984", "George Orwell", 1949));
            libreria.aggiungiLibro(new Libro("Harry Potter e la Pietra Filosofale", "J.K. Rowling", 1997));
            libreria.aggiungiLibro(new Libro("Il Nome della Rosa", "Umberto Eco", 1980));

            GestoreLibreria gestore = new GestoreLibreria(libreria);


            while (true) {
                // chiede se l'utente vuoel cominciare a giocare
                System.out.println("vuoi aprire kindle? (si/no)");
                String risposta = scanner.nextLine();
                if (risposta.equalsIgnoreCase("si")) {

                    //gestore.mostraTuttiILibri();

                    gestore.mostraLibro(2);

                    gestore.mostraLibro(10);
                    break;
                }
                System.out.println("okay, sarà per la prossima volta");
                scanner.close();

            }

        }
    }


