package project_02;


public class Q_10 {
	
	static double toplam=0;
	 

	public static void main(String[] args) {

		/*
		 * String 2D array oluştur
		 * 
		 * {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
		 * 
		 * String de $ varsa 3.2 ile çarp
		 * 
		 * String de € varsa 4.2 ile çarp
		 * 
		 * double return et
		 */

		
		
		String arr[][] = { { "$12", "$22", "5$" }, { "£9", "£40", "$1", "$2" }, { "£12" } };

		kurHesabi(arr); // return etmemiz istendiginden method reation ile hesaplamalari yapip 
						// toplam degeri return ettik
		
		
		// Gormek istersek yukardaki method call yoruma alip asagidaki
		//System.out.println aktif ederek sonucu yazdirabiliriz
		
		//System.out.println("Toplam paraniz : " + kurHesabi(arr) + " TL dir");
		
		

	}
	
	public static  double kurHesabi(String[][] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j].contains("$")) {
					
					toplam += (Double.parseDouble(arr[i][j].replace("$", ""))* 3.2);
				} 
				if(arr[i][j].contains("£")) {
					
					toplam += (Double.parseDouble(arr[i][j].replace("£", ""))* 4.2);
				}
				
			}
			
		}
		
		return toplam;
	}



}
