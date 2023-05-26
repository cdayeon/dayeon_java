package ex2_operator;

public class Ex2_operator {

	public static void main(String[] args) {
		//대입연산자
		//우변에 있는 값을 좌변에 대입한다 라는 점을 잊지 말자!!!
		
		int n1 = 10;
		int n2 = 7;
		
		System.out.println("=연산자 : n1 : " + n1 + ", n2 : " + n2);

		//복합대입연산자 : 산술연산자와 대입연산자가 합쳐진 형태(+=, -=, *=, /=, %=)
		//+=연산자  					n1 = n1 + n2;
		System.out.println("+=연산자 : n1 += n2 : " + (n1+=n2)); //17
		//누적합을 구할 때 +=연산자가 많이 사용된다.
		
		//-=연산자					n1 = n1 - n2;
		System.out.println("-=연산자 : n1 -= n2 : " + (n1-=n2)); //10
		
		//*=연산자					n1 = n1 * n2;
		System.out.println("*=연산자 : n1 *= n2 : " + (n1*=n2)); //70
		
		///=연산자					n1 = n1 / n2;
		System.out.println("/=연산자 : n1 /= n2 : " + (n1/=n2)); //10
		
		//%=연산자					n1 = n1 % n2;
		System.out.println("%=연산자 : n1 %= n2 : " + (n1%=n2)); //3
		System.out.println("-----------------------------------------");
		
		//비교연산자
		//두 수의 값을 비교할 때 사용하는 연산자
		//비교한 결과를 항상 논리형 데이터로(true, false)로 반환한다. (중요)
		//>(초과), <(미만), >=(이상), <=(이하), ==(같다), !=(같지 않다)
		
		n1 = 10;
		n2 = 7;
		
		boolean result;
		result = n1 < n2; //직접적인 연산을 출력문에 넣어주지 않고 연산을 변수에 담아서 변수를 출력하는 방식으로 하는 것이 좋다.
		System.out.println(result); //false;
		
		result = n1 == n2;
		System.out.println("==연산자 : " + result); //false;
		
		result = n1 != n2;
		System.out.println("!=연산자 : " + result); //true;
		System.out.println("----------------------------------------");
		
		//논리연산자
		//비교연산자를 통한 연산이 2개 이상 필요할 때 사용한다.
		//&&, ||, !
		//연산결과를 논리형 데이터로 반환한다.
		//&& : 앞 뒤의 연산이 모두 true여야 true를 반환한다.
		//And의 의미 '그리고'
		
		result = n1 > n2 && n1 != n2;
		System.out.println("&&연산자의 값 : " + result); //true
		
		//참&&참  -> 참
		//참&&거짓 -> 거짓
		//거짓&&참 -> 거짓 : 앞의 연산이 거짓이면 뒤의 연산을 진행하지 않는다.
		//거짓&&거짓 -> 거짓
		
		result = n1 > n2 && (n1+=2) != n2;
		System.out.println(result);
		System.out.println("n1의 값 : " + n1);
		
		
		
		//|| : 앞 뒤의 연산 중 둘 중 하나라도 참이면 참을 반환한다.
		//Or(또는)의 의미를 가지고 있다.
		
		result = n1 < n2 || n1 != n2;
		System.out.println("||연산자의 값 : " + result); //true
		
		//참||참 -> 참
		//참||거짓 -> 참 : 앞의 연산이 참이면 뒤의 연산을 진행하지 않는다.
		//거짓||참 -> 참
		//거짓||거짓 -> 거짓
		
		
		//!는 not의 의미를 가지고 있다. true -> false, false -> true로 바꿔준다.
		System.out.println("!연산자 : " + !result); //true -> false
		
		
		
		
		
		
	}

}
