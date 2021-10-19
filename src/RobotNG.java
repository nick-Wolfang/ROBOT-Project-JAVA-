
public class RobotNG extends ROBOT_CLASS {
	RobotNG(String nom, int x, int y, int sens){
		super(nom, x, y, sens);
		//this(nom, x, y, direction);
	}
	public void Avancer(int npas) {
		int i;
		for(i=0; i<npas; i++)
			super.Avancer(); //Principe d'héritage
	}
	
	public void tournerGauche() {
		super.tourner();
		super.tourner();
		super.tourner();
	}
}
