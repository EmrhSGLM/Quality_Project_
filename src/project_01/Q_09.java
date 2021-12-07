package project_01;

import java.util.Random;
import java.util.Scanner;

public class Q_09 {

	public static void main(String[] args) {
		/*
		 * Soru 9 : ***** Zuhal Hanim ***** Veri tipi integer olan max say�s�
		 * verildi�inde
		 * 
		 * 0 ile max sayisi arasindan random bir sayi elde et(olustur)
		 * 
		 * output tipi int olmal�
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("max say�s�n� giriniz");

		int max = scan.nextInt();

		Random r = new Random(); // random s�n�f�
		int a = r.nextInt(max);// 0 ve negatifler dahil de�il max da dahil de�il

		System.out.println(a);

		scan.close();
	}

}
