package it.itis.cuneo;

public class Dindondan {


    public static void main(String[] args) {

        for(int i=0; i<3; i++)
        {
            Runnable cam1 = new Campana("din", 1);
            Thread thr1 = new Thread(cam1);
            thr1.start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Runnable cam2 = new Campana("don", 1);
            Thread thr2 = new Thread(cam2);
            thr2.start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Runnable cam3 = new Campana("dan", 1);
            Thread thr3 = new Thread(cam3);
            thr3.start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
