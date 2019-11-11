package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 30/10/2019.
 */
public class Scatola {

    public static final int MAX_BOTTIGLIE = 5;
    private Bottiglia[] vBottiglie;
    //cntLibro<= MAX_LIBRI
    private int contBottiglia;

    public Scatola(){
        //costruttore di array
        vBottiglie = new Bottiglia[MAX_BOTTIGLIE];
        contBottiglia=0;
    }

    public void addBottiglia(Bottiglia bottiglia) throws ScatolaPienaException {

        if(contBottiglia>MAX_BOTTIGLIE)
            throw new ScatolaPienaException(1, "Troppe bottiglie!");
        vBottiglie[contBottiglia] = bottiglia;
        contBottiglia++;
    }

    public static void main(String[] args) {

        Bottiglia bottiglia1 = new Bottiglia("Barolo");

        Scatola scatola = new Scatola();
        try {
            scatola.addBottiglia(bottiglia1);
            scatola.addBottiglia(bottiglia1);
            scatola.addBottiglia(bottiglia1);
            scatola.addBottiglia(bottiglia1);
        } catch (ScatolaPienaException e) {
            e.printStackTrace();
            System.err.println(e.toString());
        }
        System.err.println(scatola.toString());
    }
}
