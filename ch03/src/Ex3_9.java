
public class Ex3_9 {

	public static void main(String[] args) {

		int a = 1_000_000; //1�鸸
		int b = 2_000_000; //2�鸸
		
		long c = a * b; // 2,000,000,000,000 �� �ƴ� 
		// ����: int * int ��� ����� �̹� int ������ ��� -> �����÷ο� �߻�
		// �����÷ο� �߻��� ���� long���� �ڵ�����ȯ��
		
		System.out.println(c); // -1454759936
		
		// �ذ�
		c = (long) a * b; // a�� b�� long���� ����ȯ����
		System.out.println(c); // 2000000000000
		
		// ����
//		c = (long) (a * b); 
//		System.out.println(c); //-1454759936, ����ȯ���� ������ ���� �̷����
	}

}
