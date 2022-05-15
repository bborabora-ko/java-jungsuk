
public class Ex5_1 {
	public static void main(String[] args) {
		int[] score; //참조변수 선언
		score = new int[5]; //배열의 생성
		
//		int[] score = new int[5]; //배열의 선언과 생성을 동시에
		score[3] = 100;
		
		for(int i = 0; i<=4; i++) {
			System.out.println("score["+i+"]=" + score[i]);
		}
		
		int value = score[3];
		System.out.println("value=" + value);
	}

}
