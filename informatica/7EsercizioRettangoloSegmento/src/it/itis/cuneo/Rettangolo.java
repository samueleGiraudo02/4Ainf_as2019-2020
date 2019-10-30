package it.itis.cuneo;

public class Rettangolo {

    //attributi
    private Segmento sAlto,sBasso,sDestro,sSinistro;

    //costruttori
    public Rettangolo(){
        super();
    }
    public Rettangolo(Segmento sAlto, Segmento sbasso, Segmento sDestro, Segmento sSinistro) {
        this.sAlto= new Segmento(sAlto);
        this.sBasso= new Segmento(sBasso);
        this.sDestro= new Segmento(sDestro);
        this.sSinistro= new Segmento(sSinistro);
    }
    //chiamiamo costruttore di copia
    public Rettangolo(Rettangolo rettangolo) {
        this.sSinistro = new Segmento(rettangolo.getSSinistro());
        this.sDestro = new Segmento(rettangolo.getSDestro());
        this.sAlto = new Segmento(rettangolo.getSAlto());
        this.sBasso = new Segmento(rettangolo.getSBasso());
    }



    //metodi

    public void setSAlto(Segmento sAlto){
        this.sAlto= sAlto;
    }
    public Segmento getSAlto(){
        return sAlto;
    }
    public void setSBasso(Segmento sBasso){
        this.sBasso= sBasso;
    }
    public Segmento getSBasso(){
        return sBasso;
    }
    public void setSSinistro(Segmento sSinistro){
        this.sSinistro= sSinistro;
    }
    public Segmento getSSinistro(){
        return sSinistro;
    }
    public void setSDestro(Segmento sDestro){
        this.sDestro= sDestro;
    }
    public Segmento getSDestro(){
        return sDestro;
    }


    public String toString(){
        return "Segmenti --> segmentoAlto:" + sAlto + "," + "segmentoDestro: "+ sDestro + "," +
                "segmentoBasso:" + sBasso + "," + "segmentoSinistro:" + sSinistro + ",";
    }

    public boolean equals(Rettangolo rettangolo){
        boolean equals=false;
        if(this.sAlto.equals(rettangolo.getSAlto())) &&

    }

}
