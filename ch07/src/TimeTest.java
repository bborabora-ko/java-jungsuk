
public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time();
//		time.hour = 25;
		time.setHour(21);
		System.out.println(time.getHour()); //21
		time.setHour(100);
		System.out.println(time.getHour()); //21. 유효한 값이 아니기때문에
	}

}

class Time{
	private int hour; 
	private int minute;
	private int second;
	
	public void setHour(int hour) {
	if(isNotValidHour(hour)) {
		return;
	} 
	this.hour = hour;
	}

	//매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return this.hour;
	}
}



