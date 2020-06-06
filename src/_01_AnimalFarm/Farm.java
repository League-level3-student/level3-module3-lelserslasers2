package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList<Animal> farm= new ArrayList<Animal>();
		Pig pig1 = new Pig();
		Pig pig2 = new Pig();
		Pig pig3 = new Pig();
		Cow cow = new Cow();
		Chicken chicken = new Chicken();
		Hen hen = new Hen();
		farm.add(pig1);
		farm.add(pig2);
		farm.add(pig3);
		farm.add(cow);
		farm.add(chicken);
		farm.add(hen);
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).move();
		}

	}

}
