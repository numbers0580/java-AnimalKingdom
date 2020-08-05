package Phylum;

abstract class Animals {
	//All animals consume food the same way
	//Each animal is assigned a unique number, a name, and year discovered regardless of classification.
	protected static int id;
	protected int animalId = id;
	protected String name;
	protected int year;
	protected String classification;
	
	public Animals() {
		id++;
	};
	
	abstract String getName();
	abstract int getYear();
	abstract String move();
	abstract String breathe();
	abstract String reproduce();
	
	String eatFood() {
		return "";
	}
}