package it.itis.cuneo;

public class Abitazioni {
    private int numeroStanze;
    private int superficie;
    private String indirizzo;
    private String citta;

    public Abitazioni(){

    }

    public Abitazioni(int numeroStanze, int superficie, String indirizzo, String citta) {
        this.numeroStanze = numeroStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public Abitazioni(Abitazioni abitazioni)
    {
        this.numeroStanze=abitazioni.getNumeroStanze();
        this.superficie=abitazioni.getSuperficie();
        this.indirizzo=abitazioni.getIndirizzo();
        this.citta=abitazioni.getCitta();
    }

    public int getNumeroStanze() {
        return numeroStanze;
    }

    public void setNumeroStanze(int numeroStanze) {
        this.numeroStanze = numeroStanze;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Abitazioni that = (Abitazioni) o;

        if (numeroStanze != that.numeroStanze) return false;
        if (superficie != that.superficie) return false;
        if (indirizzo != null ? !indirizzo.equals(that.indirizzo) : that.indirizzo != null) return false;
        return citta != null ? citta.equals(that.citta) : that.citta == null;

    }

    @Override
    public String toString() {
        return  "numeroStanze=" + numeroStanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'';
    }
}
