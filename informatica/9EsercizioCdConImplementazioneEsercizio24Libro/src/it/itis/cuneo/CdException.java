package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 07/11/2019.
 */
public class CdException extends Exception{
    private int codice;
    private String descrizione;

    public CdException(int codice, String descrizione)
    {
        this.codice=codice;
        this.descrizione=descrizione;
    }

    public String toString()
    {
        return "portaCd{" + ", codice:" + codice + ", descrizione" + descrizione;
    }
}
