import java.util.Arrays;

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
		
		
		//배열의 길이 예제
		int[] arr = new int[5]; // 배열의 길이가 5인 배열arr생성
		System.out.println("arr.length=" + arr.length);
		
		//배열의 모든 요소 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d%n", i, arr[i]);
		}
		
		
		//배열의 출력
		int[] iArr = {100, 95, 80, 70, 60};
		System.out.println(iArr); //[I@357246de
		System.out.println(Arrays.toString(iArr)); //[100, 95, 80, 70, 60]
		
	}
	
	

}
