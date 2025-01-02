package finalTestJAVA.presenter;


import finalTestJAVA.model.animal.pets.TypePets;
import finalTestJAVA.model.service.Service;
import finalTestJAVA.view.View;
import java.time.LocalDate;


public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addAnimals(String name, TypePets typePets, LocalDate birthDate, String commands) {
        service.addAnimals(name, typePets, birthDate, commands);
        System.out.println("Животное успешно добавлено\n");
    }

    public void getAnimalsListInfo() {
        String answer = service.getAnimalsListInfo();
        view.printAnswer(answer);
    }

    public void countAnimals() {
        service.countAnimals();
    }

    public void sortByID() {
        service.sortByID();
        getAnimalsListInfo();
    }


    public void sortByName() {
        service.sortByName();
        getAnimalsListInfo();
    }

    public void sortByAge() {
        service.sortByAge();
        getAnimalsListInfo();
    }

    public void saveFileHandler() {
        service.saveFileHandler();
    }

    public void readFileHandler() {
        service.readFileHandler();
    }

}
