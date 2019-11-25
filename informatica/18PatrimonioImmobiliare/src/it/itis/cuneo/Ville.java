package it.itis.cuneo;

public class Ville extends Abitazioni {
    private int nPiani;
    private double superficieGiardino;
    private boolean piscina;

    public Ville(){

    }

    public Ville(int nPiani, double superficieGiardino, boolean piscina) {
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public Ville(int numeroStanze, int superficie, String indirizzo, String citta, int nPiani, double superficieGiardino, boolean piscina) {
        super(numeroStanze, superficie, indirizzo, citta);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public Ville(Abitazioni abitazioni, int nPiani, double superficieGiardino, boolean piscina) {
        super(abitazioni);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public int getnPiani() {
        return nPiani;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    public double getSuperficieGiardino() {
        return superficieGiardino;
    }

    public void setSuperficieGiardino(int superficieGiardino) {
        this.superficieGiardino = superficieGiardino;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return  "Ville:{" + super.toString() +
                ", nPiani=" + nPiani +
                ", superficieGiardino=" + superficieGiardino +
                ", piscina=" + piscina +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        Boolean ret=true;

        if (!(o instanceof Ville))
            ret = false;
        if (!super.equals(o))
            ret = false;

        Ville ville = (Ville) o;

        if(ret)
        {
            if(nPiani != ville.nPiani)
                ret=false;
            if(Double.compare(ville.superficieGiardino,superficieGiardino) != 0)
                ret=false;
            if(piscina != ville.piscina)
                ret=false;
        }
        return ret;
    }


}
