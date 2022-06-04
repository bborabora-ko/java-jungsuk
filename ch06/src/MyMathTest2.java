
public class MyMathTest2 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L)); //클래스 메서드 호출->객체생성 x
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add()); //인스턴스매서드호출 -> 객체생성ㅇ
	}

}

class MyMath2{
	long a, b;

	/*인스턴스 메서드*/
	long add() {
			return a + b; //iv a,b
	}

	/*클래스 메서드(=static 메서드)*/
	static long add(long a, long b){
			return a + b; //lv a,b
	}
}


