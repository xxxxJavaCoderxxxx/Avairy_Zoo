package aviary_Zoo;
import java.util.HashMap;
import java.util.Map.Entry;
import src.*;
public class avairy <Type>{
	private SizeOfAvairy sizeOfAvairy;
	private HashMap<Integer, Type> avairyT;
	public void  CreateAvairy(int number, Type animal, SizeOfAvairy sizeOfAvairy) {
		avairyT = new HashMap<>();
		avairyT.put(number, animal);
		this.sizeOfAvairy = sizeOfAvairy;
	}
	public void  setAnimalToAvairy(int number, Type animal, SizeOfAvairy sizeOfAvairy) {
		Animal newAnimal = (Animal) animal;
		if (avairyT != null) {
			if (this.sizeOfAvairy == sizeOfAvairy) {
				avairyT.put(number, animal);
				System.out.println(newAnimal.getName()+" set to avairy with a size " +this.sizeOfAvairy+".");
			} else {
				System.out.println("You trying to place "+newAnimal.getName()+" in an avairy sized " +this.sizeOfAvairy+".");
				System.out.println(newAnimal.getName()+" can be placed in an avairy with a size "+newAnimal.getAnimalSizeOfAvairy()+".");
		}
		} else {
			System.out.println("Create avairy!");
		}
	}
	public void  removeAnimalFromAvairy(int number, Type animal) {
		avairyT.remove(number, animal);
	}
	public void  getLinkAnimalByName(String name) {
		for (Entry<Integer, Type> item : avairyT.entrySet()) {
			Animal animal = (Animal) item.getValue();
			if (animal.getName() == name) {
				System.out.println(item.getValue());
			}
		 }
	}
	public void getAnimalLinkByUniqueId(int number) {
		for (Entry<Integer, Type> item : avairyT.entrySet()){
			if (item.getKey() == number) {
				System.out.println(item.getValue());
			}
		}
			
	}
	public SizeOfAvairy getSizeOfAvairy() {
		return this.sizeOfAvairy;
	}
	
}
