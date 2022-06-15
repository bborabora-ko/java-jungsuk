import java.util.Arrays;

class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product2() {

	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i = 0;

	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("금액부족. 결제실패");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "을/를 구매완료");
	}

	void summary() {
		// 구입한 물품가격합계
		int pSum = 0;
		// 구입한 물품목록
		String pList = "";

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				break;
			}
			pSum += cart[i].price;
			pList += cart[i].toString() + ",";
		}

//		String[] pList = new String[cart.length];
//
//		for (int i = 0; i < cart.length; i++) {
//			if(cart[i] != null) {
//				pSum += cart[i].price;
//				pList[i] = cart[i].toString();				
//			}
//		}
//		System.out.println("구입한 제품의 총금액:" + pSum);
//		System.out.println("구입한 제품 목록:" + Arrays.toString(pList));

		System.out.println("구입한 제품의 총금액:" + pSum);
		System.out.println("구입한 제품 목록:" + pList);

	}
}

public class Ex7_9 {
	public static void main(String[] args) {
		Buyer2 buyer2 = new Buyer2();
		buyer2.buy(new Tv2());
		buyer2.buy(new Computer2());
		buyer2.buy(new Audio2());

		buyer2.summary();
	}
}
