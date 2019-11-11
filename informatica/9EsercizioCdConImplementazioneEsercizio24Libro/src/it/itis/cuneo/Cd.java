package it.itis.cuneo;

public class Cd {
    //attributi
    private String titolo;
    private String autore;
    private int numeroBrani;
    private int durata;
    //costruttori
    public Cd(){
        super();
    }
    public Cd(String titolo, String autore, int numeroBrani, int durata){
        this.titolo=titolo;
        this.autore=autore;
        this.numeroBrani=numeroBrani;
        this.durata=durata;
    }
    //metodi


    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public String toString(){
        return "cd{\"Titolo\":" + titolo + "," + "\"Autore\":"+ autore + "," +
                "\"Numero Brani\":" + numeroBrani + "," + "\"Durata\":" + durata + "}";
    }

    public static void main(String[] args) {
        Cd cd1;
        cd1=new Cd("Los Angeles", "The Kolors", 3, 10);
        String str;
        str=cd1.toString();
        System.out.println(str);
    }
}
