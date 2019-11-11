package it.itis.cuneo;

import java.util.Arrays;

/**
 * Created by inf.giraudos1206 on 07/11/2019.
 */
public class Contenitore
{
    private final int MAX_PROGRAMMI =3;
    private Programma[]vProgrammi;
    private int nProgrammi;

    public Contenitore()
    {
        vProgrammi= new Programma[MAX_PROGRAMMI];
        nProgrammi=0;
    }

    public void addProgramma(Programma programma) throws ContenitoreException{

        if(nProgrammi>MAX_PROGRAMMI){
            throw new ContenitoreException(1,"Troppi programmi!");

        }

        vProgrammi[nProgrammi]=programma;
        nProgrammi++;

    }

    public String toString()
    {
        return "Contenitore \"{vContenitore\": " + vProgrammi + "nProgramma: " + nProgrammi + "}";
    }

    public Programma getProgramma(int posizione)
    {
        return vProgrammi[posizione];
    }

    public void setProgramma(Programma programma)
    {
        vProgrammi[nProgrammi]= programma;
    }

    //elimina un programma
    public void killProgramma(int posizione)
    {
        vProgrammi[posizione] = null;
    }
    //restituisce il numero di programmi presente nel vettore
    public int getN()
    {
        int n=0,i;

        for(i=0;i<nProgrammi;i++)
        {
            if (vProgrammi[i] != null) {
                n++;
            }
        }
        return n;
    }

    public int cercaProgrammaPerDenominazione(Programma programma)
    {
        int i;
        int var = -1;
        for(i=0;i<nProgrammi;i++)
        {
            if(vProgrammi[i].getDenominazione().equals(programma.getDenominazione()))
            {
                var = i;
            }
        }

        return var;
    }


    public int confrontaContenitore(Contenitore contenitore)
    {
        int var=0,i,j;

        for(j=0;j<MAX_PROGRAMMI;j++)
        {
            for(i=0;i<MAX_PROGRAMMI;i++)
            {
                if(this.vProgrammi[i].equals(contenitore.getProgramma(j)))
                {
                    var++;
                }
            }
        }

        return var;
    }

    public static void main(String[] args) throws ContenitoreException {
        Programma programma1 = new Programma("liveCode", "Puppo", 3, "OsX", 2019);

        Contenitore contenitore = new Contenitore();

        try {
            contenitore.addProgramma(programma1);
        } catch (ContenitoreException e) {
            e.printStackTrace();
            System.err.println(e.toString());
        }

        System.err.println(contenitore.toString());

    }
}
























