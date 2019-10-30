public class Angolo {
    //attributi
    int g;
    int p;
    int s;
    //costruttori
    public Angolo(){
    }

    public Angolo(int g, int p, int s){
        this.g=g;
        this.p=p;
        this.s=s;
    }
    //metodi

    public void setG(int g) {
        this.g = g;
    }
    public int getG(){
        return g;
    }

    public void setP(int p) {
        this.p = p;
    }
    public int getP(){
        return p;
    }

    public void setS(int s) {
        this.s = s;
    }
    public int getS(){
        return s;
    }

    public String visualizzaAngolo(){
        return "I valori dell' angolo sono: "+ "gradi: "+ g + ", Primi:"+ p + ", Secondi: "+ s;
    }

    public void aggiungiGradi(int num){
        this.g=getG()+num;
    }

    public void aggiungiPrimi(int num){
        this.p=getP()+num;
    }

    public void aggiungiSecondi(int num){
        this.s=getS()+num;
    }

    public int angoloSecondi()
    {
        int sS;
        sS=(this.g*3600)+((this.p/60)*3600)+ this.s;
        return sS;
    }

    public void secondiAngolo(int num)
    {
        this.s=num;
        this.p=num;
        this.g=num;
    }

    public int differenzaSecondi(Angolo a2)
    {
        int diff;
        diff=(this.p-a2.getP())+(this.g+a2.getG())+(this.s+a2.getS());
        return diff;
    }

    public void sommaAngoli(Angolo a2)
    {
        this.g=a2.getG()+this.g;
        this.p=a2.getP()+this.p;
        this.s=a2.getS()+this.s;
    }

    public static void main(String[] args)
    {
        Angolo a1;
        Angolo a2;
        String frase;
        int aggPrimi=3;
        int aggGradi=4;
        int aggSec=5;
        int soloSec;
        int impostaValore=5;
        int diffAngoli;
        a1=new Angolo(12,13,14);
        a2=new Angolo(12,13,14);
        a1.aggiungiGradi(aggGradi);
        a1.aggiungiPrimi(aggPrimi);
        a1.aggiungiSecondi(aggSec);
        frase=a1.visualizzaAngolo();
        System.out.println(frase);
        soloSec=a1.angoloSecondi();
        System.out.println(soloSec);
        a1.secondiAngolo(impostaValore);
        diffAngoli=a1.differenzaSecondi(a2);
        System.out.println(diffAngoli);
        a1.sommaAngoli(a2);
        System.out.println(a1.visualizzaAngolo());
    }
}
