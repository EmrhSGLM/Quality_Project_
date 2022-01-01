package project_02;

import java.util.Arrays;

public class Q_07 {

	public static void main(String[] args) {
		/*
		 * Soru 7 : ***** MURAT BEY *****
		 * 
		 * Verilen int array ===> duplicated(tekrarlanan) öğeleri array den kaldır ===>
		 * non-duplicated(tekrarlanmayan) öğe sayisini print et
		 * 
		 * Örnek: Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
		 * 
		 * //1 2 2 2 3 3 3 4 4 4 5 5 5 result 5 olmalı
		 * 
		 * NOT: resultu print ederken for loop kullanmayın
		 * System.out.println(Arrays.toString(your_array_name)); kullanın
		 */

		int sayi[] = { 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6 };
		
		int result = (int) Arrays.stream(sayi).distinct().count();
		System.out.println("result => " +result);
		
		

	}

}
