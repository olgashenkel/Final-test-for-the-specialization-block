package finalTestJAVA.model.builder;

import finalTestJAVA.model.animal.Animals;
import finalTestJAVA.model.animal.pets.TypePets;

import java.time.LocalDate;

public class AnimalsBuilder {
    private int genId = 1;

    public Animals build(String name, TypePets typePets, LocalDate birthDate, String commands){
        return new Animals(genId++, name, typePets, birthDate, commands);
    }
}
