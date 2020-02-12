package it.itis.cuneo;

public class ThreadT extends Thread {

    private Dati dati;

    public ThreadT(){
    }
    public ThreadT(Dati dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
        dati.t = 4 * (dati.a - 2) + 5;
        System.out.println("Thread T" + " - Ho calcolato t");
    }
}
