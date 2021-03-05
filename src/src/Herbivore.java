package src;
import aviary_Zoo.SizeOfAvairy;
import src.Foodpackage.*;
public abstract class Herbivore extends Animal {
	public Herbivore (String name, String voice, SizeOfAvairy sizeOfAvairy) {
		super(name, voice, sizeOfAvairy);
	}
	public Herbivore (String name, String voice) {
		super(name, voice);
	}
	public Herbivore (String name) {
		super(name);
	}
	@Override
	public void eat(Food food) throws WrongFoodException
	{
		if (food instanceof Meat) throw new WrongFoodException("This food not for Herbivore");
			System.out.println("OmNomNom");

	}
}