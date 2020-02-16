package it.itis.cuneo;

public class Thread1 extends Thread {

    private Buffer buffer;

    public Thread1() {
    }

    public Thread1(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        buffer.setA(calcoloFattoriale());
        System.out.println("Il fattoriale del numero è: " + buffer.getA());
    }

    public int calcoloFattoriale(){
        int fact = 1;
        int numero = 10;

        for (int i = 1; i < numero; i++) {
            fact = i * fact;
        }
        return fact;
    }

}
