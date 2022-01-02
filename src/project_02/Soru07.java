package proje_Sorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Soru07 {
	/**
	 * Soru 7 : ***** MURAT BEY *****
	 * 
	 * Verilen int array
	 * 
	 * 
	 * duplicated(tekrarlanan) öðeleri array den kaldýr
	 * 
	 * non-duplicated(tekrarlanmayan) öðe sayisini print et
	 * 
	 * Örnek:
	 * 
	 * Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
	 * 
	 * //1 2 2 2 3 3 3 4 4 4 5 5 5
	 * 
	 * result 5 olmalý
	 * 
	 * NOT: resultu print ederken for loop kullanmayýn
	 * System.out.println(Arrays.toString(your_array_name)); kullanýn
	 */
	public static void main(String[] args) {

		/// Lambda ile

		Integer[] arr = new Integer[] { 1, 2, 4, 2, 2, 3, 3, 3, 3, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };

		List<Integer> listtekrarsiz = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());

		System.out.println("Lambda ile: " + listtekrarsiz.size());

		// HashSet ile

		// tekrar sayili array olustur
		Integer[] sayilar = new Integer[] { 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 3, 4, 5, 1, 3, 5, 5, 5 };

		// tekrar sayili array
		System.out.println(Arrays.toString(sayilar));

		// array elementli Set olustur
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(sayilar));

		// Arrayi kopyalari olmadan elde etme
		Integer[] tekrarsizSayi = linkedHashSet.toArray(new Integer[] {});

		System.out.println(Arrays.toString(tekrarsizSayi));
		System.out.println(tekrarsizSayi.length);

		// forloop ile

		List<Integer> list = new ArrayList<>();

		int tekrarli[] = { 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5 };

		for (int i = 0; i < tekrarli.length; i++) {

			if (!list.contains(tekrarli[i])) {
				list.add(tekrarli[i]);

			}
		}
		// System.out.println(list.size()); //5
		// System.out.println(list); // [1, 2, 3, 4, 5]
		int tekrarsiz[] = new int[list.size()];
		for (int i = 0; i < tekrarsiz.length; i++) {
			tekrarsiz[i] = list.get(i);

		}
		System.out.println("tekrarsiz list :" + Arrays.toString(tekrarsiz)); // nonDuplicated list :[1, 2, 3,
																						// 4,5]
		System.out.println("tekrarsiz list eleman sayisi :" + tekrarsiz.length); // nonDuplicated list :5
		// System.out.println(nonDuplicated[2]); //3
		// System.out.println(nonDuplicated); //[I@123772c4 ---????

	}

}
