package it.itis.cuneo;

public class Persona
{
    //attributi
    int eta;
    String nome;
    String sesso;
    String professione;
    //costruttori
    public Persona()
    {

    }

    public Persona(int eta, String nome, String sesso, String professione)
    {
        this.eta=eta;
        this.nome=nome;
        this.professione=professione;
        this.sesso=sesso;
    }

    //metodi
    public void setEta(int newEta)
    {
        this.eta=newEta;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String newNome)
    {
        this.nome=newNome;
    }

    public String getNome() {
        return nome;
    }

    public void setSesso(String newSesso)
    {
        this.sesso=newSesso;
    }

    public String getSesso() {
        return sesso;
    }

    public void setProfessione(String newProfessione)
    {
        this.professione=newProfessione;
    }

    public String getProfessione() {
        return professione;
    }

    public String chiSei(){
        return "Sono una persona di nome: "+ nome + ", sesso: " + sesso + ", età: " + eta + ", professione: " + professione;
    }

    public static void main(String[] args){
        Persona p1;
        String frase;
        p1=new Persona(17,"Samuele", "maschio", "Studente");
        frase=p1.chiSei();
        System.out.println(frase);
    }
}
