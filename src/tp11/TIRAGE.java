package tp11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TIRAGE extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNb1;
	private JTextField textFieldNb2;
	private JTextField textFieldNb3;
	private JTextField textFieldResultat;
	private JButton boutonTirage;
	private JLabel labelResultat;
	
	public TIRAGE()
	{
		setSize(200,100); // Taille largeur et hauteur en pixels
		setTitle("Jeu 3 nbs"); //Titre
		
		textFieldNb1 = new JTextField(2);
		textFieldNb2 = new JTextField(2);
		textFieldNb3 = new JTextField(2);
		textFieldResultat = new JTextField(5);
		
		boutonTirage = new JButton("Tirage");
		
		labelResultat = new JLabel("Résultat:");
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(textFieldNb1);
		getContentPane().add(textFieldNb2);
		getContentPane().add(textFieldNb3);
		getContentPane().add(boutonTirage);
		getContentPane().add(labelResultat);
		getContentPane().add(textFieldResultat);
		
		boutonTirage.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Random rand = new Random();
				int nb1 = rand.nextInt(10);
				int nb2 = rand.nextInt(10);
				int nb3 = rand.nextInt(10);
				int somme = nb1 + nb2 + nb3;
				
				textFieldNb1.setText(Integer.toString(nb1));
				textFieldNb2.setText(Integer.toString(nb2));
				textFieldNb3.setText(Integer.toString(nb3));
				
				if(somme > 15)
					textFieldResultat.setText("GAGNE");
				else
					textFieldResultat.setText("PERDU");
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
