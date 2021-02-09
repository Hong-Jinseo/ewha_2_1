public class StudentManager {
	public static void main(String[] args) {
		
		// interface �迭 ����
		Student st[] = new Student[10];
		
		// �к� 2�б� ����ȭ
		st[0] = new UnderGradStudent("����ȭ");
		st[0].addSemester(1, new double[] {70, 60, 40, 50, 80, 60});
		st[0].addSemester(2, new double[] {60, 80, 90, 50, 80, 90});
		
		// ���п� 3�б� ����ȭ
		st[1] = new GradStudent("����ȭ");
		st[1].addSemester(1, new double[] {100, 70,  70});
		st[1].addSemester(2, new double[] {80, 88, 90});
		st[1].addSemester(3, new double[] {100, 90,  80});
				
		// �к� 3�б� ����ȭ		
		st[2] = new UnderGradStudent("����ȭ");
		st[2].addSemester(1, new double[] {70, 80, 90, 50,  80, 60});
		st[2].addSemester(2, new double[] {50, 60, 40, 70, 100, 60});		
		st[2].addSemester(3, new double[] {80, 90, 70, 60,  90, 70});
		
		// �к� 3�б� ����ȭ			
		st[3] = new UnderGradStudent("����ȭ");
		st[3].addSemester(1, new double[] {60, 90, 100, 90, 70, 80});
		st[3].addSemester(2, new double[] {50, 60, 40, 70, 100, 60});		
		st[3].addSemester(3, new double[] {70, 60, 40, 50,  80, 60});
		
		// �к� 5�б� ����ȭ
		st[4] = new UnderGradStudent("����ȭ");
		st[4].addSemester(1, new double[] {60, 40, 70, 20, 30, 50});
		st[4].addSemester(2, new double[] {40, 50 ,40, 80, 30, 70});		
		st[4].addSemester(3, new double[] {70, 70, 80, 80, 60, 90});
		st[4].addSemester(4, new double[] {70, 80, 80, 80, 90, 90});		
		st[4].addSemester(5, new double[] {80, 80, 100, 100, 90, 90});
		
		// �к� 3�б� ȫ��ȭ			
		st[5] = new UnderGradStudent("ȫ��ȭ");
		st[5].addSemester(1, new double[] {30, 40, 50, 90, 90, 100});
		st[5].addSemester(2, new double[] {30, 40, 90, 90, 100, 100});		
		st[5].addSemester(3, new double[] {70, 90, 100, 100, 100, 100});
		
		// ���п� 1�б� ����ȭ			
		st[6] = new GradStudent("����ȭ");
		st[6].addSemester(1, new double[] {80, 80, 100});		
		
		// ���п� 4�б� ����ȭ			
		st[7] = new GradStudent("����ȭ");
		st[7].addSemester(1, new double[] {40, 70, 20});
		st[7].addSemester(2, new double[] {60, 40, 50});		
		st[7].addSemester(3, new double[] {90, 70, 60});
		st[7].addSemester(4, new double[] {80, 90, 90});
		
		// �к� 6�б� ����ȭ			
		st[8] = new UnderGradStudent("����ȭ");
		st[8].addSemester(1, new double[] {0, 0, 40, 50, 60, 70});
		st[8].addSemester(2, new double[] {80, 30, 70, 50, 60, 40});		
		st[8].addSemester(3, new double[] {90, 80, 80, 100, 70, 60});
		st[8].addSemester(4, new double[] {80, 90, 50, 80, 90, 70});
		st[8].addSemester(5, new double[] {90, 90, 90, 90, 100, 100});		
		st[8].addSemester(6, new double[] {100, 100, 70, 50, 50, 50});
		
		// ���п� 2�б� ����ȭ			
		st[9] = new GradStudent("����ȭ");
		st[9].addSemester(1, new double[] {70, 70, 90});
		st[9].addSemester(2, new double[] {50, 70, 40});
		
		
		// �л� ���� ��ü ���
		System.out.println();
		System.out.println("** ��ü �л� ��� **");
		for (int i= 0; i < st.length; i++){
			st[i].showStudentInfo();
			st[i].showScore();
			st[i].showTotAvg();
		}		

		
		// �к� 3�б� �л��� ���� ���
		System.out.println();
		System.out.println();
		System.out.println("** �к� 3�б� �л� ��� **");
		
		for (int i=0; i<st.length; i++) {
			if (st[i] instanceof UnderGradStudent) {//�кλ� Ŭ������ ���ϴ��� Ȯ��
				if (st[i].getSemester() == 3){		//3�б� ���������� Ȯ��
					st[i].showStudentInfo();
					st[i].showScore();
					st[i].showTotAvg();
				}
			}
		}
	}
}
