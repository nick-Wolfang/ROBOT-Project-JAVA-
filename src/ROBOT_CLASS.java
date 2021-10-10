import java.util.Scanner;

public class ROBOT_CLASS {
	private String nom;
	private int x;
	private int y;
	private int sens;
	private ROBOT_CLASS[] listeRobot;
	
	public ROBOT_CLASS(String nom, int x, int y, int sens) {
		this.nom = nom; 
		this.x = x;
		this.y = y;
		this.sens = sens;
		this.listeRobot = null;
	}
	
	//Constructeur par défaut 1
	public ROBOT_CLASS() {
		this.nom = " \"par défaut\" ";
		this.x = 0;
		this.y = 1;
		this.sens = 2;
	}
	
	//Constructeur par défaut 2
	public ROBOT_CLASS(String nom) {
		this.nom = nom;
		this.x = 1;
		this.y = 0;
		this.sens = 1;
	}
	
	public void Menu() {
		System.out.println("====================== Menu ROBOT ======================== ");
		System.out.println("Que choisissez-vous ?");
		System.out.println("\t1. Afficher le Robot");
		System.out.println("\t2. Changer l'Orientation ou faire tourner le Robot.");
		System.out.println("\t3. Faire avancer le Robot.");
		System.out.println("\t4. Faire reculer le Robot.");
		System.out.println("\t5. Faire courir le Robot. ;)");
		System.out.println("\t6. Ajouter un Robot.");
		System.out.println("\t7. Supprimer un Robot.");
		System.out.println("Votre choix est ?");
		
		System.out.print("\n");
	}
		
	public void afficheRobot() {
		System.out.println("Le Robot " + this.nom + " est de coordonnées : " + "(" + this.x + " , " + this.y + ")" );
		System.out.println("Son Orientation : " + this.sens);
		System.out.println("Voulez vous éssayer autre chose ?");
		Scanner sc = new Scanner(System.in);
	}
	
	public void tourner() {
		this.sens=(this.sens + 1) % 4;
		switch (this.sens) { 
		case 0: 
			System.out.println("Le Robot a tourné de l'Ouest vers le NORD.");
			System.out.println("Désormais, lOrientation est NORD");
		break;
		case 1: 
			System.out.println("Le Robot a tourné du Nord vers l'EST.");
			System.out.println("Désormais, lOrientation est EST");
		break;
		case 2: 
			System.out.println("Le Robot a tourné de l'Est vers le SUD.");
			System.out.println("Désormais, lOrientation est SUD");
		break;
		case 3: 
			System.out.println("Le Robot a tourné du Sud vers l'OUEST.");
			System.out.println("Désormais, lOrientation est OUEST");
		default :
		System.out.println("Votre saisie est incorrecte !!!!");
		}
	}
	
	public void Avancer() {
		switch (this.sens) { 
		case 0: 
			this.y = this.y + 1;
			System.out.println("Le Robot a avancé une fois vers le NORD.");
			System.out.println("Le Robot " + this.nom + " est de coordonnées : " + "(" + this.x + " , " + this.y  + ")" );
		break;
		case 1: 
			this.x = this.x + 1;
			System.out.println("Le Robot a avancé une fois vers l'EST.");
			System.out.println("Le Robot " + this.nom + " est de coordonnées : " + "(" + this.x + " , " + this.y  + ")" );
		break;
		case 2: 
			this.y = this.y - 1;
			System.out.println("Le Robot a avancé une fois vers le SUD.");
			System.out.println("Le Robot " + this.nom + " est de coordonnées : " + "(" + this.x + " , " + this.y  + ")" );
		break;
		case 3: 
			this.x = this.x - 1;
			System.out.println("Le Robot a avancé une fois vers l'OUEST.");
			System.out.println("Le Robot " + this.nom + " est de coordonnées : " + "(" + this.x  + " , " + this.y +1  + ")" );
		default :
		System.out.println("Votre saisie est incorrecte !!!!");
		}
		}
		
		public void Reculer() {
			switch (this.sens) { 
			case 0: 
				this.y = this.y - 1;
				System.out.println("Le Robot a reculé une fois vers le NORD.");
			break;
			case 1: 
				this.x = this.x - 1;
				System.out.println("Le Robot a reculé une fois vers l'EST.");
			break;
			case 2: 
				this.y = this.y + 1;
				System.out.println("Le Robot a reculé une fois vers le SUD.");
			break;
			case 3: 
				this.x = this.x + 1;
				System.out.println("Le Robot a reculé une fois vers l'OUEST.");
			default :
			System.out.println("Votre saisie est incorrecte !!!!");
				
			}
	}

	

}
