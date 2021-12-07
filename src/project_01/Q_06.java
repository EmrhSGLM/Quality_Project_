package project_01;

import java.util.Scanner;

public class Q_06 {
	
	public static void main(String[] args) {
		/*
		 * 3 tane pozitif String verildi�inde say�sal olmayan t�m karakterleri kald�r�n.
		 * Stringleri int e �evirin ve total print edin
		 * 
		 * Ornek: String num1 = "$15"; String num2 = "$20"; String num3 = "$30"; output
		 * ----> 65; olmali
		 * 
		 * NOT : E�er output 0 dan k���k ise outputu -1 e cevir
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("3 tane pozitif string sayi giriniz");
		
		String num1=scan.next();
		String num2=scan.next();
		String num3=scan.next();
		
		int sayi1=Integer.valueOf(num1.replace("$", ""));
		int sayi2=Integer.valueOf(num2.replace("$", ""));
		int sayi3=Integer.valueOf(num3.replace("$", ""));
		
		int toplam=sayi1 +sayi2 + sayi3;
		
		if (toplam>=0) {
			System.out.println("�� sayinin toplami: " + toplam);
			
		} else {
			System.out.println(-1);

		}
			
		scan.close();
		
	}

}
