package it.itis.cuneo;
/*
    Giraudo Samuele 4^Ainf
*/

public class LetturaStringa {
    public static void main(String[] args) {
        ThreadLettura th1 = new ThreadLettura(InputOutputUtility.leggiNome
                ("Inserisci la stringa da capovolgere: "));

        th1.start();
    }

}
