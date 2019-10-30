package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 30/09/2019.
 */
public class eseguiConversione {

    //conversioni tra tra wrapper, partendo da un primitivo
    public static void main(String[] args)
    {
        //tipo wrapper
        Float f;
        f=new Float(0.52d);
        //System.out.println(String s) la firma del metodo richiede una stringa come parametro
        //quindi il float viene convertito in una stringa al momento della chiamata
        //System.out.println( float fPrimitivo)
        //nella firma sopra passiamo Float wrapper ma il metodo si aspetta un metodo primitivo
        System.out.println(f);

        //tipo primitivo perchè non ci sono metodi, non c'è neanche la classe
        int n;
        String quanteMele = "8";
        n= Integer.parseInt("6");
        System.out.println(n);

        Float ogF;
        ogF=new Float(n);
        String s2;
        s2=""+ ogF;
        //servono i doppi apici perchè chiudo la stringa e la riapro perchè se no il \ lo chiuderebbe
        System.out.println("s2 = \"\" + ogF: " + s2);
        s2= new String("" + ogF);
        System.out.println("s2 = new String(\"\" + ogF)" + s2);
        s2= ogF.toString();
        System.out.println("s2 = ogF.toString(): " + s2);

        //da double a intero wrapper
        double dN = 6.5d; // la d serve per definire il tipo della costante
        int intN = (int) dN; // intN=6
        Integer iN = new Integer(intN);
        iN= intN;  // wrapper= primitivoDelloStessoTipo

   }
}
