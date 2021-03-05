package src;
import aviary_Zoo.SizeOfAvairy;
import src.Interfaces.Swim;
public class Fish  extends Carnivorous implements Swim {
	private static String name ="Fish";
	private static SizeOfAvairy sizeOfAvairy = SizeOfAvairy.SmallAvairy;
	public Fish() {
		super(name, sizeOfAvairy);
	}
	public Fish(String name) {
		super(name, sizeOfAvairy);
	}
	public Fish(String name, SizeOfAvairy sizeOfAvairy) {
		super(name, sizeOfAvairy);
	}
	@Override
	public void swim() {
		System.out.println("floats");
	}
}
