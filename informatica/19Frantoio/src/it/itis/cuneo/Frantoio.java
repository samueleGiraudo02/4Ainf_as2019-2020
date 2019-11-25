package it.itis.cuneo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inf.giraudos1206 on 23/11/2019.
 */
public class Frantoio {

    //List è un interfacia di ArrayList<E>
    //ArrayList<E> implementa List<E>
    private List<Oliva> listaOlive;

    public Frantoio(List<Oliva> listaOlive)
    {
        this.listaOlive= new ArrayList<Oliva>();
    }

}
