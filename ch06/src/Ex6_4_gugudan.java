
public class Ex6_4_gugudan {
	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		gugudan.printGugudan(13);
		gugudan.printGugudan(8);
	}
}

class Gugudan {
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9)) {
			return;
		}
		for (int i = 1; i <= 9; i++) {
			int result = dan * i;
			System.out.printf("%d * %d = %d%n", dan, i, result);
		}
	}

}
