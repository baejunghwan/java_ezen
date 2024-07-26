package com.mycompany.ch02;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double doubleVal = 10;
		
		float floatVal = (float) doubleVal;
		System.out.println("floatVal: " + floatVal);
		
		long longVal = (long) floatVal;
		System.out.println("longVal: " + longVal);
		
		int intVal = (int) longVal;
		System.out.println("intVal: " + intVal);
		
		short shortVal = (short) intVal;
		System.out.println("shortVal: " + shortVal);
		
		byte byteVal = (byte) shortVal;
		System.out.println("byteVal: " + byteVal);
		
		String val = 10;
		int val2 = 10;
		int result = 0;
		
		//result = val + val2;
		result = Integer.parseInt(val) + val2;
		//java는 데이터 타입이 다른것끼리는 연산이 안된다. > integer등 casting으로 형변환해주면 연산이 가능해진다.
		
		System.out.println("result: " + result);
		// 데이터 타입을 정할때 큰 > 작게 하면 db손실이 있을수있다.
		
	}

}
