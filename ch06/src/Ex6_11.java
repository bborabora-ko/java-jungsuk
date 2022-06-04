import java.util.Arrays;
import java.util.Iterator;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	public Data_2() { //기본생성자가 없으면 에러발생
	}
	
	Data_2(int x){
		value = x;
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(StaticBlockTest.arr)); 
		
	}
}

class StaticBlockTest{
	static int[] arr = new int[10];
	static {
		for(int i =0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1; //1~10까지의 난수로 초기화
		}
	}
}

