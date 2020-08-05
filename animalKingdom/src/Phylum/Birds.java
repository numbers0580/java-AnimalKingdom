package Phylum;

public class Birds extends Animals {
	public Birds(String name, int year) {
		this.name = name;
		this.year = year;
		this.classification = "Birds";
	}
	
	@Override
	public String move() {
		return "flies";
	}
	
	@Override
	public String breathe() {
		return "Lungs";
	}
	
	@Override
	public String reproduce() {
		return "Eggs";
	}
	
	//getters
	@Override
	public String getName() {
		return name;
	}
	
	public String getClassification() {
		return classification;
	}
	
	@Override
	public int getYear() {
		return year;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setClass(String classification) {
		this.classification = classification;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return name;
	}
}