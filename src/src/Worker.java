package src;
import src.Interfaces.Voice;
import src.Foodpackage.*;
public class Worker {
	public void feed(Food food, Animal animal) {
		try {
			animal.eat(food);
		} catch (WrongFoodException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void getVoice(Animal animal) {
			Voice voiceAnimal = (Voice) animal;
			System.out.println(voiceAnimal.voice());
}
}
