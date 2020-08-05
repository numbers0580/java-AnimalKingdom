package Phylum;

import java.util.ArrayList;
import java.util.List;

public class Main {
	/*
	private static List<Animals> filterZoo(List<Animals> vehicles, CheckVehicle tester)
	{
		// So in the List declaration in main(), "vehicles" = "zoo" amd "tester" = (filtered -> filtered.breathe() == "Lungs")
		List<Animals> tempList = new ArrayList<>();

        for (Animals v : vehicles)
        {
        	if (tester.test(v))
        	{
        		tempList.add(v);
        	}
        }

		return tempList;
	}
	*/
	/*
	List<AbstractVehicle> filteredList = filterVehicle(myList, v -> v.getFuelLevel() < 0);
	filteredList.sort((v1, v2) -> v2.getFuelLevel() - v1.getFuelLevel());
	filteredList.forEach((v) -> System.out.println(v.getFuelLevel()));

	System.out.println("\nHorse with postive fuel ***");
	filteredList = filterVehicle(myList, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle));
	filteredList.forEach((v) -> System.out.println(v));
	*/
	
	public static void main(String[] args) {
		List<Animals> zoo = new ArrayList<>();
		List<Animals> alphaZoo = new ArrayList<>();
		List<Animals> moveZoo = new ArrayList<>();
		List<Animals> yearZoo = new ArrayList<>();
		
		// Animals{id=0, name='Name', yearName=YYYY}
		
		Mammals panda = new Mammals("Panda", 1869);
		zoo.add(panda);
		
		Mammals zebra = new Mammals("Zebra", 1778);
		zoo.add(zebra);
		
		Mammals koala = new Mammals("Koala", 1816);
		zoo.add(koala);
		
		Mammals sloth = new Mammals("Sloth", 1804);
		zoo.add(sloth);
		
		Mammals armadillo = new Mammals("Armadillo", 1758);
		zoo.add(armadillo);
		
		Mammals raccoon = new Mammals("Raccoon", 1758);
		zoo.add(raccoon);
		
		Mammals bigfoot = new Mammals("Bigfoot", 2021);
		zoo.add(bigfoot);
		
		Birds pigeon = new Birds("Pigeon", 1837);
		zoo.add(pigeon);
		
		Birds peacock = new Birds("Peacock", 1821);
		zoo.add(peacock);
		
		Birds toucan = new Birds("Toucan", 1758);
		zoo.add(toucan);
		
		Birds parrot = new Birds("Parrot", 1824);
		zoo.add(parrot);
		
		Birds swan = new Birds("Swan", 1758);
		zoo.add(swan);
		
		Fish salmon = new Fish("Salmon", 1758);
		zoo.add(salmon);
		
		Fish catfish = new Fish("Catfish", 1817);
		zoo.add(catfish);
		
		Fish perch = new Fish("Perch", 1758);
		zoo.add(perch);
		
		//System.out.println(zoo);
		
		for(Animals i : zoo) {
			alphaZoo.add(i);
			yearZoo.add(i);
		}
		
		System.out.println("\nI checked with the instructor, John Mitchell. He prefers the format below over what's shown in the git-repo");
		System.out.println("*** List all the animals in descending order by year named ***");
		yearZoo.sort((a1, a2) -> a2.getYear() - a1.getYear());
		yearZoo.forEach((a) -> System.out.println("ID: " + a.animalId + ", " + a.getName() + ", " + a.getYear()));
		
		//myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		System.out.println("\n*** List all the animals alphabetically ***");
		alphaZoo.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		alphaZoo.forEach((anm) -> System.out.println("ID: " + anm.animalId + ", " + anm.getName() + ", " + anm.getYear()));
		
		for(Animals i : alphaZoo) {
			moveZoo.add(i);
		}
		
		
		System.out.println("\n*** List all the animals order by how they move ***");
		moveZoo.sort((m1, m2) -> m1.move().compareToIgnoreCase(m2.move()));
		moveZoo.forEach((mv) -> System.out.println("ID: " + mv.animalId + ", " + mv.getName() + ", " + mv.getYear() + ", " + mv.move()));
		
		
		System.out.println("\n*** List only those animals that breathe with lungs ***");
		//List<Animals> filterLungs = filterZoo(zoo, filtered -> filtered.breathe() == "Lungs");
		List<Animals> filterLungs = new ArrayList<>();
		//Got confused with the filtering using a boolean from an interface, so I created my own below
		//Note: I used 'moveZoo' instead of the original list: 'zoo' since this was already sorted in the order that the instructions wanted. All it needed was filtering
		for(Animals i : moveZoo) {
			if(i.breathe() == "Lungs") {
				filterLungs.add(i);
			}
		}
		filterLungs.forEach((fl) -> System.out.println(fl.getName() + " " + fl.reproduce() + " " + fl.move() + " " + fl.breathe() + " " + fl.getYear()));
		
		
		System.out.println("\n*** List only those animals that breathe with lungs and were named in 1758 ***");
		List<Animals> filter1758 = new ArrayList<>();
		for(Animals i : filterLungs) {
			if(i.getYear() == 1758) {
				filter1758.add(i);
			}
		}
		filter1758.forEach((fy) -> System.out.println(fy.getName() + " " + fy.reproduce() + " " + fy.move() + " " + fy.breathe() + " " + fy.getYear()));
		
		
		System.out.println("\n*** List only those animals that lay eggs and breathe with lungs ***");
		List<Animals> filterEggsLungs = new ArrayList<>();
		for(Animals i : moveZoo) {
			if((i.breathe() == "Lungs") && (i.reproduce() == "Eggs")) {
				filterEggsLungs.add(i);
			}
		}
		filterEggsLungs.forEach((el) -> System.out.println(el.getName() + " " + el.reproduce() + " " + el.move() + " " + el.breathe() + " " + el.getYear()));
		
		
		System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
		List<Animals> filterNamed1758 = new ArrayList<>();
		//Found that the alphabetically-ordered list was used to filter through based on the results shown in the instructions
		for(Animals i : alphaZoo) {
			if(i.getYear() == 1758) {
				filterNamed1758.add(i);
			}
		}
		filterNamed1758.forEach((fn) -> System.out.println(fn.getName() + " " + fn.reproduce() + " " + fn.move() + " " + fn.breathe() + " " + fn.getYear()));
		
		System.out.println("\n*** Stretch Goal ***");
		
		System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
		List<Animals> filterMammals = new ArrayList<>();
		for(Animals i : alphaZoo) {
			if(i.classification == "Mammal") {
				filterMammals.add(i);
			}
		}
		filterMammals.forEach((mm) -> System.out.println(mm.getName() + " " + mm.reproduce() + " " + mm.move() + " " + mm.breathe() + " " + mm.getYear()));
		
		
		
		
		
		
		
	}
}