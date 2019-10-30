package it.itis.cuneo;

import java.lang.Math;

public class Segmento {
    //attributi
    private Punto punto1;
    private Punto punto2;

    //costruttori

    /*
    public Segmento(Punto punto1, Punto punto2) {
        //copia ind punto1
        this.punto1=punto1;
        this.punto2=punto2;
    }
    */

    //costruttore di copia, quando si fa una new si fa
    public Segmento(Punto punto1, Punto punto2) {
        this.punto1 = new Punto(punto1);
        this.punto2 = new Punto(punto2);
    }

    //sta istanziando degli oggetti, gli attributi puntano alla stessa area di memoria dei metodi
    //questo crea un oggetto in piu cosi se vengono cancellati gli attributi funziona
    public Segmento(Punto punto1, Punto punto2) {
        this.punto1 = new Punto(punto1.getX(), punto1.getY());
        this.punto2 = new Punto(punto2.getX(), punto2.getY());
    }


    public Segmento(Segmento segmento) {
        this.punto1 = new Segmento(segmento.getPunto1());
        this.punto2 = new Segmento(segmento.getPunto2());
    }

    public Segmento(Segmento s) {

    }

    //metodi
    public void setPunto1(Punto punto1) {

        this.punto1 = new Punto(punto1);
        // no cosi this.punto1=punto1 perche gli passo un punto dall'esterno e
        // se viene cancellato il parametro viene cancellato anche questo metodo
    }

    public Punto getPunto1() {

        return this.punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = new Punto(punto2);
    }

    public Punto getPunto2() {

        return this.punto2;
    }

    public boolean equals(Segmento segmento){
        boolean equals=false;
        //this.punto1 == segmento.getPunto1() sbagliato percheè confronta gli handler
        if((this.punto1.equals(segmento.getPunto1())) && (this.punto2.equals(segmento.getPunto2()))){
            equals = true;
        }
        return equals;
        }
    }

}