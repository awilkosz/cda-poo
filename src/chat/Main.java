package chat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Cat monChat = new Cat();
		monChat.name = sc.next();
		monChat.color = sc.next();
		monChat.getDescription();
		
		Cat tonChat = new Cat();
		tonChat.color = "bleu";
		tonChat.name = "Eud";
		tonChat.getDescription();
		
		Cat sonChat = new Cat();
		sonChat.getDescription();
		
		Cat saChatte = new Cat("Rosie", "Blanche");
		saChatte.getDescription();
		
		
		/// Scenario :
		monChat.sleep();
		tonChat.sleep();
	    String trophe = tonChat.hunt();
		System.out.println(tonChat.name + " a ramené ça : " + trophe);
		saChatte.eat(trophe);
		monChat.listen();
		
		System.out.println("Quelle action voulez vous ? entre 1 et 5");
		int i = sc.nextInt();
		switch(i)
		{
		case 1:
			monChat.listen();
			break;
		case 2:
			monChat.eat("des croquettes");
			break;
		case 3:
			String proie = monChat.hunt();
			System.out.println(monChat.name + " a attrap� " + proie);
			break;
		case 4:
			monChat.getDescription();
			break;
		case 5:
			monChat.sleep();
			break;
		default:
			System.out.println(monChat.name + " ne comprend pas");
			break;
		}
		
		sc.close();

	}

}
