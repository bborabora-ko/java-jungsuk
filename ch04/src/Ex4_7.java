
public class Ex4_7 {
	public static void main(String[] args) {
		int num = 0;

		// 1. 1~10 ������ ������ 20�� ����ϱ�
		for (int i = 0; i <= 20; i++) {
			System.out.println((int) (Math.random() * 10) + 1);
		}

		// 2. -5~5 ������ ������ 20�� ����Ͻÿ�.
		for (int i = 0; i <= 20; i++) {
			System.out.println((int) (Math.random() * 11) - 5); 
		}

	}
}

