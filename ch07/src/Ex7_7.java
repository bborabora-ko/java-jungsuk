
public class Ex7_7 {
	 public static void main(String[] args) {

		 	Car car = null;
	        FireEngine fe = null;
		    FireEngine fe2 = (FireEngine) car; // 조상 -> 자손으로 형변환
		    Car car2 = (Car) fe;			   // 자손 -> 조상으로 형변환 
		    car2.drive();
		 
//	        Car car = null;
//	        FireEngine fe = new FireEngine();
//	        FireEngine fe2 = null;
//	        
//	        fe.water();
//	        car = fe; 				  // car  = (Car) fe; 형변환 생략
////	        car.water();  		  // 에러. Car타입의 참조변수인 car로는 water() 호출불가 
//	        fe2 = (FireEngine)car;    // 자손타입 ← 조상타입, 형변환 생략불가 
//	        fe2.water();
		 
//		 Car car = new Car();
//		 FireEngine fEngine = (FireEngine)car;
//		 fEngine.drive();
//		 fEngine.water(); //에러(java.lang.ClassCastException). 
		 
	    }
	}

	class Car { 
	    String color;
	    int door;
	        
	    void drive() {
	        System.out.println("drive, Brrr~");
	    }
	    void stop() {
	        System.out.println("stop!!");
	    }
	}

	class FireEngine extends Car{
	    void water() {
	        System.out.println("water!!");
	    }
	}

