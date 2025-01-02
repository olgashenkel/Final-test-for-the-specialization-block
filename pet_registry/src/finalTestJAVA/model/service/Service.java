package finalTestJAVA.model.service;

import finalTestJAVA.model.animal.pets.Pets;
import finalTestJAVA.model.animal.Animals;
import finalTestJAVA.model.animal.pets.TypePets;
import finalTestJAVA.model.builder.AnimalsBuilder;
import finalTestJAVA.model.writer.FileHandler;

import java.time.LocalDate;


public class Service {
    private AnimalsBuilder animalsBuilder;
    private Pets pets;
    private FileHandler fileHandler;

    public Service() {
        pets = new Pets();
        animalsBuilder = new AnimalsBuilder();
        fileHandler = new FileHandler();

    }

    public void addAnimals(String name, TypePets typePets, LocalDate birthDate, String commands) {
        Animals animals = animalsBuilder.build(name, typePets, birthDate, commands);
        pets.addAnimals(animals);
    }

    public String getAnimalsListInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список животных:\n");
        if (pets != null) {
            for (Animals animals : pets) {
                stringBuilder.append(animals);
            }
            return stringBuilder.toString();
        } else {
            System.out.println("База данных пуста!");
            return null;
        }
    }

    public void countAnimals() {
        pets.countAnimals();
    }

    public void sortByID() {
        pets.sortByID();
    }

    public void sortByName() {
        pets.sortByName();
    }

    public void sortByAge() {
        pets.sortByAge();
    }


    public void saveFileHandler() {
        fileHandler.save(pets);
        System.out.printf("Файл \"%s\" успешно сохранен\n", fileHandler);
    }

    public void readFileHandler() {
        if (fileHandler.read() != null) {
            pets = (Pets) fileHandler.read();
            System.out.println("Файл успешно восстановлен\n");
        }
    }

    public void setFileName(String filePath) {
        fileHandler.setFileName(filePath);
    }


}
