//�簢��
public class Rectangle {
	private double width;
	private double height;
	private double area;
	private String shape;
	
	//�簢���� �غ��� ���̸� �Է¹޾� ��ü�� ����� ������
	//���� �غ��� ������ ���� ���ٸ� shape�� '���簢��'�� �����ϰ�, �ƴ϶�� '���簢��'�� ����
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		if (width==height) this.shape = "���簢��";
		else this.shape="���簢��";
	}
	
	//�簢���� �غ��� �Է¹޾� �غ��� ���̰� ���� ��ü�� ����� ������
	//�Է¹��� �غ� ���� this() �޼ҵ带 ���� �ٸ� �����ڿ� ����
	public Rectangle(double width) {
		this(width, width);
	}
	
	//������ �����ϴ� �簢�� ��ü�� ������ �Է¹޾� ���ο� ��ü�� ����� ������
	//�Է¹��� �غ��� ���� ���� this() �޼ҵ带 ���� �ٸ� �����ڿ� ����
	public Rectangle(Rectangle ob) {
		this(ob.width, ob.height);
	}
	
	//������ ������ width�� height�� �̿��� ����ؼ� area�� �����ϴ� �޼ҵ�
	public void computeArea() {
		this.area = this.width * this.height;
	}
	
	//�簢�� ��ü�� ����(�غ�, ����, ����, ���)�� ����ϴ� �޼ҵ�
	public void show() {
		System.out.println("�簢��");
		System.out.println("�غ� = "+width);
		System.out.println("���� = "+height);
		System.out.println("���� = "+area);
		System.out.println("��� = "+shape+"\n");	
	}
	
}