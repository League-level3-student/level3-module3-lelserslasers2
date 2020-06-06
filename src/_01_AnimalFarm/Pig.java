package _01_AnimalFarm;

public class Pig extends Animal {
	Pig(){
		type = "Pig";
	}
	@Override
	void makeNoise() {
		System.out.println("OINK");
		
	}

}
