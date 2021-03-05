package src;
import aviary_Zoo.SizeOfAvairy;
import src.Interfaces.*;
public class Duck extends Herbivore implements Swim, Fly, Run, Voice  {
	private static String name ="Duck";
	private static String voice ="krya-krya";
	private static SizeOfAvairy sizeOfAvairy = SizeOfAvairy.VerySmallAvairy;
	public Duck() {
		super(name, voice, sizeOfAvairy);	
	}
	public Duck(String name) {
		super(name, voice, sizeOfAvairy);
	}
	public Duck(String name, String voice) {
		super(name,voice, sizeOfAvairy);
	}
	public Duck(String name, SizeOfAvairy sizeOfAvairy) {
		super(name,voice, sizeOfAvairy);
	}
	public Duck(String name, String voice, SizeOfAvairy sizeOfAvairy) {
		super(name,voice, sizeOfAvairy);
	}
	@Override
	public void fly() {
		System.out.println("Fly");
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
