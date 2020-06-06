package _01_AnimalFarm;

public abstract class Animal {
	String type;
	abstract void makeNoise();
	
	void move() {
		System.out.println("A " + type + " has moved");
	}
}
