//�ﰢ��

public class Triangle {
	private double width;
	private double height;
	private double area;
	private String shape;
	//shape�� ��� �����ڸ� ���� ������ �Է��� �� ��� this()�Լ��� ���� ��������(OOP Lab4 10��)
	//ex) this.shape="�ﰢ��";
	
	
	//�ﰢ���� �غ��� ���̸� �Է¹޾� ��ü�� ����� ������
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.shape = "�ﰢ��";
	}

	//�ﰢ���� �غ��� �Է¹޾� �غ��� ���̰� ���� ��ü�� ����� ������
	//�Է¹��� �غ� ���� this() �޼ҵ带 ���� �ٸ� �����ڿ� ����
	public Triangle(double width) {
		this(width, width);
		this.shape = "�����̵�ﰢ��";
	}
	
	//������ �����ϴ� �ﰢ�� ��ü�� ������ �Է¹޾� ���ο� ��ü�� ����� ������
	//�Է¹��� �غ��� ���� ���� this() �޼ҵ带 ���� �ٸ� �����ڿ� ����
	public Triangle(Triangle ob) {
		this(ob.width, ob.height);
		this.shape = ob.shape;
	}
	
	//������ ������ width�� height�� �̿��� ����ؼ� area�� �����ϴ� �޼ҵ�
	public void computeArea() {
		this.area = this.width * this.height * 0.5;
	}
	
	//�ﰢ�� ��ü�� ����(�غ�, ����, ����, ���)�� ����ϴ� �޼ҵ�
	public void show() {
		System.out.println("�ﰢ��");
		System.out.println("�غ� = "+width);
		System.out.println("���� = "+height);
		System.out.println("���� = "+area);
		System.out.println("��� = "+shape+"\n");	
	}
	
}