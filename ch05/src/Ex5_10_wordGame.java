import java.util.Random;
import java.util.Scanner;

public class Ex5_10_wordGame {

	public static void main(String[] args) {
		// (이차원배열을 이용) 임의의 단어에 맞는 뜻을 입력하면 정답/오답을 알려주는 단어프로그램
		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" } };

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			int wordIndex = random.nextInt(words.length); // 임의의 단어 인덱스 생성
			System.out.printf("Q. %s의 뜻?", words[wordIndex][0]);

			String userAnswer = scanner.nextLine();
			String rightAnswer = words[wordIndex][1];

			if (userAnswer.equals(rightAnswer)) {
				System.out.println("정답입니다!");
			} else {
				System.out.printf("오답입니다! 정답은 %s 입니다.\n", rightAnswer);
			}

			System.out.print("종료하시려면 N을 눌러주세요. >");
			String userChoice = scanner.nextLine();
			if (userChoice.equalsIgnoreCase("N")) {
				break;
			} else {
				
			}

			// 사용자의 답과 정답 비교
		}

		scanner.close();

	}

}
