package src;
import aviary_Zoo.SizeOfAvairy;
import src.Interfaces.*;
public class Lion extends Carnivorous implements Swim, Run, Voice{
	private static String name ="Lion";
	private static String voice = "Roar";
	private static SizeOfAvairy sizeOfAvairy = SizeOfAvairy.MediumAvairy;
	public Lion() {
		super(name, voice, sizeOfAvairy);
	}
	public Lion(String name) {
		super(name, voice, sizeOfAvairy);
	}
	public Lion(String name, String voice) {
		super(name, voice, sizeOfAvairy);
	}
	public Lion(String name,  SizeOfAvairy sizeOfAvairy) {
		super(name, voice,sizeOfAvairy);
	}
	public Lion(String name, String voice, SizeOfAvairy sizeOfAvairy) {
		super(name, voice, sizeOfAvairy);
	}
	@Override	
	public void swim() {
		System.out.println("Swim");
	}
	@Override	
	public void run() {
		System.out.println("run");
	}
	@Override	
	public String voice(){
		return voice;
	}
}
