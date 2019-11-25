package it.itis.cuneo;

public class Test {
    public static void main(String[] args) {

        Abitazioni abitazione1 =new Abitazioni(InputOutputUtility.leggiNumero("Inserisci il numero di stanze:"),
                InputOutputUtility.leggiNumero("inserisci la superficie dell'abitazione"),
                InputOutputUtility.leggiNome("Inserisci l'indirizzo:"),
                InputOutputUtility.leggiNome("Inserisci la città"));

        Ville villa1 = new Ville(InputOutputUtility.leggiNumero("inserisci il numero di piani dell'abitazione"),
                InputOutputUtility.leggiNumero("inserisci la superficie del giardino"),
                InputOutputUtility.leggiNumero("inserisci la superficie dell'abitazione"),
                InputOutputUtility.leggiNome("La piscina è presente? (si,no)"));

        Appartamenti appartamento1= new Appartamenti(InputOutputUtility.leggiNumero("Inserisci il numero di piano dell'apartamento:"),
                InputOutputUtility.leggiNome("C'è l'ascensore? (si,no)"),
                InputOutputUtility.leggiNumero("Inserisci il numero di terrazzi:"));

        Abitazioni abitazione2 =new Abitazioni(InputOutputUtility.leggiNumero("Inserisci il numero di stanze:"),
                InputOutputUtility.leggiNumero("inserisci la superficie dell'abitazione"),
                InputOutputUtility.leggiNome("Inserisci l'indirizzo:"),
                InputOutputUtility.leggiNome("Inserisci la città"));

        Ville villa2 = new Ville(InputOutputUtility.leggiNumero("inserisci il numero di piani dell'abitazione"),
                InputOutputUtility.leggiNumero("inserisci la superficie del giardino"),
                InputOutputUtility.leggiNumero("inserisci la superficie dell'abitazione"),
                InputOutputUtility.leggiNome("La piscina è presente? (si,no)"));

        Appartamenti appartamento2= new Appartamenti(InputOutputUtility.leggiNumero("Inserisci il numero di piano dell'apartamento:"),
                InputOutputUtility.leggiNome("C'è l'ascensore? (si,no)"),
                InputOutputUtility.leggiNumero("Inserisci il numero di terrazzi:"));

        boolean oggettiBoolean;

        abitazione1.toString();
        villa1.toString();
        appartamento1.toString();

        abitazione2.toString();
        villa2.toString();
        appartamento2.toString();

        oggettiBoolean = abitazione1.equals(abitazione2);
        if(oggettiBoolean == true)
        {
            System.out.println("Le due abitazioni sono uguali");
        }
        else
        {
            System.out.println("Le due abitazioni non sono uguali");
        }

        oggettiBoolean = villa1.equals(villa2);
        if(oggettiBoolean == true)
        {
            System.out.println("Le due ville sono uguali");
        }
        else
        {
            System.out.println("Le due ville non sono uguali");
        }

        oggettiBoolean = appartamento1.equals(appartamento2);
        if(oggettiBoolean == true)
        {
            System.out.println("I due appartamenti sono uguali");
        }
        else
        {
            System.out.println("I due appartamenti non sono uguali");
        }


    }
}
