import java.util.function.BiConsumer;

public class Ex4_14 {
	public static void main(String[] args) {
		int num = 12345, sum = 0;

//		for(num=12345; num > 0 ; num = num /10) {
//		System.out.println(num%10);
//		sum += num%10;
//		}
//		System.out.println(sum);

		/* �� �ڵ�: �� x�� y�� ���� �ٽ� �����ߴ���? */
//		System.out.println(12345 % 10);
//		int x = num;
//		while (x != 0) {
//			int y = x % 10;
//			x = x / 10;
//			sum += y;
//			System.out.println("x=" + x + " sum=" + sum);
//		}
		

		while (num >0) {
			sum += num % 10;
			System.out.println("sum=" + sum + ", num%10=" + num%10);
			num = num / 10;
	
		}

		System.out.println("�� �ڸ����� �� : " + sum);

	}
}
