
public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(10,20);
		Rectangle R2 = new Rectangle(30,40);
		
		int area = R1.ComputeArea();
		int w = R1.ShowWidth();
		int h = R1.ShowHeight();
		System.out.println(w+ ", "+h+ ", "+area);
		
		area = R2.ComputeArea();
		w = R2.ShowWidth();
		h = R2.ShowHeight();
		System.out.println(w+ ", "+h+ ", "+area);
	}
 
}
