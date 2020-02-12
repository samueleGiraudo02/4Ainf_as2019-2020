package it.itis.cuneo;

public class ThreadX extends Thread {
    private Dati dati;

    public ThreadX() {}
    public ThreadX(Dati dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
        dati.x = 2 * (dati.b - 2) + 4;
        System.out.println("Thread X" + " - Ho calcolato x");
    }
}
