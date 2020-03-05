/**
 * Created by inf.giraudos1206 on 20/02/2020.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Random;
import javax.swing.*;


public class Finestra extends  JFrame implements ActionListener {

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton bNuovaPartita;
    private int[][] tav = new int [3][3];
    private String mossaPrecedente = "";
    private int riga;
    private int colonna;
    public final static String PATH_NAME = "/Users/samuelegiraudo/Desktop/40PartitaTrisConComputer/src/tris.csv";
    public final static String SEPARATOR = ",";

    public Finestra()
    {
        setSize(600,600);
        setLocation(200, 200);
        setTitle("Tris");
        initComponets();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets() {

        azzeraTav(tav);
        JPanel pannelloMatrice = new JPanel();
        JPanel pannelloBasso = new JPanel();
        Container contentPane = this.getContentPane();
        pannelloMatrice.setLayout(new GridLayout(3,3));

        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");
        bNuovaPartita = new JButton("Nuova Partita");

        pannelloMatrice.add(b1);
        pannelloMatrice.add(b2);
        pannelloMatrice.add(b3);
        pannelloMatrice.add(b4);
        pannelloMatrice.add(b5);
        pannelloMatrice.add(b6);
        pannelloMatrice.add(b7);
        pannelloMatrice.add(b8);
        pannelloMatrice.add(b9);
        pannelloBasso.add(bNuovaPartita);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bNuovaPartita.addActionListener(this);
        contentPane.add(pannelloMatrice);
        contentPane.add(pannelloBasso,BorderLayout.SOUTH);
    }

    public void azzeraTav(int[][] mat){
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                mat[r][c] = -1;
            }
        }
    }

    public void controllaVincitore(){
        int vincitore = -1;

        if(tav[0][0] == tav[0][1] && (tav[0][0] == tav[0][2])){
            vincitore = tav[0][0];
        }
        else if(tav[1][0] == tav[1][1] && (tav[1][0] == tav[1][2])){
            vincitore = tav[1][0];
        }
        else if(tav[2][0] == tav[2][1] && (tav[2][0] == tav[2][2])){
            vincitore = tav[2][0];
        }
        else if(tav[0][0] == tav[0][1] && (tav[0][0] == tav[0][2])){
            vincitore = tav[0][0];
        }
        else if(tav[1][0] == tav[1][1] && (tav[1][0] == tav[1][2])){
            vincitore = tav[1][0];
        }
        else if(tav[2][0] == tav[2][1] && (tav[2][0] == tav[2][2])){
            vincitore = tav[2][0];
        }
        else if(tav[0][0] == tav[1][1] && (tav[0][0] == tav[2][2])){
            vincitore = tav[0][0];
        }
        else if(tav[0][2] == tav[1][1] && (tav[0][2] == tav[2][0])){
            vincitore = tav[0][2];
        }
        if(vincitore == 0){
            System.out.println("Vince il giocatore 0");
        }else if(vincitore == 1){
            System.out.println("Vince il giocatore 1");
        }
    }

    //@Override
    public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == b1)
            {
                b1.setText("X");
                tav[0][0] = 1;
                controllaVincitore();
                //true se posso schiacciarlo
                //false s enon posso schiacciarlo
                b1.setEnabled(false);
                giocataComputer();
            }
            if(ae.getSource() == b2) {
                b2.setText("X");
                    tav[0][1] = 1;
                controllaVincitore();
                b2.setEnabled(false);
                giocataComputer();
            }
            if(ae.getSource() == b3){
                b3.setText("X");
                    tav[0][2] = 1;
                controllaVincitore();
                b3.setEnabled(false);
                giocataComputer();
            }
            if(ae.getSource() == b4) {
                b4.setText("X");
                    tav[1][0] = 1;
                controllaVincitore();
                b4.setEnabled(false);
                giocataComputer();
            }
            if(ae.getSource() == b5){
                b5.setText("X");
                    tav[1][1] = 1;
                controllaVincitore();
                b5.setEnabled(false);
                giocataComputer();
            }
            if(ae.getSource() == b6) {
                b6.setText("X");
                    tav[1][2] = 1;
                controllaVincitore();
                b6.setEnabled(false);
                giocataComputer();
            }
            if(ae.getSource() == b7) {
                b7.setText("X");
                    tav[2][0] = 1;
                controllaVincitore();
                b7.setEnabled(false);
                giocataComputer();
            }
            if(ae.getSource() == b8){
                b8.setText("X");
                    tav[2][1] = 1;
                controllaVincitore();
                b8.setEnabled(false);
                giocataComputer();
            }
            if(ae.getSource() == b9){
                b9.setText("X");
                    tav[2][2] = 1;
                controllaVincitore();
                b9.setEnabled(false);
                giocataComputer();
        }

        if(ae.getSource() == bNuovaPartita){
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
    }

    public void visualizzaMatrice(int[][] mat){
        for(int r=0;r<3;r++) {
            System.out.print("\n");
            for (int c = 0; c < 3; c++) {
                System.out.print(mat[r][c] + " ");
            }
        }
    }

    public void giocataComputer(){
        Boolean passaggio = false;
        riga=randInt(0,2);
        colonna=randInt(0,2);
        while(passaggio == false)
        {
            if(tav[riga][colonna] == -1)
            {
                tav[riga][colonna] = 0;
                if(riga==0 && colonna==0)
                {
                    b1.setText("O");
                }else if(riga==0 && colonna == 1){
                    b2.setText("O");
                }else if(riga==0 && colonna == 2){
                    b3.setText("O");
                }else if(riga==1 && colonna ==0){
                    b4.setText("O");
                }else if(riga==1 && colonna ==1){
                    b5.setText("O");
                }else if(riga==1 && colonna ==2){
                    b6.setText("O");
                }else if(riga==2 && colonna ==0){
                    b7.setText("O");
                }else if(riga==2 && colonna ==1){
                    b8.setText("O");
                }else if(riga==2 && colonna ==2){
                    b9.setText("O");
                }
                passaggio = true;

            }else{
                riga=randInt(0,2);
                colonna=randInt(0,2);
            }
        }


    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public String toRowCsv() {
        return "Giocata" + SEPARATOR + "\n" +
                tav[0][0] + SEPARATOR + tav[0][1] + SEPARATOR + tav[0][2] + SEPARATOR + "\n" +
                tav[1][0] + SEPARATOR + tav[1][1] + SEPARATOR + tav[1][2] + SEPARATOR + "\n" +
                tav[2][0] + SEPARATOR + tav[2][1] + SEPARATOR + tav[2][2] + SEPARATOR + "\n" ;
    }

    public void salvaCSV() {
        String str = "";
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_NAME));

            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    bw.write(tav[r][c]);
                }
            }
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void apriCSV() {
        BufferedReader br;
        String rowLine;

        try {
            br = new BufferedReader(new FileReader(PATH_NAME));

            while((rowLine = br.readLine()) != null) {
                String[] campi = rowLine.split(Finestra.SEPARATOR);
                campi[0] = String.valueOf(tav [0][0]);
                campi[1] = String.valueOf(tav [0][1]);
                campi[2] = String.valueOf(tav [0][2]);
                campi[3] = String.valueOf(tav [1][0]);
                campi[4] = String.valueOf(tav [1][1]);
                campi[5] = String.valueOf(tav [1][2]);
                campi[6] = String.valueOf(tav [2][0]);
                campi[7] = String.valueOf(tav [2][1]);
                campi[8] = String.valueOf(tav [2][2]);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }
}


