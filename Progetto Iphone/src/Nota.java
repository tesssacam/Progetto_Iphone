class Nota {
    private String materia;
    private double voto;
    private String descrizione;

    public Nota(String materia, double voto, String descrizione) {
        this.materia = materia;
        this.voto = voto;
        this.descrizione = descrizione;
    }

    public String getMateria() {
        return materia;
    }

    public double getVoto() {
        return voto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public String toString() {
        return "Materia: " + materia + ", Voto: " + voto + ", Descrizione: " + descrizione;
    }
}
