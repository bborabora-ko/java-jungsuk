
public class Ex5_1 {
	public static void main(String[] args) {
		int[] score; //�������� ����
		score = new int[5]; //�迭�� ����
		
//		int[] score = new int[5]; //�迭�� ����� ������ ���ÿ�
		score[3] = 100;
		
		for(int i = 0; i<=4; i++) {
			System.out.println("score["+i+"]=" + score[i]);
		}
		
		int value = score[3];
		System.out.println("value=" + value);
	}

}
