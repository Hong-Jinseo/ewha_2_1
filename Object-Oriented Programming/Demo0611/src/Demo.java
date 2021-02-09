import java.util.*;

public class Demo {

	//대칭인지 아닌지 확인하는 메소드
	public static boolean checkPair(String[] p, Stack<String> s) {
 
		for (int i=0; i<p.length/2; i++)	//배열 처음부터 '#' 전까지
				s.add(p[i]);				//stack에 순서대로 넣어줌
			
		for (int j=(p.length+1)/2; j<p.length; j++) { 	//배열 '#' 다음부터 끝까지
			if (p[j].equals(s.peek()))					//stack의 top 값과 비교
				s.pop();								//같으면 stack값 없앰
			else
				return false;							//같지 않으면 false를 return
		}
		return true;
	}

	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String in = "a b a b c c c # c c c b a b a";
		boolean check = true;
		
		String p[] = in.split(" ");
		
		check = checkPair(p, stack);		//checkPair에서 return 받은 boolean값 저장
		
		if (check==true)
			System.out.println("대칭이다.");
		
		if (check==false)
			System.out.println("대칭이 아니다.");
	}
}
