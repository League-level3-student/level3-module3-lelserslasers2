package _01_AnimalFarm;

public class Cow extends Animal {
	Cow(){
		type = "Cow";
	}
	@Override
	void makeNoise() {
		System.out.println("MOOOO");
		
	}

}
