package it.itis.cuneo;

public class Main extends Thread{
    public int contatoreTh1;
    public int contatoreTh2;
    public int contatoreTh3;
    public int contatore=20;

    public Main() {
        super();
    }

    public int getContatore() {
        return contatore;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.contatoreTh1=0;
        main.contatoreTh2=0;
        main.contatoreTh3=0;

        Semaforo semaforo = new Semaforo();

        do{

            ThreadDecrementatore th1 = new ThreadDecrementatore(semaforo, main,"thread1");
            ThreadDecrementatore th2 = new ThreadDecrementatore(semaforo, main,"thread2");
            ThreadDecrementatore th3 = new ThreadDecrementatore(semaforo, main,"thread3");

            th1.start();
            th2.start();
            th3.start();

            try {
                th1.join();
                th2.join();
                th3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\nNumeri sottratti:\nth1: " + main.contatoreTh1 +
                                "\nth2: " + main.contatoreTh2 + "\nth3: " + main.contatoreTh3+ "\n");
        }while (main.getContatore() > 0);
    }
}

