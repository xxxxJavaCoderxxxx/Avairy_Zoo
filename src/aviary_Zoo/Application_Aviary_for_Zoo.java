package aviary_Zoo;
import src.*;
import src.Foodpackage.*;
public class Application_Aviary_for_Zoo {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Fish fish = new Fish();
		Fish fish2 = new Fish("Piranha", SizeOfAvairy.MediumAvairy);
		Duck duck = new Duck();
		avairy<Herbivore> avairyForHerbivore = new avairy<Herbivore>();
		
		avairy<Carnivorous> avairyForCarnivorous = new avairy<Carnivorous>(); // Avairy for Carnivorous animals
		
		avairyForCarnivorous.CreateAvairy(lion.getUniqueId(), lion, lion.getAnimalSizeOfAvairy());
		avairyForCarnivorous.setAnimalToAvairy(fish.getUniqueId(), fish, fish.getAnimalSizeOfAvairy());
		avairyForCarnivorous.setAnimalToAvairy(fish.getUniqueId(), fish2, fish2.getAnimalSizeOfAvairy());
		
		avairyForHerbivore.setAnimalToAvairy(duck.getUniqueId(), duck, duck.getAnimalSizeOfAvairy());
		
		
		Worker worker = new Worker();
		BeefMeat beefMeat = new BeefMeat();
		Grass_Dill grassDill = new Grass_Dill();
		worker.feed(beefMeat, duck);
		worker.feed(grassDill, duck);
	
 }

}
