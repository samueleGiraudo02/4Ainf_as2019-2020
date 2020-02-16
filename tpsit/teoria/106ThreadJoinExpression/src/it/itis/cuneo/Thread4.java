package it.itis.cuneo;

public class Thread4 extends Thread{
    Buffer buffer;

    public Thread4() {
    }

    public Thread4(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        //c2.y=c2.x + a
        buffer.setY(buffer.getX() + buffer.getA());
        System.out.println("c2.y: " + buffer.getY());
    }
}
