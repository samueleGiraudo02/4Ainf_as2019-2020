package it.itis.cuneo;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by inf.giraudos1206 on 04/11/2019.
 */
public class Calendario {

    public Calendario(){}

    public static void main(String[] args) {
        //stampa la data attuale
        String stringaData;
        System.out.println(new Date());

        Date dataOggi = new Date();
        System.out.println("oggi2: " + dataOggi);

        //legge del testo leggiNome
        //String stringaData crea una variabile di tipo String
        stringaData = InputOutputUtility.leggiNome("Inserisci la data (dd/mm/aaaa): ");
        //stringaData -> dataTastiera (String -> Date in che formato)
        /*
        Date dataTastiera = InputOutputUtility.convertiDataOraToCalendar(strData,InputOutputUtility.dfDay);
        */
        //dfDay simpleDate format
        Date dataTastiera = null;
        try {
            dataTastiera = InputOutputUtility.dfDay.parse(stringaData);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cData = Calendar.getInstance();
        //getTime(da numero di secondi)
        cData.setTime(cData.getTime());

        // convertiDataOraToCalendar fare una parse e setTime
        Calendar cData2= InputOutputUtility.convertiDataOraToCalendar(stringaData,InputOutputUtility.dfDay);
    }
}
