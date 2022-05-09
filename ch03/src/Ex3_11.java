
public class Ex3_11 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0 ; // 3142 / 1000.0 = 3.142
		System.out.println(shortPi); // 3.142
		
		// 3.141을 얻고 싶을때
		shortPi = (int) (pi * 1000); //3141.0
		shortPi = shortPi / 1000 ; // 3.141
		System.out.println(shortPi);
		
		
	}

}
