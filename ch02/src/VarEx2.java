
public class VarEx2 {

	public static void main(String[] args) {

		int x = 4, y = 2;
		int tmp;
		
		tmp = x; // 1.x�� tmp�� ����
		x = y; // 2. y�� x�� ����
		y = tmp; // 3. tmp�� y�� ����
		
		System.out.println("x=" + x); //x=2
		System.out.println("y=" + y); //y=4
		System.out.println("tmp=" + tmp); //tmp=4

		float xs = 10;
		System.out.println(xs);
	}

}