package finalTestJAVA.model.animal.comparators;

import finalTestJAVA.model.animal.Animals;

import java.util.Comparator;

public class AnimalsComparatorByAge implements Comparator<Animals> {

    //сортировка по возрасту
    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.getAge() - o2.getAge();
    }
}
