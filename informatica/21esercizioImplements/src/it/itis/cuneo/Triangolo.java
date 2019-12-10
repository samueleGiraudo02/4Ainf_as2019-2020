package it.itis.cuneo;

public class Triangolo implements Poligono{
    int b,h;

    @Override
    public double calcolaArea() {
        return (b*h/2);
    }
}
