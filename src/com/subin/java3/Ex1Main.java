package com.subin.java3;

public class Ex1Main {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.setAge(10);
		member.setId("지수빈");
		member.setMuge(60);
		member.setKi(179);
		
		int age = member.getAge();
		String id = member.getId();
		int muge = member.getMuge();
		int ki = member.getKi();
		
		System.out.println(age);
		System.out.println(id);
		System.out.println(muge);
		System.out.println(ki);
		//member.info();
	}

}
