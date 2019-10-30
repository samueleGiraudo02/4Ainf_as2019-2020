package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 07/10/2019.
 */
public class PianoCartesiano {
    //costanti, con final
    public final static int MAX_X= 1000;
    public final static int MAX_Y= 1500;
    //attributi
    //statici: sono attributi di classe
    private static int Ox=0;
    private static int Oy=0;
    private Rettangolo r1,r2;

    public PianoCartesiano(Rettangolo r1, Rettangolo r2){
        this.r1=new Rettangolo(r1);
        this.r2= new Rettangolo(r2);
    }

    public static void setOX(int OX) {
        PianoCartesiano.ox = OX;
    }
    public static void setr

    public boolean equals(){
        boolean equals=false;

        return equals;
    }

    public String toString(){
        String str="";
        str="PianoCartesiano{\"rettangolo\":" + r1 + "" + "\"rettangolo2\":" + r2 + "}";
        return str;
    }

    public static void main(String[] args) {
        //static definisce una variabile globale condivisa tra tutte le istanze della classe
        //alle variabili statiche, tipo ox PianoCartesiano si accede con nome
        //della classe, senza utilizzare il costruttore
        int maxX = PianoCartesiano.MAX_X; //costante solo in lettura(non modificabile)
        //se l'attributo condiviso viene condiviso viene modificato , per tutti gli oggetti
        PianoCartesiano.ox=10;
        PianoCartesiano.setOX(10);

    }

}
