package com.mycompany.ch02;

public class VariableEx {

		// TODO Auto-generated method stub

//			상수 표기법
			static final int SOCIAL_SECIRITY_NUMBER = 1111;

//			스네이크 표기법 (_붙이는거)
			int social_security_number;
			
//			파스칼 표기법: 클래스 (첫글자 대문자 이후도 대문자)
			int SocialSecurityNumber;
			
//			카멜 표기법: 변수, 함수 (첫글자만 소문자 이후는 대문자)
			int socialSecurityNumber;

			public static void main(String[] args) {
				
			
				int number = 1;
				int Number = 2;
				
				// 변수명은 대소문자를 구분한다.
				System.out.println(number + " : " + Number);
				
//				------
				
				int a;
				int b = 1;
				
				int c = 0;
				
				c = a + b;
				
//				처음부터 선언을 잘하는게 중요하다
				
//				------
				
				int d = 1;
				
				if(d == 1) {
					int aaa = 10;
					int bbb = aaa + d;
					System.out.println("bbb: " + bbb);
				} else {
					
				}
				
				System.out.println("aaa: " + aaa);
				System.out.println("bbb: " + bbb);
				System.out.println("d: " + d);
				
				// 결론 : 블럭안에서 선언된 변수는 블럭안에서만 작동한다.
	}

}
