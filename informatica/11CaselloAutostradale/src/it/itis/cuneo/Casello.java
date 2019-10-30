package it.itis.cuneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by inf.giraudos1206 on 21/10/2019.
 */
public class Casello {
    //attributi
    //calndar ha ore,minuti e secondi
    private Calendar dataEntrata;
    private Calendar dataUscita;
    private String identifier;
    //costruttori
    public Casello(){super();}
    public Casello(String identifier, Calendar dataEntrata, Calendar dataUscta){
        this.identifier=identifier;
        this.dataEntrata=dataEntrata;
        this.dataUscita=dataUscta;
    }
    public Casello(Casello casello){
        //invochiamo un costruttore per la stringa se no abbiamo due oggetti che puntano alla stessa cosa
        //abbiamo due oggetti
        this.identifier= new String(casello.getIdentifier());

        //Calendar.getInstance(); method factory (costruttore) costruttore metodo aziendale, metodo che produce
        //un'istanza, l'istanza creata ha come valore predefinito 1/01/1970
        //
        Calendar cDataIngresso = Calendar.getInstance();
        //serve a mettere una data
        cDataIngresso.setTime(casello.getDataEntrata().getTime());
        this.dataEntrata = cDataIngresso;

        Calendar cDataUscita = Calendar.getInstance();
        cDataIngresso.setTime(casello.getDataUscita().getTime());
        this.dataUscita = cDataUscita;
    }

    //metodi

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setDataEntrata(Calendar dataEntrata) {
        this.dataEntrata = dataEntrata;
    }

    public Calendar getDataEntrata() {
        return dataEntrata;
    }

    public void setDataUscta(Calendar dataUscta) {
        this.dataUscita = dataUscta;
    }

    public Calendar getDataUscita() {
        return dataUscita;
    }

    public static void main(String[] args) {
        //per fare la data: passsare data
        //fare una conversione da stringa a data
        //simple date form prende la stringa  es. (23/10/19 09:25:52) e la trasforma, usa un pattern che rappresenta il formato della data
        // pattern è una stringa
        //simple date form
        //tradurre le stringhe
        //bisogna dire all'utente di come mettere la stringa, messo su una stringa
        //pattern      dd/MM/yyyy HH24:mi:ss, i separatori sono gli /
        //costante final perchè non è modificabile
        //
        final String FORMATO_DD_HMS= "dd/MM/yyyy HH24:mi:ss";
        String strDataPartenza="29/08/2002 13:30:40";
        Calendar cDataIngresso = Calendar.getInstance();
        //
        SimpleDateFormat sdfHH = new SimpleDateFormat(FORMATO_DD_HMS);
        //parsificazione, prender una stringa e con il formato che gli ho creato cerca di tirare fuori una data
        //permette di ottenere una variabile di un altro tipo
        //eccezzione è un'anomalia software che si verifica quando il codice genera un errore in tempo di esecuzione, parse non rispetta il formato
        //erroe di compilazione errore grammaticale
        //errore di esecuzione errore logico es se una stringa che gli passo è diversa dal pattern
        //catch gestisce
        //surround contiene
        //restituisce una data
        Date dataPartenza=null;
        //try catch serve per controlare se la stringa della data è scritta in modo errato, cerca di trovare l'errore
        try {
            //lancia l'errore
            sdfHH.parse(strDataPartenza);
        }
        //catch prende l'errore
        catch (ParseException e) {
            //errore nel formato della stringa
            //stack var locali e parametri
            //viene stampato uno stack trace che è una traccia dello stack, elenco delle chiamate ai metodi
            e.printStackTrace();
        }

        //set time sono il numero di secondi
        //calendar mantiene il numero di secondi dal 01/01/1970
        cDataIngresso.setTime(dataPartenza);
        //stampa data in un formato illeggibile
        System.out.println("cDataIngresso: "+ cDataIngresso);
        //stampa data in formato umano, facilmente capibile
        //format ha bisogno di date non di calendar
        String strData= sdfHH.format(cDataIngresso);
        System.out.println("\n\nsdfHH.format(cDataIngresso): "+ sdfHH.format(cDataIngresso));


       // Casello casello1= new Casello("A1",);
    }
}
