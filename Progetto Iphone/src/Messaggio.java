
class Messaggio {

    private String mittente;
    private String destinatario;
    private String contenuto;

    public Messaggio(String mittente, String destinatario, String contenuto) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.contenuto = contenuto;
    }

    @Override
    public String toString() {
        return mittente + " a " + destinatario + ": " + contenuto;
    }
}

