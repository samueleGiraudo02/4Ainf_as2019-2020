package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 17/10/2019.
 */
public class Libro {
    //proprietà
    private String titolo;
    private Autore autore;
    private CasaEditrice casaEditrice;
    private int giorno;
    private int mese;
    private int anno;
    //costruttori

    public Libro(){super();}
    public Libro(String titolo, Autore autore, CasaEditrice casaEditrice, int giorno, int mese, int anno){
        this.titolo=titolo;
        this.autore =  new Autore(autore);
        this.casaEditrice = new CasaEditrice(casaEditrice);
        this.giorno= giorno;
        this.mese=mese;
        this.anno=anno;
    }
    public Libro(Libro l){
        this.titolo= l.getTitolo();
        this.autore = l.getAutore();
        this.casaEditrice= new CasaEditrice(l.casaEditrice);
        this.giorno= l.getGiorno();
        this.mese= l.getMese();
        this.anno= l.getAnno();
    }
}
