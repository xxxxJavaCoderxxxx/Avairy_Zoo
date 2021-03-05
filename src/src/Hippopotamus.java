package src;
import aviary_Zoo.SizeOfAvairy;
import src.Interfaces.*;
public class Hippopotamus extends Herbivore implements Swim, Run, Voice {
	private static String name ="Hippopotamus";
	private static String voice ="growl";
	private static SizeOfAvairy sizeOfAvairy = SizeOfAvairy.BigAvairy;
	public Hippopotamus() {
		super(name, voice, sizeOfAvairy);
	}
	public Hippopotamus(String name) {
		super(name, voice, sizeOfAvairy);
	}
	public Hippopotamus(String name, String voice) {
		super(name, voice, sizeOfAvairy);
	}
	public Hippopotamus(String name, String voice, SizeOfAvairy sizeOfAvairy) {
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
