import java.util.Arrays;

public class Ex5_5 {
	public static void main(String[] args) {
		// �ζ� ��ȣ �����
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		System.out.println(Arrays.toString(ball));

		int tmp = 0; // �ΰ��� �ٲٴµ� ����� �ӽú���
		int j = 0; // ������ ���� �� ������ ����

		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); //0~44����
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println("ball[" + i + "]=" + ball[i]);
		}
	}
}
