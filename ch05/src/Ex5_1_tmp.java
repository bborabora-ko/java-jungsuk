import java.util.Arrays;

public class Ex5_1_tmp {

	public static void main(String[] args) {
		// ����,����,�� ����(�������� �ϳ��� ��������)
		
		String[] strArr = {"����", "����", "��"};
		System.out.println(Arrays.toString(strArr));
		
		//0~2 �� �������� ���ڹ߻�
		int num = (int)(Math.random()*3);
		
		//�ش���ڸ� �ε����� �ش� �迭��� ȭ�� ���
		System.out.println(strArr[num]);
	}

}
