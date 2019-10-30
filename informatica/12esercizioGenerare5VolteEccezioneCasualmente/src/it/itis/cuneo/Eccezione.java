package it.itis.cuneo;

import java.util.Random;

public class Eccezione {

    public int nCasuale () {
        Random random = new Random();
        int num = random.nextInt(1);
        return num;
    }

    public void eccezzioneRipetuta() throws exc {

        int num;
        int cont=0;
        num = nCasuale();
        do {
            if(num == 1){
                cont ++;
                throw new exc();
            }
        }while (cont>5);
    }

    public static void main(String[] args) throws exc {
        Eccezione ec= new Eccezione();

        ec.eccezzioneRipetuta();
    }
}
