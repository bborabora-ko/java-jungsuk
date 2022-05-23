import java.util.Arrays;

public class Ex5_1_tmp3 {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4 };
		int[][] arr2D = {{11, 12}, {21, 22}};

		System.out.println(Arrays.toString(arr)); //[0, 1, 2, 3, 4] 
		System.out.println(Arrays.deepToString(arr2D)); //[[11,12],[21,22]]
		
//		String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
//		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
// 
//		System.out.println(Arrays.equals(str2D, str2D2)); //false
//		System.out.println(Arrays.deepEquals(str2D, str2D2)); //true   
//
//		int[] arr = {0, 1, 2, 3, 4};
//
//		int[] arr2 = Arrays.copyOf(arr, arr.length); 
//		System.out.println(Arrays.toString(arr2)); //arr2 = [0, 1, 2, 3, 4]
//		
//		int[] arr3 = Arrays.copyOf(arr, 3);
//		System.out.println(Arrays.toString(arr3)); //arr3 = [0, 1, 2]
//		
//		int[] arr4 = Arrays.copyOf(arr, 7);
//		System.out.println(Arrays.toString(arr4)); //arr4 = [0, 1, 2, 3, 4, 0, 0]
//		
//		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  
//		System.out.println(Arrays.toString(arr5)); //arr5= [2, 3] <-4는 불포함
//		
//		int[] arr6 = Arrays.copyOfRange(arr, 0,7);  
//		System.out.println(Arrays.toString(arr6)); //arr6= [0, 1, 2, 3, 4, 0, 0]
//		
//		
//		int[] arr7 = {3,2,0,1,4};
//
//		Arrays.sort(arr7);//배열 arr7 오름차순정렬
//		System.out.println(Arrays.toString(arr7));//[0, 1, 2, 3, 4]
	}

}
