//사각형
public class Rectangle {
	private double width;
	private double height;
	private double area;
	private String shape;
	
	//사각형의 밑변과 높이를 입력받아 객체를 만드는 생성자
	//만약 밑변과 높이의 값이 같다면 shape에 '정사각형'을 저장하고, 아니라면 '직사각형'을 저장
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		if (width==height) this.shape = "정사각형";
		else this.shape="직사각형";
	}
	
	//사각형의 밑변을 입력받아 밑변과 높이가 같은 객체를 만드는 생성자
	//입력받은 밑변 값을 this() 메소드를 통해 다른 생성자에 대입
	public Rectangle(double width) {
		this(width, width);
	}
	
	//기존에 존재하던 사각형 객체의 정보를 입력받아 새로운 객체를 만드는 생성자
	//입력받은 밑변과 높이 값을 this() 메소드를 통해 다른 생성자에 대입
	public Rectangle(Rectangle ob) {
		this(ob.width, ob.height);
	}
	
	//도형의 면적을 width와 height를 이용해 계산해서 area에 저장하는 메소드
	public void computeArea() {
		this.area = this.width * this.height;
	}
	
	//사각형 객체의 정보(밑변, 높이, 면적, 모양)를 출력하는 메소드
	public void show() {
		System.out.println("사각형");
		System.out.println("밑변 = "+width);
		System.out.println("높이 = "+height);
		System.out.println("면적 = "+area);
		System.out.println("모양 = "+shape+"\n");	
	}
	
}