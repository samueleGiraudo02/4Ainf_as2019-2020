package it.itis.cuneo;
/*
Giraudo Samuele 4^Ainf
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Finestra extends  JFrame implements  ActionListener {
	JLabel lNome;
	JLabel lCognome;
	JTextField tCognome;
	JTextField tNome;
	JButton aggiungi;

	JList listaClasse;
	DefaultListModel listModel;

	DefaultComboBoxModel comboBoxModel;

	public Finestra() {
		setTitle("ComboBox classe");
		initComponent();
		pack();
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	private void initComponent() {

		setLayout(new FlowLayout());

		lCognome = new JLabel("Cognome: ");
		this.add(lCognome);
		tCognome = new JTextField(20);
		this.add(tCognome);

		lNome = new JLabel("Nome: ");
		this.add(lNome);
		tNome = new JTextField(20);
		this.add(tNome);

		listaClasse = new JList();
		this.add(listaClasse);

		aggiungi = new JButton("Aggiungi");
		this.add(aggiungi);
		aggiungi.addActionListener(this);

		listModel = new DefaultListModel();
		listModel.addElement("Aimar Veronica");
		listModel.addElement("Arecco Alessia");
		listModel.addElement("Giraudo Alessio");
		listModel.addElement("Mattio Alessandro");
		listModel.addElement("Naccarato Matteo");
		listModel.addElement("Nicosia Francesco");
		listaClasse = new JList(listModel);
		JScrollPane jsp = new JScrollPane(listaClasse);
		this.add(jsp);

		comboBoxModel = new DefaultComboBoxModel();
		comboBoxModel.addElement("Aimar Veronica");
		comboBoxModel.addElement("Arecco Alessia");
		comboBoxModel.addElement("Giraudo Alessio");
		comboBoxModel.addElement("Mattio Alessandro");
		comboBoxModel.addElement("Naccarato Matteo");
		comboBoxModel.addElement("Nicosia Francesco");
		JComboBox comboAlunni = new JComboBox(comboBoxModel);
		JScrollPane jsp2 = new JScrollPane(comboAlunni);
		this.add(jsp2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(aggiungi)) {
			comboBoxModel.addElement(tCognome.getText() + " " + tNome.getText());
			listModel.addElement(tCognome.getText() + " " + tNome.getText());
		}
	}

	public static void main(String[] args) {
		Finestra fs = new Finestra();
	}
}
