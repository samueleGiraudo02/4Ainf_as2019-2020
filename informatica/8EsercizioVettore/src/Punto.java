

public class Punto {
    //attributi
    private double x;
    private double y;

    //costruttori
    public Punto(){
        super();
    }
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Punto(Punto p){
        this.x=p.getX();
        this.y=p.getY();
    }

    //metodi

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public String toString(){
        return "Punto{\"X\": " + x + ",\"Y\":" + y;
    }
}
