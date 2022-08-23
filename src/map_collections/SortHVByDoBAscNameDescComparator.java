package map_collections;

import java.util.Comparator;

public class SortHVByDoBAscNameDescComparator implements Comparator<HocVien> {

	@Override
	public int compare(HocVien o1, HocVien o2) {
		if (o1.getNgaySinh().compareTo(o2.getNgaySinh()) == 0) {
			return o1.getTenhv().compareTo(o2.getTenhv());
		} else if (o1.getNgaySinh().compareTo(o2.getNgaySinh()) > 0) {
			return -1;
		}
		return 1;
	}
}
