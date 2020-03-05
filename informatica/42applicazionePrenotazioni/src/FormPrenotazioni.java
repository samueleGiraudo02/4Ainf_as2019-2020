import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormPrenotazioni extends JFrame implements ActionListener{

    private String cognome;
    private String nome;
    private String telefono;
    private String cittaPartenza;
    private String cittaDestinazione;
    private String data;

    JLabel lCognome;
    JLabel lNome;
    JLabel lTelefono;
    JLabel lCittaPartenza;
    JLabel lCittaDestinazione;
    JLabel lData;

    JTextField tCognome;
    JTextField tNome;
    JTextField tTelefono;
    JTextField tCittaPartenza;
    JTextField tCittaDestinazione;
    JTextField tData;

    JButton bAnnulla;
    JButton bConferma;
    JButton bStampa;
    JButton bSalva;

    private Prenotazione[] aPrenotazioni;
    private int indice;
    public final static String PATH_CSV = "/Users/samuelegiraudo/Desktop/42applicazionePrenotazioni/src/prenotazioni.csv";
    public final static String SEPARATOR = ",";

    public FormPrenotazioni(){
        super();
        setSize(400,300);
        setLocation(100, 50);
        setTitle("Prenotazioni");
        initComponets();
        //pack();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        aPrenotazioni = new Prenotazione[10];
        indice = 0;
    }

    public Prenotazione[] getaPrenotazioni() {
        return aPrenotazioni;
    }

    public void setaPrenotazioni(Prenotazione[] aPrenotazioni) {
        this.aPrenotazioni = aPrenotazioni;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    private void initComponets() {
        JPanel pannelloCentrale = new JPanel();
        JPanel pannelloBasso = new JPanel();

        pannelloCentrale.setLayout(new FlowLayout());
        pannelloBasso.setLayout(new FlowLayout());

        Container contentPane = this.getContentPane();

        lCognome = new JLabel("Cognome: ");
        tCognome = new JTextField(20);

        lNome = new JLabel("Nome: ");
        tNome= new JTextField(20);

        lTelefono = new JLabel("Telefono: ");
        tTelefono = new JTextField(20);

        lCittaPartenza= new JLabel("Città di partenza: ");
        tCittaPartenza = new JTextField(20);

        lCittaDestinazione = new JLabel("Città di arrivo: ");
        tCittaDestinazione = new JTextField(20);

        lData = new JLabel("Data: ");
        tData= new JTextField(20);

        pannelloCentrale.add(lCognome);
        pannelloCentrale.add(tCognome);
        pannelloCentrale.add(lNome);
        pannelloCentrale.add(tNome);
        pannelloCentrale.add(lTelefono);
        pannelloCentrale.add(tTelefono);
        pannelloCentrale.add(lCittaPartenza);
        pannelloCentrale.add(tCittaPartenza);
        pannelloCentrale.add(lCittaDestinazione);
        pannelloCentrale.add(tCittaDestinazione);
        pannelloCentrale.add(lData);
        pannelloCentrale.add(tData);

        JButton bConferma = new JButton("Conferma");
        JButton bAnnulla = new JButton("Annulla");
        JButton bStampa = new JButton("Stampa");
        JButton bSalva = new JButton("Salva");

        pannelloBasso.add(bConferma);
        pannelloBasso.add(bAnnulla);
        pannelloBasso.add(bStampa);
        pannelloBasso.add(bSalva);

        contentPane.add(pannelloCentrale,BorderLayout.CENTER);
        contentPane.add(pannelloBasso,BorderLayout.SOUTH);

        //clic del bottone CONFERMA
        bConferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cognome = tCognome.getText();
                nome = tNome.getText();
                telefono = tTelefono.getText();
                cittaPartenza = tCittaPartenza.getText();
                cittaDestinazione = tCittaDestinazione.getText();
                data = tData.getText();
                Prenotazione prenotazione = new Prenotazione(cognome,nome,telefono,cittaPartenza,
                                cittaDestinazione,data);
                aPrenotazioni[indice] = prenotazione;
                indice++;
                JOptionPane.showMessageDialog(null,"La prenotazione è stata effettutata!");
            }
        });

        //clic del bottone ANNULLA
        bAnnulla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tCognome.setText("");
                tNome.setText("");
                tTelefono.setText("");
                tCittaPartenza.setText("");
                tCittaDestinazione.setText("");
                tData.setText("");
                JOptionPane.showMessageDialog(null, "Prenotazione annullata!");
            }
        });

        //clic del bottone STAMPA
        bStampa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Prenotazione prenotazione = new Prenotazione(cognome,nome,telefono,cittaPartenza,
                        cittaDestinazione,data);
                JOptionPane.showMessageDialog(null, prenotazione.toString());
            }
        });

        //clic del bottone SALVA
        bSalva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scriviCsv();
            }
        });

    }
    public void scriviCsv(){
        File file = new File(PATH_CSV);
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV));
            for(int i=0; i<indice;i++){
                bw.write(aPrenotazioni[i].toRowCsv());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("file scritto");

    }

    public void stampaPrenotazioni(){
        for (int i=0; i<indice; i++){
            Prenotazione prenotazione = aPrenotazioni[i];
            System.out.println(prenotazione.toString());
        }
    }

    public static void main(String[] args) {
        FormPrenotazioni fp = new FormPrenotazioni();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
