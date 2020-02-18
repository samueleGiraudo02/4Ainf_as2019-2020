package it.itis.cuneo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Finestra extends  JFrame implements ActionListener {

    JLabel lFattore1;
    JLabel lFattore2;

    JTextField tFattore1;
    JTextField tFattore2;

    JButton bSomma;
    JButton bMoltiplicazione;
    JButton bSottrazione;
    JButton bDivisione;

    JLabel lRisultato;


    public Finestra()
    {
        setSize(800,600);
        setLocation(200, 200);
        setTitle("Calcolatrice");
        initComponets();
        //pack();
        JPanel myPanel = new JPanel();
        //myPanel.setBackground(Color.BLUE);
        Container container = this.getContentPane();
        container.add(myPanel);
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets() {

        this.setLayout(new FlowLayout());

        lFattore1 = new JLabel("fattore 1: ");
        this.add(lFattore1);
        tFattore1 = new JTextField(20);
        this.add(tFattore1);

        lFattore2 = new JLabel("fattore 2: ");
        this.add(lFattore2);
        tFattore2= new JTextField(20);
        this.add(tFattore2);

        lRisultato = new JLabel("risultato: ");
        this.add(lRisultato);


        //bottoni
        bSomma= new JButton("Somma");
        this.add(bSomma);
        bSomma.addActionListener(this);

        bSottrazione= new JButton("Sottrazione");
        this.add(bSottrazione);
        bSottrazione.addActionListener(this);

        bMoltiplicazione= new JButton("Moltiplicazione");
        this.add(bMoltiplicazione);
        bMoltiplicazione.addActionListener(this);

        bDivisione= new JButton("Divisione");
        this.add(bDivisione);
        bDivisione.addActionListener(this);

    }

    //@Override
    public void actionPerformed(ActionEvent ae) {
        int n1 = new Integer(tFattore1.getText());
        int n2 = new Integer(tFattore2.getText());
        double risultato=0;

        if (ae.getSource() == bDivisione)
        {
            risultato = (double) n1 / n2;

            lRisultato.setText("" + risultato);
        }else if (ae.getSource() == bMoltiplicazione)
        {
            risultato = (double) n1 * n2;

            lRisultato.setText("" + risultato);
        }else if (ae.getSource() == bSomma)
        {
            risultato = (double) n1 + n2;

            lRisultato.setText("" + risultato);
        }else if (ae.getSource() == bSottrazione)
        {
            risultato = (double) n1 - n2;

            lRisultato.setText("" + risultato);
        }

    }

    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }
}


