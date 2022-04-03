
import java.util.*; //1. import문 추가

public class ScanfEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //2. Scanner클래스의 객체 생성
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num3 = Integer.parseInt(input); 
		System.out.println(num3); //문자 100출력
		
		

	}

}
