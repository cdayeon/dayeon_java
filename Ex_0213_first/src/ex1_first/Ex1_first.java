package ex1_first;


public class Ex1_first {
	public static void main(String[] args) {
		//main 적고 ctrl + space
		
		//주석 : 프로그램의 소스코드에 프로그래머의 의견이나 설명을 적을 수 있는 코드.
		//프로그램 소스 중간에 삽입하더라도 프로그램의 수행에 전혀 영향을 끼치지 않는다.
		//컴퓨터(jvm)에서 컴파일을 할 시 인식하지 못하는 코드이기 때문이다.
		//한줄 주석: //
		/* 여
		 * 러
		 * 줄
		 * 주
		 * 석
		 */
		// 여러 줄 주석을 할 경우 드래그해서 ctrl+/누르면 한 번에 여러줄 주석처리 가능하다.
		
		//sysout 적고 ctrl + space
		//System.out.println("hello world");
		
		
		/*
		 * jvm란?
		 * 자바 가상 머신(Java Virtual Machine)
		 * 자바 코드를 컴파일 하여 바이트 코드로 만들면 이 코드가 자바 가상 머신 환경에서 실행된다.
		 * jvm은 자바 실행 환경 에 포함되어 있다.
		 * 여기서 바이트 코드란 1과 0으로 이루어진 코드를 말한다.*/
		
		/*
		 * 컴파일이란?
		 * 프로그래머가 작성한 .java(자바코드)를 .class(바이트 코드)로 바꾸는 일련의 과정을 말한다.
		 * */
		
		System.out.println("hello world");
		System.out.println(100);
		System.out.println(100+50);
		
		//문장 뒤에 숫자를 더하면 문장 뒤에 붙는다.
		System.out.println("안녕하세요" + 10);
		
		//실질적인 계산은 15+":510"으로 이루어진다.
		System.out.println(5+10+":"+5+10);
		//()가 있어야 숫자 계산이 가능해진다.
		System.out.println(5+10+":"+(5+10));
		
		//"2 + 2 = " 숫자처럼 보이지만 ""안에 묶여있으면 문장 취급을 받는다.
		System.out.println("2 + 2 = " + 2+2);
		System.out.println("2 + 2 = " + (2+2));
		
	}
}

