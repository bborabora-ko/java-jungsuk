import java.util.Arrays;
import java.util.Scanner;

import javax.imageio.metadata.IIOMetadataFormat;

public class Ex5_1_rpsGame {

	public static void main(String[] args) {
		// 가위,바위,보 게임(랜덤으로 하나가 나오도록)
		Scanner scanner = new Scanner(System.in);

		String[] strArr = { "가위", "바위", "보" };

		outer: while (true) {
			System.out.println("가위,바위,보 게임: 숫자를 입력하세요.(종료: 0)");
			System.out.println("1.가위, 2.바위, 3.보");
			System.out.print(">");

			String tmp = scanner.nextLine();
			int userChoice = 4;
			
			try {
				userChoice = Integer.parseInt(tmp);				
			}catch(Exception e) {
				
			}

			if (1 <= userChoice && userChoice <= 3) {
				int comChoice = (int) (Math.random() * 3);

				String resultString = "사용자 승리";
				if (userChoice == comChoice) {
					resultString = "무승부";
				} else {
					if (userChoice == 1) {
						if (comChoice == 2) {
							resultString = "사용자 패배";
						}
					} else if (userChoice == 2) {
						if (comChoice == 3) {
							resultString = "사용자 패배";
						}
					} else {
						if (comChoice == 1) {
							resultString = "사용자 패배";
						}
					}
				}
				
				System.out.printf("사용자의 선택: %d.%s\n", userChoice, strArr[userChoice-1]);
				System.out.printf("컴퓨터의 선택: %d.%s\n", comChoice, strArr[comChoice-1]);
				System.out.println("결과: " + resultString);

			} else if (userChoice == 0) {
				System.out.println("종료! 이용해주셔서 감사합니다.");
				break outer;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
