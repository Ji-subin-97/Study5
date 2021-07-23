package com.subin.java4;

public class StaticTest {
	
	//접근지정자 [그 외지정자] 데이터타입
	public static int num=10;
	public int num2=10;
	
	//접근지정자 [그 외지정자] 리턴타입 메서드명 ([매개변수]){}
	public static void staticMethod() {
		System.out.println("Static Method");
		System.out.println(StaticTest.num);
//		System.out.println(this.num);
	}
	
	public void instanceMethod() {
		System.out.println("Instance Method");
		System.out.println(StaticTest.num);
		System.out.println(this.num2);
	}
	
}
