package tp11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class MaFenetre extends JFrame implements ActionListener{
	//ActionListener est une interface d'écoute.
	private static final long serialVersionUID = 1L;
	private JLabel labelSaisie1;
	private JLabel labelSaisie2;
	private JLabel labelSomme;
	private JTextField textFieldSaisie1;
	private JTextField textFieldSaisie2;
	private JTextField textFieldSomme;
	private JButton boutonAfficher;
	private JButton boutonQuitter;
	
	public MaFenetre()
	{
		setSize(700,75); // Taille largeur et hauteur en pixels
		setTitle("Ma fenetre"); //Titre
		
		labelSaisie1 = new JLabel("SAISIE_1");
		labelSaisie2 = new JLabel("SAISIE_2");
		labelSomme = new JLabel("SOMME");
		
		textFieldSaisie1 = new JTextField(10);
		textFieldSaisie2 = new JTextField(10);
		textFieldSomme = new JTextField(10);
		
		boutonAfficher = new JButton("AFF");
		boutonQuitter = new JButton("QUIT");
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(labelSaisie1);
		getContentPane().add(textFieldSaisie1);
		getContentPane().add(labelSaisie2);
		getContentPane().add(textFieldSaisie2);
		getContentPane().add(labelSomme);
		getContentPane().add(textFieldSomme);
		getContentPane().add(boutonAfficher);
		getContentPane().add(boutonQuitter);
		
		boutonAfficher.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Calcul somme");
				int saisie1 = Integer.parseInt(textFieldSaisie1.getText());
				int saisie2 = Integer.parseInt(textFieldSaisie2.getText());
				int somme = saisie1 + saisie2;
				String strSomme = Integer.toString(somme);
				textFieldSomme.setText(strSomme);
			}
		});
		
		boutonQuitter.addActionListener(new CloseListener());
	}
	
	private class CloseListener implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        //DO SOMETHING
	        System.exit(0);
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
