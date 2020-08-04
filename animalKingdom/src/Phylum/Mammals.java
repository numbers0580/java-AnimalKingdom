package Phylum;

public class Mammals extends Animals {
	public Mammals(String name, int year) {
		this.name = name;
		this.year = year;
		this.classification = "Mammal";
	}
	
	@Override
	public String move() {
		return "walks";
	}
	
	@Override
	public String breathe() {
		return "Lungs";
	}
	
	@Override
	public String fornicate() {
		return "Live Birth";
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