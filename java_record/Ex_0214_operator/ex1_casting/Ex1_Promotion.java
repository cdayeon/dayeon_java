package ex1_casting;

public class Ex1_Promotion {

	public static void main(String[] args) {
		//����ȯ : �ڷ����� �ٲ��ִ� ��
		// - Promotion : ���� �ڷ����� ū �ڷ������� �����ϴ� �� (�ڵ�����ȯ, �Ͻ�������ȯ)
		// - Demotion : ū �ڷ����� ���� �ڷ������� �����ϴ� �� (��������ȯ, ���������ȯ)

		double d = 100.5; //8byte
		int i = 200; //4byte
		d = i; //������ ������ �����ְ� �ִ�.
		System.out.println("d�� ��: " + d); //���: 200.0
		
		char c = 'A'; //2byte
		long l = 100; //8byte
		
		l = c;
		System.out.println("l�� ��: " + l); //'A'�� �ƽ�Ű�ڵ尪�� 65�̱� ������ �������� ���������� ����ȯ�� �����ϴ�. ���: 65
		
		
		
	}

}
