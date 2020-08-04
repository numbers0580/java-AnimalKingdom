package Phylum;

public class Fish extends Animals {
	public Fish(String name, int year) {
		this.name = name;
		this.year = year;
		this.classification = "Fish";
	}
	
	@Override
	public String move() {
		return "swims";
	}
	
	@Override
	public String breathe() {
		return "Gills";
	}
	
	@Override
	public String fornicate() {
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