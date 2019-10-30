package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 21/09/2019.
 */
public class Numero {
    //attributi
    private int valore;

    //Metodi
    //costruttore
    public Numero(int valore){
        this.valore = valore;
    }

    public void setValore(int valore){
        this.valore = valore;
    }

    public int getValore(){
        return this.valore;
    }
    //e' come se questo metodo fosse esterno alla classe perche' ha static
    public static void main(String args[]){

        int x;
        //il valore contenuto nell'oggetto e' cinque
        Numero numero = new Numero(5);

        x= numero.getValore();
        System.out.println(x);

    }
}
