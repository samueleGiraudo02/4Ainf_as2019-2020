package it.itis.cuneo;

public class Quadrato implements Poligono{
    private int lato;

    public double calcolaArea() {
        return (lato*lato);
    }

}
