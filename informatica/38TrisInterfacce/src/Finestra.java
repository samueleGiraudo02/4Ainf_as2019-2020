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

        JPanel myPanel = new JPanel();
        Container contentPane = this.getContentPane();
        myPanel.setLayout(new GridLayout(3,3));

        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");

        myPanel.add(b1);
        myPanel.add(b2);
        myPanel.add(b3);
        myPanel.add(b4);
        myPanel.add(b5);
        myPanel.add(b6);
        myPanel.add(b7);
        myPanel.add(b8);
        myPanel.add(b9);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        contentPane.add(myPanel);
    }

    public String controlloContenutoBottone(String testo){
        String ret ="";
        if(testo == "")
        {
            ret = "X";

        }else if(testo == "X"){
            ret = "O";
        }else if(testo == "O"){
            ret = "X";
        }

        return ret;
    }

    
    //@Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1)
        {
            b1.setText(controlloContenutoBottone(b1.getText()));
        }else if(ae.getSource() == b2) {
            b2.setText(controlloContenutoBottone(b2.getText()));
        }else if(ae.getSource() == b3){
            b3.setText(controlloContenutoBottone(b3.getText()));
        }else if(ae.getSource() == b4) {
            b4.setText(controlloContenutoBottone(b4.getText()));
        }else if(ae.getSource() == b5){
            b5.setText(controlloContenutoBottone(b5.getText()));
        }else if(ae.getSource() == b6) {
            b6.setText(controlloContenutoBottone(b6.getText()));
        }else if(ae.getSource() == b7) {
            b7.setText(controlloContenutoBottone(b7.getText()));
        }else if(ae.getSource() == b8){
            b8.setText(controlloContenutoBottone(b8.getText()));
        }else if(ae.getSource() == b9){
            b9.setText(controlloContenutoBottone(b9.getText()));
        }
    }

    public static void main(String[] args)
    {

        Finestra fs = new Finestra();
    }
}


