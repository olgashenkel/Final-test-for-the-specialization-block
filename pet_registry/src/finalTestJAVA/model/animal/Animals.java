package finalTestJAVA.model.animal;

import finalTestJAVA.model.animal.pets.TypePets;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class Animals implements Comparable<Animals>, Serializable {
    private int id;
    private String name;
    private LocalDate birthDate;
    private TypePets typePets;
    private List<String> commands;



    public Animals(int id, String name, TypePets typePets, LocalDate birthDate, String commands) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.typePets = typePets;
        this.commands = Arrays.asList(commands.split("\\s*,\\s*"));

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }


    // метод для вычисления возраста
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(id);
        sb.append(". Имя: ").append(name);
        sb.append("; тип животного: ").append(typePets);
        sb.append("; дата рождения: ").append(birthDate);
        sb.append("; возраст: ").append(getAge()).append(" year");
        sb.append("; команды: ").append(commands).append("\n");

        return sb.toString();
    }

    // сортировка по имени
    @Override
    public int compareTo(Animals sortName) {
        return this.name.compareTo(sortName.name);
    }

}
