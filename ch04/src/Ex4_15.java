import java.util.Scanner;

public class Ex4_15 {
	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1~100 사이의 난수
		System.out.println(answer); //정답
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 입력");
			} else if(input < answer) {
				System.out.println(" 더 큰 수로 다시 입력");
			}
		} while (input != answer);
		
		System.out.println("정답입니다!");
	}
}
