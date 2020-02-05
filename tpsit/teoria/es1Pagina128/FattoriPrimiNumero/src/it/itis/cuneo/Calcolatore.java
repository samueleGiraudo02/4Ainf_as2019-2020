package it.itis.cuneo;


public class Calcolatore extends Thread {
    public static final int MIN = 0;
    public static final int MAX = 2;
    public static final int ARRIVO = 10;
    public static final int DELAY_MIN = 500;
    public static final int DELAY_MAX = 1000;
    private String nome;
    private int numIniziale;
    private int fattoriPrimi;

    public Calcolatore(String nome, int numIniziale, int fattoriPrimi) {
        this.nome = nome;
        this.numIniziale = 4;
        this.fattoriPrimi = fattoriPrimi;
    }

    //interrupted exception lanciata perchè può essere interrotto per il sistema quando non se lo aspettava
    public void run(){
        int r=0;
        int delay=0;

        while (this.fattoriPrimi <= ARRIVO){
            delay = (int) Math.round(Math.random() * (DELAY_MAX - DELAY_MIN) + DELAY_MIN);
            try{
                this.sleep(delay);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            r = (int) Math.round(Math.random() * (MAX - MIN) + MIN);
            fattoriPrimi = numIniziale % 10;
            System.out.println(this.nome + ": " + r + "-" + this.numIniziale + "  con un ritardo di: " + delay + "ms");

        }
        System.out.println(this.nome + " ha terminato");

    }
}