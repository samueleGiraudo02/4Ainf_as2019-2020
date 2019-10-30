package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 21/10/2019.
 */
public class TrattoAutostradale {
    //proprietà
    private Casello caselloIngresso;
    private Casello caselloUscita;
    private int distanza;
    //costruttori
      //si usa solo dove nelle proprietè c'e' un altra classe
    public TrattoAutostradale(){super();}
    public TrattoAutostradale(Casello caselloIngresso, Casello caselloUscita, int distanza){
        this.caselloIngresso= new Casello(caselloIngresso);
        this.caselloUscita= new Casello(caselloUscita);
        this.distanza= distanza;
    }

    public TrattoAutostradale(TrattoAutostradale tratto){
        this.distanza= new TrattoAutostradale(tratto.getDistanza(tratto));
        this.caselloIngresso= new TrattoAutostradale(tratto.getCaselloIngresso(tratto));
        this.caselloUscita= new TrattoAutostradale(tratto.getCaselloUscita(tratto));
    }
    //metodi

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }

    public int getDistanza() {
        return distanza;
    }

    public void setCaselloIngresso(Casello caselloIngresso) {
        this.caselloIngresso = caselloIngresso;
    }

    public Casello getCaselloIngresso() {
        return caselloIngresso;
    }

    public void setCaselloUscita(Casello caselloUscita) {
        this.caselloUscita = caselloUscita;
    }

    public Casello getCaselloUscita() {
        return caselloUscita;
    }
}
