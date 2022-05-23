
import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		// (이차원배열을 이용) 단어 프로그램
		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" } };

		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i< words.length; i++) {
				System.out.printf("Q%d. %s의 뜻?", i+1,words[i][0]);
				String userAnswer = scanner.nextLine();
				
				if (userAnswer.equals(words[i][1])) {
					System.out.println("정답입니다!");
				} else {
					System.out.printf("오답입니다! 정답은 %s 입니다.\n", words[i][1]);
				}
				System.out.println();			
		}
		
		scanner.close();

	}

}
