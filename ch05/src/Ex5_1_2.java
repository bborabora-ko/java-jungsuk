import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.Random;

public class Ex5_1_2 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100, 95, 80,70,60}; //배열의 초기화 위,아래 둘다 가능
		int[] iArr3 = { 100, 94, 80, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd' };

		// 1~10까지의 숫자 iArr1 넣기
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}

		Random random = new Random();

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = random.nextInt(10)+1;
//			iArr2[i] = (int) (Math.random() * 10) + 1;
		}

		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ", ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		
		System.out.println(chArr);

	}

}
