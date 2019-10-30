package it.itis.cuneo;

public class Punto {
    //attributi
    private int x;
    private int y;

    //costruttori

    public Punto(){
        super();
    }

    public Punto(int x, int y){
        this.x=x;
        this.y=y;

    }
    //costruttore di prova, copia di un punto, che è passato per referenza alle coordinate dell'ogg in questione
    public Punto(Punto p){
        this.x = p.getX();
        this.y = p.getY();
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

    public String toString(){
        // \ per non chidere la stringa
        return "Punto{\"x\":" + "\"y\": " + y +"}";
    }

    public boolean equals(Punto punto){
        boolean equals;
        if(this.x == punto.getX() && this.y == punto.getY()){
            equals=true;
        }
        return equals;
    }

    //main
    public static void main(String[] args) {
        //pA e pB referenziano due aree di memoria diverse
        Punto pA=new Punto(4,4);
        //pB è una coopia di pA per il suo stato, ma fisicamente sono in due aree di memoria diverse
        Punto pB=new Punto(pA);
        //pc e pa referenziano come hendler la stessa  area di memoria
        Punto pC=pA;

        Punto puntoD= new Punto();
        Punto puntoE=null;
        //se il richiamo al costruttore(riga sotto) non viene svolto ho un null pointer
        puntoE= new Punto();
    }

}
