import java.util.*;

//실습 8
public class Demo {
	public static boolean check(String s){
		if (s.equals("{") || s.equals("}") || s.equals("(") || s.equals(")")) 
			return true;
		else 
			return false;
	}
	

	//실습9
	//괄호 짝이 맞는지 안맞는지 확인하는 메소드
	public static void checkPair(StringBuffer s, Stack<Character> k) {
			
		for (int i=0; i<s.length(); i++) {
				
			if (s.charAt(0)==')' || s.charAt(0)=='}') {	//닫힌 괄호로 시작한다면
				k.push('a');							//stack에 어떤 수 넣어줌(for문 나가서 "틀리다" if문에 걸리도록)
				break;
			}
				
			if (s.charAt(i)=='(' || s.charAt(i)=='{') {	//열린 괄호인 경우
				k.push(s.charAt(i));					//stack에 저장
			}
				
			else if (s.charAt(i)==')') {	//닫힌 소괄호인 경우
				if (k.peek()=='(')			//만약 stack의 맨 위에 열린 소괄호가 있다면
					k.pop();				//stack에서 열린 소괄호 삭제
			}
					
			else if (s.charAt(i)=='}') {	//닫힌 중괄호인 경우
				if (k.peek()=='{')			//만약 stack의 맨 위에 열린 중괄호가 있다면
					k.pop();				//stack에서 열린 중괄호 삭제
			}
		}
			
		if (k.empty()!=true) {				//stack k가 비어있지 않다면 (괄호쌍이 다 맞았다면 stack이 비어야 함)
			System.out.println("틀리다");
		}
			
		else
			System.out.println("맞다");
	}

	
	
	
	public static void main(String[] args) {
		//실습 8 : s2에 괄호만 저장
		String s = "{(a+b)*(c+d)+e}/{(f-(g-h))*(i+j)}";
		String s1;
		StringBuffer s2 = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s, "{}()", true);
		while (st.hasMoreTokens()) {
			s1 = st.nextToken();	
			if (check (s1)) 
				s2.append(s1);
		}		
		
		
		//실습9
		Stack<Character> k = new Stack<Character>();	//열린괄호 저장할 Stack
		
		checkPair(s2,k);	//괄호쌍이 잘 맞는지 확인하는 함수
	}
}