package project_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_02 {

	public static void main(String[] args) {
		/*
		 * Soru 2 : ***** ZUHAL HANIM *****
		 * 
		 * String bir array verildi�inde Eger String Orange i�eriyorsa b�t�n Orange leri
		 * Apple �evir
		 * 
		 * Input: Array : Peach , Berry , Orange , WaterMelon , Orange
		 * 
		 * Output : Result b�yle olmal� --> : Peach , Berry , Apple , WaterMelon , Apple
		 * 
		 * Arrayi print edin(yazdirin).
		 */
		
		
		String arr[]= {"Peach , Berry , Orange , WaterMelon , Orange" };
		
		List<String> list=new ArrayList<>();
		
		String str1=arr[0];
		String[] arr1=str1.split(",");
		
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			boolean c=list.get(i).contains("Orange");
			if (c==true) {
				list.remove(i);
				list.add(i, "Apple");
			}
		}
		
		System.out.println(list);
}
		
		
		
		
}		
		
		
	


