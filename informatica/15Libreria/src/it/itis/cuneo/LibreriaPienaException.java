package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 30/10/2019.
 */

//classe usata per le eccezioni dei libri e per quelli che non stanno nel vettore
public class LibreriaPienaException extends Exception{

    private  int codice;
    private String descrizione;

    public LibreriaPienaException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "LibreriaPienaException{" + "codice=" + codice + ", descrizione='" + descrizione + '\'' + '}';
    }
}
