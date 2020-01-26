import javax.xml.bind.annotation.XmlAttribute;

public class Brano {
    private int idBrano;
    private String nomeBrano;
    private String nomeArtista;

    public Brano() {
        super();
    }

    public Brano(int idBrano, String nomeBrano, String nomeArtista) {
        this.idBrano = idBrano;
        this.nomeBrano = nomeBrano;
        this.nomeArtista = nomeArtista;
    }

    public int getIdBrano() { return idBrano; }

    @XmlAttribute
    public void setIdBrano(int idBrano) { this.idBrano = idBrano; }
    public String getNomeBrano() { return nomeBrano; }

    @XmlAttribute
    public void setNomeBrano(String nomeBrano) { this.nomeBrano = nomeBrano; }
    public String getNomeArtista() { return nomeArtista; }

    @XmlAttribute
    public void setNomeArtista(String nomeArtista) { this.nomeArtista = nomeArtista; }
}
