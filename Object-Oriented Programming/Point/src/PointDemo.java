public class PointDemo {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(10,20);

		p1.setX(5); p1.setY(6);
		
		System.out.println("p1="+p1.getX()+", "+p1.getY());
		System.out.println("p1="+p2.getX()+", "+p2.getY());
		
		p1.showPoint();
		p2.showPoint();
	}

}
