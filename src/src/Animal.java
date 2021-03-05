package src;
import aviary_Zoo.SizeOfAvairy;
import src.Foodpackage.*;
//import aviary_Zoo.SizeOfAvairy;
public abstract class  Animal{
	private String name;
	private String voice;
	private SizeOfAvairy sizeOfAvairy;
	private static int count;
	private int uniqueId=count;
	public Animal(String name, String voice, SizeOfAvairy sizeOfAvairy) {
		this.name = name;
		this.voice = voice;
		this.sizeOfAvairy = sizeOfAvairy;
		count++;
	}
	public Animal(String name, String voice) {
		this.name = name;
		this.voice = voice;
		count++;
	}
	public Animal(String name, SizeOfAvairy sizeOfAvairy) {
		this.name = name;
		this.sizeOfAvairy = sizeOfAvairy;
		count++;
	}
	public Animal(String name) {
		this.name = name;
		count++;
	}
	public Animal(){
		count++;
	}
	public abstract void eat(Food food) throws WrongFoodException;
	
	public String getName() {
	return name;
	}
	public String getVoice( ) {
	return voice;
	}
	public int getUniqueId() {
		return uniqueId;
	}
	public SizeOfAvairy getAnimalSizeOfAvairy() {
		return sizeOfAvairy;
	}
}
