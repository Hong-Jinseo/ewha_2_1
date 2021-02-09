
public class UnderGradStudent implements Student {
	
	String name;
	int semester=0;
	double sum=0;		//한학기 성적 총합
	double[] avg = new double[9];	//한학기 성정 평균 저장할 2차원 배열
	public double yearSum;	//전체학기 성적 총합
	public double yearAvg; 	//전체학기 성적 평균
	double[][] score = new double[9][6];	//성적 저장할 2차원 배열
	//생성자
	public UnderGradStudent(String name) {
		this.name = name;
	}

	
	//학생 정보 출력
	public void showStudentInfo(){
		System.out.println("\n==================================================");
		System.out.println("학부 "+semester+"학기 "+name);
	}
	
	
	//i학기 과목 점수 기록
	public void addSemester(int i, double s[]) {
		//학기 성적 받아서 score 배열에 저장
		System.arraycopy(s, 0, score[i], 0, 6);	
		semester++;	//한 번 입력받을 때마다 학기 1씩 증가
		sum=0;
		
		//학기별 평균 성적 계산해서 avg 배열에 저장
		for (int j=0; j<6; j++) {
			sum += score[semester][j];	//한 학기 성적 총합
			avg[semester] = sum/6;		//한 학기 성적 총합/6과목 = 한학기 평균
		}
		
		//현재까지의 총 평균 업데이트
		yearSum += avg[semester];		//학기별 평균 성적 총합
		yearAvg = yearSum/semester;		//학기별 평균 성적 총합/학기 수 = 전체 학기 평균
	}
	
	
	//학기 성적 출력
	public void showScore() {
		for (int j=0; j<this.semester; j++) {
			sum=0;
			System.out.printf("%d학기 :",j+1);
			for (int k=0; k<6; k++) {
				System.out.print(score[j+1][k]+" ");
				sum += score[j+1][k];
			}
			System.out.printf("학기 평균 = %.2f",avg[j+1]);	//한학기 평균 점수
			System.out.printf("\n");	
		}
	} 
	
	
	//현재까지의 평균 성적 출력
	public void showTotAvg() {
		System.out.printf("총평균 = %.2f \n",yearAvg);
	}
	
	
	//몇 학기생인가를 반환
	public int getSemester() {
		return semester;
	}
	

}
