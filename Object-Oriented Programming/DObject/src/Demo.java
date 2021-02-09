
public class Demo {
	public static void main(String[] args) {
		DObject dob [] = new DObject [3];
		dob[0] = new DObject(10, 20);
		dob[1] = new DObject(10);
		dob[2] = new DObject(dob[1]);
		
		for (int i = 0; i < dob.length; i++) {
			dob[i].computeArea();
			dob[i].show();
		}
		
		Rectangle rob [] = new Rectangle [3];
		rob[0] = new Rectangle(10, 20);
		rob[1] = new Rectangle (10);
		rob[2] = new Rectangle (rob[1]);
		
		for (int i = 0; i < rob.length; i++) {
			rob[i].computeArea();
			rob[i].show();
		}
		
		Triangle tob [] = new Triangle [3];
		tob[0] = new Triangle(10, 20);
		tob[1] = new Triangle (10);
		tob[2] = new Triangle (tob[1]);
		
		for (int i = 0; i < tob.length; i++) {
			tob[i].computeArea();
			tob[i].show();
		}
		
		ColorTriangle ctob [] = new ColorTriangle [3];
		ctob[0] = new ColorTriangle(10, 20, "»¡°­");
		ctob[1] = new ColorTriangle (10, "³ë¶û");
		ctob[2] = new ColorTriangle(ctob[1]);
		
		for (int i = 0; i < ctob.length; i++) {
			ctob[i].computeArea();
			ctob[i].show();
		}
		
	}
}
		