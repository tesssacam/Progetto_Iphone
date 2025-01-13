public class main_spotify {
    public static void main(String[] args) {

        //program spotify
        Playlist playlist = new Playlist("theonly");
        playlist.aggiungiBrano(new Brano("paqueta", "marveille"));
        playlist.aggiungiBrano(new Brano("incipit", "frankie hi-ngr mc"));
        playlist.aggiungiBrano(new Brano("teen romance", "lil peep"));
        playlist.aggiungiBrano(new Brano("drugs you should try", "travis scott"));
        playlist.aggiungiBrano(new Brano("copines", "aya nakamura"));
        playlist.aggiungiBrano(new Brano("sono di roma", "noyz narcos"));
        playlist.aggiungiBrano(new Brano("do for love", "2pac"));


        Player player = new Player("Iphone 6", "Apple", playlist);


        //player.player();
        player.numberTrack(4);
        player.play();
        player.after();
        //player.before();
    }
}




