package project_02;

public class Q_06 {

	public static void main(String[] args) {

		/**
		 * 
		 * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
		 * 
		 * int 2D arrayini olustur
		 * 
		 * 2D arrayinden min number print et
		 */
		
		int[][] arr = {{1,2,3}, {2,3,1} , {5,5,5,15} , {2,10,3}};
		int min=arr[0][2];
		
		for(int i = 0 ; i < arr.length;i++) {
			
			for(int j = 0 ; j < arr[i].length;j++) {
				if(min > arr[i][j]) {
					min=arr[i][j];
				}
			}
		}
		System.out.println("2D arrayinden max number => " + min);
		
		
		
	}

}
