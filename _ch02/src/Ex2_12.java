
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3"; //���ڿ�3
		
		System.out.println(str.charAt(0) - '0'); //����3 -> ����3
		System.out.println('3' - '0' +1); //4
		System.out.println(Integer.parseInt(str)+ 1); //4
		System.out.println("3" + 1); //���ڿ� 31
		
		System.out.println('3' - '0'); //����3
		System.out.println(3 + '0'); //51 
		// ���ڿ� ���ڸ� ���� �� �����Ƿ� '0'�� ���ڷ� 48�� �Ǿ� ���� -> 51
		// 51�� charŸ������ ����ȯ�� �ؾ� ����3 ����
		System.out.println((char)(3 + '0'));//����3
		
		char cha = 65;
		System.out.println(cha);

		
		
		
	}

}
