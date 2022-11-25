package JavaPractice;

import java.util.ArrayList;

public class ArrayListArrayList {
	public static void main(String[] args) {

		ArrayList<ArrayList<String>> aList = new ArrayList<>();
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("siva");
		a1.add("naga");
		aList.add(a1);

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("raju");
		a2.add("gowda");
		aList.add(a2);

		for (ArrayList<String> name : aList) {
			System.out.println(name);
			for (String s1 : name) {
				System.out.println(s1);
			}
		}

	}
}
