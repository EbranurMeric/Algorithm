package Practices;

import java.util.*;

public class IntersectionFinder{
	
		public static void main(String[] args) {
			ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 7));
			ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8));

			ArrayList<Integer> sonuc = kesisim(list1, list2);
			System.out.println("Kesişim: " + sonuc);

	}

	public static ArrayList<Integer> kesisim(ArrayList<Integer> list1, 
			ArrayList<Integer> list2) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < list1.size() && j < list2.size()) {
			if (list1.get(i) < list2.get(j)) {
				i++;
			} else if (list1.get(i) > list2.get(j)) {
				j++;
			} else {
				result.add(list1.get(i));
				i++;
				j++;
			}

		}
		return result;
	}

}
