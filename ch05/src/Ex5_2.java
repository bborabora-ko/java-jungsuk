
public class Ex5_2 {
	public static void main(String[] args) {
		// �迭�� ���հ� ��� ���ϱ�
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
