package finalTestJAVA.model.animal.pets;

import finalTestJAVA.model.animal.comparators.AnimalsComparatorByAge;
import finalTestJAVA.model.animal.comparators.AnimalsComparatorByID;
import finalTestJAVA.model.animal.comparators.AnimalsComparatorByName;
import finalTestJAVA.model.animal.Animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pets implements Serializable, Iterable<Animals> {
    private List<Animals> animalsList;
    private List<CommandsAnimals> commandsAnimalsList;


    public Pets() {
        animalsList = new ArrayList<>();
        commandsAnimalsList = new ArrayList<>();
    }

    public void addAnimals(Animals animal) {
        animalsList.add(animal);
    }

    public void countAnimals() {
        System.out.printf("Количество зарегистрированных животных составляет - %s\n\n", animalsList.size());
    }


public boolean addCommands(CommandsAnimals command) {

    if (!commandsAnimalsList.contains(command)) {
        return commandsAnimalsList.add(command);
    } else {
        System.out.printf("Команда \"%s\" уже была внесена!\n", command);
        return false;
    }
}

    public void sortByID() {
        animalsList.sort(new AnimalsComparatorByID());
    }

    public void sortByName() {
        animalsList.sort(new AnimalsComparatorByName());
    }

    public void sortByAge() {
        animalsList.sort(new AnimalsComparatorByAge());
    }


    @Override
    public String toString() {
        return animalsList.toString();
    }


    @Override
    public Iterator<Animals> iterator() {
        return animalsList.iterator();
    }
}
