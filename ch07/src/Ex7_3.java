
public class Ex7_3 {

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.method();
	}

}

class Parent2 {
	int x = 10; //조상과 자식의 이름이 중복되지 않는 경우
	// super.x와 this.x 둘 다 사용가능(같은 놈을 가리킴)
}

class Child2 extends Parent2{
	void method() {
		System.out.println("x=" + x); //10. 가까운 x인 super.x가 출력
		System.out.println("super.x=" + super.x); //10
		System.out.println("this.x=" + this.x); //10
		
	}
}
