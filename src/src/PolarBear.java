package src;
import aviary_Zoo.SizeOfAvairy;
import src.Interfaces.*;
public class PolarBear extends Carnivorous implements Swim, Run, Voice  {
	private static String name ="PolarBear";
	private static String voice = "Roar+Growl";
	private static SizeOfAvairy sizeOfAvairy = SizeOfAvairy.BigAvairy;
	public PolarBear() {
		super(name, voice, sizeOfAvairy);
		}
	public PolarBear(String name) {
		super(name, voice, sizeOfAvairy);
		}
	public PolarBear(String name, String voice) {
		super(name, voice, sizeOfAvairy);
		}
	public PolarBear(String name, SizeOfAvairy sizeOfAvairy) {
		super(name, voice, sizeOfAvairy);
	}
	public PolarBear(String name, String voice, SizeOfAvairy sizeOfAvairy) {
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
