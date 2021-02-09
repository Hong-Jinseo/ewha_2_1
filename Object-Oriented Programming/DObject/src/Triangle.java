//삼각형

public class Triangle {
	private double width;
	private double height;
	private double area;
	private String shape;
	//shape의 경우 생성자를 통해 정보를 입력할 수 없어서 this()함수를 통해 대입해줌(OOP Lab4 10쪽)
	//ex) this.shape="삼각형";
	
	
	//삼각형의 밑변과 높이를 입력받아 객체를 만드는 생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.shape = "삼각형";
	}

	//삼각형의 밑변을 입력받아 밑변과 높이가 같은 객체를 만드는 생성자
	//입력받은 밑변 값을 this() 메소드를 통해 다른 생성자에 대입
	public Triangle(double width) {
		this(width, width);
		this.shape = "직각이등변삼각형";
	}
	
	//기존에 존재하던 삼각형 객체의 정보를 입력받아 새로운 객체를 만드는 생성자
	//입력받은 밑변과 높이 값을 this() 메소드를 통해 다른 생성자에 대입
	public Triangle(Triangle ob) {
		this(ob.width, ob.height);
		this.shape = ob.shape;
	}
	
	//도형의 면적을 width와 height를 이용해 계산해서 area에 저장하는 메소드
	public void computeArea() {
		this.area = this.width * this.height * 0.5;
	}
	
	//삼각형 객체의 정보(밑변, 높이, 면적, 모양)를 출력하는 메소드
	public void show() {
		System.out.println("삼각형");
		System.out.println("밑변 = "+width);
		System.out.println("높이 = "+height);
		System.out.println("면적 = "+area);
		System.out.println("모양 = "+shape+"\n");	
	}
	
}