import java.util.Scanner;

public class Ex4_4 {
	public static void main(String[] args) {
		int score = 0; // 점수를 저장하기 위한 변수
		char grade = ' '; // 학점을 저장하기 위한 변수. 공백으로 초기화 했으나
						  // 기본값을 'D' 입력시 else 구문 생략 가능.
		
		System.out.println("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';	
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		scanner.close();
		
	}

}
