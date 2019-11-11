package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.giraudos1206 on 30/10/2019.
 */
public class Bottiglia {
    
    private String etichetta;

    public Bottiglia() {super();}

    public Bottiglia(String etichetta) {
        this.etichetta = etichetta;
    }

    public Bottiglia(Bottiglia bottiglia){
        this.etichetta= bottiglia.getEtichetta(); 
    }

    public String getEtichetta() {
        return etichetta;
    }
    
    public void setEtichetta(String etichetta) {
        this.etichetta = etichetta;
    }
    
    public boolean equals(Bottiglia bottiglia){
        boolean bEquals=false;

        if(etichetta!= null && etichetta.equals(etichetta.getEtichetta()))
        {
            bEquals=true;
        }

        return bEquals;
    }
}
