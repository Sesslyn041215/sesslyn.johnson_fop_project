package day05.solved;

public class Animal {

	int numLegs;       
	String species;


	public Animal(String speciesName, int noOfLegs){
		species = speciesName;    // initialize in constructor
		numLegs = noOfLegs;
	}

	@Override
	public String toString() {
		String animalDetails = "{ numLengs : "+numLegs+" species: "+species+" }";
		System.out.println(animalDetails);
		return animalDetails;
	}
}
