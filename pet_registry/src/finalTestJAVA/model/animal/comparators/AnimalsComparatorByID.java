package finalTestJAVA.model.animal.comparators;

import finalTestJAVA.model.animal.Animals;

import java.util.Comparator;

public class AnimalsComparatorByID  implements Comparator<Animals> {

    //сортировка по ID
    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.getId() - o2.getId();
    }
}
