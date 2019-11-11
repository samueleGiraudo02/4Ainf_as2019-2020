package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 07/11/2019.
 */
public class Programma {
    //attributi
    private String denominazione;
    private String produttore;
    private int versione;
    private String sistemaOperativo;
    private int anno;

    //costruttori
    public Programma() {
        super();
    }

    public Programma(String denominazione, String produttore, int versione, String sistemaOperativo, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.anno = anno;
    }

    public Programma(Programma programma) {
        this.denominazione = programma.getDenominazione();
        this.produttore = programma.getProduttore();
        this.versione = programma.getVersione();
        this.sistemaOperativo = programma.getSistemaOperativo();
        this.anno = programma.getAnno();
    }

    //metodi
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setVersione(int versione) {
        this.versione = versione;
    }

    public int getVersione() {
        return versione;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    public String toString() {
        return "{Pc: \"Denominazione\":" + denominazione + ", " + "\"Produttore\":" + produttore + ", " + "\"Versione\":" + versione
                + ", " + "\"Sistema Operativo\":" + sistemaOperativo + ", " + "\"Anno\":" + anno + "}";
    }

    public int compareAnno(Programma pr) {

        if (this.anno > pr.anno) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Programma programma;
        Programma programma1;
        programma = new Programma("Surface", "Hp", 12, "Windows", 2015);
        programma1 = new Programma("Macbook", "Apple", 10, "MacOs", 2019);
        String messaggio;
        int comparazioneAnno;
        messaggio = programma.toString();
        System.out.println(messaggio);
        messaggio = programma1.toString();
        System.out.println(messaggio);
        comparazioneAnno = programma.compareAnno(programma1);
        if (comparazioneAnno == 1) {
            System.out.println("Il primo programma è uscito prima del secondo");
        } else {
            System.out.println("Il secondo programma è uscito prima del primo");
        }
    }
}


