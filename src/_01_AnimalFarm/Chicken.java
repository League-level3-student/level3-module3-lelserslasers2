package _01_AnimalFarm;

public class Chicken extends Animal {
	Chicken(){
		type = "Chicken";
	}
	@Override
	void makeNoise() {
		System.out.println("BAK");
		
	}

}