package it.itis.cuneo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inf.giraudos1206 on 23/11/2019.
 */
public class Frantoio {

    public final int MAX_OLIVE=3;

    //List è un interfacia di ArrayList<E>
    //ArrayList<E> implementa List<E>
    private List<Oliva> listaOlive;

    public Frantoio(List<Oliva> listaOlive)
    {
        this.listaOlive= new ArrayList<Oliva>();
    }

    public void savaOlive()throws java.io.IOException{
        TextFile out = new TextFile("olive.txt",'W');

        try{
            for(int posizione=0; posizione<MAX_OLIVE;posizione++)
            {

                }
            }
        }catch (FileException exception) {

        }
        out.closeFile();
    }

    public void caricaVolumi() throws java.io.IOException{
        TextFile in = new TextFile("olive.txt", 'R');
        int posizione;
        String[] elementi;
        Oliva oliva;

        try{
            while (true){
                linea=in.fromFile();
                elementi=linea.split(";");
                if(elementi.length == 4){
                    posizione=Integer.parseInt(elementi[0]);

                    Oliva = new Oliva();

                }
            }
        }catch (FileException exception){

        }
    }

}
