import Animal.Animal;
import com.sun.tools.attach.AgentInitializationException;
import data.AnimalTypeData;
import data.CommandsData;
import factory.Animalfactory;

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


                        Animal animal = new Animal();

                        animals.add(fillAnimalDate(animal));
                        break;
                    }

                    }
                    case LIST: {
                        for (Animal animal : animals) {
                            System.out.println(animal.toString());
                        }
                        break;

                    }

                    case EXIT: {
                        System.exit(0); //выход из программы (0 статус = успешное завершение работы)

                    }

            }


        }



    }

    private static Animal fillAnimalDate(Animal animal){
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


                System.out.println("Ввидите возраст животного (от 1 до 7)");
                //animal.setAge(Integer.parseInt(scanner.next()));
                Scanner age = new Scanner(System.in);
                int number;
                while (true) {

                    number = age.nextInt();
                    if (number <= 0 || number >= 8) {
                        System.out.println("Вы ввели не тот возраст что мы ожидаем!");
                    } else {
                        break;
                    }
                }
                animal.setAge(number);
                System.out.println("Спасибо! Получил " + number);


                System.out.println("Ввидите вес животного от 1 до 20");
                Scanner weight = new Scanner(System.in);
                int numberWeight;
                while (true) {
                    numberWeight = age.nextInt();
                    if (numberWeight <= 0 || numberWeight >= 20) {
                        System.out.println("Вы ввели не тот вес что мы ожидаем!");
                    } else {
                        break;
                    }
                }
                animal.setWeight(numberWeight);
                System.out.println("Спасибо! Получил " + numberWeight);

                return animal;

        }

    }

















