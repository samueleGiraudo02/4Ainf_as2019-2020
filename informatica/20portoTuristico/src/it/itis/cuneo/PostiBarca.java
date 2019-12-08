package it.itis.cuneo;

public class PostiBarca {
    private static final int MAXPOSTI=100;
    private Barca vBarca[];
    private int cntElementi;

    private String vNazionalita[];
    private int cntElemNazionalita;

    public PostiBarca(Barca[] vBarca, int cntElementi) {
        this.vBarca = vBarca;
        this.cntElementi = cntElementi;
    }

    public PostiBarca()
    {
        vBarca = new Barca[MAXPOSTI];
        cntElementi=0;
    }

    public Barca[] getvBarca() {
        return vBarca;
    }

    public void setvBarca(Barca[] vBarca) {
        this.vBarca = vBarca;
    }

    public int getCntElementi() {
        return cntElementi;
    }

    public void setCntElementi(int cntElementi) {
        this.cntElementi = cntElementi;
    }

    public void assegnazioneBarca(Barca barca, int postiPrimi, int postiSecondi, int postiMeta) throws PostiBarcaException {
        if(cntElementi>MAXPOSTI)
        {
            throw new PostiBarcaException("Troppe barche!", 1);
        }
        else
            {
                if(barca.getTipologia() == "vela")
                {
                    vBarca[postiSecondi] = barca;
                    cntElementi++;
                }
                else if(barca.getLunghezza() <= 10)
                {
                    vBarca[postiPrimi] = barca;
                    cntElementi++;
                }
                else
                {
                    vBarca[postiMeta] = barca;
                    cntElementi++;
                }

            }
    }

    public int liberazionePosto(Barca barca, int posizione){
        int giorniSosta,affitto;

        giorniSosta = InputOutputUtility.leggiNumero("Inserisci i giorni di sorta della barca");

        if(barca.getTipologia() == "vela")
        {
            affitto = (10 * barca.getLunghezza()) * giorniSosta;
        }
        else
        {
            affitto = (20 * barca.getStazza()) * giorniSosta;
        }

        vBarca[posizione] = null;

        return affitto;
    }

    public Barca ricercaBarca(int posizione)
    {
         return vBarca[posizione];
    }

    public void vettoreNazionalita() throws PostiBarcaException {
        String nazionalita;

        nazionalita = InputOutputUtility.leggiNome("Inserisci la nazionalità per il vettore:");
        int i,z=0;

        for(i=0;i<cntElementi;i++)
        {
            if(vBarca[i].getNazionalita().equals(nazionalita))
            {
                if(z>cntElemNazionalita)
                {
                    throw new PostiBarcaException("Troppe barche!", 1);
                }
                else
                {
                    vNazionalita[z] = nazionalita;
                    z++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Barca barca1 = new Barca("ciao", "Italia", 23, 20, "vela");


    }

}
