import java.util.ArrayList;

public class Playlist {
    private String titolo;
    private ArrayList<Brano> brani;


    public Playlist(String titolo) {
        this.titolo = titolo;
        this.brani = new ArrayList<>();
    }


    public void aggiungiBrano(Brano brano) {
        brani.add(brano);
    }


    public Brano getBrano(int index) {
        if (index >= 0 && index < brani.size()) {
            return brani.get(index);
        } else {
            return null;
        }
    }


    public int getDimensione() {
        return brani.size();
    }


    @Override
    public String toString() {
        return  "titolo='" + titolo + '\n' +
                ", brano=" + brani;
    }
}


