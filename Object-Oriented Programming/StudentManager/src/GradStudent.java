
public class GradStudent implements Student {
	
	String name;
	int semester=0;
	double sum=0;		//���б� ���� ����
	double[] avg = new double[5];	//���б� ���� ��� ������ 2���� �迭
	public double yearSum;	//��ü�б� ���� ����
	public double yearAvg; 	//��ü�б� ���� ���
	double[][] score = new double[5][3];	//���� ������ 2���� �迭
	//������
	public GradStudent(String name) {
		this.name = name;
	}

	
	//�л� ���� ���
	public void showStudentInfo(){
		System.out.println("\n==================================================");
		System.out.println("���п� "+semester+"�б� "+name);
	}
	
	
	//i�б� ���� ���� ���
	public void addSemester(int i, double s[]) {
		//�б� ���� �޾Ƽ� score �迭�� ����
		System.arraycopy(s, 0, score[i], 0, 3);	
		semester++;	//�� �� �Է¹��� ������ �б� 1�� ����
		sum=0;
		
		//�б⺰ ��� ���� ����ؼ� avg �迭�� ����
		for (int j=0; j<3; j++) {
			sum += score[semester][j];	//�� �б� ���� ����
			avg[semester] = sum/3;		//�� �б� ���� ����/3���� = ���б� ���
		}
		
		//��������� �� ��� ������Ʈ
		yearSum += avg[semester];		//�б⺰ ��� ���� ����
		yearAvg = yearSum/semester;		//�б⺰ ��� ���� ����/�б� �� = ��ü �б� ���
	}
	
	
	//�б� ���� ���
	public void showScore() {
		for (int j=0; j<this.semester; j++) {
			sum=0;
			System.out.printf("%d�б� :",j+1);
			for (int k=0; k<3; k++) {
				System.out.print(score[j+1][k]+" ");
				sum += score[j+1][k];
			}
			System.out.printf("�б� ��� = %.2f",avg[j+1]);	//���б� ��� ����
			System.out.printf("\n");	
		}
	} 
	
	
	//��������� ��� ���� ���
	public void showTotAvg() {
		System.out.printf("����� = %.2f \n",yearAvg);
	}
	
	
	//�� �б���ΰ��� ��ȯ
	public int getSemester() {
		return semester;
	}
	

}