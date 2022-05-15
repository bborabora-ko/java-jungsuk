import java.util.Arrays;

public class Ex5_1_tmp {

	public static void main(String[] args) {
		// 가위,바위,보 게임(랜덤으로 하나가 나오도록)
		
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		//0~2 중 랜덤으로 숫자발생
		int num = (int)(Math.random()*3);
		
		//해당숫자를 인덱스로 해당 배열요소 화면 출력
		System.out.println(strArr[num]);
	}

}
