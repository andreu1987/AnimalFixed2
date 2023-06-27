package factory;

import Animal.Animal;
import Cat.Cat;
import Dog.Dog;
import Duck.Duck;
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
