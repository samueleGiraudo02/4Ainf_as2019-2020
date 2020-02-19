
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Finestra extends  JFrame implements ActionListener {
    JButton button;
    JButton shortButton;
    JButton longButton;

    public Finestra()
    {
        setSize(800,600);
        setLocation(200, 200);
        setTitle("Bottoni");
        initComponets();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    private void initComponets() {
        Container container = this.getContentPane();
        JPanel myPanel = new JPanel();

        BoxLayout centerPanelLayout = new BoxLayout(myPanel, BoxLayout.Y_AXIS);
        myPanel.setLayout(centerPanelLayout);

        JButton button = new JButton("button");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        myPanel.add(button);

        JButton shortButton = new JButton("short");
        shortButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        myPanel.add(shortButton);

        JButton longButton = new JButton("long-long - long button");
        longButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        myPanel.add(longButton);
        container.add(myPanel);
    }


    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


