package project_01;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		
		/*
		  	Soru 11 : ***** Gokhan Bey *****
	
					Bir String verildiğinde

        			Eger String harf sayisi tek ise true print et 
        			değilse false print et
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter value of str");
		String str=scan.nextLine().replaceAll(" ", "");
		
		if (str.length() % 2 != 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		scan.close();		
	}

}
