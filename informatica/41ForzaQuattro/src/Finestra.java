import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finestra extends JFrame implements ActionListener {

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b10;
    JButton b11;
    JButton b12;
    JButton b13;
    JButton b14;
    JButton b15;
    JButton b16;
    JButton b17;
    JButton b18;
    JButton b19;
    JButton b20;
    JButton b21;
    JButton b22;
    JButton b23;
    JButton b24;
    JButton b25;
    JButton b26;
    JButton b27;
    JButton b28;
    JButton b29;
    JButton b30;
    JButton b31;
    JButton b32;
    JButton b33;
    JButton b34;
    JButton b35;
    JButton b36;
    JButton nuovaPartita;

    private String mossaPrecedente = "";
    private String vincitore ="W";

    public Finestra(){
        setSize(600,600);
        setLocation(200,200);
        setTitle("Forza quattro");
        //pack();
        initComponents();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void initComponents(){
        JPanel pannelloMatrice = new JPanel();
        JPanel pannelloBasso = new JPanel();

        Container container = this.getContentPane();

        pannelloMatrice.setLayout(new GridLayout(6,6));

        b1= new JButton("");
        b2= new JButton("");
        b3= new JButton("");
        b4= new JButton("");
        b5= new JButton("");
        b6= new JButton("");
        b7= new JButton("");
        b8= new JButton("");
        b9= new JButton("");
        b10= new JButton("");
        b11= new JButton("");
        b12= new JButton("");
        b13= new JButton("");
        b14= new JButton("");
        b15= new JButton("");
        b16= new JButton("");
        b17= new JButton("");
        b18= new JButton("");
        b19= new JButton("");
        b20= new JButton("");
        b21= new JButton("");
        b22= new JButton("");
        b23= new JButton("");
        b24= new JButton("");
        b25= new JButton("");
        b26= new JButton("");
        b27= new JButton("");
        b28= new JButton("");
        b29= new JButton("");
        b30= new JButton("");
        b31= new JButton("");
        b32= new JButton("");
        b33= new JButton("");
        b34= new JButton("");
        b35= new JButton("");
        b36= new JButton("");


        pannelloMatrice.add(b1);
        pannelloMatrice.add(b2);
        pannelloMatrice.add(b3);
        pannelloMatrice.add(b4);
        pannelloMatrice.add(b5);
        pannelloMatrice.add(b6);
        pannelloMatrice.add(b7);
        pannelloMatrice.add(b8);
        pannelloMatrice.add(b9);
        pannelloMatrice.add(b10);
        pannelloMatrice.add(b11);
        pannelloMatrice.add(b12);
        pannelloMatrice.add(b13);
        pannelloMatrice.add(b14);
        pannelloMatrice.add(b15);
        pannelloMatrice.add(b16);
        pannelloMatrice.add(b17);
        pannelloMatrice.add(b18);
        pannelloMatrice.add(b19);
        pannelloMatrice.add(b20);
        pannelloMatrice.add(b21);
        pannelloMatrice.add(b22);
        pannelloMatrice.add(b23);
        pannelloMatrice.add(b24);
        pannelloMatrice.add(b25);
        pannelloMatrice.add(b26);
        pannelloMatrice.add(b27);
        pannelloMatrice.add(b28);
        pannelloMatrice.add(b29);
        pannelloMatrice.add(b30);
        pannelloMatrice.add(b31);
        pannelloMatrice.add(b32);
        pannelloMatrice.add(b33);
        pannelloMatrice.add(b34);
        pannelloMatrice.add(b35);
        pannelloMatrice.add(b36);
        //pannelloBasso.add(nuovaPartita);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
        b34.addActionListener(this);
        b35.addActionListener(this);
        b36.addActionListener(this);
        //nuovaPartita.addActionListener(this);

        container.add(pannelloMatrice);
        container.add(pannelloBasso,BorderLayout.SOUTH);

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


    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1)
        {
            b1.setText(controlloContenutoBottone());
            //b1.setBackground(Color.RED);
            controllaVincitore();
        }
        if(ae.getSource() == b2) {
            b2.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b3){
            b3.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b4) {
            b4.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b5){
            b5.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b6) {
            b6.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b7) {
            b7.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b8){
            b8.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b9){
            b9.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b10){
            b10.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b11){
            b11.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b12){
            b12.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b13){
            b13.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b14){
            b14.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b15){
            b15.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b16){
            b16.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b17){
            b17.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b18){
            b18.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b19){
            b19.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b20){
            b20.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b21){
            b21.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b22){
            b22.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b23){
            b23.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b24){
            b24.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b25){
            b25.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b26){
            b26.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b27){
            b27.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b28){
            b28.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b29){
            b29.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b30){
            b30.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b31){
            b31.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b32){
            b32.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b33){
            b33.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b34){
            b34.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b35){
            b35.setText(controlloContenutoBottone());
            controllaVincitore();
        }
        if(ae.getSource() == b36){
            b36.setText(controlloContenutoBottone());
            controllaVincitore();
        }
    }

    public void controllaVincitore(){

        //controllo sui primi quattro e utimi quattro riga

        if(b1.getText() == b2.getText() && (b1.getText() == b3.getText()) && (b1.getText() == b4.getText()))
        {
            System.out.println(b1.getText());
            vincitore = b1.getText();
            decretareVincitore();
        }
        if(b6.getText() == b5.getText() && (b6.getText() == b4.getText()) && (b6.getText() == b3.getText())){
           vincitore = b6.getText();
            decretareVincitore();
        }
        if(b7.getText() == b8.getText() && (b7.getText() == b9.getText()) && (b7.getText() == b10.getText())){
            vincitore = b7.getText();
            decretareVincitore();
        }
        if(b12.getText() == b11.getText() && (b12.getText() == b10.getText()) && (b12.getText() == b9.getText())){
            vincitore = b12.getText();
            decretareVincitore();
        }
        if(b13.getText() == b14.getText() && (b13.getText() == b15.getText()) && (b13.getText() == b16.getText())){
            vincitore = b13.getText();
            decretareVincitore();
        }
        if(b18.getText() == b17.getText() && (b18.getText() == b16.getText()) && (b18.getText() == b15.getText())){
            vincitore = b18.getText();
            decretareVincitore();
        }
        if(b19.getText() == b20.getText() && (b19.getText() == b21.getText()) && (b19.getText() == b22.getText())){
            vincitore = b19.getText();
            decretareVincitore();
        }
        if(b24.getText() == b23.getText() && (b24.getText() == b22.getText()) && (b24.getText() == b21.getText())){
            vincitore = b24.getText();
            decretareVincitore();
        }
        if(b25.getText() == b26.getText() && (b25.getText() == b27.getText()) && (b25.getText() == b28.getText())){
            vincitore = b25.getText();
            decretareVincitore();
        }
        if(b30.getText() == b29.getText() && (b30.getText() == b28.getText()) && (b30.getText() == b27.getText())){
            vincitore = b30.getText();
            decretareVincitore();
        }
        if((b31.getText() == b32.getText()) && (b31.getText() == b33.getText()) && (b31.getText() == b34.getText())){
            vincitore = b31.getText();
            System.out.println(vincitore);
            decretareVincitore();
        }
        if(b36.getText() == b35.getText() && (b36.getText() == b34.getText()) && (b36.getText() == b33.getText())){
            vincitore = b36.getText();
            decretareVincitore();
        }
        //righe a metà
        if((b2.getText() == b3.getText()) && (b2.getText() == b4.getText()) && (b2.getText() == b5.getText())){
            vincitore = b2.getText();
            decretareVincitore();
        }
        if(b8.getText() == b9.getText() && (b9.getText() == b10.getText()) && (b10.getText() == b11.getText())){
            vincitore = b8.getText();
            decretareVincitore();
        }
        if(b14.getText() == b15.getText() && (b15.getText() == b16.getText()) && (b16.getText() == b17.getText())){
            vincitore = b14.getText();
            decretareVincitore();
        }
        if(b20.getText() == b21.getText() && (b21.getText() == b22.getText()) && (b22.getText() == b23.getText())){
            vincitore = b20.getText();
            decretareVincitore();
        }
        if(b26.getText() == b27.getText() && (b27.getText() == b28.getText()) && (b28.getText() == b29.getText())){
            vincitore = b26.getText();
            decretareVincitore();
        }
        if(b32.getText() == b33.getText() && (b33.getText() == b34.getText()) && (b34.getText() == b35.getText())){
            vincitore = b32.getText();
            decretareVincitore();
        }
        //colonne inizio e fine
        //inizio
        if(b1.getText() == b7.getText() && (b7.getText() == b13.getText()) && (b13.getText() == b19.getText())){
            vincitore = b1.getText();
            decretareVincitore();
        }
        if(b2.getText() == b8.getText() && (b8.getText() == b14.getText()) && (b14.getText() == b20.getText())){
            vincitore = b2.getText();
            decretareVincitore();
        }
        if(b3.getText() == b9.getText() && (b9.getText() == b15.getText()) && (b15.getText() == b21.getText())){
            vincitore = b3.getText();
            decretareVincitore();
        }
        if(b4.getText() == b10.getText() && (b10.getText() == b16.getText()) && (b16.getText() == b22.getText())){
            vincitore = b4.getText();
            decretareVincitore();
        }
        if(b5.getText() == b11.getText() && (b11.getText() == b17.getText()) && (b17.getText() == b23.getText())){
            vincitore = b5.getText();
            decretareVincitore();
        }
        if(b6.getText() == b12.getText() && (b12.getText() == b18.getText()) && (b18.getText() == b24.getText())){
            vincitore = b7.getText();
            decretareVincitore();
        }
        //fine
        if(b13.getText() == b19.getText() && (b19.getText() == b25.getText()) && (b25.getText() == b31.getText())){
            vincitore = b13.getText();
            decretareVincitore();
        }
        if(b14.getText() == b20.getText() && (b14.getText() == b26.getText()) && (b26.getText() == b32.getText())){
            vincitore = b14.getText();
            decretareVincitore();
        }
        if(b15.getText() == b21.getText() && (b21.getText() == b27.getText()) && (b27.getText() == b33.getText())){
            vincitore = b15.getText();
            decretareVincitore();
        }
        if(b16.getText() == b22.getText() && (b22.getText() == b28.getText()) && (b28.getText() == b34.getText())){
            vincitore = b16.getText();
            decretareVincitore();
        }
        if(b17.getText() == b23.getText() && (b23.getText() == b29.getText()) && (b29.getText() == b35.getText())){
            vincitore = b17.getText();
            decretareVincitore();
        }
        if(b18.getText() == b24.getText() && (b24.getText() == b30.getText()) && (b30.getText() == b36.getText())){
            vincitore = b18.getText();
            decretareVincitore();
        }
        //parte centrale colonne
        if(b7.getText() == b25.getText() && (b7.getText() == b13.getText()) && (b13.getText() == b19.getText())){
            vincitore = b7.getText();
            decretareVincitore();
        }
        if(b8.getText() == b26.getText() && (b8.getText() == b14.getText()) && (b14.getText() == b20.getText())){
            vincitore = b2.getText();
            decretareVincitore();
        }
        if(b27.getText() == b9.getText() && (b9.getText() == b15.getText()) && (b15.getText() == b21.getText())){
            vincitore = b27.getText();
            decretareVincitore();
        }
        if(b28.getText() == b10.getText() && (b10.getText() == b16.getText()) && (b16.getText() == b22.getText())){
            vincitore = b28.getText();
            decretareVincitore();
        }
        if(b29.getText() == b11.getText() && (b11.getText() == b17.getText()) && (b17.getText() == b23.getText())){
            vincitore = b29.getText();
            decretareVincitore();
        }
        if(b30.getText() == b12.getText() && (b12.getText() == b18.getText()) && (b18.getText() == b24.getText())){
            vincitore = b30.getText();
            decretareVincitore();
        }

        //diagonali
        if(b35.getText() == b28.getText() && (b28.getText() == b23.getText()) && (b23.getText() == b18.getText())){
            vincitore = b35.getText();
            decretareVincitore();
        }
        if(b19.getText() == b14.getText() && (b14.getText() == b9.getText()) && (b9.getText() == b4.getText())){
            vincitore = b19.getText();
            decretareVincitore();
        }
        if(b25.getText() == b20.getText() && (b20.getText() == b15.getText()) && (b15.getText() == b10.getText())){
            vincitore = b25.getText();
            decretareVincitore();
        }
        if(b5.getText() == b10.getText() && (b10.getText() == b15.getText()) && (b15.getText() == b20.getText())){
            vincitore = b5.getText();
            decretareVincitore();
        }
        if(b31.getText() == b26.getText() && (b26.getText() == b21.getText()) && (b21.getText() == b16.getText())){
            vincitore = b31.getText();
            decretareVincitore();
        }
        if(b6.getText() == b11.getText() && (b11.getText() == b16.getText()) && (b16.getText() == b21.getText())){
            vincitore = b6.getText();
            decretareVincitore();
        }
        if(b26.getText() == b21.getText() && (b21.getText() == b16.getText()) && (b16.getText() == b11.getText())){
            vincitore = b26.getText();
            decretareVincitore();
        }
        if(b32.getText() == b27.getText() && (b27.getText() == b22.getText()) && (b22.getText() == b17.getText())){
            vincitore = b32.getText();
            decretareVincitore();
        }
        if(b12.getText() == b17.getText() && (b17.getText() == b22.getText()) && (b22.getText() == b27.getText())){
            vincitore = b12.getText();
            decretareVincitore();
        }
        if(b13.getText() == b20.getText() && (b20.getText() == b27.getText()) && (b27.getText() == b34.getText())){
            vincitore = b13.getText();
            decretareVincitore();
        }
        if(b3.getText() == b10.getText() && (b10.getText() == b17.getText()) && (b17.getText() == b24.getText())){
            vincitore = b3.getText();
            decretareVincitore();
        }
        if(b7.getText() == b14.getText() && (b14.getText() == b21.getText()) && (b21.getText() == b28.getText())){
            vincitore = b7.getText();
            decretareVincitore();
        }
        if(b35.getText() == b28.getText() && (b28.getText() == b21.getText()) && (b21.getText() == b14.getText())){
            vincitore = b35.getText();
            decretareVincitore();
        }
        if(b2.getText() == b9.getText() && (b9.getText() == b16.getText()) && (b16.getText() == b23.getText())){
            vincitore = b2.getText();
            decretareVincitore();
        }
        if(b30.getText() == b23.getText() && (b23.getText() == b16.getText()) && (b16.getText() == b9.getText())){
            vincitore = b30.getText();
            decretareVincitore();
        }
        if(b1.getText() == b8.getText() && (b8.getText() == b15.getText()) && (b15.getText() == b22.getText())){
            vincitore = b1.getText();
            decretareVincitore();
        }
        if(b36.getText() == b29.getText() && (b29.getText() == b22.getText()) && (b22.getText() == b15.getText())){
            vincitore = b36.getText();
            decretareVincitore();
        }
        if(b8.getText() == b15.getText() && (b15.getText() == b22.getText()) && (b22.getText() == b29.getText())){
            vincitore = b8.getText();
            decretareVincitore();
        }
    }

    public void decretareVincitore(){
        if(vincitore == "X"){
            System.out.println("Il vincitore è il giocatore X");
        } else if (vincitore == "O") {
            System.out.println("Il vincitore è il giocatore O");
        }
    }

    public static void main(String[] args) {
        Finestra fs = new Finestra();
    }
}
