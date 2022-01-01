package project_02;

import java.util.Arrays;
import java.util.Scanner;

public class Q_08 {

	public static void main(String[] args) {
		/*
		 Soru 8 :***** HIKMET BEY *****

		Verilen String array
		String arrayi ters çevir
		ters arrayi yazdır

       			NOT:
       	Arrays.toString(your_array_name);  <--- kullanın
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir str giriniz");
		String str=scan.nextLine();
		
		String arr[]=str.split("");
		// Arrays.stream(arr).sorted(Comparator.comparing(t-> t.toString().length()).reversed()).forEach(t-> System.out.println(););
		
		String arr1[]=new String[str.length()];
		int x=0;
		for(int i=arr.length-1; i >= 0 ; i--) {
			System.out.print(arr[i]);
			arr1[x]=arr[i];
			x++;
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		scan.close();
	}

}
