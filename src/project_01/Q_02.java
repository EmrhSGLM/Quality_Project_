package project_01;

import java.util.Scanner;

public class Q_02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
	/*	Veri tipi int olan number verildi�inde, number  �ift mi tek mi kontrol et

        E�er number �ift ise  print true

        E�er number tek ise  print false

        Sonuc true ya da false olmal�.
        */

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen sayi Giriniz");
		int sayi =scan.nextInt();
		
			
		if(sayi%2==0) {
		
		System.out.println("E�er number �ift ==>"+(sayi%2==0));
		 
		}
		if(sayi%2==1) {
		System.out.println("E�er number tek ==>"+(sayi%2==0));
		}	
	}

}
