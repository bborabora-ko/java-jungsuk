import java.util.Scanner;

public class Ex4_18 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("(1) squere");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

			String tmpString = scanner.nextLine();
			menu = Integer.parseInt(tmpString);

			if (menu == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}
	}

}
