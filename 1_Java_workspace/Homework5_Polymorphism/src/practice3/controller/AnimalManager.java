package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] animal = new Animal[5];

		for (int i = 0; i < animal.length; i++) {
			if ((int) (Math.random() * 2) == 0) {
				animal[i] = new Dog("개", "시베리안 허스키", (int) (Math.random() * 8) + 1);
			} else {
				animal[i] = new Cat("고양이", "삼색 고양이", "지구", "삼색");
			}
		}

		for (int i = 0; i < animal.length; i++) {
			animal[i].speak();
		}

	}

}
