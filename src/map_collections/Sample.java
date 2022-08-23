package map_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("13");
		list.add("4");
		list.add("10");
		list.add("11");
		list.add("111");
		list.add("12");

		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list.toString());
//
		String i1 = new String("VuLCT");
		String i2 = new String("HangPLT");
//		int kq = i1 - i2;
		if (i1.compareTo(i2) == 0) {
			System.out.println("i1==i2");
		} else if (i1.compareTo(i2) > 0) {
			System.out.println("i1>i2");
		} else {
			System.out.println("i1<i2");
		}
		System.out.println("=======================================================================");

		List<HocVien> listHV = new ArrayList<>();
		listHV.add(new HocVien(1, "VuLCT", new Date(92, 11, 22), true));
		listHV.add(new HocVien(2, "NghiNTT", new Date(100, 8, 16), false));
		listHV.add(new HocVien(3, "QuyTT4", new Date(100, 6, 10), true));
		listHV.add(new HocVien(3, "NhatDV8", new Date(100, 4, 10), true));
		listHV.add(new HocVien(3, "HuyTN15", new Date(100, 5, 10), true));
		listHV.add(new HocVien(10, "DinhNV10", new Date(100, 5, 18), true));
		listHV.add(new HocVien(4, "HangPLT", new Date(99, 6, 23), false));
		System.out.println("Cach 1");
		Collections.sort(listHV, new SortHVByDoBAscNameDescComparator());
		listHV.forEach(t -> System.out.println(t));
		System.out.println("Cach 2");
		Collections.sort(listHV, new SortHVByDoBDescNameAscComparator());
		listHV.forEach(t -> System.out.println(t));
	}
}
