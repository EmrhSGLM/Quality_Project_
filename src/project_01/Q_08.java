package project_01;

import java.util.Scanner;

public class Q_08 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Soru 8 : ***** Tugba Hanim ***** 
		 * 
		 * Veri tipi int olan bir say� verildi�inde
		 * 
		 * 0 dan ba�layarak verilen say�ya kadar olan tum cift say�lar� print edin.
		 * 
		 * Example 1: int input = 10;
		 * 
		 * print 0 2 4 6 8 10 olmal�
		 * 
		 * 
		 * Example 2: int input = 15;
		 * 
		 * print 0 2 4 6 8 10 12 14 olmal�
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int girilenSayi = scan.nextInt();
		int toplam = 0;
		for (int i = 0; i <= girilenSayi; i++) {
			toplam += i;

			if (i % 2 == 0) {
				System.out.print(i + " ");

			}

		}
		scan.close();

	}

}
