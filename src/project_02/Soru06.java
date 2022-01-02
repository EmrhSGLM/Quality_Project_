package proje_Sorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru06 {
	/**
	 * Soru 6 : ***** MURAT BEY *****
	 * 
	 * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
	 * 
	 * int 2D arrayini olustur
	 * 
	 * 2D arrayinden min number print et
	 * 
	 */

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 2, 3, 1 }, { 5, 5, 5 }, { 2, 1, -90, -503 } };

		int flag = arr[0][0];

		for (int i1 = 0; i1 < arr.length; i1++) {
			for (int j = 0; j < arr[i1].length; j++) {
				if (arr[i1][j] < flag) {
					flag = arr[i1][j];

				}

			}

		}
		System.out.println("for lopp ile min sonuc " + flag);

		// List<int[]> array=Arrays.asList(arr);
		// System.out.println(array);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				list.add(arr[i][j]);
			}
		}
		// System.out.println(list); // [1, 2, 3, 2, 3, 1, 5, 5, 5, 2, 1, -90, -503]
		System.out.println("Lambda ile min: " + list.stream().sorted().distinct().findFirst());

		Collections.sort(list);
		System.out.println("list ile min: " + list.get(0));
	}

}
