import java.util.Random;
import java.util.Scanner;

public class Ex5_10_wordGame {

	public static void main(String[] args) {
		// (�������迭�� �̿�) ������ �ܾ �´� ���� �Է��ϸ� ����/������ �˷��ִ� �ܾ����α׷�
		String[][] words = { { "chair", "����" }, { "computer", "��ǻ��" }, { "integer", "����" } };

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			int wordIndex = random.nextInt(words.length); // ������ �ܾ� �ε��� ����
			System.out.printf("Q. %s�� ��?", words[wordIndex][0]);

			String userAnswer = scanner.nextLine();
			String rightAnswer = words[wordIndex][1];

			if (userAnswer.equals(rightAnswer)) {
				System.out.println("�����Դϴ�!");
			} else {
				System.out.printf("�����Դϴ�! ������ %s �Դϴ�.\n", rightAnswer);
			}

			System.out.print("�����Ͻ÷��� N�� �����ּ���. >");
			String userChoice = scanner.nextLine();
			if (userChoice.equalsIgnoreCase("N")) {
				break;
			} else {
				
			}

			// ������� ��� ���� ��
		}

		scanner.close();

	}

}
