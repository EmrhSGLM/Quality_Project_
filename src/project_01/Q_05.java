package project_01;

import java.util.Scanner;

public class Q_05 {

	public static void main(String[] args) {
		/*
		 * Scanner class araciliyla girilen herhangi bir sayinin faktoriyel degerini
		 * bulmak icin bir program yazin.
		 * 
		 * number:6 factorial:1*2*3*4*5*6=720 output ---> 720
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz: ");

		int sayi = scan.nextInt();

		int faktoriyel = 1;

		System.out.print(sayi + "!=");
		for (int i = 1; i < sayi; i++) {
			faktoriyel *= i;

			System.out.print(i + "*");

		}
		faktoriyel *= sayi;
		System.out.print(sayi + "=" + faktoriyel);
		scan.close();

	}

}
