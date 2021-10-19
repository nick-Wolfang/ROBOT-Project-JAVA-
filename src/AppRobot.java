
import java.util.Scanner;
public class AppRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ROBOT_CLASS n = new ROBOT_CLASS("Nick");
		n.Menu();
		Scanner sc = new Scanner(System.in);
			int choix = sc.nextInt();
			switch (choix) {
			case 1: 
				n.afficheRobot();
				System.out.println("Voulez vous éssayer autre chose");
				Scanner sc0 = new Scanner(System.in);
				String txt = sc0.nextLine();
				if(txt.equals("NON"))
					System.out.println("Aurevoir PETIT ;)");
				break;
			case 2:
				n.tourner();
				System.out.println("Voulez vous éssayer autre chose");
				Scanner sc1 = new Scanner(System.in);
				String txt1 = sc1.nextLine();
				if(txt1.equals("NON"))
					System.out.println("Aurevoir PETIT ;)");
				break;
			case 3:
				n.Avancer();
				System.out.println("Voulez vous éssayer autre chose");
				Scanner sc2 = new Scanner(System.in);
				String txt2 = sc2.nextLine();
				if(txt2.equals("NON"))
					System.out.println("Aurevoir PETIT ;)");
				break;
			case 4:
				n.Reculer();
				System.out.println("Voulez vous éssayer autre chose");
				Scanner sc3 = new Scanner(System.in);
				String txt3 = sc3.nextLine();
				if(txt3.equals("NON"))
					System.out.println("Aurevoir PETIT ;)");
			}
	

	}  
}