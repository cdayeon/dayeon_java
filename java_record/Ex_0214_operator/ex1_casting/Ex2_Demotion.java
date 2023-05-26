package ex1_casting;

public class Ex2_Demotion {

	public static void main(String[] args) {
		//큰 자료형을 작은 자료형에 대입
		
		char c = 'B'; //2byte
		int i = c+1; //여기까지는 Promotion casting
		//c = i; c는 2byte, i는 4byte이므로 오류 발생
		c = (char)i;
		System.out.println("c의 값: " + c);
		
		float f = 5.5f;
		int n1 = 0;
		
		n1 = (int)f; //같은 4byte여도 자료형이 일치하지 않으면 대입되지 않는다.
		System.out.println("n1의 값: " + n1);
		//float에서 int로 casting되면서 소수점 이하 자리를 상실하게 된다.
		
		byte b3 = 100;
		byte b4 = 20;
		
		byte b5;
		b5 = (byte)(b3 + b4); //byte만 써주게 되면 b3에만 형변환이 적용되기 때문에 ()로 묶어준 다음에 형변환을 해줘야한다.
		System.out.println("b5의 값: " + b5);
	}

}
