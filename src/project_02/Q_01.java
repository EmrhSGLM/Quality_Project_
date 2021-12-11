package day01_gitupProjeOdevi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		/* Artan düzende sıralanmış iki adet ınt array göz önüne alındığında,
        
        içteki tüm sayılar dışta görünüyorsa true değerini döndürür.
        ILK ARRAYIN IKINCİ ARRAYIN ICERDIGINI DOGRULAYINint.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true*/

		
		
		
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Lutfen birinci sayilari giriniz");
	        String myStr = scan.nextLine();
	        String[] arr1 = myStr.split("");
	        System.out.println("Lutfen ikinci sayiyi giriniz");
	        String myStr1 = scan.nextLine();
	        String[] arr2 = myStr1.split("");
	        boolean a;
	        int sayac=0;
	        for (int i = 0; i < arr1.length; i++) {
	        	for (int j = 0; j < arr2.length; j++) {
	        		if (arr1[i].equals(arr2[j])) {
	        			sayac++;
						
					}	
				} 	 
			}
	        if (sayac==arr2.length) {
	        	a=true;
	        	System.out.println(a);
	        	
			}else {
				a=false;
				System.out.println(a);
				
			}
	       
	        
	        
	
	        
	        
	        
	        
	        
	        
	        
	        
	      /*  �kinci cozum
          Scanner scan = new Scanner(System.in);
		    System.out.println("Lutfen birinci sayilari          giriniz");
	        String myStr = scan.nextLine();
	        String[] arr1 = myStr.split("");
             int[] myArr = new int[5];
	        for(int i = 0 ; i< arr.length ; i++){
	            int num = Integer.parseInt(arr[i]);
	            myArr[i] = num;
	        }
	        
	        int[] UseThisArray1 = new int[3];
	        int[] UseThisArray2 = new int[2];
	        for(int i = 0 ; i <3 ; i++){
	            UseThisArray1[i] = myArr[i];
	        }
	        for(int i = 3 ; i <5 ; i++){
	            UseThisArray2[i-3] = myArr[i];
	        }
	       // UseThisArray1 ve UseThisArray2 array isimlerini kullan
	        boolean b1 = false;
	        for(int i = 0 ; i<UseThisArray2.length ; i++) {
	            for (int j = 0; j < UseThisArray1.length; j++) {
	                if (UseThisArray1[j] == UseThisArray2[i]) {
	                    b1 = true;
	                    break;
	                } else if (UseThisArray1[j] != UseThisArray2[i] ) {
	                    b1 = false;
	                }
	            }
	        }
	        System.out.println(b1);*/
		
	

	        }
	        }
	
	

	

	
	

