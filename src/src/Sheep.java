package src;
import aviary_Zoo.SizeOfAvairy;
import src.Interfaces.*;
public class Sheep extends Herbivore implements Swim, Run, Voice{
	private static String name ="Sheep";
	private static String voice ="baa-baa";
	private static SizeOfAvairy sizeOfAvairy = SizeOfAvairy.SmallAvairy;
	public Sheep() {
		super(name, voice, sizeOfAvairy);
	}
	public Sheep(String name) {
		super(name, voice, sizeOfAvairy);
	}
	public Sheep(String name, String voice) {
		super(name, voice, sizeOfAvairy);
	}
	public Sheep(String name, SizeOfAvairy sizeOfAvairy) {
		super(name, voice, sizeOfAvairy);
	}
	public Sheep(String name, String voice, SizeOfAvairy sizeOfAvairy) {
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
