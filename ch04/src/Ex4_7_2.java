
import java.util.Random;

public class Ex4_7_2 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		// 0~9������ ���� 10�� ���
		for (int i = 0; i<= 10; i++) {
			System.out.println(i + "��° " + random.nextInt(10));
		}
	}
}
