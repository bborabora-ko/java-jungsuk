
public class Ex4_10 {
	public static void main(String[] args) {
		int sum = 0;
		
		// i = 1, 2, 3, 4, 5 일때 
		for(int i = 1; i <= 5; i++) {
			sum += i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i , sum);
		}
	}
}
