
public class Ex5_1_tmp2 {
	public static void main(String[] args) {
		String str = "ABCDEF";
		
		char ch = str.charAt(2); //C
		String str2 = str.substring(1, 4); //BCD
		String str3 = str.substring(1); //BCDEF //to������ ������������~���ڿ�������		
		String str4 = str.substring(1, str.length()); //BCDEF //������������~���ڿ�������
		
		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
