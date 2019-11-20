package tp8;

import java.io.FileReader;
import java.util.*;
import java.io.IOException;
import java.io.*;

public class C_PRINCIPALE {

	public static void main(String[] args) throws Exception {
		
		//Exercice 1
		Scanner lecture_clavier = new Scanner(System.in);
		FileReader Flux_Fichier;
		int c;
		Flux_Fichier = new FileReader("C:\\Users\\AUR.WILKOSZ\\Documents\\cda-poo\\src\\tp8\\fichierTexte.txt");
		
		String nomfich;
		System.out.print("donnez le nom du fichier a créer : ");
		nomfich = lecture_clavier.nextLine();
		System.out.print("donnez le nom du fichier sans accents : ");
		String nomfich2 = lecture_clavier.nextLine();
		FileOutputStream sortie = new FileOutputStream(nomfich);
		FileOutputStream sortie2 = new FileOutputStream(nomfich2);
		String accents[] = new String[] {"à=a","é=e","è=e","ê=e","ë=e","î=i","ï=i","ô=o","ö=o","û=u","ü=u"};
		// fichier texte
		// Lecture et affichage du fichier
		do
		{
			c = Flux_Fichier.read();
			// lecture 
			// retourne -1 si fin de fichier
			char car = (char)c;
			if(c !=-1)
			{
				System.out.print(car);
			}
			//Traitement exercice 2
			if(c == 'a')
				sortie.write('A');
			else
				sortie.write(c);
			
			//Traitement exercice 3
			sortie2.write(traiteCaractere((char)c,accents));
		}while(c >=0);
		
		//Exercice 4
		FileInputStream entree = new FileInputStream("C:\\Users\\AUR.WILKOSZ\\Documents\\cda-poo\\src\\tp8\\Fich_Points.obj");
		ObjectInputStream serie = new ObjectInputStream (entree);
		
		Flux_Fichier.close();
		lecture_clavier.close();
	}
	
	public static char traiteCaractere(char car, String tab[])
	{
		for(int i=0; i<tab.length; i++)
		{
			if(tab[i].charAt(0) == car)
				car = tab[i].charAt(2);
				
		}
		return car;
	}
}

