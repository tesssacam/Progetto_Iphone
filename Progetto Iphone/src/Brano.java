
public class Brano {
    private String titolo;
    private String autore;

    public Brano(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        autore = autore;
    }

    @Override
    public String toString() {
        return "titolo='" + titolo + '\n' +
                "autore='" + autore + '\n';

    }
}

