
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

	}

}
