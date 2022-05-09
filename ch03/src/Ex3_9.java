
public class Ex3_9 {

	public static void main(String[] args) {

		int a = 1_000_000; //1백만
		int b = 2_000_000; //2백만
		
		long c = a * b; // 2,000,000,000,000 이 아님 
		// 이유: int * int 계산 결과가 이미 int 범위를 벗어남 -> 오버플로우 발생
		// 오버플로우 발생한 이후 long으로 자동형변환됨
		
		System.out.println(c); // -1454759936
		
		// 해결
		c = (long) a * b; // a나 b를 long으로 형변환해줌
		System.out.println(c); // 2000000000000
		
		// 주의
//		c = (long) (a * b); 
//		System.out.println(c); //-1454759936, 형변환보다 연산이 먼저 이루어짐
	}

}
