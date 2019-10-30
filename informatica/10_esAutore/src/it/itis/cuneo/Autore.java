package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 17/10/2019.
 */
public class Autore {
    //proprietà
    private String cognome;
    private String nome;
    private int annoDiNascita;
    //costruttori

    public Autore(){ super();}
    public Autore(String cognome, String nome, int annoDiNascita){
        this.cognome=cognome;
        this.nome=nome;
        this.annoDiNascita=annoDiNascita;
    }

}
