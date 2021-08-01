
public class Marka implements Comparable<Marka>{

	private int id;
	private String name;
	
	public Marka(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Marka o) {
		return this.name.compareTo(o.name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
