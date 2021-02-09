
public class Rectangle {
	private int width;
	private int height;
	private int area;
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public int ComputeArea() {
		return width*height;
	}
	
	public int ShowWidth(){
		return width;
	}
	
	public int ShowHeight() {
		return height;
	}
}
