import java.util.Arrays;

public class Ex5_5 {
	public static void main(String[] args) {
		// 로또 번호 만들기
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		System.out.println(Arrays.toString(ball));

		int tmp = 0; // 두값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수

		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째 부터 5번째 요소까지 모두 6개반 바꾼다.
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); //0~44범위
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println("ball[" + i + "]=" + ball[i]);
		}
	}
}
