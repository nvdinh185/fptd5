package map_collections;

public class HocVien2 {

	private String id;
	private String name;

	public HocVien2() {
	}

	public HocVien2(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "HocVien [id=" + id + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
