package it.itis.cuneo;

public class ThreadY extends Thread{
    private Dati dati;

    public ThreadY() {}
    public ThreadY(Dati dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
        dati.y = dati.x * dati.t;
        System.out.println("Thread Y" + " - Ho calcolato il risultato");
    }
}
