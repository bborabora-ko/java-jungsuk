
public class VarEx3 {

	public static void main(String[] args) {
		// ���� �� ���� ����
		int score = 100;
		score = 200;		
		System.out.println(score); //200
		
		// ��� �� ���� �Ұ�
		final int SCORE2 = 100;
//		SCORE2 = 200; // �����߻�		
		System.out.println(SCORE2); //100
		
		boolean power = true;
//		boolean power = 0; //����
		System.out.println(power); //true
		
//		byte b = 128; //���� byteŸ���� ���� -128~127
		byte b = -128;
		int oct = 010; //8����, 8
		int hex = 0x10; //16����, 16
		System.out.println(oct); //8
		System.out.println(hex); //16. println�� 10������ ��°���
		
//		long l = 10_000_000_000; //����. ���� int������ �Ѿ
		long l = 10_000_000_000L; 
		
//		float f = 3.14; //����.
		
		System.out.println(10.0); //10.0
		System.out.println(.10); //0.1
		System.out.println(10f); //10.0, ���̻�� ��µ��� ����
		System.out.println(1e3); //1000.0
		

	}

}
