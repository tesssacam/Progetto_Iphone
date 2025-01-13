public class Player {
    private String modello;
    private String marca;
    private Playlist playlist;
    private int posizione;


    public Player(String modello, String marca, Playlist playlist) {
        this.modello = modello;
        this.marca = marca;
        this.playlist = playlist;
        this.posizione = 0;
    }


    public void play() {
        Brano branoSelezionato = playlist.getBrano(posizione);
        if (branoSelezionato != null) {
            System.out.println(branoSelezionato.getTitolo() + " è in riproduzione (posizione: " + posizione+")");
        } else {
            System.out.println("brano non disponibile.");
        }
    }


    public void after() {
        if (posizione < playlist.getDimensione() - 1) {
            posizione++;
            System.out.println("verrà riprodotto il prossimo brano...");
            play();
        } else {
            System.out.println("fine della playlist");
        }
    }


    public void before() {
        if (posizione > 0) {
            posizione--;
            System.out.println("verrà riprodotto il brano precendente...");
            play();
        } else {
            System.out.println("Sei già al brano che vuoi");
        }
    }


    public void numberTrack(int n) {
        if (n >= 0 && n < playlist.getDimensione()) {
            posizione = n;
        } else {
            System.out.println("il brano che vuoi non è in questa posizione" + n);
        }
    }

    public void player(){
        System.out.println("modello='" + modello + '\n' +
                ", marca='" + marca + '\n' +
                ", playlist=" + playlist);
    }
}

