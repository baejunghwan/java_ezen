package com.mycompany.ch02;

public class FloatDoubleEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 범위가 큰 계산을 할때는 보통 double을 많이 쓴다.
		float var1 = 3.14f;
		
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		// 정밀도 테스트
		double var4 = 0.123456789;
		float var5 = 0.123456789F;
		
		System.out.println(var4);
		System.out.println(var5);
		
		
	}

}
