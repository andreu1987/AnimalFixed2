package factory;

import animal.Animal;
import animal.cat.Cat;
import animal.dog.Dog;
import animal.duck.Duck;
import data.AnimalTypeData;

public class Animalfactory {
    public Animal create (AnimalTypeData animalTypeData) {

        switch (animalTypeData) {
            case CAT: {
                return new Cat();
            }
            case DOG: {
                return new Dog();
            }
            default:
                return new Duck() {
                    @Override
                    public void say() {
                        super.say();
                    }
                };
        }
    }

}
