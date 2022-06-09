package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent{
	public void printMembers() {
//		System.out.println(prv); //에러. 다른패키지니까
//		System.out.println(dft); //에러. 다른패키지니까
		System.out.println(prt); //ok
		System.out.println(pub); //ok		
	}
}

public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); //에러. 
//		System.out.println(p.dft); //에러.
//		System.out.println(p.prt); //에러. 다른패키지+자손클래스가 아니니까
		System.out.println(p.pub); //ok
		
	}
}



