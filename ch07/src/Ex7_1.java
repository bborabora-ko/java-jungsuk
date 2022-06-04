class Tv{ //부모멤버 5개
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv { //tv에 자막 추가 //자식멤버 2개+5개상속 = 7개
	boolean caption; //캡션(자막기능)
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}


public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel); //11
		
		String textString = "자막나와라";
		
		stv.displayCaption(textString); //출력안됨
		stv.caption = true;
		stv.displayCaption(textString); //자막나와라 출력
	}

}
