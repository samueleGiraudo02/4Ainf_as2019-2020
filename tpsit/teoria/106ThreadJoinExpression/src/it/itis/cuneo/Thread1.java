package it.itis.cuneo;

public class Thread1 extends Thread {
    private Buffer buffer;

    public Thread1() {
    }

    public Thread1(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        //c1.x = 4 * b

        buffer.setX(4 * buffer.getB());
        System.out.println("c1.x:" + buffer.getX());
    }
}
