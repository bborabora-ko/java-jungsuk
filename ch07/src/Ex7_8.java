class Product {
	int price;
	int bonusPoint;

	public Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv1 extends Product {
	Tv1() {
		super(100);
	}

	public String toString() { // Object클래스 toString() 오버라이딩
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족. 물건결제실패");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입완료");
	}
	
}

public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1()); //Tv를 구입완료
		b.buy(new Computer()); //Computer를 구입완료
		
		System.out.println("현재 남은돈: " + b.money +"만원"); //현재 남은돈: 700만원
		System.out.println("현재 보너스점수: " + b.bonusPoint +"점");//현재 보너스점수: 30점
	}

}
