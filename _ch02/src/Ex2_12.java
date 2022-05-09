
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3"; //문자열3
		
		System.out.println(str.charAt(0) - '0'); //문자3 -> 숫자3
		System.out.println('3' - '0' +1); //4
		System.out.println(Integer.parseInt(str)+ 1); //4
		System.out.println("3" + 1); //문자열 31
		
		System.out.println('3' - '0'); //숫자3
		System.out.println(3 + '0'); //51 
		// 숫자와 문자를 더할 수 없으므로 '0'이 숫자로 48로 되어 계산됨 -> 51
		// 51을 char타입으로 형변환을 해야 문자3 나옴
		System.out.println((char)(3 + '0'));//문자3
		
		char cha = 65;
		System.out.println(cha);

		
		
		
	}

}
