import java.util.Arrays;
import java.util.Scanner;

import javax.imageio.metadata.IIOMetadataFormat;

public class Ex5_1_rpsGame {

	public static void main(String[] args) {
		// ����,����,�� ����(�������� �ϳ��� ��������)
		Scanner scanner = new Scanner(System.in);

		String[] strArr = { "����", "����", "��" };

		outer: while (true) {
			System.out.println("����,����,�� ����: ���ڸ� �Է��ϼ���.(����: 0)");
			System.out.println("1.����, 2.����, 3.��");
			System.out.print(">");

			String tmp = scanner.nextLine();
			int userChoice = 4;
			
			try {
				userChoice = Integer.parseInt(tmp);				
			}catch(Exception e) {
				
			}

			if (1 <= userChoice && userChoice <= 3) {
				int comChoice = (int) (Math.random() * 3);

				String resultString = "����� �¸�";
				if (userChoice == comChoice) {
					resultString = "���º�";
				} else {
					if (userChoice == 1) {
						if (comChoice == 2) {
							resultString = "����� �й�";
						}
					} else if (userChoice == 2) {
						if (comChoice == 3) {
							resultString = "����� �й�";
						}
					} else {
						if (comChoice == 1) {
							resultString = "����� �й�";
						}
					}
				}
				
				System.out.printf("������� ����: %d.%s\n", userChoice, strArr[userChoice-1]);
				System.out.printf("��ǻ���� ����: %d.%s\n", comChoice, strArr[comChoice-1]);
				System.out.println("���: " + resultString);

			} else if (userChoice == 0) {
				System.out.println("����! �̿����ּż� �����մϴ�.");
				break outer;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}

	}

}
