package fixtures;

public class Fixture { //(abstract)
	protected String name;
	protected String shortDescription;
	protected String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getShort() {
		return shortDescription;
	}
	
	public void setShort(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLong() {
		return name;
	}
	
	public void setLong(String longDescription) {
		this.longDescription = longDescription;
	}
}
