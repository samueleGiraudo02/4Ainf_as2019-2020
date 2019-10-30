package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 21/09/2019.
 */
public class Frazione {
    //attributi
    private int num;
    private int den;

    //Metodi
    //costruttore

    public Frazione()
    {
        super();
    }
    public Frazione(int num, int den){
        super();
        this.num = num;
        this.den = den;
    }

    public void setNum(int num){

        this.num = num;
    }

    public void setDen(int den){

        this.den = den;
    }

    public int getNum(){

        return this.num;
    }

    public int getDen(){

        return this.den;
    }

    //restituisce una stringa con lo stato dell'oggetto
    //restituisce una stringa
    //+ concatena pezzi di stringa
    public String toString()
    {
        return "Frazione{numeratore: "+ num
                + " ,denominatore" + den + "}";
    }

    public boolean equals(Frazione frazione)
    {
        boolean sonoUguali=false;

        //this == frazione serve per controllare se due oggetti si trovano nella stessa area di memoria
        //this.numeratore fa riferimento all'attributo, punta ad oggetto interno e frazione e' esterno quindi non possiamo entrare quindi si usano i set e get
        if((this.num == frazione.getNum()) && (this.num == frazione.getNum()))
        {
            sonoUguali=true;
        }

        return sonoUguali;
    }

    //e' come se questo metodo fosse esterno alla classe perche' ha static
    public static void main(String args[]) //psvm esce la stessan cosa, te lo scrive
    {
        Frazione frazioneUnknownState = new Frazione();

        Frazione frazione1=new Frazione(2,5);
        // tostring serve a vedere cosa c'e' dentro
        //invoco toString su frazione1(con .), soggetto+attributo
        System.out.println(frazione1.toString);

        boolean confrontoUguali = frazione1.equals(frazioneUnknownState);
        System.out.printf("Sono uguali? " +  confrontoUguali);//souf te lo scrive









        /*
        float x;
        float y;
        //il valore contenuto nell'oggetto e' cinque
        Frazione numeratore = new Frazione(1);
        Frazione denominatore = new Frazione(4);

        x= numeratore.getNum();
        y= denominatore.getDen();

        float x2;
        float y2;

        Frazione numeratoreDue= new Frazione(3);
        Frazione denominatoreDue= new Frazione(5);

        x2= numeratoreDue.getNum();
        y2= denominatoreDue.getDen();

        float somma= ((x*y2)+(x2*y))/(y*y2);
        System.out.println("La somma vale: ");
        System.out.println(somma);

        float sottrazione= ((x/y)-(x2/y2));
        System.out.println("La sottrazione vale: ");
        System.out.println(sottrazione);

        float moltiplicazione= ((x/y)*(x2/y2));
        System.out.println("La moltiplicazione vale: ");
        System.out.println(moltiplicazione);

        float divisione= ((x/y)/(x2/y2));
        System.out.println("La divisione vale: ");
        System.out.println(divisione);
        */
    }
}