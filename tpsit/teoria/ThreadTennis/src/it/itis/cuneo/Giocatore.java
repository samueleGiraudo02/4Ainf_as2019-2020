package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 12/12/2019.
 */
public class Giocatore extends Thread {

    public static final int MIN=2;
    public static final int MAX=6;
    private String name;
    private CampoDaTennis campoDaTennis;

    //costruttore per far restituire i valori
    public Giocatore(String nome, CampoDaTennis campoDaTennis){
        this.name =name;
        this.campoDaTennis=campoDaTennis;
    }

    //quello che vogliamo far fare al thread
    public void run() {
        //per generare numero casuale tra max e min
        //da intervallo da 0 a 1 a intervallo tra 2 e 6
        //Math.random() a caso tra 0 e 1
        long estrazione = Math.round(Math.random() * (MAX - MIN) + MIN);
        System.err.println(name + ":" + estrazione);
        if (name.equalsIgnoreCase("giocatore1")) {
            campoDaTennis.setPunteggio1(estrazione);
        } else {
            campoDaTennis.setPunteggio2(estrazione);
        }
    }
}