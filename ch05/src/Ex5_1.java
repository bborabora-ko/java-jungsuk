import java.util.Arrays;

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
		
		
		//�迭�� ���� ����
		int[] arr = new int[5]; // �迭�� ���̰� 5�� �迭arr����
		System.out.println("arr.length=" + arr.length);
		
		//�迭�� ��� ��� ���
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d%n", i, arr[i]);
		}
		
		
		//�迭�� ���
		int[] iArr = {100, 95, 80, 70, 60};
		System.out.println(iArr); //[I@357246de
		System.out.println(Arrays.toString(iArr)); //[100, 95, 80, 70, 60]
		
	}
	
	

}
