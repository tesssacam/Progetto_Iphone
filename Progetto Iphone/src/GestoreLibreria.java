public class GestoreLibreria {
    private Libreria libreria;

    public GestoreLibreria(Libreria libreria) {
        this.libreria = libreria;
    }

    public void mostraLibro(int index) {
        Libro libro = libreria.getLibro(index);
        if (libro != null) {
            System.out.println("Il libro che vuoi leggere è:");
            System.out.println(libro.toString());
        } else {
            System.out.println("Libro non trovato!");
        }
    }

    public void mostraTuttiILibri() {
        System.out.println(libreria.toString());
    }
}


