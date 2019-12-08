package it.itis.cuneo;

public class Barca {
    private String nome;
    private String nazionalita;
    private int lunghezza;
    private int stazza;
    private String tipologia;

    public Barca(String nome, String nazionalita, int lunghezza, int stazza, String tipologia) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipologia = tipologia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getStazza() {
        return stazza;
    }

    public void setStazza(int stazza) {
        this.stazza = stazza;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
}
