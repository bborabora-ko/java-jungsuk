
public class Ex5_3 {
	public static void main(String[] args) {
		// �迭���� �ִ밪 �ּҰ� ã��
		int[] score = { 79, 88, 92, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}

		System.out.println("max= " + max);
		System.out.println("min= " + min);

	}

}
