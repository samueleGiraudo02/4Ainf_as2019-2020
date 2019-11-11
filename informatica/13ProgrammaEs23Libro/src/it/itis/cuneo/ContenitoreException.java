package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 07/11/2019.
 */
public class ContenitoreException extends Exception{
    //attributi
    private int codice;
    private String descrizione;
    //metodi
    public ContenitoreException(int codice, String descrizione)
    {
        this.codice=codice;
        this.descrizione=descrizione;
    }

    public String toString()
    {
        return "ContenitoreException {" + "codice: " + codice + ", descrizione:' " + descrizione + '\'' + "}";
    }


}
