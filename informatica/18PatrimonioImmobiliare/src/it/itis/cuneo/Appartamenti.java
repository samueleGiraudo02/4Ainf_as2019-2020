package it.itis.cuneo;

import java.util.Objects;

public class Appartamenti extends Abitazioni {

    private int piano;
    private boolean ascensore;
    private int nTerrazzi;

    public Appartamenti(){

    }

    public Appartamenti(int piano, Boolean ascensore, int nTerrazzi) {
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public Appartamenti(int numeroStanze, int superficie, String indirizzo, String citta, int piano, Boolean ascensore, int nTerrazzi) {
        super(numeroStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public Appartamenti(Abitazioni abitazioni, int piano, Boolean ascensore, int nTerrazzi) {
        super(abitazioni);
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public Boolean getAscensore() {
        return ascensore;
    }

    public void setAscensore(Boolean ascensore) {
        this.ascensore = ascensore;
    }

    public int getnTerrazzi() {
        return nTerrazzi;
    }

    public void setnTerrazzi(int nTerrazzi) {
        this.nTerrazzi = nTerrazzi;
    }

    @Override
    public String toString() {
        return  "Appartamenti{"+ super.toString() +
                "piano=" + piano +
                ", ascensore=" + ascensore +
                ", nTerrazzi=" + nTerrazzi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Appartamenti that = (Appartamenti) o;

        if (piano != that.piano) return false;
        if (ascensore != that.ascensore) return false;
        return nTerrazzi == that.nTerrazzi;

    }

    @Override
    public int hashCode() {
        int result = piano;
        result = 31 * result + (ascensore ? 1 : 0);
        result = 31 * result + nTerrazzi;
        return result;
    }
}
