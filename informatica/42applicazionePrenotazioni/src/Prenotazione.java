public class Prenotazione {
    private String cognome;
    private String nome;
    private String telefono;
    private String cittaPartenza;
    private String cittaDestinazione;
    private String data;

    public Prenotazione() {
        super();
    }

    public Prenotazione(String cognome, String nome, String telefono, String cittaPartenza, String cittaDestinazione, String data) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.cittaPartenza = cittaPartenza;
        this.cittaDestinazione = cittaDestinazione;
        this.data = data;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCittaPartenza() {
        return cittaPartenza;
    }

    public void setCittaPartenza(String cittaPartenza) {
        this.cittaPartenza = cittaPartenza;
    }

    public String getCittaDestinazione() {
        return cittaDestinazione;
    }

    public void setCittaDestinazione(String cittaDestinazione) {
        this.cittaDestinazione = cittaDestinazione;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cittaPartenza='" + cittaPartenza + '\'' +
                ", cittaDestinazione='" + cittaDestinazione + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public String toRowCsv() {
        return "prenotazione" + FormPrenotazioni.SEPARATOR
                + cognome + FormPrenotazioni.SEPARATOR + nome + FormPrenotazioni.SEPARATOR +
                telefono + FormPrenotazioni.SEPARATOR + cittaPartenza + FormPrenotazioni.SEPARATOR
                + cittaDestinazione + FormPrenotazioni.SEPARATOR + data + FormPrenotazioni.SEPARATOR + "\n";
    }
}
