package it.itis.cuneo;

/**
 * Created by inf.giraudos1206 on 07/11/2019.
 */
public class PortaCd {
    private final int MAX_CD=3;
    private Cd[]vCd;
    private int nCd;

    public PortaCd()
    {
        vCd = new Cd[MAX_CD];
        nCd=0;
    }

    public void addCd(Cd cd) throws CdException {
        if(nCd>MAX_CD)
        {
            throw new CdException(1,"Troppi cd!");
        }
        vCd[nCd] = cd;
        nCd++;
    }

    public Cd getCd(int i)
    {
        return vCd[i];
    }

    public void setCd(Cd cd)
    {
        vCd[nCd] = cd;
    }

    public void kilCd(int i)
    {
        vCd[i] = null;
    }

    public int getN()
    {
        int cont=0;
        int i;
        for(i=0; i<MAX_CD; i++)
        {
            if(vCd != null)
            {
                cont++;
            }
        }
        return cont;
    }

    public int cercaCdPerTitolo(Cd cd)
    {
        int pos=-1;
        int i;
        for(i=0; i<MAX_CD; i++)
        {
            if(vCd[i].getTitolo().equals(cd.getTitolo()))
            {
                pos = i;
            }
        }
        return pos;
    }

    public String toString()
    {
        return "PortaCd{\"vCd: " + vCd + ", nCd: " + nCd + "}";
    }

    public int confrontaCollezione(PortaCd portaCd2)
    {
        int i,j,cont=0;
        for(i=0;i<MAX_CD;i++)
        {
            for(j=0;j<MAX_CD;j++)
            {
                if(this.vCd[i].equals(portaCd2.getCd(j)))
                {
                    cont++;
                }
            }
        }
        return cont;
    }


}
