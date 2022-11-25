package JavaPractice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Treset {
	public static void main(String[] args) {
		
	
//	TreeSet<String> ts = new TreeSet<String>((o1,o2)-> {
//		return o1.compareTo(o2);
//	});
		
		TreeSet<String> ts = new TreeSet<String>((o1,o2)-> o1.compareTo(o2));
	ts.add("bangalur");
	ts.add("aaahannai");
	ts.add("hyd");
	Iterator<String> i = ts.iterator();
	while(i.hasNext()){
	   System.out.println(i.next()+"treesettttt");
	}
	}
}

// class Comparater implements Comparator<String>{
//
//		@Override
//		public int compare(String o1, String o2) {
//			int val=o1.compareTo(o2);
//			return val;
//		}
//		
//	}

