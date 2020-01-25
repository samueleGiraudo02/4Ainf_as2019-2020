package it.itis.cuneo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Album> aAlbum;
    public static final String FILE_NAME = "C:\\Users\\inf.giraudos1206\\Desktop\\workspaceEstivo\\Preventivo\\preventivo.csv";
    public static final String SEPARATOR = ",";

    public Libreria(){
        aAlbum = new ArrayList<>();
    }

    public Libreria(List<Album> aAlbum){
        this.aAlbum = aAlbum;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "aAlbum=" + aAlbum +
                '}';
    }

    public void aggiungiAbum(Album album){
        aAlbum.add(album);
    }

    public void rimuoviAbum(String album){
        int numAbum= aAlbum.size();

        for (int i=0;i<numAbum;i++){
            /*

             */
        }
    }

    public void simula() {
        Brani a= new Brani(1, 3, "ciao", "io", "ciao");
        Album b= new Album();
        b.aggiungiBrano(a);
    }

    public void stampa() {
        System.out.println( this.toString() );
    }

    public void salvaCSV() {
        String str ="";
        BufferedWriter bw;
        try {
            //
            bw= new BufferedWriter(new FileWriter(FILE_NAME));

            for(int cntCliente=0; cntCliente<this.aAlbum.size(); cntCliente++)
            {

                bw.write(aAlbum.toRowCSV());

                for(int cntArticolo=0; cntArticolo<aAlbum.getaAlbum().size(); cntArticolo++) {

                    /*

                     */
                }
            }

            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void apriCSV() {
        BufferedReader br;
        String rowLine;
        Album album = null;

        try {
            br = new BufferedReader(new FileReader(FILE_NAME));

            while((rowLine = br.readLine()) != null) {
                String[] campi = rowLine.split(Libreria.SEPARATOR);
                if(campi[0].equalsIgnoreCase("Brani")) {
                    brani = new Brani(campi[1], campi[2], campi[3], campi[4], campi[5]);
                    this.aggiungiAbum(album);
                }

            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static void main(String[]args) {

        Libreria p= new Libreria();
        p.simula();
        p.stampa();

    }


}





}
