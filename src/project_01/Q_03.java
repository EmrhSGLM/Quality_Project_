package project_01;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		
		/*
		 	Soru 3 :  ***** Sezai Bey *****
	
			Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     		input :  Test output
            	b :  0
        	output:  0 olmalı


     		input :  bucket
                b :  1
            output:  1 olmalı

			ipucu :  .charAt, length(), for, index, counter
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter value of str");
		String str=scan.next().toLowerCase();
		
		int count=0;
		for (int index = 0; index < str.length(); index++) {
			 if (str.charAt(index) == 'b') {
				 count++;				
			}	
		
		}
		System.out.println(count);
		scan.close();
		
	}

}
