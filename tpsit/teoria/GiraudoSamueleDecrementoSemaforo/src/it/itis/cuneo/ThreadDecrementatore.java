package it.itis.cuneo;

public class ThreadDecrementatore extends Thread {

    private int numEsecuzioneTh;
    private Semaforo semaforo;
    private String nomeTh;
    private Main main;

    public ThreadDecrementatore(Semaforo semaforo, Main main, String nomeTh) {
        this.semaforo = semaforo;
        this.main = main;
        this.nomeTh = nomeTh;
    }

    public void run(){
        semaforo.down();
        decremento();
        semaforo.up();
    }
    
    public void decremento(){

        try{
            this.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(main.contatore == 0){
            return;
        }

        main.setContatore(main.getContatore() - 1);

        if(nomeTh == "thread1"){
            main.contatoreTh1 = main.contatoreTh1 +1;
            numEsecuzioneTh = main.contatoreTh1;
        }
        if(nomeTh == "thread2"){
            main.contatoreTh2 = main.contatoreTh2 +1;
            numEsecuzioneTh = main.contatoreTh2;
        }
        if(nomeTh == "thread3"){
            main.contatoreTh3 = main.contatoreTh3 +1;
            numEsecuzioneTh = main.contatoreTh3;
        }

        System.out.println(nomeTh + ", numero esecuzioni: " + numEsecuzioneTh + ", contatore: " + main.contatore);
    }
}
