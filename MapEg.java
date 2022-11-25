package JavaPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEg {
	public static void main(String[] args) {
		TreeMap<String, String> ts = new TreeMap<>();
		ts.put("KARNATAKA", "BANG");
		ts.put("andhra", "ayd");
//		ts.entrySet()
//		  .stream()
//		  .sorted(Map.Entry.comparingByKey())
//		  .forEachOrdered(x -> ts.put(x.getKey(), x.getValue()));
//
		Set<String> s = ts.keySet();
	
		for (String ss : s) {
			
			String value = ts.get(ss);
		
			System.out.println("key is" + ss + "-----" + "value" + value);
		}
				
	}

}
