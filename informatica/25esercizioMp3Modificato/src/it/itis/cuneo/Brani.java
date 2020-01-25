package it.itis.cuneo;

public class Brani {
    private int idBrano;
    private int durata;
    private String brano;
    private String artista;
    private String nomeBrano;

    public Brani() {
        super();
    }

    public Brani(int idBrano, int durata, String brano, String artista, String nomeBrano) {
        this.idBrano = idBrano;
        this.durata = durata;
        this.brano = brano;
        this.artista = artista;
        this.nomeBrano = nomeBrano;
    }

    public int getIdBrano() {
        return idBrano;
    }

    public void setIdBrano(int idBrano) {
        this.idBrano = idBrano;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getBrano() {
        return brano;
    }

    public void setBrano(String brano) {
        this.brano = brano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNomeBrano() {
        return nomeBrano;
    }

    public void setNomeBrano(String nomeBrano) {
        this.nomeBrano = nomeBrano;
    }

    @Override
    public String toString() {
        return "Brani{" +
                "idBrano=" + idBrano +
                ", durata=" + durata +
                ", brano='" + brano + '\'' +
                ", artista='" + artista + '\'' +
                ", nomeBrano='" + nomeBrano + '\'' +
                '}';
    }

    public String toRowCsv(){
        return "Brano" + Libreria.SEPARATOR + idBrano + Libreria.SEPARATOR + durata + Libreria.SEPARATOR + brano
                + Libreria.SEPARATOR + artista + Libreria.SEPARATOR + nomeBrano + "\n";
    }

    public Brani caricaBrani(){
        idBrano = itis.cuneo.preventivo.Tastiera.leggiNumero("inserisci l'id del brnano");
        durata = itis.cuneo.preventivo.Tastiera.leggiNumero("inserisci la durata del brnano");
        brano = itis.cuneo.preventivo.Tastiera.leggiNome("inserisci il nome del brano");
        artista= itis.cuneo.preventivo.Tastiera.leggiNome("inserisci il nome del'artista");
        nomeBrano= itis.cuneo.preventivo.Tastiera.leggiNome("inserisci il nome de brano");
    }

}
