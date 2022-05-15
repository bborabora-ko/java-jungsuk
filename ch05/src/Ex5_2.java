
public class Ex5_2 {
	public static void main(String[] args) {
		// 배열의 총합과 평균 구하기
		int[] score = { 100, 88, 100, 100, 90 };

		int sum = 0;
		float avg = 0f;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / (float) score.length;

		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
