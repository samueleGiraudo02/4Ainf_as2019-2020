package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.giraudos1206 on 30/10/2019.
 */
public class Libro {
    private String titolo;
    private String autore;
    private String isbn;
    private Calendar dataPubblicazione;

    public Libro(String alice, String lewis_carroll, String autore, Calendar calendar) {
    }

    public Libro(Calendar dataPubblicazione, String isbn, String autore, String titolo) {
        this.dataPubblicazione = dataPubblicazione;
        this.isbn = isbn;
        this.autore = autore;
        this.titolo = titolo;
    }

    public  Libro(Libro libro){
        this.dataPubblicazione= libro.getDataPubblicazione();
        this.autore= libro.getAutore();
        this.titolo= libro.getTitolo();
        this.isbn= libro.getIsbn();
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public Calendar getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDataPubblicazione(Calendar dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public boolean equals(Libro libro){
        boolean bEquals=false;

        if(titolo!= null && titolo.equals(libro.getTitolo())
                && autore!= null && autore.equals(libro.getAutore())
                && isbn!=null && isbn.equals(libro.getIsbn())
                && dataPubblicazione!=null && dataPubblicazione.equals(libro.getDataPubblicazione()))
        {
            bEquals=true;
        }

        return bEquals;

        //stringa ottunuta da altri dati, come il codice fiscale dell'oggetto
        //simile a equals, non posso avere due omonimie nel programma

    }
}
