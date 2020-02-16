package it.itis.cuneo;

public class Thread2 extends Thread{
    private Buffer buffer;

    public Thread2() {
    }

    public Thread2(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        //c1.y = c1.x + a

        buffer.setY(buffer.getX() + buffer.getA());
        System.out.println("c1.y:" + buffer.getY());
    }
}
