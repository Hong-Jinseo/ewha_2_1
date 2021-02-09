public class StudentManager {
	public static void main(String[] args) {
		
		// interface 배열 생성
		Student st[] = new Student[10];
		
		// 학부 2학기 한이화
		st[0] = new UnderGradStudent("한이화");
		st[0].addSemester(1, new double[] {70, 60, 40, 50, 80, 60});
		st[0].addSemester(2, new double[] {60, 80, 90, 50, 80, 90});
		
		// 대학원 3학기 최이화
		st[1] = new GradStudent("최이화");
		st[1].addSemester(1, new double[] {100, 70,  70});
		st[1].addSemester(2, new double[] {80, 88, 90});
		st[1].addSemester(3, new double[] {100, 90,  80});
				
		// 학부 3학기 김이화		
		st[2] = new UnderGradStudent("김이화");
		st[2].addSemester(1, new double[] {70, 80, 90, 50,  80, 60});
		st[2].addSemester(2, new double[] {50, 60, 40, 70, 100, 60});		
		st[2].addSemester(3, new double[] {80, 90, 70, 60,  90, 70});
		
		// 학부 3학기 정이화			
		st[3] = new UnderGradStudent("정이화");
		st[3].addSemester(1, new double[] {60, 90, 100, 90, 70, 80});
		st[3].addSemester(2, new double[] {50, 60, 40, 70, 100, 60});		
		st[3].addSemester(3, new double[] {70, 60, 40, 50,  80, 60});
		
		// 학부 5학기 성이화
		st[4] = new UnderGradStudent("성이화");
		st[4].addSemester(1, new double[] {60, 40, 70, 20, 30, 50});
		st[4].addSemester(2, new double[] {40, 50 ,40, 80, 30, 70});		
		st[4].addSemester(3, new double[] {70, 70, 80, 80, 60, 90});
		st[4].addSemester(4, new double[] {70, 80, 80, 80, 90, 90});		
		st[4].addSemester(5, new double[] {80, 80, 100, 100, 90, 90});
		
		// 학부 3학기 홍이화			
		st[5] = new UnderGradStudent("홍이화");
		st[5].addSemester(1, new double[] {30, 40, 50, 90, 90, 100});
		st[5].addSemester(2, new double[] {30, 40, 90, 90, 100, 100});		
		st[5].addSemester(3, new double[] {70, 90, 100, 100, 100, 100});
		
		// 대학원 1학기 박이화			
		st[6] = new GradStudent("박이화");
		st[6].addSemester(1, new double[] {80, 80, 100});		
		
		// 대학원 4학기 노이화			
		st[7] = new GradStudent("노이화");
		st[7].addSemester(1, new double[] {40, 70, 20});
		st[7].addSemester(2, new double[] {60, 40, 50});		
		st[7].addSemester(3, new double[] {90, 70, 60});
		st[7].addSemester(4, new double[] {80, 90, 90});
		
		// 학부 6학기 신이화			
		st[8] = new UnderGradStudent("신이화");
		st[8].addSemester(1, new double[] {0, 0, 40, 50, 60, 70});
		st[8].addSemester(2, new double[] {80, 30, 70, 50, 60, 40});		
		st[8].addSemester(3, new double[] {90, 80, 80, 100, 70, 60});
		st[8].addSemester(4, new double[] {80, 90, 50, 80, 90, 70});
		st[8].addSemester(5, new double[] {90, 90, 90, 90, 100, 100});		
		st[8].addSemester(6, new double[] {100, 100, 70, 50, 50, 50});
		
		// 대학원 2학기 윤이화			
		st[9] = new GradStudent("윤이화");
		st[9].addSemester(1, new double[] {70, 70, 90});
		st[9].addSemester(2, new double[] {50, 70, 40});
		
		
		// 학생 정보 전체 출력
		System.out.println();
		System.out.println("** 전체 학생 기록 **");
		for (int i= 0; i < st.length; i++){
			st[i].showStudentInfo();
			st[i].showScore();
			st[i].showTotAvg();
		}		

		
		// 학부 3학기 학생들 정보 출력
		System.out.println();
		System.out.println();
		System.out.println("** 학부 3학기 학생 기록 **");
		
		for (int i=0; i<st.length; i++) {
			if (st[i] instanceof UnderGradStudent) {//학부생 클래스에 속하는지 확인
				if (st[i].getSemester() == 3){		//3학기 재학중인지 확인
					st[i].showStudentInfo();
					st[i].showScore();
					st[i].showTotAvg();
				}
			}
		}
	}
}
