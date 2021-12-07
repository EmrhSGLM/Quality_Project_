package project_01;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		/*
		 * E�er age 10 dan k���k veya e�it ise facebook hesabi acmak icin cok gencsin
		 * print yap�n.
		 * 
		 * E�er age 16 dan k���k veya e�it ise ehliyet almak icin cok gencsin print
		 * yap�n.
		 * 
		 * E�er age 18 den k���k veya e�it ise dovme yaptirmak icin cok gencsin print
		 * yap�n.
		 * 
		 * E�er age 21 den k���k veya e�it ise alkol icmek icin cok gencsin print yap�n.
		 * 
		 * E�er age 21 den b�y�k ise istedigini yapabilirsin print yap�n. Not : Note: if
		 * else kullanarak cozum yapiniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi Giriniz");
		int age = scan.nextInt();

		if (age <= 10) {
			System.out.println("facebook hesabi acmak icin cok gencsin==>" + age);

		} else if (age <= 16) {
			System.out.println("ehliyet almak icin cok gencsin==>" + age);

		} else if (age <= 18) {
			System.out.println("dovme yaptirmak icin cok gencsin==>" + age);

		} else if (age <= 21) {
			System.out.println("alkol icmek icin cok gencsin==>" + age);

		} else if (age > 21) {
			System.out.println("istedigini yapabilirsin==>" + age);
		}
		scan.close();
	}

}
