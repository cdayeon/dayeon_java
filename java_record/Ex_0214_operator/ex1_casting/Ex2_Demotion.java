package ex1_casting;

public class Ex2_Demotion {

	public static void main(String[] args) {
		//ū �ڷ����� ���� �ڷ����� ����
		
		char c = 'B'; //2byte
		int i = c+1; //��������� Promotion casting
		//c = i; c�� 2byte, i�� 4byte�̹Ƿ� ���� �߻�
		c = (char)i;
		System.out.println("c�� ��: " + c);
		
		float f = 5.5f;
		int n1 = 0;
		
		n1 = (int)f; //���� 4byte���� �ڷ����� ��ġ���� ������ ���Ե��� �ʴ´�.
		System.out.println("n1�� ��: " + n1);
		//float���� int�� casting�Ǹ鼭 �Ҽ��� ���� �ڸ��� ����ϰ� �ȴ�.
		
		byte b3 = 100;
		byte b4 = 20;
		
		byte b5;
		b5 = (byte)(b3 + b4); //byte�� ���ְ� �Ǹ� b3���� ����ȯ�� ����Ǳ� ������ ()�� ������ ������ ����ȯ�� ������Ѵ�.
		System.out.println("b5�� ��: " + b5);
	}

}
