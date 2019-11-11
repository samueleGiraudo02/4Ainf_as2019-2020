package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 30/10/2019.
 */
public class Libreria {

    public static final int MAX_LIBRI = 10;
    private Libro[] vLibri;
    //cntLibro<= MAX_LIBRI
    private int contLibro;

   public Libreria(){
       //costruttore di array
       vLibri = new Libro[MAX_LIBRI];
       contLibro=0;
   }

    public void addLibro(Libro libro) throws LibreriaPienaException{

        //possibile perche nella libreria PienaException ha l?extend
        if(contLibro>MAX_LIBRI)
            //se viene rilanciata l'eccezione il codice dopo non lo esegue
            throw new LibreriaPienaException(1, "Troppi libri!");
        vLibri[contLibro] = libro;
        contLibro++;
    }

    public static void main(String[] args) {
        //dfDay e' il pattern
        //Libro libro2 = new Libro("Pinocchio", )
        Libro libro1 = new Libro("Alice", "Lewis Carroll", "123456780", InputOutputUtility.convertiDataOraToCalendar("12/10/2019", InputOutputUtility.dfDay ));

        //Libro libro2 = new Libro("Pinocchio", )
        Libreria libreria = new Libreria();
        try {
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
        } catch (LibreriaPienaException e) {
            e.printStackTrace();
            //System.out.println(e.toString());
            System.err.println(e.toString());
        }

        //System.out.println(libreria.toString());
        System.err.println(libreria.toString());


    }


}
