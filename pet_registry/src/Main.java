import finalTestJAVA.view.ConsoleUI;
import finalTestJAVA.view.View;

public class Main {
    public static void main(String[] args) {


// ***************************************************
// 1-ый этап создания Animals:
//    Animals animals = new Animals(1, "Fido", TypePets.Cat, LocalDate.of(2020, 1, 1));
//// Добавление команд одному животному
//        animals.addCommands(Commands.Bark);
//        animals.addCommands(Commands.Bark);
//        animals.addCommands(Commands.Fetch);
//    animals.addCommands(Commands.Fetch);
//
//
//        Animals animals1 = new Animals(1, "Dae", TypePets.Dog, LocalDate.of(2020, 1, 1));
//// Добавление команд одному животному
//        animals1.addCommands(Commands.Hide);
//        animals1.addCommands(Commands.Bark);
//        animals1.addCommands(Commands.Paw);
//        animals1.addCommands(Commands.Paw);
//
//
//        Pets pets = new Pets();
//        pets.addAnimals(animals);
//        pets.addAnimals(animals1);
//
//    System.out.println(animals);
//        System.out.println(pets);
// ***************************************************


//// ***************************************************
//// 2-ой этап создания Animals через Service:
//        Service service = new Service();
//        service.addAnimals("Fido", TypePets.Cat, LocalDate.of(2022, 1, 1));
//        service.addAnimals("Dae", TypePets.Dog, LocalDate.of(2020, 11, 1));
//
//
//        System.out.println(service.getAnimalsListInfo());
//        service.sortByName();
//        System.out.println(service.getAnimalsListInfo());
//        service.sortByAge();
//        System.out.println(service.getAnimalsListInfo());
//        service.addCommands(Commands.Bark);
//        System.out.println(service.getAnimalsListInfo());

        // ***************************************************
// 3-ий этап создания Animals через создание сервиса MVP (создание связи обращения к пользователю):
        View view = new ConsoleUI();
        view.start();






    }

}