package it.itis.cuneo;

import java.io.IOException;

public class Playlist {
    public static final int MAX_BRANI = 300;
    private Brano[]vBrani;
    private Brano[]vBraniParziale;
    private Brano[]vBraniSottoprogramma;
    private int contBraniParziale;
    private int contBrani;

    public Playlist(){
        //costruttore di array
        vBrani = new Brano[MAX_BRANI];
        vBraniParziale = new Brano[MAX_BRANI];
        vBraniSottoprogramma = new Brano[MAX_BRANI];
        contBrani=0;
        contBraniParziale=0;
    }

    public Playlist(Brano[] vBrani, int contBrani, int contBraniParziale) {
        this.vBrani = vBrani;
        this.contBrani = contBrani;
        this.contBraniParziale = contBraniParziale;
    }

    public Playlist(Brano brano1, Brano brano2, Brano brano3, Brano brano4) {
    }

    //get e set
    public Brano[] getvBrani() {
        return vBrani;
    }

    public void setvBrani(Brano[] vBrani) {
        this.vBrani = vBrani;
    }

    public int getContBrani() {
        return contBrani;
    }

    public void setContBrani(int contBrani) {
        this.contBrani = contBrani;
    }

    public void addBrano(Brano brano) throws PlaylistPienaException {
        if(contBrani>MAX_BRANI){
            throw new PlaylistPienaException(1,"Troppi brani!");

        }
        vBrani[contBrani] = brano;
        contBrani++;
    }

    public void rimuoviBrano(Brano brano,String titolo){
        int i;
        for(i=0; i<contBrani;i++){
            if(vBrani[i].titolo.equals(titolo)) {
                vBrani[i].titolo == null;
            }
        }
    }

    public int durataTotBrani(){
        int durata=0;
        int i;
        for (i=0;i<contBrani;i++){
            durata = durata + vBrani[i].durata;
        }
        return durata;
    }

    public void vettoreParziale(int nBrani){
        int i;
        for(i=0;i<nBrani;i++){
            vBraniParziale[i]=vBrani[i];
        }
    }

    public Brano esportazionePrimiBrani(int t){
        int i;
        for(i=0;i<contBrani;i++){
            if(vBrani[i].durata<=t){
                return vBrani[i];
            }
        }
        return null;
    }

    public void spostamentoBranoIndietro(int posizione){
        int pos=posizione;
        int i;
        for(i=0;i<contBrani;i++){
            vBraniSottoprogramma[i] = vBrani[i];
        }

        for(i=posizione-1;i<contBrani;i++){
            vBrani[pos] = vBraniSottoprogramma[i];
            pos--;
        }
    }

    public void spostamentoBranoAvanti(int posizione){
        int pos=posizione;
        int i;
        for(i=0;i<contBrani;i++){
            vBraniSottoprogramma[i] = vBrani[i];
        }

        for(i=posizione-1;i<contBrani;i++){
            vBrani[pos] = vBraniSottoprogramma[i];
            pos--;
        }
    }

    public void salvaLeggiBraniFile()throws java.io.IOException{
        TextFile out = new TextFile("volumi.txt",'W');

        try{
            for(int posizione=0; posizione<MAX_BRANI;posizione++)
            {
                if(vBrani[posizione] != null){
                    String line = Integer.toString(posizione);
                    line += ";" + vBrani[posizione].getTitolo();
                    line += ";" + vBrani[posizione].getDurata();
                }
            }
        }catch (FileException exception) {

        }
        out.closeFile();
    }

    public void riordinoBraniShuffle(){
        int i;
        for(i=0;i<contBrani;i++){
            double casuale = (int)(Math.random()*10);
            vBrani[i]=vBraniSottoprogramma[(int) casuale];
        }
    }

    public static void main(String[] args) throws PlaylistPienaException, IOException {
        Brano brano1 = new Brano("ciao",345);
        Brano brano2 = new Brano("eros",654);
        Brano brano3 = new Brano("si",789);
        Brano brano4 = new Brano("do",567);
        Playlist playlist = new Playlist(brano1,brano2,brano3,brano4);
        playlist.addBrano(brano1);
        playlist.rimuoviBrano(brano2,"eros");
        int durataTotaleBrani=playlist.durataTotBrani();
        playlist.esportazionePrimiBrani(4);
        playlist.spostamentoBranoAvanti(3);
        playlist.spostamentoBranoIndietro(2);
        playlist.salvaLeggiBraniFile();
        playlist.riordinoBraniShuffle();


    }
}
