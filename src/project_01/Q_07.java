package project_01;

import java.util.Scanner;

public class Q_07 {

	public static void main(String[] args) {
		/******
		 * Tugba Hanim ***** Pozitif bir int num verildiginde, return edildigi zaman num
		 * tamkare ise true veren degilse false veren bir fonksiyon yazin.
		 * 
		 * �������� Not: sqrt gibi fonksiyonlari kullanmayin.
		 * 
		 * Example 1: Input: 16 Output: true Not: bu sayi tamkare cunku  4*4 = 16
		 * 
		 * Example 2: Input: 25 Output: true Note: bu sayi tamkare cunku  5*5=25
		 * 
		 * 
		 * Example 3: Input: 14 Output: false
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif sayi giriniz");
		int sayi = scan.nextInt();
		boolean dogruMu=false;
		System.out.println(sayi+" "+ "Output => "+ kare(sayi,dogruMu));
		
		scan.close();
	}

	private static boolean kare(int sayi, boolean dogruMu) {
		if (sayi <= 0) {
			System.out.println("Yalnis sayi girdiniz pozitif bir sayi girin lutfen");
		}
		for (int i = 1; i <= sayi; i++) {

			if (sayi == i * i) {
				dogruMu=true;
				sayi=i;
				break;
			} else if (sayi == i) {
				dogruMu=false;
				break;

			}
		}
		return dogruMu;
		
	}
	/*
	private static String kare1(int sayi, boolean dogruMu) {
		String veri="";
		if (sayi <= 0) {
			System.out.println("Yalnis sayi girdiniz pozitif bir sayi girin lutfen");
		}
		for (int i = 1; i <= sayi; i++) {

			if (sayi == i * i) {
				dogruMu=true;
				sayi=i*i;
				break;
			} else if (sayi == i) {
				dogruMu=false;
				break;

			}
		}
		String 
		
	}
	*/
}
