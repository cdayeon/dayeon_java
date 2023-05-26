package ex1_casting;

public class Ex1_Promotion {

	public static void main(String[] args) {
		//형변환 : 자료형을 바꿔주는 것
		// - Promotion : 작은 자료형을 큰 자료형에다 대입하는 것 (자동형변환, 암시적형변환)
		// - Demotion : 큰 자료형을 작은 자료형에다 대입하는 것 (강제형변환, 명시적형변환)

		double d = 100.5; //8byte
		int i = 200; //4byte
		d = i; //변수의 대입을 보여주고 있다.
		System.out.println("d의 값: " + d); //결과: 200.0
		
		char c = 'A'; //2byte
		long l = 100; //8byte
		
		l = c;
		System.out.println("l의 값: " + l); //'A'의 아스키코드값은 65이기 때문에 문자형이 정수형으로 형변환이 가능하다. 결과: 65
		
		
		
	}

}
