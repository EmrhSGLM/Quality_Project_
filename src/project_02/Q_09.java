package project_02;

import java.util.Arrays;

public class Q_09 {

	public static void main(String[] args) {

		/*
		 * Soru 8 :***** EMRAH BEY *****
		 * 
		 * Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe
		 * ile son öğe eşitse true değerini yazdırın.
		 * 
		 * sameFirstLast([1, 2, 3]) → false 
		 * sameFirstLast([1, 2, 3, 1]) → true
		 * sameFirstLast([1, 2, 1]) → true 
		 * sameFirstLast([1]) → true
		 * 
		 * sadece true veya false print et
		 */
		
		
		int arr[] = {1,2,3};
		//int arr[] = {1,2,3,1};
		//int arr[] = {1,2,3,1};
		//int arr[] = {1};

		
		if (arr.length >= 1 && arr[0] == arr[arr.length-1]) {
			
			System.out.println(Arrays.toString(arr)+" ==> " + "true");
			
		} else System.out.println(Arrays.toString(arr)+" ==> " + "false");
		

	}

}
