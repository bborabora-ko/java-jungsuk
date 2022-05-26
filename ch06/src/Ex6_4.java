
public class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); //8
		long result2 = mm.subtract(5L, 3L); //3
		long result3 = mm.multiply(5L, 3L); //15
		double result4 = mm.divide(5L, 3L); //1.6666666666666667
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		long result5 = mm.max(5, 3);
		long result6 = mm.max(4, 10);
		long result7 = mm.max(5, 5);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
	
	}

}

class MyMath{ //사칙연산 메서드를 가진 클래스MyMath
	long add(long a, long b) {
		long result = a+b;
		return result;
		//return a+b; //위 두문장을 간단히 가능
	}	
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {
		return a/b;
	}
	//두 값을 받아서 둘중 큰값을 반환하는 메서드
	long max(long a, long b) {
		if(a > b) {
			return a;			
		} else if (a < b) {
			return b;
		} else {
			return 0;
		}
	}
	
}
