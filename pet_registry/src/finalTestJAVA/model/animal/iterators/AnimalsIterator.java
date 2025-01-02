package finalTestJAVA.model.animal.iterators;

import finalTestJAVA.model.animal.Animals;

import java.util.Iterator;
import java.util.List;

public class AnimalsIterator implements Iterator<Animals> {
    private int currentId;
    private List<Animals> animalsList;

    public AnimalsIterator(List<Animals> animalsList) {
        this.animalsList = animalsList;
    }

    @Override
    public boolean hasNext() {
        return animalsList.size() > currentId;
    }

    @Override
    public Animals next() {
        return animalsList.get(currentId++);
    }
}
