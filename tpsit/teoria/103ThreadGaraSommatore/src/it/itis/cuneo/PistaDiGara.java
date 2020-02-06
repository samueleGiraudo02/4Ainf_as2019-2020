package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 30/01/2020.
 */
public class PistaDiGara {
    public static void main(String[] args) {

        Corridore corridore1 = new Corridore("Nicosia");
        Corridore corridore2 = new Corridore("Viada");
        Corridore corridore3 = new Corridore("Arecco");

        //da qui in giù uso il thread definito come l'interfaccia
        System.out.println("---da qui in giù interfaccia---\n");

        Runnable corridore4Runnable = new CorridoreInterfaccia("Pano");
        Thread corridore4 = new Thread(corridore4Runnable);

        Runnable corridore5Runnable = new CorridoreInterfaccia("Peretti");
        Thread corridore5 = new Thread(corridore5Runnable);

        Runnable corridore6Runnable = new CorridoreInterfaccia("Tolosano");
        Thread corridore6 = new Thread(corridore6Runnable);

        corridore1.start();
        corridore2.start();
        corridore3.start();
        corridore4.start();
        corridore5.start();
        corridore6.start();

    }
}
