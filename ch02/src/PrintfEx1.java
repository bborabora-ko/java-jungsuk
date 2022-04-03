
public class PrintfEx1 {

	public static void main(String[] args) {
//		System.out.println(10.0/3);
		
//		System.out.printf("%d%n", 15); //15
//		System.out.printf("%o%n", 15); //17
//		System.out.printf("%x%n", 15); //f
//		System.out.printf("%s", Integer.toBinaryString(15)); //1111, 15를 이진문자열로 변경
		
		//실수 표현
//		float f = 123.456789f;
//		System.out.printf("%f%n", f); //123.456787
//		
//		double d = 123.456789;
//		System.out.printf("%f%n", d); //123.456789
//		System.out.printf("%e%n", d); //1.234568e+02
//		System.out.printf("%g%n", d); //123.457
//		
//		System.out.printf("[%5d]", 10);
//		System.out.printf("[%5d]", 123456);
//		System.out.printf("[%-5d]", 10);
//		System.out.printf("[%05d]", 10);
		
		double d = 1.23456789;
		System.out.printf("%f%n", d); //1.234568
		System.out.printf("%14f%n", d); //      1.234568
		System.out.printf("%14.10f%n", d); //  1.2345678900
		System.out.printf("%.6f%n", d); //1.234568
		
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n", url); //[www.codechobo.com]
		System.out.printf("[%20s]%n", url); //[www.codechobo.com]
		System.out.printf("[%-20s]%n", url); //[www.codechobo.com]
		System.out.printf("[%.10s]%n", url); //[www.codechobo.com]
	}

}
