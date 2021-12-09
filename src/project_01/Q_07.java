package project_01;

import java.util.Scanner;

public class Q_07 {

	public static void main(String[] args) {
		/******
		 * Tugba Hanim ***** Pozitif bir int num verildi�inde, return edildi�i zaman num
		 * tamkare ise true veren de�ilse false veren bir fonksiyon yaz�n.
		 * 
		 * �������� Not: sqrt gibi fonksiyonlar� kullanmay�n.
		 * 
		 * Example 1: Input: 16 Output: true Not: bu say� tamkare ��nk� 4*4 = 16
		 * 
		 * Example 2: Input: 25 Output: true Note: bu say� tamkare ��nk� 5*5=25
		 * 
		 * 
		 * Example 3: Input: 14 Output: false
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi <= 0) {
			System.out.println("Yalnis sayi girdiniz pozitif bir sayi girin lutfen");
		}
		for (int i = 1; i <= sayi; i++) {

			if (sayi == i * i) {
				System.out.println(true);
				System.out.println("bu sayi tam kare cunku " + i + "*" + i + "=" + sayi);
				break;
			} else if (sayi == i) {
				System.out.println(false);
				break;

			}
		}
		scan.close();
	}
	
}
