
import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		// (�������迭�� �̿�) �ܾ� ���α׷�
		String[][] words = { { "chair", "����" }, { "computer", "��ǻ��" }, { "integer", "����" } };

		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i< words.length; i++) {
				System.out.printf("Q%d. %s�� ��?", i+1,words[i][0]);
				String userAnswer = scanner.nextLine();
				
				if (userAnswer.equals(words[i][1])) {
					System.out.println("�����Դϴ�!");
				} else {
					System.out.printf("�����Դϴ�! ������ %s �Դϴ�.\n", words[i][1]);
				}
				System.out.println();			
		}
		
		scanner.close();

	}

}
