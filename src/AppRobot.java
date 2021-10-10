
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
			break;
		case 2:
			n.tourner();
			break;
		case 3:
			n.Avancer();
			break;
		case 4:
			n.Reculer();
		}
	
		System.out.print("\n========================== FIN ===========================");
	}  

}
