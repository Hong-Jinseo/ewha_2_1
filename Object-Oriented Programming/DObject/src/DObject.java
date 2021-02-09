//2���� ����
public class DObject {
	private double width;
	private double height;
	private double area;
	
	//2���� ������ �غ��� ���̸� �Է¹޾� �����ϰ�, ���̴� ����ؼ� �����ϴ� ������(�޼ҵ�)
	public DObject(double width, double height){	//2���� ������ �غ��� ���̸� �Է¹ް�, ���̴� ����ϴ� ������(�޼ҵ�)
		this.width=width;
		this.height=height;
	}
	
	//�غ����� �Է¹޾� �غ��� ���̰� ���� 2���� ���� ��ü�� ����� ������
	public DObject(double width){
		this.width=width;
		this.height=width;
	}
	
	//������ �����ϴ� 2���� ������ ������ �Է¹޾� ��ü�� ����� ������
	public DObject(DObject ob){
		this(ob.width, ob.height);
	}
	
	//������ ������ width�� height�� �̿��� ����ؼ� area�� �����ϴ� �޼ҵ�
	public void computeArea() {
		this.area = this.width * this.height;
	}
	
	//2���� ���� ��ü�� ����(�غ�, ����, ����)�� ����ϴ� �޼ҵ�
	public void show() {
		System.out.println("2���� ����");
		System.out.println("�غ� = "+width);
		System.out.println("���� = "+height);
		System.out.println("���� = "+area+"\n");		
	}
	
}
