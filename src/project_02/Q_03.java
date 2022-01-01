package project_02;

public class Q_03 {

	public static void main(String[] args) {
		/*
		 Soru 3 : ***** HACER HANIM *****

	a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse 
        veya aynı son öğeye sahiplerse true değerini döndürün.

        Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.
	
	Output :
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
		 */
		
		int[] arr1= {1, 2, 3};
		int arr2[]= {1, 7, 3, 2};
		
		if(arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
