package it.itis.cuneo;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private List<Brani> aBrani;

    public Album(){
        super();
        aBrani = new ArrayList<>();
    }

    public Album(List<Brani> aBrani){
        this.aBrani = aBrani;
    }

    @Override
    public String toString() {
        return "Album{" +
                "aBrani=" + aBrani +
                '}';
    }

    public void aggiungiBrano(Brani brani){
        aBrani.add(brani);

    }
}
