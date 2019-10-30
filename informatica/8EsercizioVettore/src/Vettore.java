
import java.lang.Math;

public class Vettore {
    //attributi
    private Punto p1;
    private Punto p2;
    //costruttori
    public Vettore(){
        super();
    }
    public Vettore(Punto p1, Punto p2){
        this.p1= new Punto(p1);
        this.p2= new Punto(p2);
    }
    public Vettore(Vettore v){
        this.p1= new Punto(v.getP1());
        this.p2= new Punto(v.getP2());
    }
    //metodi

    public void setP1(Punto p1) {

        this.p1 = new Punto(p1);
    }

    public Punto getP1() {

        return p1;
    }

    public void setP2(Punto p2) {
        this.p2 = new Punto(p2);
    }

    public Punto getP2() {
        return p2;
    }

    public boolean equals(Vettore v){
        boolean uguali = false;
        if(this.p1 == getP1() && this.p2 == getP2()) {
                uguali = true;
            }
             return uguali;
    }

    public String toString(){
        return "Vettore{\"inizio\": " + p1 + ",\"fine{\":" + p2;
    }

    public double lenght(){
        double lunghezza;
        lunghezza=Math.sqrt(((p1.getX()-p2.getX())*(p1.getX()-p2.getX()))+ ((p1.getY()-p2.getY())*(p1.getY()-p2.getY())));
        return lunghezza;
    }


    public static void main(String[] args) {
        Punto p1,p2,p3,p4;
        Vettore v1,v2;
        p1=new Punto(1,4);
        p2=new Punto(4,1);
        p3=new Punto(5,4);
        p4=new Punto(3,4);
        v1=new Vettore(p1,p2);
        v2=new Vettore(p3,p4);
        boolean vettUguali;
        double lunghezza;
        vettUguali=v1.equals(v2);
        if(vettUguali==true){
            System.out.println("I vettori sono uguali");
        }
        else{
            System.out.println("I vettori non sono uguali");
        }

        lunghezza=v1.lenght();
        System.out.println("La lunghezza vale:" + lunghezza);
    }

}
