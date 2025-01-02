package finalTestJAVA.model.animal.comparators;

import finalTestJAVA.model.animal.Animals;

import java.util.Comparator;

public class AnimalsComparatorByName implements Comparator<Animals> {

    //сортировка по имени
    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
