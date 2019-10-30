package it.itis.cuneo;
import java.lang.Math;

public class Punto {

    //attributi
    private int x;
    private int y;

    //costruttore
    public Punto(){
        super();
    }
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    //metodi
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int numQuadrante(){
        if(this.getX()>0 && this.getY()>0){
            return 1;
        } else if(this.x<0 && this.getY()>0){
            return 2;
        } else if(this.getX()<0 && this.getY()<0){
            return 3;
        } else {
            return 4;
        }
    }

    public double distPunti(Punto p2){
        double dist;
        dist=Math.sqrt(((this.getX()-p2.getX())*(this.getX()-p2.getX()))+ ((this.getY()-p2.getY())*(this.getY()-p2.getY())));
        return dist;
    }

    public boolean equals(Punto p2){
        boolean equals=false;
        if(this.getX() == p2.getX()){
            if(this.getX() == p2.getY()){
                equals=true;
            }
        }
        return equals;
    }

    public String toString(){
        return "Punto{\"X\":" + x + "\"Y\":" + y;
    }

    public static void main(String[] args){
        Punto p1,p2;
        p1= new Punto(1,1);
        p2= new Punto(1,1);
        int nQuadr;
        double dist;
        boolean uguali;
        nQuadr=p1.numQuadrante();
        System.out.println("Il primo quadrante vale:" + nQuadr);
        nQuadr=p2.numQuadrante();
        System.out.println("Il secondo quadrante vale:" + nQuadr);
        dist=p1.distPunti(p2);
        System.out.println("La distanza vale:" + dist);
        if(p1.equals(p2)==true){
            System.out.println("I punti sono uguali");
        }else{
            System.out.println("I punti non sono uguali");
        }
    }
}
