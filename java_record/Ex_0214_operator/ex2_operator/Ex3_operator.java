package ex2_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//��Ʈ������
		//&, |, ^, ~
		
		//���������ڿ� ���������� bit����(2����)�� ���길 �����ϴ�.
		//�Ϲ������� ��ȣȭ,��ȣȭ �۾��� ���ȴ�.
		
		int a = 10; //10�� 2������ ǥ���ϸ� -> 1010
		int b = 7; //7�� 2������ ǥ���ϸ� -> 0111
		int c = a & b; //������(and) - 2������ �ٲ��� �� �� ���� ��� 1�� ���� ����� 1, �������� 0
		System.out.println("c : " + c); //0010 = 2
		
		c = a | b; //������(or) - 2������ �ٲ��� �� �� ���� ��� 0�̸� 0, �������� 1
		System.out.println("c : " + c); //1111 = 15
		
		c = a ^ b; //��Ÿ��or(xor) - 2������ �ٲ��� �� �� ���� ���� ������ 0, �ٸ� ���� 1
		System.out.println("c : " + c); //1101 = 13
		
		System.out.println("c : " + ~c); //2�������� 0 -> 1, 1 -> 0���� ����
		System.out.println("--------------------------------------------");
		
		
		//����������
		//1�� ������Ű�ų� 1�� ���ҽ����ִ� ������
		//++, --
		
		//��������
		//������ �տ��� ����� �ȴ�.
		a= 10;
		System.out.println("++a : " +  ++a); //��� : 11
				
		//��������
		//������ �ڿ��� ����� �ȴ�.
		b = 10;
		System.out.println("b++ : " + b++); //��� : 10
		//1�� �����ֵ�, ���� ���� �ٽ� �� �� ���� �� ����ȴ�.
		System.out.println("b : " + b);
		
		a = 7;
		++a; //8
		++a; //9
		a++; //9(+1)
		++a; //11
		a++; //11(+1)
		a++; //12(+1)
		a++; //13(+1)
		System.out.println("a : " + a); //a -> 14
		System.out.println("-----------------------------------------");
		
		a = 10;
		b = 12;
			
		//����
		boolean result = ++a >= b || 2 + 7 <= b && 13 -b >= 0 && (a+=b) - (a % b) > 10;
		// 11 >= 12 || 9 <= 12 && 1 >=0 && 23 - 11 > 10;
		// 		false || true && true && true;
		//			true && true && true
		//				true && true
		//					true
		// ����: true?
		System.out.println("���� ���� : " + result);
		System.out.println("-------------------------------------------");
		
		
		/*
		 * �������� �ִ�.
		 * ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ����
		 * 5, 7, 5��.
		 * 
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ����ϰ�,
		 * �ð��� ��ü ������ ��� ���갳���� ����ϼ���.
		 * ��հ��� ��� ������  float���� ���� ��*/
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
	
		//�Ϸ翡 ����Ǵ� �� ����
		int total = pear + apple + orange;
		System.out.println("�Ϸ翡 ����Ǵ� ������ �� �� : " + total);
		
		//�ð��� ��ü ������ ��� ���갳��
		float avg = (float)total/24;
		//����/���� -> ����, �Ǽ�/���� -> �Ǽ�, ����/�Ǽ� -> �Ǽ�
		//�Ǽ�/�Ǽ� -> �Ǽ�
		System.out.println("�ð� �� ����Ǵ� ������ �� ���귮  : " + avg);
		
		
		
		
		
		
		
		
		
		
		
	}
}