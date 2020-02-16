package it.itis.cuneo;

public class Thread3 extends Thread {
    Buffer buffer;

    public Thread3() {
    }

    public Thread3(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        //c2.x= 5 * b

        buffer.setX(5 * buffer.getB());
        System.out.println("c2.x: " + buffer.getX());
    }
}
