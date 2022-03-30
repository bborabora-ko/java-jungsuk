
public class VarEx2 {

	public static void main(String[] args) {

		int x = 4, y = 2;
		int tmp;
		
		tmp = x; // 1.x값 tmp에 저장
		x = y; // 2. y값 x에 저장
		y = tmp; // 3. tmp값 y에 저장
		
		System.out.println("x=" + x); //x=2
		System.out.println("y=" + y); //y=4
		System.out.println("tmp=" + tmp); //tmp=4

		
	}

}
