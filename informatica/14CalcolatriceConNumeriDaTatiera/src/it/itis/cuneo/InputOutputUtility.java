package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputOutputUtility {

    //System.in prende dati da tastiera
    //input attaccat input ad output
    private static InputStreamReader r = new InputStreamReader(System.in);
    //buffered è memoria in mem centrale che contiene dati letti da input reader, (legge dati da tastiera)
    private static BufferedReader br = new BufferedReader(r);


    //funzione che legge dal buffer
    //legge una sequenza di caratteri(sc), viene letta dando all'utente un messaggio
    //(String outStr) per dire all'utente che tipo di dato deve scrivere
    public static String input(String outStr){
        String a=null;

        System.out.print(outStr);
        //try catch per eccezioni
        try {
            //buffer puo' essere di 10 righe ma ne prendiamo solo una per logica fifo
            //sto leggendo una sequenza di caratteri
            a=br.readLine();
            //(IOException e) eccezione input output(es la tastiera è rotta)
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return a;
    }

    public static void main(String[] args) {
        double a,b,c;
        a=Double.parseDouble(input("Inserisci il primo numero: "));
        b=Double.parseDouble(input("Inserisci il secondo numero: "));

        try{
            c=a/b;
        }
        catch(ArithmeticException ex){
            System.out.println("Non puoi inserire 0");
            b= Double.parseDouble(input("Inserire il secondo numero. Il valore deve essere diverso da 0"));
        }
        finally {
            System.out.println("Valori adatti");
        }

        System.out.println("La somma vale:" + (a+b));
        System.out.println("La differenza vale:" + (a-b));
        System.out.println("La moltiplicazione vale:" + (a*b));
        System.out.println("La divisione vale:" + (a/b));
    }


}