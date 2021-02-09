import java.util.*;

//�ǽ� 8
public class Demo {
	public static boolean check(String s){
		if (s.equals("{") || s.equals("}") || s.equals("(") || s.equals(")")) 
			return true;
		else 
			return false;
	}
	

	//�ǽ�9
	//��ȣ ¦�� �´��� �ȸ´��� Ȯ���ϴ� �޼ҵ�
	public static void checkPair(StringBuffer s, Stack<Character> k) {
			
		for (int i=0; i<s.length(); i++) {
				
			if (s.charAt(0)==')' || s.charAt(0)=='}') {	//���� ��ȣ�� �����Ѵٸ�
				k.push('a');							//stack�� � �� �־���(for�� ������ "Ʋ����" if���� �ɸ�����)
				break;
			}
				
			if (s.charAt(i)=='(' || s.charAt(i)=='{') {	//���� ��ȣ�� ���
				k.push(s.charAt(i));					//stack�� ����
			}
				
			else if (s.charAt(i)==')') {	//���� �Ұ�ȣ�� ���
				if (k.peek()=='(')			//���� stack�� �� ���� ���� �Ұ�ȣ�� �ִٸ�
					k.pop();				//stack���� ���� �Ұ�ȣ ����
			}
					
			else if (s.charAt(i)=='}') {	//���� �߰�ȣ�� ���
				if (k.peek()=='{')			//���� stack�� �� ���� ���� �߰�ȣ�� �ִٸ�
					k.pop();				//stack���� ���� �߰�ȣ ����
			}
		}
			
		if (k.empty()!=true) {				//stack k�� ������� �ʴٸ� (��ȣ���� �� �¾Ҵٸ� stack�� ���� ��)
			System.out.println("Ʋ����");
		}
			
		else
			System.out.println("�´�");
	}

	
	
	
	public static void main(String[] args) {
		//�ǽ� 8 : s2�� ��ȣ�� ����
		String s = "{(a+b)*(c+d)+e}/{(f-(g-h))*(i+j)}";
		String s1;
		StringBuffer s2 = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s, "{}()", true);
		while (st.hasMoreTokens()) {
			s1 = st.nextToken();	
			if (check (s1)) 
				s2.append(s1);
		}		
		
		
		//�ǽ�9
		Stack<Character> k = new Stack<Character>();	//������ȣ ������ Stack
		
		checkPair(s2,k);	//��ȣ���� �� �´��� Ȯ���ϴ� �Լ�
	}
}