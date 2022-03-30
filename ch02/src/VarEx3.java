
public class VarEx3 {

	public static void main(String[] args) {
		// 변수 값 변경 가능
		int score = 100;
		score = 200;		
		System.out.println(score); //200
		
		// 상수 값 변경 불가
		final int SCORE2 = 100;
//		SCORE2 = 200; // 에러발생		
		System.out.println(SCORE2); //100
		
		boolean power = true;
//		boolean power = 0; //에러
		System.out.println(power); //true
		
//		byte b = 128; //에러 byte타입의 범위 -128~127
		byte b = -128;
		int oct = 010; //8진수, 8
		int hex = 0x10; //16진수, 16
		System.out.println(oct); //8
		System.out.println(hex); //16. println은 10진수만 출력가능
		
//		long l = 10_000_000_000; //에러. 값이 int범위를 넘어섬
		long l = 10_000_000_000L; 
		
//		float f = 3.14; //에러.
		
		System.out.println(10.0); //10.0
		System.out.println(.10); //0.1
		System.out.println(10f); //10.0, 접미사는 출력되지 않음
		System.out.println(1e3); //1000.0
		

	}

}
