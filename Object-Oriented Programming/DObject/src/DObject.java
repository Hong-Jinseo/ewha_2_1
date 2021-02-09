//2차원 도형
public class DObject {
	private double width;
	private double height;
	private double area;
	
	//2차원 도형의 밑변과 높이를 입력받아 저장하고, 넓이는 계산해서 저장하는 생성자(메소드)
	public DObject(double width, double height){	//2차원 도형의 밑변과 높이를 입력받고, 넓이는 계산하는 생성자(메소드)
		this.width=width;
		this.height=height;
	}
	
	//밑변만을 입력받아 밑변과 높이가 같은 2차원 도형 객체를 만드는 생성자
	public DObject(double width){
		this.width=width;
		this.height=width;
	}
	
	//기존에 존재하던 2차원 도형의 정보를 입력받아 객체를 만드는 생성자
	public DObject(DObject ob){
		this(ob.width, ob.height);
	}
	
	//도형의 면적을 width와 height를 이용해 계산해서 area에 저장하는 메소드
	public void computeArea() {
		this.area = this.width * this.height;
	}
	
	//2차원 도형 객체의 정보(밑변, 높이, 면적)를 출력하는 메소드
	public void show() {
		System.out.println("2차원 도형");
		System.out.println("밑변 = "+width);
		System.out.println("높이 = "+height);
		System.out.println("면적 = "+area+"\n");		
	}
	
}
