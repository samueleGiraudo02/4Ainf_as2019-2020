/**
 * Created by d.claudio.borgogno on 12/12/2019.
 */
public class Giocatore extends Thread{
    public static final int MIN=2;
    public static final int MAX=6;

    private String name;
    private CampoDaTennis campoDaTennis;

    public Giocatore(String name, CampoDaTennis campoDaTennis){
        this.name=name;
        this.campoDaTennis=campoDaTennis;
    }

    public void run(){
        //senza import Math.*;
        //Math.random():0..1
        //(Math.random()*(MAX-MIN): -> 0..4
        long estrazione = Math.round(
                (Math.random()*(MAX-MIN))+MIN);
        System.err.println(name+ ": " + estrazione);
        if(name.equalsIgnoreCase("giocatore1"))
            campoDaTennis.setPunteggio1(estrazione);
        else
            campoDaTennis.setPunteggio2(estrazione);
    }
}
