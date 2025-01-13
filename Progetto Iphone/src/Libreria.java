import java.util.ArrayList;

public class Libreria {
    private String nome;
    private ArrayList<Libro> libri;

    public Libreria(String nome) {
        this.nome = nome;
        this.libri = new ArrayList<>();
    }

    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public Libro getLibro(int index) {
        if (index >= 0 && index < libri.size()) {
            return libri.get(index);
        } else {
            return null;
        }
    }

    public int getNumeroLibri() {
        return libri.size();
    }
}

