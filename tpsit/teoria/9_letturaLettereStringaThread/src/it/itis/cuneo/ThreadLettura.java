package it.itis.cuneo;
/*
    Giraudo Samuele 4^Ainf
*/

public class ThreadLettura extends Thread {
    private String stringa;
    public static final int DELAY_MIN = 1000;
    public static final int DELAY_MAX = 3000;
    private int indice = 0;
    private int delay = 0;
    private int indAlContrario;

    public ThreadLettura(){
        super();
    }

    public ThreadLettura(String stringa) {
        this.stringa = stringa;
    }

    public void run(){

        int lungh = stringa.length() -1;
        int indAlContrario = lungh;

        while (this.indice <= lungh){

            delay= (int) Math.round(Math.random() * (DELAY_MAX - DELAY_MIN) + DELAY_MIN);
            try{
                this.sleep(delay);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

            char ch1 = stringa.charAt(indAlContrario);
            System.out.println(ch1);

            indice++;
            indAlContrario--;

        }
    }
}
