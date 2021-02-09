import java.util.*;

public class Demo {

	//��Ī���� �ƴ��� Ȯ���ϴ� �޼ҵ�
	public static boolean checkPair(String[] p, Stack<String> s) {
 
		for (int i=0; i<p.length/2; i++)	//�迭 ó������ '#' ������
				s.add(p[i]);				//stack�� ������� �־���
			
		for (int j=(p.length+1)/2; j<p.length; j++) { 	//�迭 '#' �������� ������
			if (p[j].equals(s.peek()))					//stack�� top ���� ��
				s.pop();								//������ stack�� ����
			else
				return false;							//���� ������ false�� return
		}
		return true;
	}

	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String in = "a b a b c c c # c c c b a b a";
		boolean check = true;
		
		String p[] = in.split(" ");
		
		check = checkPair(p, stack);		//checkPair���� return ���� boolean�� ����
		
		if (check==true)
			System.out.println("��Ī�̴�.");
		
		if (check==false)
			System.out.println("��Ī�� �ƴϴ�.");
	}
}
