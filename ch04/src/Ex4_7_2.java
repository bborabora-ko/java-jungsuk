
import java.util.Random;

public class Ex4_7_2 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		// 0~9까지의 난수 10개 출력
		for (int i = 0; i<= 10; i++) {
			System.out.println(i + "번째 " + random.nextInt(10));
		}
	}
}
