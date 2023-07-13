import animal.Animal;
import animal.cat.Cat;
import animal.dog.Dog;
import animal.duck.Duck;
import check.CheckAgeString;
import check.CheckWeightString;
import data.AgeColorData;
import data.AnimalTypeData;
import data.CommandsData;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Animal> animals = new LinkedList<>();

        while (true) {
            System.out.println("В ведите одну из команд add/list/exit");

            String commandStr = scanner.next().trim().toUpperCase(Locale.ROOT);
            // защита от дурака
            boolean isExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandStr)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println(String.format("Введенная команда %s не поддерживается", commandStr));
                continue;
            }

            CommandsData commandsData = CommandsData.valueOf(commandStr);
            switch (commandsData) {
                case ADD: {
                    while (true) {
                        System.out.println("Ввидите одно из животных (CAT(кошка)/ DOG(собака)/ DUCK(утка)");
                        String animalStr = scanner.next().trim().toUpperCase(Locale.ROOT);
                        // защита от дурака
                        boolean isAndExist = false;
                        for (AnimalTypeData animalTypeData : AnimalTypeData.values()) {
                            if (animalTypeData.name().equals(animalStr)) {
                                isAndExist = true;
                                break;
                            }
                        }
                        if (!isAndExist) {
                            System.out.println(String.format("Введенный тип животного %s не поддерживается", animalStr));
                            continue;
                        }

                        Animal animal = null;
                        switch (animalStr){
                            case "CAT": animal = new Cat();
                            break;
                            case "DOG": animal = new Dog();
                            break;
                            case "DUCK": animal = new Duck();
                        }
                        //animals.add(fillAnimalDate(animal));

                        animals.add(fillAnimalDate(animal));

                        break;
                    }

                    }
                    case LIST: {
                        for (Animal animal : animals) {
                            System.out.println(animal.toString());
                            animal.say();
                        }
                        break;

                    }

                    case EXIT: {
                        System.exit(0); //выход из программы (0 статус = успешное завершение работы)

                    }

            }


        }



    }

    private static Animal fillAnimalDate(Animal animal) {
        System.out.println("Ввидите имя животного");
        animal.setName(scanner.next());

        while (true) {
            System.out.println("Ввидите цвет животного (WHITE,GRAY,BLACK)");
            String ageColorStr = scanner.next().trim().toUpperCase(Locale.ROOT);
            // защита от дурака
            boolean isColorExist = false;
            for (AgeColorData ageColorData : AgeColorData.values()) {
                if (ageColorData.name().equals(ageColorStr)) {
                    isColorExist = true;
                    break;
                }
            }
            if (!isColorExist) {
                System.out.println(String.format("Введенный цвет %s не поддерживается", ageColorStr));
                continue;
            }
            animal.setColor(ageColorStr);
            break;
        }

        Integer age = 0;
        do {
            System.out.println("Ввидите возраст животного (от 1 до 7)");
            age = CheckAgeString.ConvertIntStr(scanner.next());

            if (age != null) {
                break;
            }
            System.out.println("Вы ввели не тот возраст что мы ожидаем!");
        } while (true);

        animal.setAge(age);


        Integer weight = 0;
        do {
            System.out.println("Ввидите вес животного (от 1 до 20)");
            weight = CheckWeightString.ConvertWeigntString(scanner.next());

            if (weight != null) {
                break;
            }
            System.out.println("Вы ввели не тот вес что мы ожидаем!");
        } while (true);

        animal.setWeight(weight);


       return animal;
    }

}




















