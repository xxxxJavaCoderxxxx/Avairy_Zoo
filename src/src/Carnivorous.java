package src;
import aviary_Zoo.SizeOfAvairy;
import src.Foodpackage.*;
public abstract class Carnivorous extends Animal {
	public Carnivorous(String name, String voice, SizeOfAvairy sizeOfAvairy) {
		super(name, voice, sizeOfAvairy);
	}
	public Carnivorous(String name, String voice) {
		super(name, voice);
	}
	public Carnivorous(String name, SizeOfAvairy sizeOfAvairy) {
		super(name, sizeOfAvairy);
	}
	public Carnivorous(String name) {
		super(name);
	}
	@Override
	public void eat(Food food) throws WrongFoodException
	{
		if (food instanceof Meat) throw new WrongFoodException("This food not for Carnivorous");
		System.out.println("OmNomNom");
	}
}