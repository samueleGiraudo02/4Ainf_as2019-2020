package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 17/10/2019.
 */
public class CasaEditrice {
    //proprietà
    private String ragioneSociale;
    private String luogo;
    private int annoDiFondazione;
    //costruttori
    public CasaEditrice(){super();}
    public CasaEditrice(String ragioneSociale, String luogo, int annoDiFondazione){
        this.ragioneSociale=ragioneSociale;
        this.luogo=luogo;
        this.annoDiFondazione=annoDiFondazione;
    }

}
