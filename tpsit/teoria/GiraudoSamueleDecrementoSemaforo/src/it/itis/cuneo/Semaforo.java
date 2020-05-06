package it.itis.cuneo;

public class Semaforo {
    private int val;

    public Semaforo() {
        val = 1;
    }

    public synchronized void up(){
        val = val + 1;
        notify();
    }

    public synchronized void down(){
        while(val == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        val = val -1;
    }
}
