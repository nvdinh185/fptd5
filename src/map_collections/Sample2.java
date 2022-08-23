package map_collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Sample2 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add(null);
		set1.add("D");

		Set<String> set2 = new HashSet<>();
		set1.add("ABC");
		set1.add("AB");
		set1.add("Z");

		set1.removeIf(t -> t == null);

		set1.addAll(set2);

		Iterator<String> iter = set1.iterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
		}
		System.out.println("==================================");

		set1.forEach(t -> System.out.println(t));

		System.out.println("==================================");
		TreeSet<Integer> set3 = new TreeSet<>();
		set3.add(1);
		set3.add(10);
		set3.add(8);
		set3.add(9);
		set3.add(2);
		set3.add(67);

		System.out.println(set3.floor(11));
		System.out.println(set3.ceiling(11));

		Map<Integer, HocVien2> map = new HashMap<Integer, HocVien2>();
		map.put(1, new HocVien2("1", "a"));
		map.put(4, new HocVien2("4", "d"));
		map.put(2, new HocVien2("2", "b"));
		map.put(3, new HocVien2("3", "c"));
		map.putIfAbsent(5, new HocVien2("5", "e"));

		if (map.get(4) != null) {
			System.out.println(map.get(4));
		}

		map.replace(4, new HocVien2("6", "X"));

//		map.replaceAll((k,v)->new HocVien2("k", "VuLCT"));

		for (Entry<Integer, HocVien2> entry : map.entrySet()) {
			System.out.print("[" + entry.getKey() + ",");
			System.out.print(entry.getValue() + "]\n");
		}
	}
}
