
import java.util.Scanner;

public class Ex4_20 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		outer: while (true) {
			System.out.println("(1) squere");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");

			String tmpString = scanner.nextLine();
			menu = Integer.parseInt(tmpString);

			if (menu == 0) {
//				System.out.println("�����մϴ�.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}

			System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");

			for (;;) {
				System.out.println("����� ���� �Է��ϼ���.(�������:0, ��ü����:99)");
				tmpString = scanner.nextLine();
				num = Integer.parseInt(tmpString);
				
				if(num==0) {
					break;
				}else if(num == 99) {
					break outer;
				}

				switch (menu) {
				case 1:
					System.out.println("result="+ num*num);
					break;
				case 2:
					System.out.println("result="+Math.sqrt(num));
					break;
				case 3:
					System.out.println("result="+Math.log(num));
					break;
				}
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
