package map_collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HocVien implements Comparable<HocVien> {
	private int mahv;
	private String tenhv;
	private Date ngaySinh;
	private boolean gt;

	public HocVien(int mahv, String tenhv) {
		this.mahv = mahv;
		this.tenhv = tenhv;
	}

	public HocVien(int mahv, String tenhv, Date ngaySinh, boolean gt) {
		this.mahv = mahv;
		this.tenhv = tenhv;
		this.ngaySinh = ngaySinh;
		this.gt = gt;
	}

	public int getMahv() {
		return mahv;
	}

	public void setMahv(int mahv) {
		this.mahv = mahv;
	}

	public String getTenhv() {
		return tenhv;
	}

	public void setTenhv(String tenhv) {
		this.tenhv = tenhv;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGt() {
		return gt;
	}

	public void setGt(boolean gt) {
		this.gt = gt;
	}

	@Override
	public String toString() {
		return "HocVien [mahv=" + mahv + ", tenhv=" + tenhv + ", ngaySinh=" + formatDate(ngaySinh) + ", gt=" + gt + "]";
	}

	private String formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(date);
	}

	/**
	 *  a. In danh sach
	 *	Tang dan theo ngay sinh
	 *	Giam dan theo ten
	 *	b. In danh sach
	 *	Giam dan theo ngay sinh
	 *	Tang dan theo ten
	 */	
	@Override
	public int compareTo(HocVien o) {
		if (this.ngaySinh.compareTo(o.ngaySinh) == 0) {
			return (-1) * this.tenhv.compareTo(o.tenhv);
		} else if (this.ngaySinh.compareTo(o.ngaySinh) > 0) {
			return 1;
		}
		return -1;
	}

}
