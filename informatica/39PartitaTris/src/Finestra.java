/**
 * Created by inf.giraudos1206 on 20/02/2020.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public String controlloContenutoBottone(){
        String ret ="";
        if(mossaPrecedente == "")
        {
            ret ="X";
            mossaPrecedente ="X";
        }else if(mossaPrecedente == "X")
        {
            ret = "O";
            mossaPrecedente ="O";
        }else if(mossaPrecedente == "O"){
            ret = "X";
            mossaPrecedente ="X";
        }
        return ret;
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
        }else if(vincitore == -1){
            System.out.println("Nessun vincitore");
        }
    }

    //@Override
    public void actionPerformed(ActionEvent ae) {

        azzeraTav(tav);

        if (ae.getSource() == b1)
        {
            b1.setText(controlloContenutoBottone());
            if(b1.getText() == "X")
            {
                tav[0][0] = 1;
            }else if(b1.getText() == "O"){
                tav[0][0] = 0;
            }
            controllaVincitore();
        }
        if(ae.getSource() == b2) {
            b2.setText(controlloContenutoBottone());
            if(b2.getText() == "X")
            {
                tav[0][1] = 1;
            }else if(b2.getText() == "O"){
                tav[0][1] = 0;
            }
            controllaVincitore();
        }
        if(ae.getSource() == b3){
            b3.setText(controlloContenutoBottone());
            if(b3.getText() == "X")
            {
                tav[0][2] = 1;
            }else if(b3.getText() == "O"){
                tav[0][2] = 0;
            }
            controllaVincitore();
        }
        if(ae.getSource() == b4) {
            b4.setText(controlloContenutoBottone());
            if(b4.getText() == "X")
            {
                tav[1][0] = 1;
            }else if(b4.getText() == "O"){
                tav[1][0] = 0;
            }
            controllaVincitore();
        }
        if(ae.getSource() == b5){
            b5.setText(controlloContenutoBottone());
            if(b5.getText() == "X")
            {
                tav[1][1] = 1;
            }else if(b5.getText() == "O"){
                tav[1][1] = 0;
            }
            controllaVincitore();
        }
        if(ae.getSource() == b6) {
            b6.setText(controlloContenutoBottone());
            if(b6.getText() == "X")
            {
                tav[1][2] = 1;
            }else if(b6.getText() == "O"){
                tav[1][2] = 0;
            }
            controllaVincitore();
        }
        if(ae.getSource() == b7) {
            b7.setText(controlloContenutoBottone());
            if(b7.getText() == "X")
            {
                tav[2][0] = 1;
            }else if(b7.getText() == "O"){
                tav[2][0] = 0;
            }
            controllaVincitore();
        }
        if(ae.getSource() == b8){
            b8.setText(controlloContenutoBottone());
            if(b8.getText() == "X")
            {
                tav[2][1] = 1;
            }else if(b8.getText() == "O"){
                tav[2][1] = 0;
            }
            controllaVincitore();
        }
        if(ae.getSource() == b9){
            b9.setText(controlloContenutoBottone());
            if(b4.getText() == "X")
            {
                tav[2][2] = 1;
            }else if(b4.getText() == "O"){
                tav[2][2] = 0;
            }
            controllaVincitore();
        }

        visualizzaMatrice(tav);

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

    public static void main(String[] args)
    {

        Finestra fs = new Finestra();

    }
}


